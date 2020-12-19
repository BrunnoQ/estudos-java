package br.edu.brunno.hackerhank;

public class DijsktraImplement {

    public static void main(String[] args) {

        // Matriz de adjacencia representando o GRAFO e suas ARESTAS
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

        dijsktraContaTodos(graph, 0);
    }

    private static void dijsktraContaTodos(int graph[][], int origem) {

        // Caminhos do vertice a ser analisado
        int caminhoMenosCustoso[] = new int[graph.length];
        // Navegador do grafo
        boolean caminhosJaPercorridos[] = new boolean[graph.length];

        for (int i = 0; i < caminhoMenosCustoso.length; i++) {
            caminhoMenosCustoso[i] = Integer.MAX_VALUE; // Digo que todos os caminhos tem um valor ALTO pq não sei quem
                                                        // eh quem
            caminhosJaPercorridos[i] = false; // Nenhum caminho percorrido
        }

        caminhoMenosCustoso[origem] = 0;
        // Encontrar os caminhos Percorrer vertice
        for (int i = 0; i < caminhoMenosCustoso.length - 1; i++) {

            int menor = verticeComMenorCusto(caminhoMenosCustoso, caminhosJaPercorridos);

            caminhosJaPercorridos[menor] = true; // Ja passei pelo indice

            // Percorrer Arestas
            for (int a = 0; a < caminhoMenosCustoso.length; a++) {

                if (!caminhosJaPercorridos[a] && graph[menor][a] != 0 && caminhoMenosCustoso[menor] != Integer.MAX_VALUE
                        && caminhoMenosCustoso[menor] + graph[menor][a] < caminhoMenosCustoso[a])
                    caminhoMenosCustoso[a] = caminhoMenosCustoso[menor] + graph[menor][a];
            }

        }
        printar(caminhoMenosCustoso);
    }

    static void printar(int caminhoMenosCustoso[]) {
        System.out.println("VERTICE \t\t DISTANCIA da FONTE");
        for (int i = 0; i < caminhoMenosCustoso.length; i++)
            System.out.println(i + " \t\t " + caminhoMenosCustoso[i]);
    }

    private static int verticeComMenorCusto(int caminhoMenosCustoso[], boolean caminhosJaPercorridos[]) {

        int menorValor = Integer.MAX_VALUE; // Nao sei o valor chuto o mais alto
        int indiceComMenorValor = -1; // Não sei o indice, coloco um valor inválido

        for (int i = 0; i < caminhoMenosCustoso.length; i++) {

            if (caminhosJaPercorridos[i] == false && caminhoMenosCustoso[i] <= menorValor) {
                menorValor = caminhoMenosCustoso[i];
                indiceComMenorValor = i;
            }

        }

        return indiceComMenorValor;
    }

}
