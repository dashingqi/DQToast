package com.dashingqi.toast

import android.app.Activity
import android.view.View

/**
 * @desc :  添加到视图层级上的Toast
 * @author : zhangqi
 * @time : 2021/11/27 16:38
 */

class ViewToast(private var toastConfig: ToastConfig) : BaseToast() {

    /**
     * 是否要添加到DecorView上
     */
    private var mIsAddInDecorView: Boolean = false


    /**
     *  是否添加到DecorView上
     */
    fun isAddInDecorView(isAddInDecorView: Boolean): ViewToast {
        mIsAddInDecorView = isAddInDecorView
        return this
    }

    /**
     * 展示
     */
    override fun show() {
        toastConfig.context ?: return
        val parent = getParent(toastConfig.content as Activity)
        parent ?: return


    }

    /**
     * 获取Parent
     */
    private fun getParent(activity: Activity): View? {
        return runCatching<View?> {
            if (mIsAddInDecorView) {
                getDecorView(activity)
            } else {
                getContentView(activity)
            }
        }.getOrNull()
    }

    /**
     * 获取到DecorView
     * @param activity Activity
     * @return View?
     */
    private fun getDecorView(activity: Activity?): View? {
        return activity?.window?.decorView
    }

    /**
     * 获取到ContentView
     * @param activity Activity
     * @return View?
     */
    private fun getContentView(activity: Activity?): View? {
        return activity?.window?.decorView?.findViewById(android.R.id.content)
    }

}