package tut_5.Question_4;

class X2 extends X1 {
//    final method can not be can not be overridden. hence method foo() should be not final
    public void foo() {
        System.out.println("foo() called in X2");
    }
}
