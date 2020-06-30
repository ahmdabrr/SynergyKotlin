import inipackage.Ayam
import inipackage.AyamKate

//Case Penulisan

//camelCase = function, variable
//PascalCase = Class
//snake_case = nama di resource
//UPPER_CASE = Konstanta / Static Final Variable
//kebab-case

fun main(args: Array<String>) { //    iniFungsi()
    //    println(jumlahAngka(angka2 = 9))
    //    sumOfNumber(5,3,1,7,0,8,2,4,6,2,2)
    val rembo:Ayam = Ayam()
    val remboUpin:Ayam = AyamKate()

    rembo.berbunyi()
    remboUpin.berbunyi()
}

//fungsi TANPA parameter
//fungsi TANPA return Type
fun iniFungsi() {
    print("Ini dalam fungsi iniFungsi()")
}

//fungsi dengan parameter & Return Type
private fun jumlahAngka(angka1: Int = 1, angka2: Int = 2): Int {
    return angka1 + angka2
}

fun penjumlahan():Int = 3 + 2

fun Int.multiplyThousand():Int = this * 1000

fun Int.sebutBilangan():String = "Ini bilangan $this"

fun sumOfNumber(vararg number: Int){
    for(num in number){
        println(num)
    }
}
