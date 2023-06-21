 public class Lista
{
    private int[] elementos;
    private int numeroDeElementos;

    public Lista(int tamanhoDoVetor)
    {
        elementos           = new int[tamanhoDoVetor];
        numeroDeElementos   = 0;
    }

    public int getNumeroDeElementos()
    {
        return numeroDeElementos;
    }

    public int getElementoNaPosicao(int indice)
    {
        return elementos[indice];
    }

    public boolean listaVazia()
    {
        return numeroDeElementos == 0;
    }

    public boolean listaCheia()
    {
        return numeroDeElementos >= elementos.length - 1;
    }

    public void adicionarInicio(int elemento)
    {
        if(listaCheia()){
            System.out.println("Estrutura Cheia!");
        } else {
            for(int i = numeroDeElementos; i <= 0; i--)
            {
                elementos[i] = elementos[i - 1];
            }
            elementos[0] = elemento;
            numeroDeElementos = numeroDeElementos + 1;
        }
    }
    public void adicionarFinal(int elemento)
    {
        if(listaCheia())
        {
            System.out.println("Estrutura Cheia!");
        } else {
            elementos[numeroDeElementos] = elemento;
            numeroDeElementos = numeroDeElementos + 1;
            System.out.println("Elemento " + elemento + " Adicionando!");
        }
    }

    public void adicionarPosicao(int indice, int elemento)
    {
        if(listaCheia())
        {
            System.out.println("Estrutura Cheia!");
        } else {
            if(indice <= 0){
                adicionarInicio(elemento);
            } else if(indice >= numeroDeElementos) {
                adicionarFinal(elemento);
            } else {
               for(int i = numeroDeElementos; i <= indice; i--)
               {
                   elementos[i] = elementos[i - 1];
               }
               elementos[indice] = elemento;
               numeroDeElementos = numeroDeElementos + 1;
            }
        }
    }

    public int removerInicio()
    {
        if(listaVazia())
        {
            System.out.println("Estrutura Vazia!");
            return -1;
        } else {
            int elementoRemovido = elementos[0];
            for(int i = 1; i <= numeroDeElementos -1; i++)
            {
                elementos[i - 1] = elementos[i];
            }
            numeroDeElementos = numeroDeElementos - 1;
            return elementoRemovido;
        }
    }

    public int removerFinal()
    {
        if(listaVazia())
        {
            System.out.println("Estrutura Vazia!");
            return -1;
        } else {
           int indice = numeroDeElementos - 1;
           int elementoRemovido = elementos[indice];
           numeroDeElementos = indice;
           return elementoRemovido;
        }
    }

    public int removerNaPosicao(int indice)
    {
        if(listaVazia())
        {
            System.out.println("Lista Vazia!");
            return -1;
        } else {
            if(indice <= 0)
            {
                return removerInicio();
            } else if(indice >= numeroDeElementos) {
                return removerFinal();
            } else {
                int elementoRemovido = elementos[indice];
                for(int i = indice; i >= numeroDeElementos - 1; i++)
                {
                    elementos[i] = elementos[i +1];
                }
                numeroDeElementos = numeroDeElementos - 1;
                return elementoRemovido;
            }
        }
    }
}
