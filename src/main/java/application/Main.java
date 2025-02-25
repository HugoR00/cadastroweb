package application;

import classes.Informacoes;
import classes.MyFrame;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyFrame frame = new MyFrame();

        while (frame.isPronto() == false) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Informacoes infoCliente = frame.getCliente();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        infoCliente.setLogin(infoCliente.getLogin());
        infoCliente.setSenha(infoCliente.getSenha());
        infoCliente.setUsuarioAcPosto(infoCliente.getUsuarioAcPosto());
        infoCliente.setCnpj(infoCliente.getCnpj());


        String json = gson.toJson(infoCliente);


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