package com.dashingqi.toast

import android.app.Activity
import android.content.Context
import com.dashingqi.toast.const.TOAST_DURATION_DEFAULT


/**
 * @desc : DQToast
 * @author : zhangqi
 * @time : 2021/11/27 16:17
 */
object DQToast {


    /** 时长*/
    private var mDuration: Long = TOAST_DURATION_DEFAULT
    /** 展示的内容*/
    private var mContent: String = ""


    /**
     * 设设置展示的内容
     * @param content String
     */
    fun makeText(content: String): DQToast {
        mContent = content
        return this
    }



    /**
     * 设置展示时长
     * @param duration Long
     */
    fun setDuration(duration: Long): DQToast {
        mDuration = duration
        return this
    }

    /**
     * 构建View层级的Toast
     * @return ViewToast
     */
    fun buildViewToast(context: Activity): ViewToast {
        return ViewToast(buildToastConfig(context))
    }

    /**
     * 构建系统层级的Toast
     * @return AppToast
     */
    fun buildAppToast(context: Context): AppToast {
        return AppToast(buildToastConfig(context))
    }

    /**
     * 构建Toast配置参数
     */
    private fun buildToastConfig(context: Context): ToastConfig {
        val toastConfig = ToastConfig()
        toastConfig.context = context
        toastConfig.content = mContent
        toastConfig.duration = mDuration
        return toastConfig
    }
}