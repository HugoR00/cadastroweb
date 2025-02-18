package classes;

import java.util.List;

public class Informacoes {
    private String login;
    private String senha;
    private String usuarioAcPosto;
    private List listaCnpj;

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

    public List getListaCnpj() {
        return listaCnpj;
    }

    public void setListaCnpj(List listaCnpj) {
        this.listaCnpj = listaCnpj;
    }

    @Override
    public String toString() {
        return "Informacoes{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", usuarioAcPosto='" + usuarioAcPosto + '\'' +
                ", listaCnpj=" + listaCnpj +
                '}';
    }
}
