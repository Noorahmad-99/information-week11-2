package com.example.information.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import com.example.information.databinding.ActivitySecondBinding
import com.example.information.ui.BaseActivity

class SecondActivity : BaseActivity<ActivitySecondBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivitySecondBinding
        get() = ActivitySecondBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding?.textName?.text = intent.getStringExtra(Intent.EXTRA_TEXT)
        binding?.textEmail?.text = intent.getStringExtra(Intent.EXTRA_EMAIL)
        binding?.textPhon?.text= intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER)

    }
}