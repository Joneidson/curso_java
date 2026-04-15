package dio;

import java.util.Scanner;

public class ArrayDIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criamos a porta de entrada

        if(sc.hasNextLine()){ // fizemos uma condição de leitura
            String linesCodes =  sc.nextLine();
            if(sc.hasNextLine()){ // colocamos a estrutura para pegar o código alvo: tipo aa02
                String codealvo =  sc.nextLine(); // criamos a variável
                String[] codes = linesCodes.split(" "); // criamos a array pra percorrer o trajeto lendo todas as info
                int cont = 0; // criamos a conta pra ser a variable de contagem dos relatórios tipo : aa02
                for(String code : codes){
                    if(code.equals(codealvo)){ // fizemos a equalization pra poder realmente saber quem tem mais citações no código
                        cont++;
                    }
                }
                System.out.println(cont);
            }
        }


        sc.close();
    }

}
