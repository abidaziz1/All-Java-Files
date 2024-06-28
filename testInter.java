interface I1 {
    void show();
}

interface I2 {
    void display();
}

class testInter implements I1, I2 {
    public void show() {
        System.out.println("show");
    }

    public void display() {
        System.out.println("display");
    }

    public static void main(String args[]) {
        testInter t = new testInter();
        t.show();
        t.display();
    }
}