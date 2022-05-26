package com.non_static;

import org.junit.jupiter.api.Test;

public class TestOuterClassWithPrivateInnerClass {
    @Test
    void test() {
        OuterClassWithPrivateInnerClass o = new OuterClassWithPrivateInnerClass();
        //OuterClassWithPrivateInnerClass.InnerClass i = o.new InnerClass();
        o.callPrivateInnerClass();

    }
}
