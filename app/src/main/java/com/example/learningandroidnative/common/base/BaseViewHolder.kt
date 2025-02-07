package com.example.learningandroidnative.common.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

class BaseViewHolder <V : ViewBinding>(val binding: V) : RecyclerView.ViewHolder(binding.root)