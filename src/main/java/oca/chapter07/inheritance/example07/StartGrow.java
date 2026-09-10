package oca.chapter07.inheritance.example07;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe de execução para demonstrar o crescimento de uma árvore de bordo e uma tulipa ao longo de três anos.
 * Esta classe cria instâncias das plantas, simula as estações do ano e registra informações sobre o crescimento.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public class StartGrow {

    private static final Logger logger = LogManager.getLogger(StartGrow.class);

    public static void main(String[] args) {
        logger.info("Creating a maple tree and tulip...");

        MapleTree mapleTree = new MapleTree();
        Tulip tulip = new Tulip();
        logger.info("Entering a loop to simulate 3 years");

        for (int i = 0; i < 3; i++) {
            mapleTree.doSpring();
            tulip.doSpring();
            mapleTree.doSummer();
            tulip.doSummer();
            mapleTree.doFall();
            tulip.doFall();
            mapleTree.doWinter();
            tulip.doWinter();
        }
    }
}
