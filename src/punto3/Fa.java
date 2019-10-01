
package punto3;


public class Fa implements Conversiones {//de celsius a fahren

    @Override
    public float conversiones(float grados) {
        float con= (grados*9/5)+32;
        return con;
    }
    
}
