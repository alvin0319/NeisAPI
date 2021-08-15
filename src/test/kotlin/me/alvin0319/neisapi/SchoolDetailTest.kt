package me.alvin0319.neisapi

import me.alvin0319.neisapi.school.SchoolDetail
import me.alvin0319.neisapi.school.SchoolSearched
import me.alvin0319.neisapi.types.SchoolDistrictList

class SchoolDetailTest {
    fun start() {
        val schoolName = "고등학교"

        val edu = SchoolDistrictList.ALL

        val start = System.currentTimeMillis()

        val result = SchoolSearched.search(schoolName, edu, true)

        val end = System.currentTimeMillis()

        println("총 ${result.size}개의 결과를 찾는데 ${end - start}ms가 걸렸습니다.")
        if (result.isEmpty()) {
            println("학교 검색에 실패했습니다.")
            return
        }

        val school = result.toMutableList().removeFirst()

        val detail = SchoolDetail.getSchoolDetail(school)

        if (detail == null) {
            println("학교 검색에 실패했습니다.")
            return
        }

        printSchoolDetail(detail)
    }

    private fun printSchoolDetail(schoolDetail: SchoolDetail) {
        println("=== ${schoolDetail.name} 학교 정보 ===")
        println("교육청: ${schoolDetail.edu.name}")
        println("학교 주소: ${schoolDetail.address}")
        println("학교 설립 유형: ${schoolDetail.foundType.name}")
        println("학교 남/여: ${schoolDetail.genderType.name}")
        println("학교 전화번호: ${schoolDetail.tell}")
        println("학교 팩스: ${schoolDetail.fax}")
        println("학교 선생님 수: ${schoolDetail.teachers}")
        println("학교 설립일: ${schoolDetail.foundDate}")
        println("학교 홈페이지: ${schoolDetail.homepage}")
    }
}

fun main(args: Array<String>) {
    SchoolDetailTest().start()
}
