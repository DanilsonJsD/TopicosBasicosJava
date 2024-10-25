import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TesteDeFixacao {
    public static void main(String[] args) {
        String res = "";
        do {
        System.out.println("Teste de fixação de assuntos aplicados desde a lógica de programação");
        System.out.println("Escolha que assunto deseja verificar...");
        System.out.println("Lembrando que isso é pra gravar o que eu me lembro kkkk pode faltar algumas coisas");
        System.out.println("Agora vamos lá! Escolha!");
        System.out.println("[1] - Tipos de variaveis");
        System.out.println("[2] - Operadores");
        System.out.println("[3] - Estruturas condicionais");
        System.out.println("[4] - Estruturas de repetição");
        System.out.println("[5] - Arrays");
        System.out.println("[6] - Arrays multidimensionais");
        Scanner O = new Scanner(System.in);
        Scanner T = new Scanner(System.in);
        System.out.println("Digite a opção ...");
        String perg;
            int op = O.nextInt();
            switch (op) {
                case 1:
                    System.out.println("[1] - Tipos de variaveis");
                    System.out.println("Existem alguns tipos de variaveis conforme as passagens de versões do java");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Os tipos primitivos");
                    System.out.println("int: que serve para numeros inteiros");
                    System.out.println("byte: que serve para alocar pequenos numeros no espaço da memoria");
                    System.out.println("short: que serve para alocar inteiros porem pouco mais que o byte");
                    System.out.println("float: para numeros com ponto flutuante");
                    System.out.println("long: para inteiros maiores");
                    System.out.println("char: para gravar 1 caractere");
                    System.out.println("double: para numeros com ponto flutuantes, porém, maiores que float");
                    System.out.println("boolean: para verdadeiro ou falso");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Não primitivos");
                    System.out.println("String: que seria para colocar textos grandes ou mesmo pequenos, serve para textos");
                    System.out.println("let: É o tipo de variavel que pode ser iniciada em qualquer lugar mas não pode ser" +
                            "alterada depois, famosa constante");
                    System.out.println("var: É um tipo de variavel que pode ser iniciada sem dizer o tipo real da variavel," +
                            " por exemplo, 'var = 10' que seria do tipo inteiro");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("\nAgora me diga, deseja continuar aprendendo? digite sim ou não");
                    perg = T.next();
                    if (perg.equals("sim")){
                        res = "sim";
                    }else{
                        res = "nao";
                    }
                    break;
                case 2:
                    System.out.println("[2] - Operadores");
                    System.out.println("Existem alguns tipos de operadores conforme as passagens de versões do java");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Operadores de atribuição: ");
                    System.out.println(" =, +=, -=, *=, /= ");
                    System.out.println("Operadores aritméticos: ");
                    System.out.println(" +, -, *, /, %, ++, -- ");
                    System.out.println("Operadores relacionais: ");
                    System.out.println(" <, <=, >, >=, ==, != ");
                    System.out.println("Operadores lógicos: ");
                    System.out.println(" &, |, ^, !, &&, || ");
                    System.out.println("Operador condicional: ");
                    System.out.println(" ?: ");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("\nAgora me diga, deseja continuar aprendendo? digite sim ou não");
                    perg = T.next();
                    if (perg.equals("sim")){
                        res = "sim";
                    }else{
                        res = "nao";
                    }
                    break;
                case 3:
                    System.out.println("[3] - Estruturas condicionais");
                    System.out.println("Existem 3 tipos de estruturas condicionais no java");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("IF ELSE");
                    System.out.println("Nessa aplicação já estamos utilizando o if e else, que funciona de forma simples");
                    System.out.println("primeiro um <if> seguido da condição e logo após a abertura e fechamento do bloco ");
                    System.out.println("desta forma: if (aprender == true){ ");
                    System.out.println("                    System.out.println('isso é bom');");
                    System.out.println("             }else{");
                    System.out.println("                    System.out.println('Vá estudar!');");
                    System.out.println("             }");
                    System.out.println("existe tambem o if elseif, que cria uma nova condição a partir do segundo if");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("SWITCH/CASE");
                    System.out.println("Assim como o if else, o switch case tambem foi usado para selecionar os topicos");
                    System.out.println("switch {");
                    System.out.println("    case 1:");
                    System.out.println("        linha de comando");
                    System.out.println("        break;");
                    System.out.println("    case 2:");
                    System.out.println("        linha de comando");
                    System.out.println("        break;");
                    System.out.println("    defalt;");
                    System.out.println("        linha de comando");
                    System.out.println("        break;");
                    System.out.println("}");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("TERNÁRIO");
                    System.out.println("Este terceiro exemplo ainda não foi inserido no codigo até o momento, mas ele funciona assim:");
                    System.out.println("(expressão booleana) ? código 1 : código 2;");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("\nAgora me diga, deseja continuar aprendendo? digite sim ou não");
                    perg = T.next();
                    if (perg.equals("sim")){
                        res = "sim";
                    }else{
                        res = "nao";
                    }
                    break;
                case 4:
                    System.out.println("[4] - Estruturas de repetição");
                    System.out.println("Existem 3 tipos de estruturas de repetição no java, for, while e do-while");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("FOR");
                    System.out.println("Essa é a sintaxe basica do for");
                    System.out.println("for (int i = 0; i < ; i++) {");
                    System.out.println("        bloco de comandos");
                    System.out.println("}");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("WHILE");
                    System.out.println("Essa é a sintaxe basica do while");
                    System.out.println("int i = 1");
                    System.out.println("while (i < 5) {");
                    System.out.println("    System.out.println('numero ' +i);");
                    System.out.println("    i++;");
                    System.out.println("}");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("DO-WHILE");
                    System.out.println("Esse exemplo está sendo usado no nosso codigo e ele cria o loop para executar os topicos");
                    System.out.println("Em diferença do anterior ele executa pelo menos uma vez sem saber se a condição é verdadeira");
                    System.out.println("int i = 1");
                    System.out.println(" do {");
                    System.out.println("    System.out.println('numero ' +i);");
                    System.out.println("    i++;");
                    System.out.println("}while (i < 5);");
                    System.out.println("Agora me diga, deseja continuar aprendendo? digite sim ou não");
                    perg = T.next();
                    if (perg.equals("sim")){
                        res = "sim";
                    }else{
                        res = "nao";
                    }
                    break;
                case 5:
                    System.out.println("[5] - Arrays");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Existem algumas formas de criar um array porem eu vou mostrar a melhor forma que eu acho");
                    System.out.println("int[] array = new int[5]");
                    System.out.println("int[] myArray1 = {1, 0, 3, 17, 5, 6, 7, 8, 9, 10}; tambem existe essa forma já definindo o que vai ser em cada posição");
                    System.out.println("Esta é a forma para implementar dados dentro do array");
                    System.out.println("Ex: array[1] = 20");
                    System.out.println("Sobre os arrays simples esse é o modelo que eu mais vou usar kkkkkk");
                    System.out.println("Agora me diga, deseja continuar aprendendo? digite sim ou não");
                    perg = T.next();
                    if (perg.equals("sim")){
                        res = "sim";
                    }else{
                        res = "nao";
                    }
                    break;
                case 6:
                    System.out.println("[6] - Arrays multidimensionais");
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Da mesma forma do array simples, a criação do multidimensional é bem parecido, veja");
                    System.out.println("int[][] matrix = new int[2][2]");
                    System.out.println("array[0][0] = 30;");
                    System.out.println("array[0][1] = 40;");
                    System.out.println("array[1][0] = 50;");
                    System.out.println("array[1][1] = 60;");
                    System.out.println("System.out.println(array[0][0]); // desta forma irá mostrar o resultado 30");
                    System.out.println("Praticamente cada caixa de array vai dar uma posição de medida, a primeira diz quantos arrays terão");
                    System.out.println("O segundo mostra quantas posições os arrays terão");
                    System.out.println("A partir da terceira já conseguimos definir colunas e linhas ");
                    System.out.println("Agora me diga, deseja continuar aprendendo? digite sim ou não");
                    perg = T.next();
                    if (perg.equals("sim")){
                        res = "sim";
                    }else{
                        res = "nao";
                    }
                    break;
                default:
                    System.out.println("Você escolheu uma opção inexistente");
                    System.out.println("Agora me diga, deseja continuar aprendendo? digite sim ou não");
                    perg = T.next();
                    if (perg.equals("sim")){
                        res = "sim";
                    }else{
                        res = "nao";
                    }
            }
        }while (res.equals("sim"));
    }
}