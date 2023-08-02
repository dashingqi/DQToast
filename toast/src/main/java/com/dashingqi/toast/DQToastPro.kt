package com.dashingqi.toast

import android.content.Context
import com.dashingqi.toast.const.TOAST_DURATION_DEFAULT

/**
 * @desc : toast pro
 * @author : zhangqi
 * @time : 2023/8/2 23:59
 */
class DQToastPro private constructor(private val builder: Builder, private val context: Context) {

    companion object {
        inline fun build(context: Context, block: Builder.() -> Unit) = Builder().apply(block).build(context)
    }

    /**
     * 展示toast
     */
    fun show() {


    }

    class Builder {
        fun build(context: Context) = DQToastPro(this, context)

        /** 消息内容*/
        var content: String = ""

        /** 展示时长*/
        var duration: Long = TOAST_DURATION_DEFAULT
    }
}