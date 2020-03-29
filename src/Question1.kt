//WAP using Lambda function to calculate the Simple Interest.

fun main(args: Array<String>) {
    var calculateSimpleInterest = { principle: Double, rate: Double, time: Double -> (principle * rate * time) / 100 }
    var answer = calculateSimpleInterest(200.0, 2.1, 2.0)
    println(answer)
}