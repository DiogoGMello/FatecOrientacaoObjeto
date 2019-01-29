
package telasprojeto;

import javax.swing.JFrame;

public class BibliotecaPOO {
    
    public BibliotecaPOO(){
        JFrame frame = new JFrame("Biblioteca");
        
        frame.setSize(480, 360);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        new BibliotecaPOO();
    }
    
}
