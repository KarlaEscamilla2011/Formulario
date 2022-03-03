
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class mainFrame extends JFrame {
    public void init(){
        setTitle("Bienvenido");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main (String[] args){
         mainFrame miform = new  mainFrame();
       miform.init();
    }
}
