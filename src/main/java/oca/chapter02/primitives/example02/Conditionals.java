package oca.chapter02.primitives.example02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe demonstrativa sobre estruturas condicionais em Java.
 * <p>
 * Contém um enum interno {@link Weather} com vários estados de tempo e
 * metodos utilitários para mapear identificadores (ids) e nomes para valores
 * de enum, assim como para obter um evento de tempo (uma string resumida)
 * a partir de um valor de {@code Weather}.
 * <p>
 * Este exemplo é usado para ilustrar o uso de: enums, switch, loops, exceções
 * e asserções em código didático para preparação ao exame OCA.
 *
 * Principais responsabilidades:
 * - Fornecer mapeamento de id -> {@code Weather} e nome -> {@code Weather}.
 * - Converter um {@code Weather} para um evento textual curto (ex: "RAIN").
 *
 * Observações:
 * - Os metodos lançam exceções documentadas quando parâmetros inválidos são
 *   fornecidos (por exemplo, {@link ArrayIndexOutOfBoundsException} e
 *   {@link IllegalArgumentException}).
 * - O metodo {@link #getWeatherEvent(Weather)} assume que o argumento não é
 *   nulo (passar {@code null} resultará em {@link NullPointerException}).
 *
 * @author henriqueotogami
 * @since 2026-02-25
 * @version 1.1
 */
public class Conditionals {

    private static final Logger logger = LogManager.getLogger(Conditionals.class);
    
    /**
     * Enum que representa diversos estados do tempo (weather).
     * Cada constante possui um identificador inteiro e uma mensagem legível.
     */
    public enum Weather {
        UNKNOWN_WEATHER(0, "Unknown weather condition!"),

        ITS_RAINING(1, "It's raining!"),
        ITS_WINDING(2, "It's winding!"),
        ITS_SUNNY(3, "It's sunny!"),
        ITS_THUNDERING(4, "It's thundering!"),
        ITS_CLOUDY(5, "It's cloudy!"),

        ITS_NOT_RAINING(6, "It's not raining!"),
        ITS_NOT_WINDING(7, "It's not winding!"),
        ITS_NOT_SUNNY(8, "It's not sunny!"),
        ITS_NOT_THUNDERING(9, "It's not thundering!"),
        ITS_NOT_CLOUDY(10, "It's cloudy!");

        private final int id;
        private final String message;

        Weather(final int id, final String message) {
            this.id = id;
            this.message = message;
        }

        /**
         * Retorna o identificador inteiro desta constante.
         */
        public int getId() {
            return this.id;
        }

        /**
         * Retorna a mensagem legível associada a esta constante.
         */
        public String getMessage() {
            return this.message;
        }
    }

    /**
     * Retorna o {@link Weather} correspondente ao identificador fornecido.
     * <p>
     * Observação: este metodo percorre todas as constantes do enum e compara
     * o campo {@code id}. Se nenhum valor corresponder, retorna {@code null}.
     *
     * @param id identificador do tempo (conforme definido nas constantes do enum)
     * @return o {@code Weather} correspondente, ou {@code null} se não houver correspondência
     * @throws ArrayIndexOutOfBoundsException se o id estiver fora de um intervalo
     *                                        esperado (implementação atual verifica se id &gt; quantidade de constantes)
     */
    public Weather getWeatherType(final int id) throws ArrayIndexOutOfBoundsException {
        final Weather[] allWeather = Conditionals.Weather.values();

        if (id > allWeather.length) throw new ArrayIndexOutOfBoundsException();

        for (Weather weather : allWeather) {
            if (weather.getId() == id) {
                logger.info(weather.getMessage());
                return weather;
            }
        }
        return null;
    }

    /**
     * Converte um nome (string) no correspondente valor do enum {@link Weather}.
     * <p>
     * Este metodo delega ao {@code Enum.valueOf} e, portanto, lança
     * {@link IllegalArgumentException} se o nome não corresponder a nenhuma
     * constante do enum (ou {@link NullPointerException} se o nome for nulo).
     *
     * @param name nome da constante do enum (ex.: "ITS_RAINING")
     * @return o {@code Weather} correspondente ao nome fornecido
     * @throws IllegalArgumentException se não existir constante com esse nome
     */
    public Weather getWeatherType(final String name) throws IllegalArgumentException {
        return Conditionals.Weather.valueOf(name);
    }

    /**
     * Retorna um código de evento (string curta) para o {@link Weather} dado.
     * <p>
     * Exemplos de retorno: "RAIN", "WIND", "SUN", "CLOUD".
     * Se o {@code weather} não corresponder a nenhum case conhecido, retorna
     * {@code "UNKNOWN"}.
     *
     * @param weather um valor do enum {@code Weather}; não deve ser {@code null}
     * @return string representando o evento associado ao estado do tempo
     */
    public String getWeatherEvent(final Weather weather) {
        switch (weather) {
            case ITS_RAINING:
                return "RAIN";
            case ITS_WINDING:
                return "WIND";
            case ITS_SUNNY:
                return "SUN";
            case ITS_CLOUDY:
                return "CLOUD";
            default:
                return "UNKNOWN";
        }
    }

    public boolean strangeBooleanCondition() {
        boolean b;
        boolean bValue = (b = true);

        // Avaliada como verdadeira
        if (bValue) logger.info("TRUE");
        else logger.info("FALSE");

        if (bValue = false) logger.info("TRUE");
        else logger.info("FALSE");

        if (bValue == false) logger.info("TRUE");
        else logger.info("FALSE");

        return bValue;
    }

    public boolean wrapperBooleanCondition() {
        Boolean wrapperBoolean = new Boolean("true");

        /* Válido */
        boolean primitiveBoolean1 = wrapperBoolean.booleanValue();

        /* Válido por causa do unboxing */
        boolean primitiveBoolean2 = wrapperBoolean;

        if (wrapperBoolean) {
            logger.info("Funciona em razão do unboxing");
        }

        return wrapperBoolean;
    }
}
