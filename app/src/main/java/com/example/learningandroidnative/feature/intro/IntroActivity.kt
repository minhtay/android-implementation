package com.example.learningandroidnative.feature.intro

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import com.example.learningandroidnative.common.base.BaseActivity
import com.example.learningandroidnative.databinding.ActivityIntroBinding
import com.example.learningandroidnative.feature.intro.adapter.IntroPagerAdapter
import com.example.learningandroidnative.feature.main.FullscreenActivity

class IntroActivity : BaseActivity<ActivityIntroBinding>() {

    private val adapterIntro by lazy { IntroPagerAdapter() }

    override val bindingInflater: (LayoutInflater) -> ActivityIntroBinding
        get() = ActivityIntroBinding::inflate

    @SuppressLint("NotifyDataSetChanged")
    override fun initView() {
        super.initView()

        //setup intro viewpager2
        adapterIntro.data = listOf("https://images.rawpixel.com/image_800/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDI0LTAxL3Jhd3BpeGVsX29mZmljZV8yOF9pbGx1c3RyYXRpb25fb2ZfdG9reW9fbWluaW1hbF93YWxscGFwZXJfX2NvbF9jNjkwNjNhZC1mMTY3LTQ4NmYtYWRmMC1jMTE4YWM1NjJjMmRfMS5qcGc.jpg","https://images.unsplash.com/photo-1629277910650-07546caa6414?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3")
        binding.vpIntro.adapter = adapterIntro

        // set click button
        binding.btnContinue.setOnClickListener {
            val newIntent = Intent(this, FullscreenActivity::class.java)
            startActivity(newIntent)
        }
    }
}