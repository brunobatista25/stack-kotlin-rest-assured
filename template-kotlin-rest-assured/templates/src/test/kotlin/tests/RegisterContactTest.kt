package tests

import com.github.javafaker.Faker
import io.restassured.response.ValidatableResponse
import org.junit.Assert
import org.junit.Test
import service.CreateContactService.createContact
import support.utils.GetProperties.getProp
import support.utils.RestContext.response

class RegisterContactTest {
    lateinit var jsonResponse: ValidatableResponse
    var faker = Faker()
    var fakeName: String = faker.name().firstName()
    var fakeLastName: String = faker.name().lastName()
    var fakeEmail: String = faker.name().firstName() + "@gmail.com"

    @Test
    fun postRegisterUserSuccessful() {
        createContact(fakeName, fakeLastName, fakeEmail, 12, "21984759575", "Rua 1","Rio de Janeiro","Rio de Janeiro" )
        jsonResponse = response!!.then().log().all()

        Assert.assertNotNull(jsonResponse.extract().path<String>("data.id"))
        Assert.assertEquals("contacts", jsonResponse.extract().path<String>("data.type"))
        Assert.assertEquals(fakeName, jsonResponse.extract().path<String>("data.attributes.name"))
        Assert.assertEquals(fakeLastName, jsonResponse.extract().path<String>("data.attributes.last-name"))
        Assert.assertEquals(fakeEmail, jsonResponse.extract().path<String>("data.attributes.email"))
        Assert.assertEquals(12, jsonResponse.extract().path<String>("data.attributes.age"))
        Assert.assertEquals("21984759575", jsonResponse.extract().path<String>("data.attributes.phone"))
        Assert.assertEquals("Rua 1", jsonResponse.extract().path<String>("data.attributes.address"))
        Assert.assertEquals("Rio de Janeiro", jsonResponse.extract().path<String>("data.attributes.state"))
        Assert.assertEquals("Rio de Janeiro", jsonResponse.extract().path<String>("data.attributes.city"))
    }

}