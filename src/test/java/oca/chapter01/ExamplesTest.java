package oca.chapter01;

import oca.chapter01.fundamentals.exemple01.Example01PackageImport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class ExamplesTest {

    /**
     * <br>Teste para verificar se a classe Example01PackageImport gera uma lista de planetas corretamente.
     * <br>Este teste é importante para garantir que a classe Example01PackageImport esteja funcionando conforme o esperado, gerando uma lista de planetas que não esteja vazia.
     *
     * @author henriqueotogami
     * @since 2026-03-07
     * @version 1.0
     * @see Example01PackageImport
     */
    @Test
    @Order(1)
    void example01Test(){
        Example01PackageImport example = new Example01PackageImport();
        example.generateCoolPlanets();
        Assertions.assertFalse(example.getPlanetList().isEmpty(), "Expected planet list to contain at least one planet");
    }
}