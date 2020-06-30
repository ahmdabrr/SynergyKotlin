import inipackage.Ayam

//Class Header

//Constructor : Method yang pertama kali dijalani ketika object dibuat.
private class Manusia(var nama:String = "Fulan", var umur:Int, var makananFav: Ayam) {
//    constructor(nama:String,warnaKulit:String)

    //Class Body
    private var panggilan:String = "Fulan"
    var sesuatu = 0
    var warisan = 9000

    //Atribut / Field / Variable / Properties
    public var tinggiBadan: Int = 0

    private fun berjalan(){
        println("$nama sedang berjalan")
    }

    fun berbicara(){
        println("$nama sedang berbicara")
    }
}