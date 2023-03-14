import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Server extends JFrame implements ActionListener{

    Server(){
        setLayout(null);
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(7, 94, 84));
        panel1.setBounds(0,0,400,70);
        panel1.setLayout(null);
        add(panel1);

        ImageIcon imgicn = new ImageIcon(ClassLoader.getSystemResource("icons/left-arrow.png"));
        Image img = imgicn.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon imgicn2 = new ImageIcon(img);
        JLabel back = new JLabel(imgicn2);
        back.setBounds(5,20,25,25);
        panel1.add(back);

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae){
                System.exit(ABORT);
            }
        });

        ImageIcon imgicn3 = new ImageIcon(ClassLoader.getSystemResource("icons/maleFaceIcon.png"));
        Image img3 = imgicn3.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        ImageIcon imgicn4 = new ImageIcon(img3);
        JLabel back1 = new JLabel(imgicn4);
        back1.setBounds(50,15,35,35);
        panel1.add(back1);

        JLabel name = new JLabel("Brijesh");
        name.setBounds(110,15,100,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        panel1.add(name);

        JLabel status = new JLabel("Active Now");
        status.setBounds(110,35,100,18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        panel1.add(status);

        setSize(400,600);
        setLocation(200,100);
        getContentPane().setBackground(new Color(18, 140, 126));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[] args) {
        new Server();
    }
}