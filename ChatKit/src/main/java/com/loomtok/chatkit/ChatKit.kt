package com.loomtok.chatkit

import android.content.Context
import android.widget.Toast

class ChatKit {
    companion object {
        fun showToast(context: Context, message: String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}