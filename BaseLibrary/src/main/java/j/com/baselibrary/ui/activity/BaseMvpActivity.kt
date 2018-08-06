package j.com.baselibrary.ui.activity

import j.com.baselibrary.presenter.BasePresenter
import j.com.baselibrary.presenter.view.BaseView

/**
 * Created by zhoufeng on 2018/8/6.
 */
open class BaseMvpActivity<T:BasePresenter<*>> : BaseActivity(),BaseView{
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(text: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    lateinit var mPresenter:T

}