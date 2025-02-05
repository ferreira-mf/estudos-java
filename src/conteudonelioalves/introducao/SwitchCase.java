package conteudonelioalves.introducao;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*O Switch Case é utilizado como alternativa para que não seja usado varios if else...

        obs: fiz uma breve pesquisa e a maioria prefere usar if else... um exemplo de caso onde ele seria bem
        aproveitado seria quando vc tem multiplhas escolhas mas elas retornam o mesmo valor
        EXEMPLO:

        switch (command) {
            case "m":
            case "msg":
            case "message":
                sendMessage(data);
                break;
            case "k":
            case "kick":
                kick(data);
                break;
        } */

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }

        System.out.println("dia da semana: " + dia);
    }
}
