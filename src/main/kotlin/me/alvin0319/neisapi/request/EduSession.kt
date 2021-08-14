/*
 * MIT License
 *
 * Copyright (c) 2021 alvin0319
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package me.alvin0319.neisapi.request

import me.alvin0319.neisapi.types.SchoolDistrictList
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients
import java.util.Date

class EduSession(val eduCode: SchoolDistrictList) {
    var cookie: String = ""
        get() {
            if (time < Date().time || field == "") {
                return refreshCookie()
            }
            return field
        }

    var time: Long = -1

    fun refreshCookie(): String {
        val client = HttpClients.createDefault()
        val request = HttpGet("https://stu.${eduCode.url}/edusys.jsp?page=sts_m40000")
        request.addHeader(
            "User-Agent",
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.132 Safari/537.36"
        )

        val response = client.execute(request)
        if (response.statusLine.statusCode != 200) {
            throw IllegalStateException("Invalid HTTP status code returned: ${response.statusLine.statusCode}")
        }
        val cookie =
            response.getHeaders("set-cookie")[1].toString().replace("Set-Cookie: ", "").replace("JSESSIONID=", "")
                .replace("Path=/", "")
        if (cookie == "") {
            throw IllegalStateException("Server returned invalid cookie: $cookie")
        }

        this.cookie = cookie
        time = Date().time + 1000 * 60 * 30
        return this.cookie
    }
}
