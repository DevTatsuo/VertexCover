# Vertex Cover

Projeto em Java que implementa uma solução gulosa simples para o problema de **Vertex Cover** em um grafo não direcionado.

## Sobre o problema

Um **Vertex Cover** é um conjunto de vértices escolhido de forma que toda aresta do grafo tenha pelo menos uma de suas extremidades dentro desse conjunto.

Exemplo: se existe uma aresta entre os vértices `0` e `1`, então o conjunto de cobertura precisa conter `0`, `1` ou ambos.

## Como funciona o algoritmo

O programa percorre a lista de arestas do grafo. Para cada aresta `(u, v)`, ele verifica se nenhum dos dois vértices ainda foi escolhido. Se isso acontecer, os dois vértices são adicionados ao conjunto de cobertura.

Essa abordagem é gulosa e gera uma cobertura válida, mas não garante sempre a menor cobertura possível.

## Estrutura do projeto

```text
VertexCover/
├── src/
│   └── VertexCover.java
├── bin/
├── lib/
└── README.md
```

## Requisitos

- Java JDK instalado
- Terminal, PowerShell ou prompt de comando

Para verificar se o Java está instalado:

```bash
java -version
javac -version
```

## Como compilar e executar

A partir da pasta `WarRoom`, entre no projeto:

```bash
cd VertexCover
```

Compile o arquivo Java:

```bash
javac -d bin src/VertexCover.java
```

Execute o programa:

```bash
java -cp bin VertexCover
```

No Windows PowerShell, também funciona com barras invertidas:

```powershell
javac -d bin src\VertexCover.java
java -cp bin VertexCover
```

## Exemplo de uso

Entrada:

```text
Digite o número de vértices: 4
Digite o número de arestas: 3
Aresta 1:
  Origem: 0
  Destino: 1
Aresta 2:
  Origem: 1
  Destino: 2
Aresta 3:
  Origem: 2
  Destino: 3
```

Saída aproximada:

```text
Matriz de adjacência:
      0  1  2  3
  0   0  1  0  0
  1   1  0  1  0
  2   0  1  0  1
  3   0  0  1  0

Vértices escolhidos: [0, 1, 2, 3]
Tamanho da cobertura: 4
```

## Observações

- Os vértices devem ser informados usando números de `0` até `n - 1`.
- O grafo é tratado como não direcionado.
- O programa também imprime a matriz de adjacência do grafo.
- A solução é aproximada, não necessariamente ótima.
