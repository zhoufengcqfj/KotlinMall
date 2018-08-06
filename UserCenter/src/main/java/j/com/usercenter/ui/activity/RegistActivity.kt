package j.com.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.widget.Toast
import j.com.baselibrary.ui.activity.BaseMvpActivity
import j.com.usercenter.R
import j.com.usercenter.R.id.mRegisterBtn
import j.com.usercenter.presenter.RegisterPresenter
import j.com.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_regist.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class RegistActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {
    override fun onRegisterResult(result: Boolean) {
        if (result) {
            toast("注册成功")
        }else{
            toast("注册失败")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)
        mRegisterBtn.setOnClickListener {
//            startActivity<TestActivity>("id" to 10)
//            toast("点击了啊哈哈哈")
            mPresenter = RegisterPresenter()
            mPresenter.mView = this
            mPresenter.register("","","")
        }
    }
}
