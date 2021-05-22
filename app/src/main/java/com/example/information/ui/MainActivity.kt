package com.example.information.ui

import android.app.Activity
import android.content.Intent
import android.graphics.text.LineBreaker
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.SyncStateContract
import android.view.LayoutInflater
import com.example.information.data.Information_Data
import com.example.information.databinding.ActivityMainBinding
import com.example.information.ui.BaseActivity
import com.example.information.util.Constant

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding?.buttonNext?.setOnClickListener {
            Intent(Intent.ACTION_SEND).apply {
                putExtra(Intent.EXTRA_TEXT, Information_Data.getDataString()[Constant.Name])
                putExtra(Intent.EXTRA_EMAIL, Information_Data.getDataString()[Constant.E_mail])
                putExtra(Intent.EXTRA_PHONE_NUMBER , Information_Data.getDataString()[Constant.Phone])
                type = "text/*"
            }.let { startActivity(it) }
        }
        }

}