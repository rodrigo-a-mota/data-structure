public class Fila
{
    private int[] elementos;
    private int numeroDeElementos;

    public Fila(int tamanhoDoVetor)
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

    public boolean filaVazia()
    {
        return numeroDeElementos == 0;
    }

    public boolean filaCheia()
    {
        return numeroDeElementos >= elementos.length - 1;
    }

    public int getElementoInicio()
    {
        return elementos[0];
    }

    public void enfileirar(int elemento)
    {
        if(filaCheia())
        {
            System.out.println("Estrutura Cheia!");
        } else {
            elementos[numeroDeElementos] = elemento;
            numeroDeElementos = numeroDeElementos + 1;
            System.out.println("Elemento " + elemento + " Adicionando!");
        }
    }

    public int desenfileirar()
    {
        if(filaVazia())
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
}
