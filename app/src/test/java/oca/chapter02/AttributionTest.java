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
 * @throws Exception
 */
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class AttributionTest {

    /**
     * <br>Teste para verificar se a classe Attribution realiza atribuições corretamente e lida com exceções de forma adequada.
     * <br>Este teste é crucial para garantir que a classe Attribution esteja funcionando conforme o esperado, realizando atribuições corretamente e lançando exceções quando necessário.
     *
     * @author henriqueotogami
     * @since 2026-02-23
     * @version 0.4
     * @see Attribution
     * @throws Exception
     */
    @Test
    @Order(1)
    public void fishTest() {
        Attribution attribution = new Attribution();
        attribution.setDefaultDegrees();
        attribution.sumFishes(100, 50);
        Assertions.assertThrows(NumberFormatException.class, () -> { attribution.setFoundTotalFish("FISH"); });
        Assertions.assertEquals(100, attribution.getDegrees());
        Assertions.assertEquals(150, attribution.getTotalFish());
    }
}
