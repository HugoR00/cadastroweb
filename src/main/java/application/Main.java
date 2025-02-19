package application;

import classes.Informacoes;
import com.google.gson.Gson;
    import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Informacoes cliente = new Informacoes();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.print("Digite o email do cliente para login: ");
        cliente.setLogin(sc.nextLine());
        System.out.print("Digite a senha do cliente: ");
        cliente.setSenha(sc.nextLine());
        System.out.print("Digite o usuário do cliente no AC-Posto: ");
        cliente.setUsuarioAcPosto(sc.nextLine());
        cliente.setarCNPJS(sc);

        String json = gson.toJson(cliente);
        System.out.println(json);

        try {
            FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\file.json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();

    }
}