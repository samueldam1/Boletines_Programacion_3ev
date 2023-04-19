
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ventana {
    
    JFrame frame;
    JPanel panel;
    JLabel label_nome, label_password;
    JTextField textField_nome, textField_password;
    JTextArea textArea;
    JButton bEnviar, bLimpiar;
    
    public void iniciarVentana(){
    
        // INSTANCIAR COMPONENTES
        
        frame = new JFrame();
        panel = new JPanel();
        
        label_nome = new JLabel("NOME");
        label_password = new JLabel("PASSWORD");
        
        textField_nome = new JTextField();
        textField_password = new JTextField();
        
        textArea = new JTextArea();
        
        bEnviar = new JButton("ENVIAR");
        bLimpiar = new JButton("LIMPIAR");
        
        // DAR CARACTERISTICAS
        
        frame.setBounds(0,0,800,800);
        
        panel.setBounds(5,5,700,700);
        panel.setBackground(Color.orange);
        
        label_nome.setBounds(1,1,100,100);
        
        textField_nome.setBounds(200,100,200,50);
        
        textArea.setBounds(50,200,500,300);
        
        bEnviar.setBounds(100,600,150,100);
        
        bLimpiar.setBounds(500,600,150,100);
        bLimpiar.setToolTipText("LIMPIAR");
        
        // AÑADIR COMPONENTES AL PANEL
        
        panel.setLayout(null);
        
        panel.add(label_nome);
        panel.add(label_password);
        panel.add(textField_nome);
        panel.add(textField_password);
        panel.add(textArea);
        panel.add(bEnviar);
        panel.add(bLimpiar);
        
        // AÑADIR PANEL AL MARCO
        
        frame.add(panel);        
        
        // REQUERIDO
        
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    
    }
    
}
