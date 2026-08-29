package oca.chapter07;

import oca.chapter07.inheritance.example01.Animal;
import oca.chapter07.inheritance.example01.NewCat;
import oca.chapter07.inheritance.example01.NewDog;
import oca.chapter07.inheritance.example02.CDPlayer;
import oca.chapter07.inheritance.example02.MP3Player;
import oca.chapter07.inheritance.example02.MusicPlayer;
import oca.chapter07.inheritance.example03.CellPhone;
import oca.chapter07.inheritance.example03.LandlinePhone;
import oca.chapter07.inheritance.example03.Phone;
import oca.chapter07.inheritance.example04.ScoreBoard;
import oca.chapter07.inheritance.example05.PhoneBookEntry;
import oca.chapter07.inheritance.example06.Bicycle;
import oca.chapter07.inheritance.example06.TenSpeedBicycle;
import oca.chapter07.inheritance.example07.MapleTree;
import oca.chapter07.inheritance.example07.Plant;
import oca.chapter07.inheritance.example07.Tulip;
import oca.chapter07.inheritance.example08.Fax;
import oca.chapter07.inheritance.example08.Printer;
import oca.chapter07.inheritance.example08.PrinterFaxCombo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;

/**
 * <br>Classe de teste para os exemplos de herança em Java do capítulo 07.
 * <br>Valida conceitos de herança de classe, classes abstratas, interfaces, sobrescrita de métodos e implementação múltipla.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 1.0
 */
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class ExamplesTest {

    /**
     * <br>Teste para verificar se a subclasse NewDog possui relação IS-A com a superclasse Animal.
     * <br>Este teste é importante para garantir que a herança em Java estabelece corretamente a relação entre subclasse e superclasse.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see NewDog
     * @see Animal
     */
    @Test
    @Order(1)
    void example01InheritanceIsA() {
        // Arrange
        final NewDog newDog = new NewDog();

        // Act & Assert
        Assertions.assertTrue(newDog instanceof Animal,
                "NewDog deve ser uma instância de Animal, demonstrando a relação IS-A da herança.");
    }

    /**
     * <br>Teste para verificar se a subclasse NewDog herda métodos da superclasse Animal.
     * <br>Este teste é importante para garantir que métodos herdados permanecem acessíveis e executáveis na subclasse.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see NewDog
     * @see Animal
     */
    @Test
    @Order(2)
    void example01InheritedMethods() {
        // Arrange
        final NewDog newDog = new NewDog();
        final int direction = 90;

        // Act
        newDog.eat();
        newDog.rest();
        newDog.move(direction);
        newDog.bark();

        // Assert
        Assertions.assertTrue(newDog instanceof Animal,
                "NewDog deve herdar e executar métodos da superclasse Animal sem lançar exceção.");
    }

    /**
     * <br>Teste para verificar se múltiplas subclasses compartilham a mesma superclasse Animal.
     * <br>Este teste é importante para garantir que diferentes subclasses podem estender a mesma superclasse mantendo comportamentos específicos.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see NewCat
     * @see NewDog
     * @see Animal
     */
    @Test
    @Order(3)
    void example01MultipleSubclasses() {
        // Arrange
        final NewCat newCat = new NewCat();
        final NewDog newDog = new NewDog();

        // Act & Assert
        Assertions.assertTrue(newCat instanceof Animal,
                "NewCat deve ser uma instância de Animal.");
        Assertions.assertTrue(newDog instanceof Animal,
                "NewDog deve ser uma instância de Animal.");
    }

    /**
     * <br>Teste para verificar se MP3Player implementa corretamente os métodos abstratos de MusicPlayer.
     * <br>Este teste é importante para garantir que classes concretas devem implementar todos os métodos abstratos da superclasse abstrata.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see MP3Player
     * @see MusicPlayer
     */
    @Test
    @Order(4)
    void example02AbstractClassImplementation() {
        // Arrange
        final MP3Player mp3Player = new MP3Player();

        // Act
        mp3Player.play();
        mp3Player.stop();
        mp3Player.changeVolume(50);

        // Assert
        Assertions.assertTrue(mp3Player instanceof MusicPlayer,
                "MP3Player deve ser uma instância de MusicPlayer.");
    }

    /**
     * <br>Teste para verificar se CDPlayer também implementa os métodos abstratos de MusicPlayer.
     * <br>Este teste é importante para garantir que múltiplas subclasses concretas podem estender a mesma classe abstrata.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see CDPlayer
     * @see MusicPlayer
     */
    @Test
    @Order(5)
    void example02MultipleConcreteSubclasses() {
        // Arrange
        final CDPlayer cdPlayer = new CDPlayer();

        // Act
        cdPlayer.play();
        cdPlayer.stop();

        // Assert
        Assertions.assertTrue(cdPlayer instanceof MusicPlayer,
                "CDPlayer deve ser uma instância de MusicPlayer.");
    }

    /**
     * <br>Teste para verificar se CellPhone implementa corretamente a interface Phone.
     * <br>Este teste é importante para garantir que classes concretas devem cumprir o contrato definido por uma interface.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see CellPhone
     * @see Phone
     */
    @Test
    @Order(6)
    void example03CellPhoneInterface() {
        // Arrange
        final CellPhone cellPhone = new CellPhone();
        final int phoneNumber = 1198765432;
        final boolean expectedCallInProgress = false;

        // Act
        cellPhone.dialNumber(phoneNumber);
        final boolean isCallInProgress = cellPhone.isCallInProgress();

        // Assert
        Assertions.assertTrue(cellPhone instanceof Phone,
                "CellPhone deve ser uma instância de Phone.");
        Assertions.assertEquals(expectedCallInProgress, isCallInProgress,
                "Após discar, a chamada não deve permanecer em andamento.");
    }

    /**
     * <br>Teste para verificar se LandlinePhone implementa corretamente a interface Phone.
     * <br>Este teste é importante para garantir que diferentes classes podem implementar a mesma interface com o mesmo contrato.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see LandlinePhone
     * @see Phone
     */
    @Test
    @Order(7)
    void example03LandlinePhoneInterface() {
        // Arrange
        final LandlinePhone landlinePhone = new LandlinePhone();
        final int phoneNumber = 1133334444;
        final boolean expectedCallInProgress = false;

        // Act
        landlinePhone.dialNumber(phoneNumber);
        final boolean isCallInProgress = landlinePhone.isCallInProgress();

        // Assert
        Assertions.assertTrue(landlinePhone instanceof Phone,
                "LandlinePhone deve ser uma instância de Phone.");
        Assertions.assertEquals(expectedCallInProgress, isCallInProgress,
                "Após discar, a chamada não deve permanecer em andamento.");
    }

    /**
     * <br>Teste para verificar os métodos getter e setter da classe ScoreBoard.
     * <br>Este teste é importante para garantir que o encapsulamento de dados funciona corretamente em classes de suporte a herança.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see ScoreBoard
     */
    @Test
    @Order(8)
    void example04ScoreBoardGetSet() {
        // Arrange
        final ScoreBoard scoreBoard = new ScoreBoard();
        final int expectedScore = 42;

        // Act
        scoreBoard.setScore(expectedScore);
        final int actualScore = scoreBoard.getScore();

        // Assert
        Assertions.assertEquals(expectedScore, actualScore,
                "O método getScore deve retornar o valor definido por setScore.");
    }

    /**
     * <br>Teste para verificar se PhoneBookEntry armazena nome e número corretamente.
     * <br>Este teste é importante para garantir que métodos de acesso e mutação de dados funcionam em classes usadas em hierarquias de objetos.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see PhoneBookEntry
     */
    @Test
    @Order(9)
    void example05PhoneBookEntrySetNameNumber() {
        // Arrange
        final PhoneBookEntry entry = new PhoneBookEntry();
        final String expectedName = "Henrique";
        final int expectedPhoneNumber = 1199988776;

        // Act
        entry.setNameNumber(expectedName, expectedPhoneNumber);

        // Assert
        Assertions.assertEquals(expectedName, entry.getName(),
                "O método getName deve retornar o nome definido por setNameNumber.");
        Assertions.assertEquals(expectedPhoneNumber, entry.getPhoneNumber(),
                "O método getPhoneNumber deve retornar o número definido por setNameNumber.");
    }

    /**
     * <br>Teste para verificar o cálculo de rotação da roda na classe Bicycle.
     * <br>Este teste é importante para garantir que a superclasse calcula corretamente wheelRPM com base na rotação do pedal.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see Bicycle
     */
    @Test
    @Order(10)
    void example06BicyclePedalRPM() {
        // Arrange
        final Bicycle bicycle = new Bicycle();
        final float pedalRPM = 50f;
        final float expectedWheelRPM = 100f;

        // Act
        bicycle.pedalRPM(pedalRPM);
        final float actualWheelRPM = bicycle.getWheelRPM();

        // Assert
        Assertions.assertEquals(expectedWheelRPM, actualWheelRPM, 0.001f,
                "O método pedalRPM deve calcular wheelRPM como pedalRPM multiplicado pela relação de marchas padrão (2).");
    }

    /**
     * <br>Teste para verificar a sobrescrita do método pedalRPM na subclasse TenSpeedBicycle.
     * <br>Este teste é importante para garantir que a subclasse pode sobrescrever comportamento da superclasse com uma relação de marchas configurável.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see TenSpeedBicycle
     * @see Bicycle
     */
    @Test
    @Order(11)
    void example06TenSpeedBicycleOverride() {
        // Arrange
        final TenSpeedBicycle tenSpeedBicycle = new TenSpeedBicycle();
        final float gearRatio = 3f;
        final float pedalRPM = 40f;
        final float expectedWheelRPM = 120f;
        final int expectedDegreeOfTurn = 10;

        // Act
        tenSpeedBicycle.setGearRatio(gearRatio);
        tenSpeedBicycle.setDegreeOfTurn(expectedDegreeOfTurn);
        tenSpeedBicycle.pedalRPM(pedalRPM);
        final float actualWheelRPM = tenSpeedBicycle.getWheelRPM();

        // Assert
        Assertions.assertEquals(expectedWheelRPM, actualWheelRPM, 0.001f,
                "TenSpeedBicycle deve calcular wheelRPM usando a relação de marchas configurada.");
        Assertions.assertEquals(expectedDegreeOfTurn, tenSpeedBicycle.getDegreeOfTurn(),
                "TenSpeedBicycle deve herdar o método getDegreeOfTurn da superclasse Bicycle.");
    }

    /**
     * <br>Teste para verificar o crescimento sazonal da MapleTree ao longo da primavera e verão.
     * <br>Este teste é importante para garantir que subclasses concretas implementam corretamente os métodos abstratos de Plant.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see MapleTree
     * @see Plant
     */
    @Test
    @Order(12)
    void example07MapleTreeSeasonalGrowth() {
        // Arrange
        final MapleTree mapleTree = new MapleTree();
        final int expectedAgeAfterSpring = 1;
        final int expectedHeightAfterSpring = 2;
        final int expectedHeightAfterSummer = 4;

        // Act
        mapleTree.doSpring();
        final int ageAfterSpring = mapleTree.getAge();
        final int heightAfterSpring = mapleTree.getHeight();
        mapleTree.doSummer();
        final int heightAfterSummer = mapleTree.getHeight();

        // Assert
        Assertions.assertEquals(expectedAgeAfterSpring, ageAfterSpring,
                "MapleTree deve incrementar a idade durante a primavera.");
        Assertions.assertEquals(expectedHeightAfterSpring, heightAfterSpring,
                "MapleTree deve crescer 2 unidades durante a primavera.");
        Assertions.assertEquals(expectedHeightAfterSummer, heightAfterSummer,
                "MapleTree deve crescer mais 2 unidades durante o verão.");
    }

    /**
     * <br>Teste para verificar o comportamento da Tulip durante o inverno, recolhendo-se ao nível do solo.
     * <br>Este teste é importante para garantir que subclasses podem implementar comportamentos distintos para os mesmos métodos abstratos.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see Tulip
     * @see Plant
     */
    @Test
    @Order(13)
    void example07TulipWinterDieDown() {
        // Arrange
        final Tulip tulip = new Tulip();
        final int expectedHeightAfterSpring = 1;
        final int expectedHeightAfterWinter = 0;

        // Act
        tulip.doSpring();
        final int heightAfterSpring = tulip.getHeight();
        tulip.doSummer();
        tulip.doFall();
        tulip.doWinter();
        final int heightAfterWinter = tulip.getHeight();

        // Assert
        Assertions.assertEquals(expectedHeightAfterSpring, heightAfterSpring,
                "Tulip deve crescer 1 unidade durante a primavera.");
        Assertions.assertEquals(expectedHeightAfterWinter, heightAfterWinter,
                "Tulip deve recolher-se ao nível do solo durante o inverno.");
    }

    /**
     * <br>Teste para verificar se PrinterFaxCombo implementa as interfaces Printer e Fax simultaneamente.
     * <br>Este teste é importante para garantir que uma classe pode implementar múltiplas interfaces em Java.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see PrinterFaxCombo
     * @see Printer
     * @see Fax
     */
    @Test
    @Order(14)
    void example08MultipleInterfaces() {
        // Arrange
        final PrinterFaxCombo combo = new PrinterFaxCombo();

        // Act & Assert
        Assertions.assertTrue(combo instanceof Printer,
                "PrinterFaxCombo deve implementar a interface Printer.");
        Assertions.assertTrue(combo instanceof Fax,
                "PrinterFaxCombo deve implementar a interface Fax.");
    }

    /**
     * <br>Teste para verificar os métodos de PrinterFaxCombo, incluindo a sobrescrita do método default getInkLevel.
     * <br>Este teste é importante para garantir que classes concretas podem sobrescrever métodos default de interfaces e executar operações de impressão e fax.
     *
     * @author henriqueotogami
     * @since 2026-08-29
     * @version 1.0
     * @see PrinterFaxCombo
     * @see Printer
     */
    @Test
    @Order(15)
    void example08PrinterFaxComboMethods() {
        // Arrange
        final PrinterFaxCombo combo = new PrinterFaxCombo();
        final File testFile = new File("test-document.txt");
        final int faxNumber = 1133224455;
        final int expectedInkLevel = 0;

        // Act
        combo.printFile(testFile);
        combo.sendFax(testFile, faxNumber);
        final int actualInkLevel = combo.getInkLevel();
        final Object receivedFaxes = combo.getReceivedFaxes();

        // Assert
        Assertions.assertEquals(expectedInkLevel, actualInkLevel,
                "PrinterFaxCombo deve sobrescrever getInkLevel e retornar o nível de tinta da instância.");
        Assertions.assertNull(receivedFaxes,
                "Nenhum fax recebido deve estar armazenado inicialmente.");
    }
}
