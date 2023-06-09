import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
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
}