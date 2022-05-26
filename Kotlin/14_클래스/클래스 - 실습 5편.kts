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

