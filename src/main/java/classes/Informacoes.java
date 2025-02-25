package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Informacoes {
    private String login;
    private String senha;
    private String usuarioAcPosto;
    private ArrayList<String> cnpj;

    public Informacoes() {
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

    public void addCnpj(String cnpj){
        this.cnpj.add(cnpj);
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
