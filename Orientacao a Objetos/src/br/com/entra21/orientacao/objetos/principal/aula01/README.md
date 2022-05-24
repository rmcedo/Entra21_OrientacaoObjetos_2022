# Aprendendo sobre Classes e Objetos

## Classe s�o formas que criam objetos

> As classes podem ser chamadas de 2 formas

> - static onde n�o precisa dar new para utilizar o (ponto) por�m somente itens static aparecem como op��o

> - objeto onde para acessar os atributos e metodos � necess�rio dar new para criar um objeto

## Encapsulamento

> Pode ser visto como uma burocracia no c�digo, por�m facilita e muito a refatora��o com o m�nimo ou nenhum impacto para quem j� consumiu os objetos dessa classe.

> EXEMPLOS:

> - Alterar o nome de um atributo que est� sendo acessado diretamente dora da classe, requer que l� fora seja ajustado tamb�m

> - Mudar privil�gios de altera��o ou leitura sem impactar em quem consome, basta alterar a implementa��o nos gets e sets.