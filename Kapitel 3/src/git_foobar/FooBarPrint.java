package git_foobar;

public class FooBarPrint {
    public void cantGetEnoughFoobar() {
        System.out.println("FOO...");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("...BAR!");
        }
    }

    public static void main(String[] args) {
        FooBarPrint foobar = new FooBarPrint();
        foobar.cantGetEnoughFoobar();
    }
}
