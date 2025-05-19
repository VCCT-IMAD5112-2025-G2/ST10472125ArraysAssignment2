package za.co.varsitycollege.st10472125.st10472125arraysassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)
        var questionCounter = 0

        val QuizTxt = findViewById<TextView>(R.id.QuizTxt)
        val btnTrue = findViewById<Button>(R.id.btnTrue)
        val btnFalse = findViewById<Button>(R.id.btnFalse)
        val btnNext = findViewById<Button>(R.id.btnNext)

        val questions = arrayOf( "World War ll ended in 1945 ", "The Roman Empire was ruled by Napolean Bonaparte ","Tutankhamun was the youngest pharoah in history","The Berlin wall separated North and South Korea","Julius Ceasar ruled over the Mongol empire")
        val answers = arrayOf(true,false,true,false,false)
        val userAnswers = BooleanArray(5)
        QuizTxt.text = questions[questionCounter]

        btnTrue.setOnClickListener {userAnswers[questionCounter]= true
        QuizTxt.text = "Correct!"}
        btnFalse.setOnClickListener { userAnswers[questionCounter]=false
        QuizTxt.text = "Not quite :("}
        btnNext.setOnClickListener {
            //compare answer with user answer
            //feedback
            questionCounter++
            QuizTxt.text = questions[questionCounter]



        }





        }
    }
