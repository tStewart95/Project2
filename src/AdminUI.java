import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminUI {

    public UserModel user = null;

    public JFrame view;

    public JButton btnConfig = new JButton("Set system configuration");
    public JButton btnAddUser = new JButton("Add user");
    public JButton btnDelUser = new JButton("Delete User");

    public AdminUI(UserModel user) {

        this.user = user;

        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Administrator View");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (45.0f));
        view.getContentPane().add(title);

        JPanel panelUser = new JPanel(new FlowLayout());
        panelUser.add(new JLabel("ADMINISTRATOR"));

        view.getContentPane().add(panelUser);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnConfig);
        panelButtons.add(btnDelUser);
        panelButtons.add(btnAddUser);

        view.getContentPane().add(panelButtons);
    }
}