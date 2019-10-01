
package punto3;


public class Ce implements Conversiones {//grados fahren a celsius

    @Override
    public float conversiones(float grados) {
        float con = (grados-32)/(9/5);
        return con;
    }
    
}
