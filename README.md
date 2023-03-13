## Listas Encadeadas

Estrutura dinâmica, cada element é um nó (célula), guarda a referência do primeiro elemento, cada nó faz referência ao próximo elemento.

Estrutura estática (arrays, fila e pilhas): era necessário dizer quantos elementos a estrutura teria.

Estrutura dinâmica: você reserva memória no início, vai dependendo da inserção de elementos.

 Adicionar um elemento no final da lista:
 - Você deve pegar o elemento anterior que tem e apontar o próximo elemento. Início.proximo = novo Nó.
-  para adicionar 3 ou mais elementos é necessário referenciar o primeiro elemento e o anterior.

Percorrer a lista:
- Vamos utilizar uma referência chamada de ponteiro que vai receber o valor inicial da lista.
- Enquanto o valor o próximo for diferente de nulo, o ponteiro será movido para o próximo item da lista.
	- atual.proximo != null { atual = atual.proximo; }
- Você deve modificar o método toString.

Limpar a lista:
- Você pode setar o valor inicial, o próximo e o tamanho como 0.
