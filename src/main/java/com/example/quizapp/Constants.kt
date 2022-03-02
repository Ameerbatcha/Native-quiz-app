package com.example.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Which is the synonym of scrumptios ",
            "whole",
            "Delicious",
            "Negative",
            "Risky",
            2
        )
        questionsList.add(question1)

        val question2 = Question(
            2,
            "Which is a synonym of 'pugnacious'?",
            "aggressive",
            "chilly",
            "toxic",
            "hateful",
            1
        )
        questionsList.add(question2)

        val question3 = Question(
            3,
            "Which is a synonym of 'scrupulous'?",
            "careless",
            "smart",
            "late",
            "honorable",
            4
        )
        questionsList.add(question3)

        val question4 = Question(
            4,
            "Which is a synonym of 'inundate'?",
            "pick",
            "lose",
            "flood",
            "hide",
            3
        )
        questionsList.add(question4)

        val question5 = Question(
            5,
            "Which is a synonym of 'solace'?",
            "season",
            "comfort",
            "defeat",
            "wisdom",
            2
        )
        questionsList.add(question5)

        val question6 = Question(
            6,
            "Which is a synonym of 'spurious'?",
            "tasteless",
            "repulsive",
            "untrue",
            "brave",
            3
        )
        questionsList.add(question6)
        val question7 = Question(
            7,
            "Which is a synonym of 'rescined'?",
            "event",
            "holiday",
            "memory",
            "cancel",
            4
        )
        questionsList.add(question7)

        val question8 = Question(
            8,
            "Which is a synonym of 'purported'?",
            "relieved",
            "advanced",
            "supposed",
            "blessed",
            3
        )
        questionsList.add(question8)

        val question9 = Question(
            9,
            "Which is a synonym of 'proxy'?",
            "service",
            "boat",
            "tunnel",
            "agent",
            4
        )
        questionsList.add(question9)

        val question10 = Question(
            10,
            "Which is a synonym of 'lachrymose'?",
            "wild",
            "noisy",
            "quirky",
            "tearful",
            4
        )
        questionsList.add(question10)
        return questionsList
    }
}