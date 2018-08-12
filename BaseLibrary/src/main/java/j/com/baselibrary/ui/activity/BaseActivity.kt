package j.com.baselibrary.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.FrameLayout
import com.trello.rxlifecycle.components.RxActivity
import com.trello.rxlifecycle.components.support.RxAppCompatActivity
import j.com.baselibrary.common.AppManager
import org.jetbrains.anko.find

/**
 * Created by zhoufeng on 2018/8/6.
 */
open class BaseActivity:RxAppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppManager.instance.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppManager.instance.finishActivity(this)
    }

    //获取Window中视图content
    val contentView: View
        get() {
            val content = find<FrameLayout>(android.R.id.content)
            return content.getChildAt(0)
        }

}