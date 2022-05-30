import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculadoraTest {

    private static Calculadora calculadora;

    @BeforeAll
    public static void setup(){
        calculadora = new Calculadora();
    }
    @Test
    public void sumarTest(){
        //Instrucciones
        int resutado = calculadora.sumar(5,3);
        assertEquals(8,resutado);
        assertTrue(resutado==8);
    }

    //Compruieba el resuñtado cuando el denominador es 0
    @Test
    public void dividirTest_0(){
        int resutado = calculadora.dividir(10,0);
        assertEquals(-1,resutado);
    }
    //Compruieba el resuñtado cuando el denominador NO es 0
    // @Disabled
    @Test
    public void dividirTest(){
        int resutado = calculadora.dividir(10,2);
        assertEquals(5,resutado);
    }

}
