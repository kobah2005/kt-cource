fun main() {
    var temperature = readln().toInt()
    var acIsOn = false
    if (temperature > 25) {
         acIsOn = true
    } else if( temperature < 20) {
         acIsOn = false
    }
    if (acIsOn) {
        temperature -= 5
    } else{
        temperature += 5
    }
    println("1. AC is $acIsOn and current temp  $temperature")
    if (temperature > 25) {
        acIsOn = true
    } else if( temperature < 20) {
        acIsOn = false
    }
    if (acIsOn) {
        temperature -= 5
    } else{
        temperature += 5
    }
    println("2. AC is $acIsOn and current temp  $temperature")
    if (temperature > 25) {
        acIsOn = true
    } else if( temperature < 20) {
        acIsOn = false
    }
    if (acIsOn) {
        temperature -= 5
    } else{
        temperature += 5
    }
    println("3. AC is $acIsOn and current temp  $temperature")
}