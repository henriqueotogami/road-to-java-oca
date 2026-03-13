package oca.chapter01;

import oca.chapter01.fundamentals.exercise01.Exercise01Import;
import oca.chapter01.fundamentals.exercise02.Exercise02Compile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * <br>Testes para verificar a funcionalidade das classes Exercise01Import e Exercise02Compile.
 * <br>Esses testes são importantes para garantir que as classes estejam funcionando conforme o esperado, criando arquivos de log corretamente e compilando sem erros.
 *
 * @author henriqueotogami
 * @since 2026-02-22
 * @version 1.0
 * @see Exercise01Import
 * @see Exercise02Compile
 */
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class ImportAndCompileTest {

    /**
     * <br>Teste para verificar se a classe Exercise01Import cria um arquivo de log corretamente.
     * <br>Este teste é importante para garantir que a classe Exercise01Import esteja funcionando conforme o esperado, criando um arquivo de log com as mensagens apropriadas.
     *
     * @author henriqueotogami
     * @since 2026-02-22
     * @version 1.0
     * @see Exercise01Import
     */
    @Test
    @Order(1)
    void exercise01ImportTest() {
        final Exercise01Import exercise = new Exercise01Import();
        final boolean hasCreatedFile    = exercise.createFileLog("logs");
        Assertions.assertTrue(hasCreatedFile, "Expected log file to be created successfully");
    }

    /**
     * <br>Teste para verificar se a classe Exercise02Compile compila corretamente e se o metodo startUniverse() retorna true.
     * <br>Este teste é crucial para garantir que a classe Exercise02Compile esteja corretamente importada e que seu metodo startUniverse() funcione conforme esperado, permitindo que o exercício seja executado sem erros de compilação.
     *
     * @author henriqueotogami
     * @since 2026-02-22
     * @version 1.0
     * @see Exercise02Compile
     */
    @Test
    @Order(2)
    void exercise02CompileTest() {
        final Exercise02Compile exercise = new Exercise02Compile();
        final boolean hasStartedUniverse = exercise.startUniverse();
        Assertions.assertTrue(hasStartedUniverse, "Expected universe to start successfully");
    }
}
