package com.dashingqi.toast

import android.content.Context
import com.dashingqi.toast.const.TOAST_DURATION_DEFAULT

/**
 * @desc :
 * @author : zhangqi
 * @time : 2021/11/27 16:58
 */
class ToastConfig {

    /** 时长*/
    var duration: Long = TOAST_DURATION_DEFAULT

    /** 内容*/
    var content: String = ""

    /** 上下文环境*/
    var context: Context? = null
}