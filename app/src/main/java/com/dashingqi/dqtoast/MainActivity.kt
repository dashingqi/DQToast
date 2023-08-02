package com.dashingqi.dqtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dashingqi.toast.DQToast
import com.dashingqi.toast.DQToastPro

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DQToastPro.build(this) {
            content = ""

        }.show()

    }
}