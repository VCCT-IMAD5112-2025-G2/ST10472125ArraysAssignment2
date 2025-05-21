package za.co.varsitycollege.st10472125.st10472125arraysassignment2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_results)

        val score = intent.getIntExtra("score", 0)
        val userAnswers = intent.getBooleanArrayExtra("userAnswers")
        val questions = intent.getStringArrayExtra("questions")
        val correctAnswers = intent.getBooleanArrayExtra("correctAnswers")

    }
    }
