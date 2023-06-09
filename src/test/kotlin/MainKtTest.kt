import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertThrows
import java.lang.NullPointerException
import kotlin.test.fail

class MainKtTest {

    @Test
    @DisplayName("teste metodo countXO")
    fun testCountXO() {
        assertAll(
            { assertTrue(countXO("xxoo")) },
            { assertTrue(countXO("XXoo")) },
            { assertTrue(countXO("xxOO")) },
//            { assertTrue(countXO("XxOox")) },
//            { assertTrue(countXO("XxOox")) },
            { assertTrue(countXO("XxoO")) },
            { assertTrue(countXO("XxoO")) },
            { assertTrue(countXO("xXOo")) },
            { assertTrue(countXO("xXoO")) },
            { assertFalse(countXO("xxxoo")) }
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
//        fail("Não posso terminar os testes sem esse metodo")
    }

    @Test
    /**
     * Assert true só roda se a condiçao assumida no assumption for atendida
     * Do contrário o assert true não rodaria, e também não falharia.
     * */
    fun assumption() {
        assertAll(
            { Assumptions.assumeTrue(countXO("xxoo")) },
            { Assumptions.assumeFalse(countXO("xxo")) },
            { assertTrue(abc()) }
        )
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { exception() }
    }


    @Test
    @DisplayName("Teste Portaria")
    fun portariaTest() {
        assertEquals(portaria(15, "", ""), "NEGADO")
        assertEquals(portaria(20, "", ""), "NEGADO")

        assertEquals(portaria(25, "VIP", ""), "NEGADO")
        assertEquals(portaria(25, "comum", "xt123456"), "WELCOME")
        assertEquals(portaria(25, "comum", "4567889"), "NEGADO")
        assertEquals(portaria(25, "premium", "xt4567889"), "NEGADO")
        assertEquals(portaria(25, "premium", "4567889"), "NEGADO")
        assertEquals(portaria(25, "premium", "xl4567889"), "WELCOME")
        assertEquals(portaria(25, "luxo", "xl4567889"), "WELCOME")

        assertAll(
            { assertEquals(portaria(15, "", ""), "NEGADO") },
            { assertEquals(portaria(20, "", ""), "NEGADO") },
            { assertEquals(portaria(25, "VIP", ""), "NEGADO") },
            { assertEquals(portaria(25, "comum", "xt123456"), "WELCOME") },
            { assertEquals(portaria(25, "comum", "4567889"), "NEGADO") },
            { assertEquals(portaria(25, "premium", "xt4567889"), "NEGADO") },
            { assertEquals(portaria(25, "premium", "4567889"), "NEGADO") },
            { assertEquals(portaria(25, "premium", "xl4567889"), "WELCOME") },
            { assertEquals(portaria(25, "luxo", "xl4567889"), "WELCOME") })
    }

}



