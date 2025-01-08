package com.example.tic_tac_toe

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {

  private var currentPlayer = "X"
  private val board = Array(3) { arrayOfNulls<String>(3) }
  private var isGameOver = false

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContentView(R.layout.activity_main)

    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
      insets
    }

    Log.d("MainActivity", "onCreate $savedInstanceState")

    val statusText = findViewById<TextView>(R.id.statusText)
    val resetButton = findViewById<Button>(R.id.resetButton)
    val buttons = listOf(
      findViewById<Button>(R.id.button1),
      findViewById<Button>(R.id.button2),
      findViewById<Button>(R.id.button3),
      findViewById<Button>(R.id.button4),
      findViewById<Button>(R.id.button5),
      findViewById<Button>(R.id.button6),
      findViewById<Button>(R.id.button7),
      findViewById<Button>(R.id.button8),
      findViewById<Button>(R.id.button9)
    )
  }

  override fun onStart() {
    super.onStart()
    Log.d("MainActivity", "onStart")
  }

  override fun onResume() {
    super.onResume()
    Log.d("MainActivity", "onResume")
  }

  override fun onPause() {
    super.onPause()
    Log.d("MainActivity", "onPause")
  }

  override fun onStop() {
    super.onStop()
    Log.d("MainActivity", "onStop")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d("MainActivity", "onDestroy")
  }

  override fun onRestart() {
    super.onRestart()
    Log.d("MainActivity", "onRestart")
  }
}

