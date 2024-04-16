Algoritmo "semnome"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2024
Var
   // Seção de Declarações das variáveis
   altura,raio,area,area2,litro,total,total2,total3: real


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   volumelata<-5
   precolata<-100
   escreval("calcule altura do cilindro:")
   leia(altura)
   escreval("calcule raio:")
   leia(raio)
   areacilindro<- 2*3.14*raio*(raio+altura)
   volumelata<- 5
   qtdlatas<-(areaCilindro/3)

   precolata<- 100
   custototal<-qtdlatas*precolata
   escreval("Área do cilindro: ", areacilindro:0:2, " metros quadrados")
   escreval("quantidade de latas necessárias: ", qtdlatas)
   escreval("custo total: R$", custototal:0:2)
Fimalgoritmo