package fundamentos;

public class SequenciaLogica {

/*
QUATRO INTENÇOES BASICAS
INTENÇÃO DE APRESENTAÇÃO DA IMAGEM
ESCREVER MENSSAGEM
INTENÇÃO DE ARMAZENAMENTO DE DADOS
ARMAZERNAR INFORMAÇÃO
INTENÇÃO DE LEITURA DE DADOS
LER INFORMAÇÃO
INTENÇÃO DE PROCESSAMENTO DE DADOS
PROCESSAR OPERAÇÃO

PSEUDOCOMANDOS

1) Descreva, usando os quatro pseudocomandos, um programa que calcula a área de
um retângulo.
escerever a mensagem "digite a base"
ler informação
armazena a informaçõa em base
escreve a mensagem "digite a altura"
ler a informação
armazena a informaçõa em altura
processa a operação base * altura
armazena a informação em area
escreve a mensagem area

2) Descreva um programa que calcula o troco de uma compra.
escreve a mesagem "digite o preço da compra"
ler informação.
armazena a informaçõa em ValorCompra
Escreve a mensagem "valor pago"
ler informação.
Armazena a informação em ValorPago.
processa operação ValorPago - ValorCompra.
Armazena a informaçõa em troco.
escreve a mensagem "o troco e ".
escreve a mensagem troco.


3) Descreva um programa que informa se uma pessoa pode dirigir, a partir da idade.
escreve a messagem "digite a sua idade".
ler  informação .
armazera a informação em idade
processa operação: compara se a idade e igual ou maior a 18 anos
 se for maior armazernar "pode dirigir " em resposta
 se for falso armazenar "não pode dirigir" em resposta
escreve a mensagem em resposta

4) Descreva um programa que apresenta a tabuada de um número.
escreve a mensagem "digite um numero"
ler informação
armazenar informação em numero
armazena o valor 1 em um mutiplicador
 processa a operação de repetição enquanto mutiplicador for menor ou igual a 10
 armazenar informação em resultados
 escreve a menssagem Resultados
 processa a operação mutiplicador + 1
 armazena a informação em mutiplicador


Exercícios
Descreva os programas abaixo utilizando apenas os quatro pseudocomandos.
1. Um programa que converte uma temperatura de Celsius para Fahrenheit.
1.escreve a mensagem "informe a temperatura de celsius"
2.ler informação
3.armazena inforção em Celsius
4.processa operação (celsius * 1.8 )+ 32
5.armazenar informação em Fahrenheit
6.escreve a mensagem "a temperatura de fahrenheit e"
7.escrever mensagem Fahrenheit


2. Um programa que calcula o valor da parcela de uma compra sem juros.
1.escreve a menssagem "informe o valor da compra
2.ler informação
3.armazenar a informação em ValorCompra
4.escreve a mensagem "informe a quantidade de parcelas "
5.ler informação
6.armazena informação em  QuantidadeParcela
7.processa operação  ValorCompra/QuantidadeParcela.
8.armazena informação em ValorParcela.
9.escrever mensagem "o valor da parcela e "
10.ecrever mensagem Valorparcela.

3. Um programa que calcula o IMC de uma pessoa a partir do peso e da altura.
1. Escrever a mensagem "Informe seu peso em kg".
2. Ler informação.
3. Armazenar informação em Peso.
4. Escrever a mensagem "Informe sua altura em metros".
5. Ler informação.
6. Armazenar informação em Altura.
7. Processar a operação Peso / (Altura * Altura).
8. Armazenar informação em IMC.
9. Escrever a mensagem "Seu IMC é:".
10. Escrever a informação IMC.

4. Um programa que apresenta a soma de três números digitados pelo usuário.
1.escreve "mensagem digite um numero"
2.ler informação
3.armazena informação em Numero1
4.escreve "mensagem digite o segundo numero"
5.ler informação
6.armazena informação em Numero2
7.escreve "mensagem digite o terceiro numero"
8.ler informação
9.armazena informação em Numero3
10.Processa operação numero1 + numero2  + numero3
11.armazena informação em soma
12.Escreve mensagem "a Soma dos tres numeros e "
13.escreve a mensagem Soma

5. Um programa que informa se um número digitado é par ou ímpar.
1.escreve a mensagem "Digite um numero"
2.ler a informação
3.armazena informação em Numero
4. processa informação numero % 2
5.  se o resultado for igual a
6.   escrever mensagem "o numero e par
7. caso contrario
8.   escrever mensagem 'o numero e impar


6. Um programa que calcula quanto uma pessoa vai gastar de combustível em uma viagem,
1.a partir da distância, do consumo do carro e do preço do litro.
2.escreva a informação " digite qual a distancia percorrida"
3.ler informação
4.armazena informção em distancia
5.escreve a mensagem "digite o consumo do veiculo em km/l"
6.ler informação
7.armazena informação em consumo
8.escreve a mensagem "qual o preço do litro da gasolina
9.ler informação
10.armazena infomação em preço
11.processa operaçao (distancia /consumo) * litro
12.Armazenar informação em Gasto.
13.Escrever a mensagem "O gasto estimado com combustível será:".
14.Escrever a informação Gasto.


7. Um programa que apresenta o maior entre dois números digitados.
1.escreva mensagem "digite um numero"
2.ler informação
3.armazena informação numero1
4.escreva mensagem "digite outro numero"
5.ler informação
6.armazena informação numero2
7. processa operação compara numero1 com o numero2
 se numero 1 for maior que o numero2 armazenar o resultado em resposta
 caso contrario armazenar o o reusltado em resposta
8. escrever mensagem "o maior numero e "
9.escrever mensagem resposta



8. Um programa que calcula o valor final de uma compra com 10% de desconto.
1.escreve a mensagem "Qual o valor da compra"
2.ler informação
3.armazenar informação ValorCompra
4.procesa operação Valorcompra * 0,10
5.armazena informação em desconto
6.processa operação ValorCompra - Desconto
7.armazena informação em ValorFinal
8.escreve mensagem "o valor finaçl da compra e "
9.escreve a mensagem ValorFinal


9. Um programa que lê o nome e o ano de nascimento de uma pessoa e apresenta uma
mensagem de boas-vindas com a idade dela.
escreve a mensagem "Qual e o seu nome"
ler informação
armazena informação
escreve a mensagem "Qual a sua data de nascimento
ler informação
armazena informaçõa em DataNascimento
Processar a operação AnoAtual - AnoNascimento.
Armazenar informação em Idade.
Escrever a mensagem "Seja bem-vindo(a),".
Escrever a informação Nome.
Escrever a mensagem "Sua idade é:".
Escrever a informação Idade.

10. Um programa que lê cinco notas e apresenta a média.
Escrever a mensagem "Digite a primeira nota".
Ler informação.
Armazenar informação em Nota1.
Escrever a mensagem "Digite a segunda nota".
Ler informação.
Armazenar informação em Nota2.
Escrever a mensagem "Digite a terceira nota".
Ler informação.
Armazenar informação em Nota3.
Escrever a mensagem "Digite a quarta nota".
Ler informação.
Armazenar informação em Nota4.
Escrever a mensagem "Digite a quinta nota".
Ler informação.
Armazenar informação em Nota5.
processar a operação (Nota1 + Nota2 + Nota3 + Nota4 + Nota5) / 5.
armazenar informação em Media.
escrever a mensagem "A média das cinco notas é:".
escrever a informação Media.

11. Um programa que valida uma senha: lê a senha digitada e informa se ela está correta.
armazena informação em SenhaCorreta
escreve a mensagem "Qual e a sua senha"
ler informação
armazena informação em SenhaDigitada
processa operação entre senha digitada e a SenhaCorreta
se senha digitada for igual a senha correta
escrever a mensagem "Senha correta. Acesso permitido!".
Caso contrário
escrever a mensagem "Senha incorreta. Acesso negado!".


12. Um programa que lê o preço de um produto e a quantidade comprada e apresenta o total
escrever a mensagem "Informe o preço do produto".
ler informação.
armazenar informação em Preco.
escrever a mensagem "Informe a quantidade comprada".
ler informação.
Armazenar informação em Quantidade.
processar a operação Preco * Quantidade.
armazenar informação em Total.
escrever a mensagem "O valor total da compra é:".
Escrever a informação Total.


*/



   }
