🎤 Apresentação completa – Marvio e Felype

1. Introdução

"Olá, somos Marvio e Felype.

O objetivo deste trabalho é manter a ordem de chegada dos pacientes em uma clínica, garantindo que quem chegar primeiro seja atendido primeiro, seguindo o modelo FIFO (First In, First Out). Para isso, usamos uma fila encadeada, onde cada paciente é representado por um nó. Essa estrutura permite inserir novos pacientes no final da fila e remover do início, mantendo a ordem corretamente."

2. Estrutura da Fila Encadeada (JavaScript)

"No código, criamos a classe No, que representa cada paciente. Cada nó guarda os dados do paciente e um ponteiro para o próximo da fila.

A classe FilaEncadeada gerencia a fila com três funções principais:

enfileirar(dado): adiciona um novo paciente ao final da fila;

desenfileirar(): remove o paciente do início, simulando o atendimento;

espiar(): mostra quem é o próximo a ser atendido, sem remover da fila;

paraVetor(): transforma a fila em um vetor para exibição na interface.

Isso garante que a lógica FIFO seja mantida em todas as operações."

3. Interface e Interação com o Usuário

"Depois de implementar a estrutura da fila, criamos uma interface para simular a fila da clínica no navegador.

Usamos os campos de nome, idade e condição do paciente. Quando o botão 'Adicionar' é clicado, a função enfileirarPaciente() coleta esses dados e adiciona o paciente à fila.

Quando clicamos em 'Atender', a função desenfileirarPaciente() remove o paciente da frente da fila, como se ele estivesse sendo chamado.

Também é possível:

Espiar quem está na frente, usando espiarPaciente();

Limpar toda a fila, com limparFila().

A função atualizarInterface() cuida de mostrar tudo isso na tela: os pacientes em ordem, quem está na frente e um histórico das operações realizadas."

4. Conclusão

"Com essa implementação, conseguimos simular uma clínica organizada, onde todos os pacientes são atendidos por ordem de chegada, garantindo justiça e eficiência no atendimento. A estrutura de fila encadeada foi essencial para manter esse controle de forma dinâmica."
