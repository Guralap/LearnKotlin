import java.util.stream.DoubleStream.concat

fun main(args: Array<String>) {


    val votes: Int = 251
    val majorityGov = votes > 250
    val minorityGov = votes < 250
    val message: String
    message = when {
        majorityGov -> {
            "It is majority government."
        }
        votes == 250 -> {
            "It is majority government."
        }
        else -> {
            "It is minority government"
        }
    }
    val message2: String
    message2 = if (majorityGov) {
        "It is majority government."
    } else if (votes == 250) {
        "It is majority government."
    } else {
        "It is minority government"
    }
    println(message)
    println(message2)

}


