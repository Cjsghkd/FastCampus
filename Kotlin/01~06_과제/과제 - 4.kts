fun check(Num : Int) : Int {
    return Num * 5
}

var sucNum = readLine()!!.toInt()
sucNum = check(sucNum)
println(sucNum)

