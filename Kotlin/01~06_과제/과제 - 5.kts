fun plus (var A : Int?, var B : Int?) : Int? {
    if (A == null)
        A = 0
    else if (B == null)
        B = 0

    return A + B
}
var X : Int? = 10
var Y : Int? = null
var score : Int? = plus(X, Y)