Algoritmo "semnome"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2024
Var
// Seção de Declarações das variáveis 


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
 Algoritmo CalculoTinta
 
   largura_parede1, comprimento_parede1, largura_parede2, comprimento_parede2, largura_parede3, comprimento_parede3, largura_parede_especial, comprimento_parede_especial: Real
   area_paredes_comuns, area_parede_especial, litros_tinta_comum, litros_tinta_especial, custo_tinta_comum, custo_tinta_especial: Real
   preco_tinta_comum, preco_tinta_especial: Real

Inicio
   preco_tinta_comum <- 80.00
   preco_tinta_especial <- 150.00

   Escreva("Informe a largura da parede 1 (em metros): ")
   Leia(largura_parede1)
   Escreva("Informe o comprimento da parede 1 (em metros): ")
   Leia(comprimento_parede1)

   Escreva("Informe a largura da parede 2 (em metros): ")
   Leia(largura_parede2)
   Escreva("Informe o comprimento da parede 2 (em metros): ")
   Leia(comprimento_parede2)

   Escreva("Informe a largura da parede 3 (em metros): ")
   Leia(largura_parede3)
   Escreva("Informe o comprimento da parede 3 (em metros): ")
   Leia(comprimento_parede3)

   Escreva("Informe a largura da parede especial (em metros): ")
   Leia(largura_parede_especial)
   Escreva("Informe o comprimento da parede especial (em metros): ")
   Leia(comprimento_parede_especial)

   area_paredes_comuns <- (largura_parede1 * comprimento_parede1) + (largura_parede2 * comprimento_parede2) + (largura_parede3 * comprimento_parede3)
   area_parede_especial <- largura_parede_especial * comprimento_parede_especial

   litros_tinta_comum <- area_paredes_comuns / 5
   litros_tinta_especial <- area_parede_especial / 3

   custo_tinta_comum <- litros_tinta_comum * preco_tinta_comum
   custo_tinta_especial <- litros_tinta_especial * preco_tinta_especial

   Escreva("Tinta comum necessária: ", litros_tinta_comum:2:2, " litros")
   Escreva("Custo da tinta comum: R$", custo_tinta_comum:2:2)
   Escreva("Tinta especial necessária: ", litros_tinta_especial:2:2, " litros")
   Escreva("Custo da tinta especial: R$", custo_tinta_especial:2:2)


Fimalgoritmo