import java.util.*;

public class VertexCover {
    public static class Grafo { 
        int vertices;
        List<int[]> arestas;

        Grafo(int v) {
            this.vertices = v;
            this.arestas = new ArrayList<>();
        }
        void adicionarAresta(int u, int v) {
            this.arestas.add(new int[]{u, v});
        }   
        Set<Integer> encontrarVertexCover() {
            Set<Integer> cobertura = new HashSet<>();
            for (int[] aresta : this.arestas) {
                int u = aresta[0];
                int v = aresta[1];
                if (!cobertura.contains(u) && !cobertura.contains(v)) {
                    cobertura.add(u);
                    cobertura.add(v);
                }
            }
            return cobertura;
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de vértices: ");
            System.out.flush();
            int v = scanner.nextInt();
            
            System.out.print("Digite o número de arestas: ");
            System.out.flush();
            int a = scanner.nextInt();   
            Grafo grafo = new Grafo(v);

            int[][] matriz = new int[v][v];

            for (int i = 0; i < a; i++) {
                System.out.println("Aresta " + (i + 1) + ":");
                System.out.print("  Origem: ");
                System.out.flush();
                int origem = scanner.nextInt();
                System.out.print("  Destino: ");
                System.out.flush();
                int destino = scanner.nextInt();

                grafo.adicionarAresta(origem, destino);
                if (origem >= 0 && origem < v && destino >= 0 && destino < v) {
                    matriz[origem][destino] = 1;
                    matriz[destino][origem] = 1; // grafo não direcionado
                }
            }

            System.out.println("\nMatriz de adjacência:");
            System.out.print("    ");
            for (int j = 0; j < v; j++) {
                System.out.printf("%3d", j);
            }
            System.out.println();
            for (int i = 0; i < v; i++) {
                System.out.printf("%3d", i);
                System.out.print(" ");
                for (int j = 0; j < v; j++) {
                    System.out.printf("%3d", matriz[i][j]);
                }
                System.out.println();
            }

            Set<Integer> vertexCover = grafo.encontrarVertexCover();
            System.out.println("\nVértices escolhidos: " + vertexCover);
            System.out.print("Tamanho da cobertura: " + vertexCover.size());
            System.out.println("\nComplexidade aproximada: O(E²) " + vertexCover);
        }
    }
}