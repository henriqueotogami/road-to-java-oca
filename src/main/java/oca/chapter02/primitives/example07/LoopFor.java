package oca.chapter02.primitives.example07;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe demonstra o uso de loops for em Java, comparando a declaração de variáveis
 * dentro e fora do loop, e apresentando uma abordagem mais moderna usando loops for-each
 * com arrays e coleções genéricas.
 *
 * @author henriqueotogami
 * @since 2026-02-27
 * @version 1.0
 */
public class LoopFor {

    private static final Logger logger = LogManager.getLogger(LoopFor.class);

    public void variableOutsideLoop() {
        int m;
        for (m = 1; m < 5; m++) {
            logger.info("Marker {} , ", m);
        }
        logger.info("Last Marker {}\n", m);
    }

    public void variableInsideLoop() {
        for (int m = 1; m < 5; m++) {
            logger.info("Marker {}, ", m);
        }
        // por exemplo a linha falha logger.info("Last Marker \n", m); -> m está fora de escopo

        //FAILURE: Build failed with an exception.
        //
        //* What went wrong:
        //Execution failed for task ':app:compileJava'.
        //> Compilation failed; see the compiler error output for details.
    }

    public void betterLoop() {
        final int[] hookSizes = { 1, 1, 1, 2, 2, 4, 5, 5, 5, 6, 7, 8, 8, 9 };
        for (int hook: hookSizes) logger.info("{} ", hook);
    }

    public void betterLoopGenerics() {
        List<Integer> hookSizesList = new ArrayList<>();
        hookSizesList.add(1);
        hookSizesList.add(4);
        hookSizesList.add(5);
        for (Integer hook : hookSizesList) logger.info("{} ", hook);
    }

    // Consulte Java Generics and Collections de Maurice Naftalin e Philip Wadler
    // (O’Reilly, 2006) para ver uma abordagem abrangente dos frameworks de genéricos e
    // coleções.
}
