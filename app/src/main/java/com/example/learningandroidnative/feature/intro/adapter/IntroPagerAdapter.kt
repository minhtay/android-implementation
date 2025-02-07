package com.example.learningandroidnative.feature.intro.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.learningandroidnative.common.base.BaseRecyclerViewAdapter
import com.example.learningandroidnative.databinding.ItemIntroBinding

class IntroPagerAdapter: BaseRecyclerViewAdapter<String, ItemIntroBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> ItemIntroBinding
        get() = ItemIntroBinding::inflate

    override fun bindItem(item: String, binding: ItemIntroBinding, position: Int) {
        Glide.with(binding.imgIntro.context).load(item).into(binding.imgIntro)
    }
}