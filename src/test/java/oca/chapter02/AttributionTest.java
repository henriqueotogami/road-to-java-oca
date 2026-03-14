package oca.chapter02;

import oca.chapter02.primitives.example01.Attribution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * <br>Testes para verificar a funcionalidade da classe Attribution.
 * <br>Esses testes são importantes para garantir que a classe Attribution esteja funcionando conforme o esperado, realizando atribuições corretamente e lidando com exceções de forma adequada.
 *
 * @author henriqueotogami
 * @since 2026-02-23
 * @version 0.4
 * @see Attribution
 */
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class AttributionTest {

    /**
     * <br>Teste para verificar se a classe Attribution realiza atribuições corretamente e lida com exceções de forma adequada.
     * <br>Este teste é crucial para garantir que a classe Attribution esteja funcionando conforme o esperado, realizando atribuições corretamente e lançando exceções quando necessário.
     *
     * @author henriqueotogami
     * @since 2026-02-23
     * @version 0.4
     * @see Attribution
     */
    @Test
    @Order(1)
    void fishTest() {
        Attribution attribution = new Attribution();
        attribution.setDefaultDegrees();
        attribution.sumFishes(100, 50);
        Assertions.assertThrows(NumberFormatException.class, () -> { attribution.setFoundTotalFish("FISH"); });
        Assertions.assertEquals(100, attribution.getDegrees());
        Assertions.assertEquals(150, attribution.getTotalFish());

        attribution.afterIncrementDegrees();
        final int[] expectedDegrees1 = {6, 5, 4};
        for(int index = 0; expectedDegrees1.length > index; index++) Assertions.assertEquals(expectedDegrees1[index], attribution.getRegistersDegrees()[index]);

        attribution.afterDecrementDegrees();
        final int[] expectedDegrees2 = new int[]{6, 7, 8};
        for(int index = 0; expectedDegrees2.length > index; index++) Assertions.assertEquals(expectedDegrees2[index], attribution.getRegistersDegrees()[index]);

        attribution.beforeIncrementDegrees();
        final int[] expectedDegrees3 = {2, 3, 4};
        for(int index = 0; expectedDegrees3.length > index; index++) Assertions.assertEquals(expectedDegrees3[index], attribution.getRegistersDegrees()[index]);

        attribution.beforeDecrementDegrees();
        final int[] expectedDegrees4 = {9, 10, 11};
        for(int index = 0; expectedDegrees4.length > index; index++) Assertions.assertEquals(expectedDegrees4[index], attribution.getRegistersDegrees()[index]);
    }
}
