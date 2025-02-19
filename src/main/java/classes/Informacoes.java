package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Informacoes {
    private String login;
    private String senha;
    private String usuarioAcPosto;
    private ArrayList<String> cnpj;

    public Informacoes() {
        this.login = login;
        this.senha = senha;
        this.usuarioAcPosto = usuarioAcPosto;
        this.cnpj = new ArrayList<>();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuarioAcPosto() {
        return usuarioAcPosto;
    }

    public void setUsuarioAcPosto(String usuarioAcPosto) {
        this.usuarioAcPosto = usuarioAcPosto;
    }

    public ArrayList<String> getCnpj() {
        return cnpj;
    }

    public void setCnpj(ArrayList<String> cnpj) {
        this.cnpj = cnpj;
    }

    public void setarCNPJS(Scanner scanner){
        int cnpjs = 0;
        System.out.print("Digite quantos CNPJS tem o cliente: ");
        cnpjs = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cnpjs; i ++){
            System.out.print("Digite o(s) CNPJ(s): ");
            String cnpjoto = scanner.nextLine();
            cnpj.add(cnpjoto);
        }
    }

    @Override
    public String toString() {
        return "Informacoes{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", usuarioAcPosto='" + usuarioAcPosto + '\'' +
                ", cnpj=" + cnpj +
                '}';
    }
}
