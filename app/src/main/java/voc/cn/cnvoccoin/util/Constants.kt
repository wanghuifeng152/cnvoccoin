package voc.cn.cnvoccoin.util

import android.support.annotation.Keep
import java.io.Serializable

/**
 * Created by shy on 2018/3/27.
 */
const val COIN_NUMBER = "COIN_NUMBER"
const val USER_ID = "USER_ID"
const val USER_NAME = "USER_MOBILE"
const val PASSWORD = "USER_EMAIL"
const val TOKEN = "TOKEN"
const val VOICE_TEXT = "VOICE_TEXT"
const val VOICE_ID = "voice_id"
const val FOCUS_COMMON = "3"
const val JOIN_COMMUNTITY = "2"

//------------------eventbus-----------------------------//
class LoginEvent(var flag:Int,var number:String)
//-------------------------------------------------------//

//-------------------------url request response------------------------------//
@Keep
data class RegisterRequest(var username:String,var password:String,var code:String,var invite_code:String):Serializable
@Keep
data class LoginRequest(var username:String,var password:String,var device_type:String):Serializable
@Keep
data class LoginResponse(var token:String,var user:UserBean):Serializable
@Keep
data class UserBean(var id:Int,var user_type:Int,var sex:Int,var birthday:Int,var last_login_time:Int,var score:Int,var coin:Int,var balance:String,var create_time:Double,var user_status:Int,var user_login:String,var user_pass:String,var user_nickname:String,var user_email:String,var user_url:String,var avatar:String,var signature:String,var last_login_ip:String,var user_activation_key:String,var mobile:String,var more:String,var voc_coin:String):Serializable


@Keep
data class VersionResponse(var isUpdate:Int,var platform:String,var version:String,var url:String,var content:String):Serializable

@Keep
data class UploadCoinRequest(var id:String)

@Keep
data class TaskRequest(var code:String,var type:String)

@Keep
data class GetConfirmCodeRequest(var mobile:String)
