package tests

import com.github.javafaker.Faker
import io.restassured.response.ValidatableResponse
import org.junit.Assert
import org.junit.Test
import service.UserService.createUser
import service.UserService.deleteUser
import service.UserService.editUser
import service.UserService.getUserById
import support.utils.GetProperties.getProp
import support.utils.RestContext.response

class UsersTest {
    lateinit var jsonResponse: ValidatableResponse
    var faker = Faker()
    var fakeName: String = faker.name().firstName() + faker.name().lastName()
    var fakeEmail: String = faker.name().firstName() + "@gmail.com"

    @Test
    fun postRegisterUserSuccessful() {
        createUser(fakeName, fakeEmail, "123456", "false")
        jsonResponse = response!!.then().log().all()

        Assert.assertEquals(getProp("messagem_de_sucesso"), jsonResponse.extract().path<String>("message"))
        Assert.assertNotNull(jsonResponse.extract().path<String>("_id"))
    }

}