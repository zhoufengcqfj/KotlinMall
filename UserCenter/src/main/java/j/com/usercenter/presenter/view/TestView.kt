package j.com.usercenter.presenter.view

import j.com.baselibrary.presenter.view.BaseView
import j.com.usercenter.data.TestBean

/**
 * Created by zhoufeng on 2018/8/6.
 */
interface TestView : BaseView {
    fun onGetResult(result:TestBean)
}