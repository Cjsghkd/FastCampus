import kotlin.contracts.contract

// 클래스를 선언하는 방법
class Person {

}

// 생성자
// - 주 생성자
//  - 클래스 이름 옆에 괄호로 둘러싸인 코드
//  - 클래스를 통해서 객체를 만드는데 필요한 재료들을 적어 준다
//      - 재료이름(변수명) : 재료타입(변수타입)
//  - 반드시 한개만 존재할 수 있다
//  - constructor 키워드를 생략할 수 있다

// 주 생성자 -> 풀버젼 (생략이 없는 버젼)
class User1 constructor(name : String) { // 클래스 네이밍은 대문자로 시작한다
    val userName : String // 클래스 속성 (프로퍼티, property)은 init블럭에서 초기화 한다

    init { // 클래스가 생성될때 (클래스를 통해서 객체를 만들때) 호출된다
        println(name)
        userName = name
    }
}

// 클래스를 호출하는 방법 -> 클래스를 통해서 객체를 만드는 방법
// 클래스를 호출 -> 인스턴스화 (Instance)
// 객체 -> Objcet, Instance
val user = User1("홍길동")

// 주 생성자 -> init을 생략하는 방법
class User2 constructor(name : String) {
    val userName : String = name
}
val user = User2("홍길동")

// 주 생성자 -> constructor를 생략하는 방법
class User3 (name : String) {
    val userName : String = name
}
val user = User3("홍길동")

// 주 생성자 -> 생략할수 있는 모든걸 생략하는 방법
class User4(val name : String) {
}

// 주 생성자 -> 기본값
class User5(name : String = "김아무개") {
    val userName : String = name
}
val user = User5()

// 생성자에서 받는 속성이 복수개인 경우
class User6 constructor (age : Int, name : String) {
    val age : Int // 클래스 속성
    val name : String

    init {
        this.age = age // this 는 클래스 자체를 의미한다 (User5) -> User5의 age
        this.name = name
    }
}

// . 의 의미
// -> ~의
val user6 = User6(20, "홍길동")
println(user6.age)
//  - user5.age -> user5의 age
//  - user5.name -> user5의 name
//  - user5.기능 -> user5의 기능
// -> .은 객체의 속성이나 기능을 사용할때 사용한다

// 부 생성자(Secondary Constructor)
// - constructor 키워드를 생략할 수 없다
// - 주 생성자에는 객체를 만들기 위한 필수 조건이 있다면, 부 생성자에는 객체를 만들기 위한 옵션 조건이 있다
// - 부 생성자에는 주 생성자에서 필요한 조건을 포함하고 있어야 한다 (파라미터를 포함하고 있어야한다)
// - 부 생성자는 주 생성자에게 생성을 위임해야한다
class User7 constructor (name : String) {
    var age : Int = 0
    val name : String

    init {
        this.name = name
    }

    // 부 생성자는 클래스명 우측에 올수 없다 -> 클래스의 본문에 있어야한다
    constructor(name : String, age : Int) : this(name) { // this = User6
        this.age = age
    }
}
val user7 = User7(name = "가나다") // 주 생성자에서 실행하여 생성한다
println(user7.name)
val user7_2 = User7("가나다다", 20) // 부 생성자에서 실행하며 주 생성자에서 없는 인자(파라미터)만 생성한다. (주 생성자에서 생성한다)
println(user7_2.age)