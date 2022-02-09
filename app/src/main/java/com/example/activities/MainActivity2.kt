package com.example.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    lateinit var name:String
    lateinit var age:String
    lateinit var JobId:String
    lateinit var phone:String
    val TAG = "MainActivity2Tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        name= intent.getStringExtra("name")!!
        age= intent.getStringExtra("age")!!
        JobId= intent.getStringExtra("jobid")!!
        phone= intent.getStringExtra("phone")!!
        val data:String=name+" "+age+" "+JobId+" "+phone
        Log.d(TAG,data)
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
        Log.d(TAG,"onStop started")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause started")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart started")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy started ")

    }
}