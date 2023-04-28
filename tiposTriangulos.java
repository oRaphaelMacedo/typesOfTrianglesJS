import java.util.Scanner;

public class tiposTriangulos {
    public static void main(String[] args) {
        // Declaracao das variaveis
        double a,b,c;
        double auxiliar, a2, bc;
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o valor do lado A");
        a = sc.nextDouble();
        System.out.println("Digite o valor do lado B");
        b = sc.nextDouble();
        System.out.println("Digite o valor do lado C");
        c = sc.nextDouble();

        //Verifica se A > dos elementos
        if (b > a){
            auxiliar = a;
            a = b;
            b = auxiliar;
        }
        if (c > a){
            auxiliar = a;
            a = c;
            c = auxiliar;
        }

        // Definindo as potencias
        a2 = Math.pow(a, 2);
        bc = Math.pow(b, 2) + Math.pow(c, 2);

        if (a >= b + c){
            //Nao forma triangulo
            System.out.println("Não forma triangulo");
        }
        else {
            //Pode formar triangulo
            if(a2 > bc) {
                System.out.println("Triangulo Obtusangulo");
            }
            else if (a2 < bc){
                System.out.println("Triangulo Acutangulo");
            }
            else{
                System.out.println("Triangulo Retangulo");
            }

            //Verifica arestas
            if(a == b && b == c){
                System.out.println("Triangulo Equilatero");
            }
            else if (a == b || a == c || b == c){
                System.out.println("Triangulo Isosceles");
            }
        }
    }
    
}
