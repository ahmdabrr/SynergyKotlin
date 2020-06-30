package inipackage

open class Ayam : Unggas() {
    var berat = 2
    private var warnaBulu = "Kuning"
    internal var gender = "betina"

    override fun berbunyi(){
        println("Ayam Berkokok")
    }

    override fun berbunyi(vol: String) {
        super.berbunyi(vol)
    }

    fun makan(makanan:String){

    }
}