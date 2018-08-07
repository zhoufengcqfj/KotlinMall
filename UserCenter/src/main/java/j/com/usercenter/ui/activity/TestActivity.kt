package j.com.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import j.com.baselibrary.ui.activity.BaseMvpActivity
import j.com.baselibrary.widgets.VerifyButton
import j.com.provider.R
import j.com.usercenter.data.TestBean
import j.com.usercenter.presenter.RegisterPresenter
import j.com.usercenter.presenter.TestPresenter
import j.com.usercenter.presenter.view.TestView
import org.jetbrains.anko.toast

class TestActivity : BaseMvpActivity<TestPresenter>(),TestView {
    override fun onGetResult(result: TestBean) {
//        tv_desc.setText(result.toString())
        Log.i("qqqqq",result.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        toast("${intent.getIntExtra("id",-1)}")
        mPresenter = TestPresenter()
        mPresenter.mView = this
        mPresenter.test()

    }
}
