package j.com.baselibrary.data.protocol

/**
 * desc:  <br/>
 * time:2018/8/6<br/>
 * author: 周峰 <br/>
 * since V 1.0 <br/>
 */
data class BaseResp<out T>(val status:Int,val message:String,val data:T)