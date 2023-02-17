package com.loomtok.chatkitsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.loomtok.chatkit.ChatKit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ChatKit.showToast(this, "안녕하세요.")
    }
}