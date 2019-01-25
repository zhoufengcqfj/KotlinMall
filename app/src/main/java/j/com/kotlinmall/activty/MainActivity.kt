package j.com.kotlinmall.activty

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import j.com.kotlinmall.R

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(tag,"test")
    }
}
