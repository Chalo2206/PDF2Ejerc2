
package pdf2ejer2;

/**
 *
 * @author Gonzalo
 */
public class Contador {
    //Atributos
    int x;
    int y;
    
    //Metodos
    public void incrementar(){}
    public void decrementar(){}
    
    //Constructores
    //Por defecto
    public Contador() {
    }
    //Con parametros
    public Contador(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Copia
    public Contador(Contador contadores){
        this.x = contadores.x;
        this.y = contadores.y;
    }
    
    //Getters y setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
