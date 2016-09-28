package buscaminas;

import javax.swing.JButton;


/**
 *
 * @author juan-
 */
public class Cuadro extends JButton{
    private boolean mina;
    
    public Cuadro(){
        super();
        double random = Math.random();
        if(random > 0.8){
            mina=true;                   
        }else {
            mina = false;
        }
    }
    public boolean estaMinado(){
        return mina;
    }
    
}
