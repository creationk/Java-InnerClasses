package com.non_static;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TestOuterClassWithPublicInnerClass {
    @Test
    void test() {
        OuterClassWithPublicInnerClass o = new OuterClassWithPublicInnerClass();
        OuterClassWithPublicInnerClass.InnerClass i = o.new InnerClass();
    }

    @Test
    void testAccessPublicClassPrivateMembersThroughInnerClass() {
        OuterClassWithPublicInnerClass o = new OuterClassWithPublicInnerClass();
        OuterClassWithPublicInnerClass.InnerClass i = o.new InnerClass();
        log.info("i.accessPrivateMembersOfOuterClass() -> {}", i.accessPrivateMembersOfOuterClass());

    }
}
