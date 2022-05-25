fun increaseOne(numberUnder100 : Int) { // 함수의 파라미터는 무조건 value형식 바꿔줄 수 없다
    var givenNumber : Int = numberUnder100 // 파라미터를 바꿀 필요가있다면 varable 형식을 만들어서 카피를 하자
    while(givenNumber < 100) {
        givenNumber++
        println("up")
    }
    return
}
increaseOne(99)