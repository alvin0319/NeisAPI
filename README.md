# NeisAPI

나이스에서 학교 정보, 학교 급식 조회 API 라이브러리입니다.


## 사용법

#### 예제코드

##### 학교 검색
```kotlin

val searchText = "..." // 검색할 고등학교 이름

val districtType = SchoolDistrictType.ALL // 검색할 교육청

// List<SchoolSearched> 반환
val schoolSearched = SchoolSearch.search(searchText, districtType)
```

##### 급식 검색
```kotlin
val year = 2021
val month = 8
// Map<Int, Meal> 반환
val mealList = SchoolMeal.getMeal(year, month)
```

> 더 구체적인 예제는 [test](./src/test/kotlin/me/alvin0319/neisapi) 폴더에서 확인 가능합니다.

## 개발 환경

##### Kotlin: >= 1.4.31
##### Java: >= 16
##### JVM: 1.5.10

## 도움이 된 라이브러리
##### [neis](https://github.com/nnnlog/neis): JavaScript & TypeScript 나이스 API
