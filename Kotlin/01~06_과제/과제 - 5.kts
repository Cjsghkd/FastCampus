fun plus (A : Int?, B : Int?) : Int {
    var tempA: Int
    var tempB: Int
    if (A == null) {
        tempA = 0
    } else {
        tempA = A
    }
    if (B == null) {
        tempB = 0
    } else {
        tempB = B
    }
    return tempA + tempB
}

var X : Int? = 10
var Y : Int? = null
val score = plus(X, Y)
println(score)