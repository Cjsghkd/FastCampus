fun hungry(remainEatNumber : Int, nowEatNumber : Int) {
        var total : Int = remainEatNumber - nowEatNumber
        do {
            println("밥을 먹었다")
            total--
        } while (total > 0)
        println("배가 부르다")

}

hungry(3, 2)
