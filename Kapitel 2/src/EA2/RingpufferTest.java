package EA2;

public class RingpufferTest {
public static void main(String[] args) {
    Ringpuffer ring = new Ringpuffer(1);
    
    ring.insert("erster");
    ring.insert("zweiter");
    ring.insert("dritter");
    ring.print();
    ring.insert("vierter");
    ring.insert("fünfter");
    ring.insert("sechster");
    
    ring.print();
   
    
}
}
