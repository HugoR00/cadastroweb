package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrame extends JFrame implements ActionListener {

    JButton addInfo;
    JButton confirmar;
    JButton limpar;
    JLabel descEmail;
    JLabel descSenha;
    JLabel descUsuario;
    JLabel descCnpjs;
    JTextField email;
    JTextField senha;
    JTextField usuario;
    JTextField listaCnpj;

    Informacoes cliente = new Informacoes();

    private boolean pronto = false;
    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 250);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configurações comuns
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);  // Espaçamento

        // Labels e campos de texto
        descEmail = new JLabel("Email: ");
        email = new JTextField();
        email.setPreferredSize(new Dimension(250, 40));

        descSenha = new JLabel("Senha: ");
        senha = new JTextField();
        senha.setPreferredSize(new Dimension(250, 40));

        descUsuario = new JLabel("Usuário: ");
        usuario = new JTextField();
        usuario.setPreferredSize(new Dimension(250, 40));

        descCnpjs = new JLabel("CNPJ: ");
        listaCnpj = new JTextField();
        listaCnpj.setPreferredSize(new Dimension(250, 40));

        // Botões
        addInfo = new JButton("ADD");
        addInfo.addActionListener(this);

        confirmar = new JButton("Salvar");
        confirmar.addActionListener(this);

        limpar = new JButton("Limpar");
        limpar.addActionListener(this);

        // Adicionando labels (primeira coluna)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.1;
        this.add(descEmail, gbc);

        gbc.gridy = 1;
        this.add(descSenha, gbc);

        gbc.gridy = 2;
        this.add(descUsuario, gbc);

        gbc.gridy = 3;
        this.add(descCnpjs, gbc);

        // Adicionando campos de texto (segunda coluna)
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.9;
        this.add(email, gbc);

        gbc.gridy = 1;
        this.add(senha, gbc);

        gbc.gridy = 2;
        this.add(usuario, gbc);

        gbc.gridy = 3;
        this.add(listaCnpj, gbc);

        // Adicionando botões na parte inferior
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(addInfo);
        buttonPanel.add(confirmar);
        buttonPanel.add(limpar);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;  // Estende por 2 colunas
        gbc.fill = GridBagConstraints.NONE;  // Não esticar os botões
        gbc.anchor = GridBagConstraints.CENTER;  // Centralizar os botões
        this.add(buttonPanel, gbc);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addInfo){
            cliente.setLogin(email.getText());
            cliente.setSenha(senha.getText());
            cliente.setUsuarioAcPosto(usuario.getText());
            cliente.addCnpj(listaCnpj.getText());
        }
        else if(e.getSource() == confirmar){
            pronto = true;
            JOptionPane.showMessageDialog(this, "Dados confirmados!");
        }
        else if(e.getSource() == limpar){
            limparCampos();
        }
    }

    public Informacoes getCliente(){
        return cliente;
    }
    public boolean isPronto() {
        return pronto;
    }
    public void limparCampos(){
        email.setText("");
        senha.setText("");
        usuario.setText("");
        listaCnpj.setText("");
    }

    public void resetPronto(){
        pronto = false;
        cliente = new Informacoes(); //Atribuição de novo objeto a variável cliente
    }



}
