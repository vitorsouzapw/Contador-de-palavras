public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            return;
        }

        int palavrasquant = args.length;
        int par = 0;
        int impar = 0;
        int qtda = 0;
        int qtde = 0;
        int qtdi = 0;
        int qtdo = 0;
        int qtdu = 0;

        for(String palavra: args){
            if(palavra.length() % 2 == 0)
                par++;
            else
                impar++;

            for(char letra: palavra.toLowerCase().toCharArray()){
                switch (letra) {
                    case 'a':
                        qtda++;
                        break;
                    case 'e':
                        qtde++;
                        break;
                    case 'i':
                        qtdi++;
                        break;
                    case 'o':
                        qtdo++;
                        break;
                    case 'u':
                        qtdu++;
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println("Relatório:");
        System.out.println("Quantidade de palavras: "+palavrasquant);
        System.out.println("Quantidade de pares: "+par);
        System.out.println("Quantidade de ímpares: "+impar);
        System.out.println("Quantidade de a: "+qtda);
        System.out.println("Quantidade de e: "+qtde);
        System.out.println("Quantidade de i: "+qtdi);
        System.out.println("Quantidade de o: "+qtdo);
        System.out.println("Quantidade de u: "+qtdu);
    }
}