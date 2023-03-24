/* *******************************************************************
 * Colegio Técnico Antônio Teixeira Fernandes (Univap)
 * Curso Técnico em Informática - Data de Entrega: 19/03/2022
 * Autores do Projeto: Henrique Curtis
 *                     Arthur Kinderman
 * Turma: 3F  Disciplina: Programação - II
 * Avaliação parcial referente ao 1 - Bimestre
 * Observação: <colocar se houver>
 *
 * nome_arquivo.java
 * ******************************************************************/
public class Main {
    public static void main(String[] args) {
        int QtdDias = Integer.parseInt(args[0]);
        int x = 0;
        int num =0;
        while (x < QtdDias){
            if(num >= args.length -1) System.exit(0);
            int totalDeGrupos = Integer.parseInt(args[num+1]);
            int totalDeAlunos = Integer.parseInt(args[num+2]);
            int pares = 0;
            int count =0;
            int soma =0;

            while(count < totalDeGrupos-1){
                pares+=2;
                soma += pares;
                count++;
            }

            int res = (totalDeAlunos - soma)/totalDeGrupos;
            count = 0;
            pares = 0;
            System.out.printf("Quantidade de Grupos: %d \n", totalDeGrupos);
            System.out.printf("Total de alunos: %d \n", totalDeAlunos);
            while (count <= totalDeGrupos-1){
                System.out.println(res + pares);
                pares+=2;
                count++;
            }
            num+=2;
            x++;
        }

    }
}