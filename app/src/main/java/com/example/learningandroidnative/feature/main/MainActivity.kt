package com.example.learningandroidnative.feature.main

import android.view.LayoutInflater
import com.example.learningandroidnative.common.base.BaseActivity
import com.example.learningandroidnative.databinding.ActivityMainBinding

class MainActivity: BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun initView() {
        super.initView()
        binding.textCenter.text = "test android native"
    }
}