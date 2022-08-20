package model

class Users(val nome: String?,
            val email: String?,
            val password: String?,
            val administrador: String?) {

    override fun toString(): String {
        return "{\n" +
                "  \"nome\": \"$nome\",\n" +
                "  \"email\": \"$email\",\n" +
                "  \"password\": \"$password\",\n" +
                "  \"administrador\": \"$administrador\"\n" +
                "}"
    }
}