fun discount(count: Int, total: Double): Double{
    var dis: Double
    if(count >= 5){
        dis = 0.15 * total
        return dis
    } else if(total>=15.0) {
        dis = 0.1 * total
        return dis
    }
        else if(count >= 5 && total>=15.0){
            dis = 0.15 * total
            return dis
        }
    else{
        return 0.0
}
    }

fun main(){
    println("********** Byte and Brew Coffee **********")
    println("Menu")
    println("Item Number    Item    Price")
    println("1) Espresso $3.00\n2) Latte $4.50\n3) Cappuccino $4.00")
    var c = 1
    var count = 0
    var total: Double = 0.0
    while(c == 1){
        println("Choose your order: ")
        var choice = readln().toInt()
        when(choice) {
            1 -> {
                total += 3.00
                count++
            }
            2 -> {
                total += 4.50
            count++
        }
            3 -> {
                total += 4.00
                count++
            }
            else -> println("Enter correct item number")
        }
        println("Would you like to continue ordering?(0/1)")
        c = readln().toInt()
    }
    println("     Bill     ")
    println("Number of items ordered: ${count}\nTotal Amount: ${total}\nTotal Amount with discount: ${total-discount(count,total)}")
} 