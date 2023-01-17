package com.kdl.quizapp.common

import com.kdl.quizapp.data.local.db.Question

object Constants {

    const val DATABASE_NAME = "QuizAppDatabase"

    val androidQuestions = listOf<Question>(
        Question(
            "Yes.-No-None of the above",
            2,
            "Android is open source ?",0),
        Question(
            "Services-Activities-All the above",
            2,
            "What are the android Components?",1),
        Question(
            "onPreExecution()-doInBackground()-onPostExecution()",
            2,
            "What are the functionalities in asyncTask in android?",2),
        Question(
            "Interface class.-A class that does not have a name but have functionalities in it-Java class",
            1,
            "What is an anonymous class in android?",3),

    )
}