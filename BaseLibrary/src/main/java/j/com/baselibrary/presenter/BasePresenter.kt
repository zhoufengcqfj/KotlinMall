package j.com.baselibrary.presenter

import j.com.baselibrary.presenter.view.BaseView

/**
 * Created by zhoufeng on 2018/8/6.
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView : T
}