
package punto3;


public class CENT implements Conversiones {

    @Override
    public float conversiones(float grados) {//fahren a centigrados
        
        float con= (grados-32)*(9/5);
        return con;
    }
    
    
}
