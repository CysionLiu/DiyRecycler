package com.cysion.uibox.viewpager

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

class NoSlideViewPager(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {

    val MAX_OFF_SCREEN = 5

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        return false
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        return false
    }

    override fun setCurrentItem(item: Int) {
        super.setCurrentItem(item, false)
    }

    override fun setOffscreenPageLimit(limit: Int) {
        super.setOffscreenPageLimit(MAX_OFF_SCREEN)
    }
}
