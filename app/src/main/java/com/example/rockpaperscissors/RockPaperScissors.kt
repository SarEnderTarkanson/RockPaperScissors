package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""

    while (true) {
        println("Rock, Paper, or Scissors? Enter your choice!")
        playerChoice = readln().lowercase()

        if (playerChoice == "rock" || playerChoice == "paper" || playerChoice == "scissors") {
            break
        } else {
            println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.")
        }
    }

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> computerChoice = "rock"
        2 -> computerChoice = "paper"
        3 -> computerChoice = "scissors"
    }

    println("Computer chose: $computerChoice")

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's a tie")
    } else {
        println("$winner won!")
    }
}
