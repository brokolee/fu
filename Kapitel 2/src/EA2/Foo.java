package EA2;



    public class Foo {
        private int x;
        private static char c = 'c';

        Foo(int x) {
            this.x = x;
        }

        Foo() {
            x = 42;
            
        }

        static class X {
            void n() {
            //System.out.println(x);
            System.out.println(c);
            }
            }
        
        class Bar {
            Object y;

            void m(Foo foo) {
                y = new Object();
            }

            void m(String foo) {
                y = foo;
            }

            Bar() {
                y = new Object();
            }
        }

        Object z() {
            return new String();
        }
        

        
    }

