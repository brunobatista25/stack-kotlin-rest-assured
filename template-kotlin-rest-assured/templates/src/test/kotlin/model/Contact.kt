package model

class Contact(val name: String?,
              val last_name: String?,
              val email: String?,
              val age: Int?,
              val phone: String?,
              val address: String?,
              val state: String?,
              val city: String?) {

    override fun toString(): String {
        return "{\n" +
                "  \"name\": \"$name\",\n" +
                "  \"last_name\": \"$last_name\",\n" +
                "  \"email\": \"$email\",\n" +
                "  \"age\": $age,\n" +
                "  \"phone\": \"$phone\",\n" +
                "  \"address\": \"$address\",\n" +
                "  \"state\": \"$state\",\n" +
                "  \"city\": \"$city\"\n" +
                "}"
    }
}