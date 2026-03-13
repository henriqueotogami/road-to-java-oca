package oca.chapter01;

import oca.chapter01.fundamentals.exemple01.Example01PackageImport;
import oca.chapter01.fundamentals.exemple02.Example02SingleStaticImport;
import oca.chapter01.fundamentals.exemple03.Example03MultiStaticImport;
import oca.chapter01.fundamentals.exemple04.Example04Ship;
import oca.chapter01.fundamentals.exemple04.Example04Spaceship;
import oca.chapter01.fundamentals.exemple04.Example04SpaceshipSimulator;
import oca.chapter01.fundamentals.exemple05.Example05GreetingsUniverse;
import oca.chapter01.fundamentals.exemple06.Example06PropertiesManager;
import oca.chapter01.fundamentals.exercise01.Exercise01Import;
import oca.chapter01.fundamentals.exercise02.Exercise02Compile;
import oca.chapter01.fundamentals.plus.Study01StringTokenizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.StringTokenizer;
import java.util.logging.FileHandler;


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

    /**
     * <br>Teste para verificar se a classe Example02SingleStaticImport importa corretamente o membro estático ITALY.
     * <br>Este teste é importante para garantir que a classe Example02SingleStaticImport esteja funcionando conforme o esperado, importando o membro estático e definindo a variável hasImportedStaticMember como true após chamar o método getSingleStaticImport.
     *
     * @author henriqueotogami
     * @since 2026-03-07
     * @version 1.0
     * @see Example02SingleStaticImport
     */
    @Test
    @Order(2)
    void example02Test() {
        Example02SingleStaticImport example = new Example02SingleStaticImport();
        example.getSingleStaticImport();
        Assertions.assertTrue(example.isHasImportedStaticMember(), "Expected hasImportedStaticMember to be true after calling getSingleStaticImport");
    }

    /**
     * <br>Teste para verificar se a classe Example03MultiStaticImport importa corretamente os membros estáticos ITALY, GERMANY e JAPANESE.
     * <br>Este teste é importante para garantir que a classe Example03MultiStaticImport esteja funcionando conforme o esperado, importando os membros estáticos e definindo a variável hasImportedStaticMember como true após chamar o método getMultiStaticImport.
     *
     * @author henriqueotogami
     * @since 2026-03-07
     * @version 1.0
     * @see Example03MultiStaticImport
     */
    @Test
    @Order(3)
    void example03Test() {
        Example03MultiStaticImport example = new Example03MultiStaticImport();
        example.getMultiStaticImport();
        Assertions.assertTrue(example.isHasImportedStaticMember(), "Expected hasImportedStaticMember to be true after calling getMultiStaticImport");
    }

    /**
     * <br>Teste para verificar se a classe Example04Spaceship acopla corretamente a nave espacial.
     * <br>Este teste é importante para garantir que a classe Example04Spaceship esteja funcionando conforme o esperado, acoplando a nave espacial e definindo a variável isDocked como true após chamar o método dockShip.
     *
     * @author henriqueotogami
     * @since 2026-03-07
     * @version 1.0
     * @see Example04Spaceship
     */
    @Test
    @Order(4)
    void example04Test() {
        Example04Spaceship ship1 = new Example04Spaceship();
        ship1.dockShip();
        Assertions.assertTrue(ship1.isDocked(), "Expected ship1 to be docked after calling dockShip()");
        Assertions.assertEquals(Example04Ship.ShipType.BATTLESHIP.name(), ship1.getShipType(), "Expected default ship type to be BATTLESHIP");

        Example04Spaceship ship2 = new Example04Spaceship(Example04Ship.ShipType.FRIGATE);
        ship2.dockShip();
        Assertions.assertTrue(ship2.isDocked(), "Expected ship2 to be docked after calling dockShip()");
        Assertions.assertEquals(Example04Ship.ShipType.FRIGATE.name(), ship2.getShipType(), "Expected ship type to be FRIGATE");

        Assertions.assertEquals("oca.chapter01.fundamentals.exemple04.Example04SpaceshipSimulator", Example04SpaceshipSimulator.logger.getName(), "Expected class name to be oca.chapter01.fundamentals.exemple04.Example04SpaceshipSimulator");
    }

    /**
     * <br>Teste para verificar se a classe Example05GreetingsUniverse retorna a saudação correta.
     * <br>Este teste é importante para garantir que a classe Example05GreetingsUniverse esteja funcionando conforme o esperado, retornando a saudação "Greetings, Universe!" quando o método getGreetings for chamado.
     *
     * @author henriqueotogami
     * @since 2026-03-07
     * @version 1.0
     * @see Example05GreetingsUniverse
     */
    @Test
    @Order(5)
    void example05Test() {
        Example05GreetingsUniverse example = new Example05GreetingsUniverse();
        Assertions.assertEquals("Greetings, Universe!", example.getGreetings());
    }


    /**
     * <br>Teste para verificar se a classe Example06PropertiesManager gerencia corretamente as propriedades do sistema.
     * <br>Este teste é importante para garantir que a classe Example06PropertiesManager esteja funcionando conforme o esperado, gerenciando as propriedades do sistema, listando todas as propriedades e verificando a presença de propriedades específicas.
     *
     * @author henriqueotogami
     * @since 2026-03-07
     * @version 1.0
     * @see Example06PropertiesManager
     */
    @Test
    @Order(6)
    void example06Test() {
        Example06PropertiesManager manager = new Example06PropertiesManager();
        Assertions.assertNotNull(manager.getProps(), "Expected properties object to be initialized");
        Assertions.assertNotEquals(0, manager.getProps().size(), "Expected properties to contain 60 entries (default system properties)");
        Assertions.assertTrue(manager.printAllProperties(manager.getProps()), "Expected printAllProperties to return true");

        Assertions.assertTrue(manager.isMissingProperty(new String[] {"-list_prop"}), "Expected isMissingProperty to return true when property name is missing");
        Assertions.assertFalse(manager.isMissingProperty(new String[] {"-list_prop", "java.version", "user.name"}), "Expected isMissingProperty to return false when property name is provided");

        Assertions.assertTrue(manager.isArgsEmpty(new String[0]), "Expected isArgsEmpty to return true when args array is empty");
        Assertions.assertFalse(manager.isArgsEmpty(new String[] {"-list_all"}), "Expected isArgsEmpty to return false when args array is not empty");

        Assertions.assertTrue(Example06PropertiesManager.main(new String[] {"-list_all"}), "Expected main method to execute without throwing an exception when -list_all argument is provided");
        Assertions.assertTrue(Example06PropertiesManager.main(new String[] {"-list_prop", "java.version"}), "Expected main method to execute without throwing an exception when -list_prop argument is provided with a property name");
        Assertions.assertFalse(Example06PropertiesManager.main(new String[] {"-list_prop"}), "Expected main method to execute without throwing an exception when -list_prop argument is provided without a property name");
        Assertions.assertFalse(Example06PropertiesManager.main(new String[] {"-invalid_arg"}), "Expected main method to execute without throwing an exception when an invalid argument is provided");
        Assertions.assertFalse(Example06PropertiesManager.main(new String[0]), "Expected main method to execute without throwing an exception when no arguments are provided");
    }


    /**
     * <br>Teste para verificar se a classe Study01StringTokenizer divide corretamente a string em tokens usando o delimitador especificado.
     * <br>Este teste é importante para garantir que a classe Study01StringTokenizer esteja funcionando conforme o esperado, dividindo a string "um,dois,três" em três tokens ("um", "dois", "três") usando a vírgula como delimitador.
     *
     * @author henriqueotogami
     * @since 2026-03-07
     * @version 1.0
     * @see Study01StringTokenizer
     */
    @Test
    @Order(7)
    void study01Test() {
        Study01StringTokenizer example = new Study01StringTokenizer();
        example.setStringTokenizer(new StringTokenizer("um,dois,três", ","));
        Assertions.assertTrue(example.printTokens(), "Expected printTokens to return true when printing tokens");

        example.setStringTokenizer(new StringTokenizer("um,dois,três", ","));
        Assertions.assertEquals(3, example.getStringTokenizer().countTokens());

        Assertions.assertTrue(example.getStringTokenizer().hasMoreTokens());
        Assertions.assertTrue(example.getStringTokenizer().hasMoreElements());
        Assertions.assertEquals("um", example.getStringTokenizer().nextToken());

        Assertions.assertTrue(example.getStringTokenizer().hasMoreTokens());
        Assertions.assertTrue(example.getStringTokenizer().hasMoreElements());
        Assertions.assertEquals("dois", example.getStringTokenizer().nextToken());

        Assertions.assertTrue(example.getStringTokenizer().hasMoreTokens());
        Assertions.assertTrue(example.getStringTokenizer().hasMoreElements());
        Assertions.assertEquals("três", example.getStringTokenizer().nextToken());

        Assertions.assertFalse(example.getStringTokenizer().hasMoreTokens());
        Assertions.assertFalse(example.getStringTokenizer().hasMoreElements());
        Assertions.assertFalse(example.printTokens(), "Expected printTokens to return false when there are no more tokens to print");
    }

    /**
     * <br>Teste para verificar se a classe Exercise02Compile habilita o logging corretamente e inicia o universo com sucesso.
     * <br>Este teste é importante para garantir que a classe Exercise02Compile esteja funcionando conforme o esperado, habilitando o logging e iniciando o universo com sucesso quando o logging estiver habilitado.
     *
     * @author henriqueotogami
     * @since 2026-03-07
     * @version 1.0
     * @see Exercise02Compile
     */
    @Test
    @Order(8)
    void exercise02Test() {
        final Exercise02Compile exercise = new Exercise02Compile();
        exercise.setLoggingEnabled(true);
        Assertions.assertTrue(exercise.isLoggingEnabled(), "Expected logging to be enabled after setting it to true");
        Assertions.assertTrue(exercise.startUniverse(), "Expected universe to start successfully when logging is enabled");
    }

    /**
     * <br>Teste para verificar se a classe Exercise01Import cria um arquivo de log corretamente.
     * <br>Este teste é importante para garantir que a classe Exercise01Import esteja funcionando conforme o esperado, criando um arquivo de log com mensagens de log usando o pacote java.util.logging.
     *
     * @author henriqueotogami
     * @since 2026-03-07
     * @version 1.0
     * @see Exercise01Import
     */
    @Test
    @Order(9)
    void exercise01Test() throws Exception {
        Exercise01Import exercise = new Exercise01Import();
        FileHandler fileHandler = exercise.getFileHandler("src\\test\\resources\\TestLog.txt");
        Assertions.assertNotNull(fileHandler, "Expected file handler to be created successfully");
        Assertions.assertTrue(exercise.createFile(fileHandler), "Expected createFile to return true when file handler is created successfully");

        Assertions.assertFalse(exercise.createFile(null), "Expected createFile to return false when file handler is null");
        Assertions.assertFalse(exercise.createFileLog(null), "Expected createFileLog to return false when path is null");
        Assertions.assertNull(exercise.getFileHandler(null), "Expected getFileHandler to return null when path is null");
    }


}