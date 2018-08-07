package j.com.baselibrary.ui.activity

import j.com.baselibrary.presenter.BasePresenter
import j.com.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by zhoufeng on 2018/8/6.
 */
open class BaseMvpActivity<T:BasePresenter<*>> : BaseActivity(),BaseView{
    override fun showLoading() {
    }

    override fun hideLoading() {

    }

    override fun onError(text: String) {

    }

    lateinit var mPresenter:T

}