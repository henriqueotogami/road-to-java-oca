package oca;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({
        "oca.chapter01",
        "oca.chapter02",
        "oca.chapter03",
        "oca.chapter04",
        "oca.chapter05",
        "oca.chapter06",
        "oca.chapter07",
        "oca.chapter08",
        "oca.chapter09"
})
class JavaOcaSuite {
}