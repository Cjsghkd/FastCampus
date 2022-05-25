fun repeatText(repeatText : String, repeatNumber : Int) {
    for (i in 0..repeatNumber - 1) println(repeatText)
    for (i in 1..repeatNumber) println(repeatText)
    for (i in 0 until repeatNumber) println(repeatText)
}
repeatText("안녕", 2)