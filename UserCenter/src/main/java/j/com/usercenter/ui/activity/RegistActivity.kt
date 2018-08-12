package j.com.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.widget.Toast
import j.com.baselibrary.ext.enable
import j.com.baselibrary.ext.onClick
import j.com.baselibrary.ui.activity.BaseMvpActivity
import j.com.usercenter.R
import j.com.usercenter.R.id.mRegisterBtn
import j.com.usercenter.injection.component.DaggerTestComponent
import j.com.usercenter.injection.module.TestModule
import j.com.usercenter.presenter.RegisterPresenter
import j.com.usercenter.presenter.TestPresenter
import j.com.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_regist.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class RegistActivity : BaseMvpActivity<TestPresenter>(), RegisterView, View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)
//        mRegisterBtn.setOnClickListener {
//
//        }
//        btn_test.setOnClickListener {
//            startActivity<TestActivity>("id" to 10)
//            toast("点击了啊哈哈哈")
////            mPresenter = RegisterPresenter()
////            mPresenter.mView = this
////            mPresenter.register("","","")
//        }
//        mVerifyCodeBtn.setOnClickListener {
//            mVerifyCodeBtn.requestSendVerifyNumber()
//        }
        initView()
    }

    private fun initView() {
        mRegisterBtn.enable(mMobileEt,{isBtnEnable()})
        mRegisterBtn.enable(mVerifyCodeEt,{isBtnEnable()})
        mRegisterBtn.enable(mPwdEt,{isBtnEnable()})
        mRegisterBtn.enable(mPwdConfirmEt,{isBtnEnable()})

        mVerifyCodeBtn.onClick(this)
        mRegisterBtn.onClick(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.mVerifyCodeBtn->{ mVerifyCodeBtn.requestSendVerifyNumber()}
            R.id.mRegisterBtn->{ startActivity<TestActivity>("id" to 10)
             toast("hahaahaha")}
        }

    }

    override fun injectComponent() {
        DaggerTestComponent.builder().activityComponent(mActivityComponent)
                .testModule(TestModule()).build().inject(TestActivity())
    }

    override fun onRegisterResult(result: Boolean) {
        if (result) {
            toast("注册成功")
        } else {
            toast("注册失败")
        }
    }

    /*
       判断按钮是否可用
    */
    private fun isBtnEnable():Boolean{
        return mMobileEt.text.isNullOrEmpty().not() &&
                mVerifyCodeEt.text.isNullOrEmpty().not() &&
                mPwdEt.text.isNullOrEmpty().not()&&
                mPwdConfirmEt.text.isNullOrEmpty().not()
    }
}
