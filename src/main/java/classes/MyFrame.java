package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton addInfo;
    JButton confirmar;
    JTextField email;
    JTextField senha;
    JTextField usuario;
    JTextField cnpjs;

    Informacoes cliente = new Informacoes();

    private boolean pronto = false;
    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);


        email = new JTextField();
        email.setPreferredSize(new Dimension(250,40));

        senha = new JTextField();
        senha.setPreferredSize(new Dimension(250,40));

        usuario = new JTextField();
        usuario.setPreferredSize(new Dimension(250,40));

        cnpjs = new JTextField();
        cnpjs.setPreferredSize(new Dimension(250,40));

        addInfo = new JButton("ADD");
        addInfo.addActionListener(this);

        confirmar = new JButton("Salvar");
        confirmar.addActionListener(this);


        this.add(email);
        this.add(senha);
        this.add(usuario);
        this.add(cnpjs);

        this.add(addInfo);
        this.add(confirmar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addInfo){
            cliente.setLogin(email.getText());
            cliente.setSenha(senha.getText());
            cliente.setUsuarioAcPosto(usuario.getText());
            cliente.addCnpj(cnpjs.getText());
        }
        else if(e.getSource() == confirmar){
            pronto = true;
            JOptionPane.showMessageDialog(this, "Dados confirmados!");
        }
    }

    public Informacoes getCliente(){
        return cliente;
    }
    public boolean isPronto() {
        return pronto;
    }



}
