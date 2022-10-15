/*
 * Created by Darshan Pandya. (@itznotabug)
 * Copyright (c) 2018-2020.
 */

package com.thukuma.mylibrary.listener

import android.view.View

interface NativeAdListener {
    fun onAdLoaded()
    fun onAdFailedToLoad(exception: Exception)
}

interface NativeActionListener {
    fun onClick(view: View)
}
