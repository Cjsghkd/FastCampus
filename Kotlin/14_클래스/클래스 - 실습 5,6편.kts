// getter/setter
class Book() {
    var title : String = "모름"
        get() {
            println("getter")
            return "책 제목"
        }
        set(value) {
            println("setter")
            field = value // field = title
//          title = value // 사용 X
        }
}
val book = Book()
println(book.title)
book.title = "제목 변경"
println(book.title)

// 기본값
//class Book() {
//    var title : String = "모름"
//        get() {
//            return field
//        }
//        set(value) {
//            field = value
//        }
//}

// lateinit
class Book2() {
    lateinit var title : String  // lateinit 는 var타입에서 사용가능 (val타입에서 사용 불가능)

    fun nextPage() { // 클래스 안에 함수로 기능을 만든다
        if (::title.isInitialized == true) { // == true 부분은 생략 가능
            println("페이지가 넘어간다")
        } else {
            println("초기화 필요")
        }

    }
}

val book2 = Book2() // Book2 -> 붕어빵 틀(클래스), book2 -> 붕어빵(객체)
book2.title = "책이름" // 초기화 했으므로 isInitialized가 true가 된다
println(book2.nextPage())

val book2_2 = Book2() // Book2 -> 붕어빵 틀(클래스), book2_2 -> 붕어빵(객체)
println(book2_2.nextPage()) // 초기화 되지않았으므로 isInitialized가 false가 된다

// book2 != book2_2 -> 서로 클래스는 같지만 각각의 객체이므로 객체마다 초기화를 해줘야한다
