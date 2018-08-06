package j.com.baselibrary.presenter.view

/**
 * Created by zhoufeng on 2018/8/6.
 */
/*
    MVP中视图回调 基类
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(text:String)
}