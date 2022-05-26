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

// Lazy
// - 호출시점에 by lazy 정의에 의해서 초기화을 수행한다
// - val 에서만 사용 가능하다
class Book3() {
    val title : String by lazy {
        // 본문 -> 다른 작업도 할 수 있지만 반드시 프로퍼티(속성)를 초기화 시켜주는 작업을 해야한다
        println("lazy 초기화") // 다른 작업
        // title = "책제목" -> 불가능
        // return "책제목" -> 불가능
        "책 제목" // 람다식이므로 마지막 줄이 리턴된다
    }
    // val title : String = "abc" -> lazy는 초기화 X
}
val book3 = Book3()
//val book4 = Book4()
//val book5 = Book4()
//val book6 = Book4()   ->  복잡한 작업이 많고 속성중 title이 없다면 굳이 다 초기화 하지않고
//val book7 = Book4()       lazy를 써서 필요할 때(사용할 때)만 초기화 시킬 수 있다
//val book8 = Book4()
println(book3.title)


