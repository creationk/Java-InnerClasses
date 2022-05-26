package com.non_static;

import lombok.extern.slf4j.Slf4j;

public class OuterClassWithPrivateInnerClass {
    public void callPrivateInnerClass() {
        InnerClass i = new InnerClass();
        i.privateInnerMethod();
    }

    private class InnerClass {
        int i1 = 9;
        private void privateInnerMethod() {
           System.out.println("Calling private Inner method");

        }
    }

}
