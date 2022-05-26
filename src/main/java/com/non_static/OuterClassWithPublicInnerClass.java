package com.non_static;

public class OuterClassWithPublicInnerClass {
    private int o1 = 9;

    public class InnerClass {
        int i1 = 9;

        int accessPrivateMembersOfOuterClass() {
            return o1;
        }
    }

    void test() {
        InnerClass i = new InnerClass();

    }
}
