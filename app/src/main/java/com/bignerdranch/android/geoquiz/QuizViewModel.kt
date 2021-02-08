package com.bignerdranch.android.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel() {

    var currentIndex = 0
    var isCheater = false

    private val questionBank = listOf(
        Question(R.string.question_film, true),
        Question(R.string.question_frozen, false),
        Question(R.string.question_france, true),
        Question(R.string.question_largest, true),
        Question(R.string.question_planet, true),
        Question(R.string.question_dole, false),
        Question(R.string.question_snack, false),
        Question(R.string.question_open, true))

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId

    fun moveToNext() {
        currentIndex = (currentIndex+1) % questionBank.size
    }

    fun moveToPrev() {
        currentIndex = (currentIndex-1)
    }

}