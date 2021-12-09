

import java.io.*;
import java.util.*;




// DNI:

/* Donada una cadena amb el número de un DNI, genera una cadena amb el NIF. El NIF s'obté a partir del DNI afegint-li la lletra que s'obté calculant el residu de la divisió entera del DNI entre 23.

Les lletres són: TRWAGMYFPDXBNJZSQVHLCKE i la transformació de codi és: 0 ->T, 1->R, 2->W, etc.

Exemple: Al DNI 37721039 li correspon el NIF 37721039G

Input Format

Introdueix una enter de 8 dígits que sigui el DNI.

Constraints

Suposem que el dni conté 8 dígits.

Output Format

Imprimeix el NIF: DNI + LLETRA

Sample Input 0

37721039
Sample Output 0

37721039G
 */



public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int numero = sc.nextInt();

        String[] abc = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String letra = abc[(numero%23)];

        System.out.println(numero + letra);


    }
}
