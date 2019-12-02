/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresdehanoi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

/**
 *
 * @author igor_
 */
public class TorresdeHanoi {

    public static void main(String[] args) {
        // TODO code application logic here
        int n; // número de discos        
 
        // recebe o nú  mero de discos digitado pelo usuário
        Scanner entrada = new Scanner(System.in);
        Timer timer = new Timer();
        System.out.print("Digite o número de discos: ");
        n = entrada.nextInt();
        

 
        // executa o algoritmo iterativo das Torres de Hanói e com o SimpleDateFormat conta o tempo de execução
        long start = System.currentTimeMillis();
        HanoiIterativo.hanoi(n);
        long finish = System.currentTimeMillis();
        long elapse = finish - start;
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println("Tempo de execução: "+dateFormat.format(new Date(elapse)));
    } 
}
