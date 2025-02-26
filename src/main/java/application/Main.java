package application;

import classes.Informacoes;
import classes.MyFrame;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

        while (true) { //Mantém o loop rodando para ir adicionando novos clientes
            while (!frame.isPronto()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Informacoes infoCliente = frame.getCliente();

            infoCliente.setLogin(infoCliente.getLogin());
            infoCliente.setSenha(infoCliente.getSenha());
            infoCliente.setUsuarioAcPosto(infoCliente.getUsuarioAcPosto());
            infoCliente.setCnpj(infoCliente.getCnpj());

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(infoCliente);

            try {
                File file = new File(System.getProperty("user.home"), "/Desktop/file.txt");
                FileWriter fw = new FileWriter(file,true);
                fw.write(json);
                fw.write("," + "\n");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            frame.resetPronto(); //Reseta o pronto e cria uma nova instância

        }
    }
}