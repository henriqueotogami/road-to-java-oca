package oca.chapter01.fundamentals.exemple06;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

/**
 * Exemplo de uso da classe Properties em Java.
 * Mostra como listar todas as propriedades do sistema e como acessar uma propriedade específica.
 * @author henriqueotogami
 * @since 2026-02-12
 * @version 1.0
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Properties.html">Java Properties Documentation</a>
 */
public class Example06PropertiesManager {

    private static final Logger logger = LogManager.getLogger(Example06PropertiesManager.class);

    public static void main(String[] args) {

        if (args.length == 0) {
            logger.info("No arguments provided");
            return;
        }

        final Properties props = System.getProperties();

        /* Exemplo de nova propriedade */
        props.setProperty("new_property2", "new_value2");

        switch (args[0]) {

            case "-list_all":
                props.forEach((k, v) -> logger.info("{} = {}", k, v)); // Lista todas as propriedades
                break;

            case "-list_prop":
                if (args.length < 2) {
                    logger.error("Missing property name");
                    return;
                }
                /* Lista valor */
                logger.info(props.getProperty(args[1]));
                break;

            default:
                logger.info("Usage: java PropertiesManager[-list_all]");
                logger.info(" java PropertiesManager[-list_prop[property]]");
                break;
        }
    }

//    HMAP :: oca/chapter01/fundamentals 1 » cd ../../../
//    HMAP :: src/main/java » java -Dnew_property1=new_value1 oca.chapter01.fundamentals.Example06PropertiesManager -list_all
//    -- listing properties --
//    java.specification.version=23
//    sun.jnu.encoding=UTF-8
//    java.class.path=.
//    java.vm.vendor=Oracle Corporation
//    sun.arch.data.model=64
//    java.vendor.url=https://java.oracle.com/
//    java.vm.specification.version=23
//    os.name=Mac OS X
//    sun.java.launcher=SUN_STANDARD
//    user.country=BR
//    sun.boot.library.path=/Users/henriquematheusalvespereira/Li...
//    sun.java.command=oca.chapter01.fundamentals.Example06P...
//    http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16
//    jdk.debug=release
//    sun.cpu.endian=little
//    user.home=/Users/henriquematheusalvespereira
//    user.language=pt
//    java.specification.vendor=Oracle Corporation
//    java.version.date=2025-01-21
//    java.home=/Users/henriquematheusalvespereira/Li...
//    file.separator=/
//    java.vm.compressedOopsMode=Zero based
//    line.separator=
//
//    java.vm.specification.vendor=Oracle Corporation
//    java.specification.name=Java Platform API Specification
//    apple.awt.application.name=Example06PropertiesManager
//    sun.management.compiler=HotSpot 64-Bit Tiered Compilers
//    ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16
//    java.runtime.version=23.0.2+7-58
//    user.name=henriquematheusalvespereira
//    stdout.encoding=UTF-8
//    path.separator=:
//    os.version=15.7.2
//    java.runtime.name=OpenJDK Runtime Environment
//    file.encoding=UTF-8
//    java.vm.name=OpenJDK 64-Bit Server VM
//    java.vendor.url.bug=https://bugreport.java.com/bugreport/
//    java.io.tmpdir=/var/folders/0r/rqwj_7910h183r57kdpm1...
//    java.version=23.0.2
//    user.dir=/Users/henriquematheusalvespereira/Do...
//    os.arch=x86_64
//    java.vm.specification.name=Java Virtual Machine Specification
//    native.encoding=UTF-8
//    java.library.path=/Users/henriquematheusalvespereira/Li...
//    java.vm.info=mixed mode, sharing
//    stderr.encoding=UTF-8
//    java.vendor=Oracle Corporation
//    java.vm.version=23.0.2+7-58
//    sun.io.unicode.encoding=UnicodeBig
//    socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16
//    java.class.version=67.0
//    new_property1=new_value1
//    new_property2=new_value2
//    HMAP :: src/main/java »
//    HMAP :: src/main/java » java --version
//    openjdk 23.0.2 2025-01-21
//    OpenJDK Runtime Environment (build 23.0.2+7-58)
//    OpenJDK 64-Bit Server VM (build 23.0.2+7-58, mixed mode, sharing)
//    HMAP :: src/main/java » javac --version
//    javac 23.0.2
//    HMAP :: src/main/java »
}