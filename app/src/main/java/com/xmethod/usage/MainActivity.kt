package com.xmethod.usage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xmethod.xycode.utils.TS

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TS.show("哈哈")

    }
}