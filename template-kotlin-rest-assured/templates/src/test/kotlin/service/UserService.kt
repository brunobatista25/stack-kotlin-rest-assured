package service

import model.Users
import support.utils.RestContext
import support.enums.BaseUri
import support.enums.ApiPath
import java.util.HashMap

object UserService {

    fun createUser(nome: String?, email: String?, password: String?, administrador: String?) {
        RestContext.initRequest()
        RestContext.setPath(BaseUri.URLBASE.path, ApiPath.USER.path)

        val header: MutableMap<String, String> = HashMap()
        header["accept"] = "application/json"
        header["Content-Type"] = "application/json"
        RestContext.setHeader(header)

        val user = Users(nome, email, password, administrador)
        RestContext.setBody(user.toString())

        RestContext.postRequest()
    }

}