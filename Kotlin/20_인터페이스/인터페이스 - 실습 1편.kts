interface Tiger {
    fun bite()
    fun goToBox()
}

class backDoSanTiger : Tiger {
    override fun bite() {
        // 구체적인 기능
    }

    override fun goToBox() {
        // 구체적인 기능
    }
}

val backdosantiger : backDoSanTiger = backDoSanTiger()
backdosantiger.bite()
backdosantiger.goToBox()