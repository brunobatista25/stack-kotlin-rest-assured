package service

import model.Contact
import support.utils.RestContext
import support.enums.BaseUri
import support.enums.ApiPath
import java.util.HashMap

object CreateContactService {

    fun createContact(name: String?, last_name: String?, email: String?, age: Int?,
                      phone: String, address: String?, state: String?, city: String?) {
        RestContext.initRequest()
        RestContext.setPath(BaseUri.URLBASE.path, ApiPath.USER.path)
        val header: MutableMap<String, String> = HashMap()
        header["Content-type"] = "application/json"
        header["Accept"] = "application/vnd.tasksmanager.v2"
        RestContext.setHeader(header)
        val user = Contact(name, last_name, email, age, phone, address, state, city)
        RestContext.setBody(user.toString())
        RestContext.postRequest()
    }
}