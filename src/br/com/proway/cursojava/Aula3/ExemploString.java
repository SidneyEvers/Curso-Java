package br.com.proway.cursojava.Aula3;

public class ExemploString {

    public static void main(String[] args) {

        //Strings são imutáveis
        String nome = "João";
        System.out.println(nome);
        System.out.println(nome.concat(" Da Silva Brasil"));
        System.out.println(nome);

        String nome2 = "Maria";
        String nome3 = "Maria";
        String nome4 = new String("Maria");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome4);

        //Uso length
        String texto = "Hello Java";
        System.out.println("A quantidade de caracteres em "+texto +" é "+texto.length());

        String texto2 = "Blumenau";
        String inverse = "";
        for(int index = texto2.length() - 1; index >= 0; index--){
            inverse = inverse + texto2.charAt(index);
        }
        System.out.println(texto2);
        System.out.println(inverse);


        //Uso contains()
        String texto5 = "Aprender Java é divertido!";
        boolean contem = texto5.contains("Java");
        System.out.println(contem);

        //Uso equals()
        //Vai comparar duas strings e vai verificar se são iguais
        String a = "Java";
        String b = "java";
        boolean saoIguais = a.equals(b);
        System.out.println(saoIguais);

        //Uso equalsIgnoreCase()
        //Vai comparar as strings vai retornar se são iguais mesmo com a diferença entre caixa alta ou baixa
        String a1 = "Java";
        String b2 = "java";
        boolean saoIguais1 = a.equals(b);
        System.out.println(saoIguais1);

        //Uso indexOf()
        //Retorna o índice da primeira ocorrência da string especificada
        String indexOfstring = "Programar em Java é ótimo!";
        int indice = indexOfstring.indexOf("Java");
        System.out.println(indexOfstring); //Retorna 14 pois java começa a partir do caracter 14

        //Uso isEmpty()
        //Verifica se a string está vazia(comprimento igual a 0)
        String textoVazio = "";
        boolean estaVazia = textoVazio.isEmpty();
        System.out.println(estaVazia); //retorna true pois está vazia

        //Uso replace()
        //Substitui todas as ocorrências de uma sequência por outra
        String textoReplace = "Olá, Mundo!";
        String novoTexto = textoReplace.replace("Mundo", "Java");
        System.out.println(novoTexto); //Exibi Olá, Java!

        //Uso replaceAll()
        //Subsitui todas as ocorrências que correspondem a uma expressão regular

        String textoReplaceAll = "123 Java 456";
        String novoTextoReplace = textoReplaceAll.replaceAll("\\d", "#");
        System.out.println(novoTextoReplace); //exibi ### Java ###

        //Uso split()
        //Divide a string em um array com base em um delimitador

        String linhaArquivo = "João da Silva; 999.888.777-00;joso@test.com";
        String[] data = linhaArquivo.split(";");
        System.out.println("Nome: "+ data[0]);
        System.out.println("CPF: "+ data[1]);
        System.out.println("Email: "+ data[2]);

        //uso starstWith()
        //Verifica se a string começa com o prefixo especificado

        String textoStarts = "Java é legal";
        boolean comecaCom = textoStarts.startsWith("Java");
        System.out.println(comecaCom);

        //Uso endsWith
        //Verifica se a string termina com o sufixo especificado

        String textoEnds = "Vamos aprender Java";
        boolean terminaCom = textoEnds.endsWith("Java!");
        System.out.println(terminaCom);

        //Uso substring()
        //Retorna uma parte da string do índice inicial até o índice final(Não incluso).

        String textoSubString = "Aprender Java é incrível";
        String parte = textoSubString.substring(9, 13);
        System.out.println(parte);

        //Uso toLowerCase()
        //Coloca o texto que está em caixa alta para baixa

        String textoToLower = "JAVA";
        String minusculo = textoToLower.toLowerCase();
        System.out.println(minusculo);

        //Uso toUpperCase()
        //Coloca o texto em minusculo em masiusculo

        String textoToUpper = "java";
        String maiusculo = textoToUpper.toUpperCase();
        System.out.println(maiusculo);

        //Uso trim()
        //Remove os espaços em branco no ínicio e no fim da string
        String textoTrim = " Java é legal   ";
        String semEspacos = textoTrim.trim();
        System.out.println(semEspacos);

        //Uso compareTo()
        //Compara duas strings lexicograficamente(vai verificar se uma string vem antes da outra ou depois ou mesma posição)
        //Sempre vai retornar negativo caso a palavra na posição aNome venha primeiro, 0 caso sejam iguais, positivo caso a palavra na posição bNome venha primeiro.
        String aNome = "Java";
        String bNome = "Python";
        int resultado = aNome.compareTo(bNome);
        System.out.println(resultado);



    }
}
