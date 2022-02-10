package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivityTag"
    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var jobId: EditText
    lateinit var phone: EditText
    var sbtBtn: Button? = null // Button and Button?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "oncreate called")
        name = findViewById(R.id.etName)
        age = findViewById<EditText>(R.id.etage);
        phone = findViewById<EditText>(R.id.etphone);
        jobId = findViewById<EditText>(R.id.etjobid);
        sbtBtn = findViewById(R.id.submitBtn)

        sbtBtn?.setOnClickListener { _ ->
            startActivity(
                Intent(this, MainActivity2::class.java)?.apply {
                putExtra("name", name.text.toString())
                putExtra("age", age.text.toString())
                putExtra("phone", phone.text.toString())
                putExtra("jobid", jobId.text.toString())
                } ?: return@setOnClickListener
            )
            Log.d(TAG, "finish called")
        }

        var nullableString: String? = null
        val lengthOfNullableString = nullableString?.length ?: 0
        println(lengthOfNullableString)

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onstart started")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume started")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop started")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause started")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart started")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy started ")

    }


}