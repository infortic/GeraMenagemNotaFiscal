# Exercício 1
Você está recebendo uma classe Java chamada GeradorObservacao. Essa classe é uma classe legada similar</br>
ao que temos em alguns pontos do nosso produto que poderia fazer parte de uma geração de relatório para</br>
o nosso sistema, e onde precisamos fazer uma alteração por uma necessidade levantada.</br>
A classe atual recebe uma lista de inteiros, e devolve uma String com esses inteiros separados por vírgula</br>
concatenados a um texto inicial. Ajustando o texto para singular ou plural de acordo com a quantidade de</br>
itens da lista.</br>
## Exemplo:
Dado de entrada: Arrays.asList(1, 2, 3, 4, 5)</br>
Retorno esperado: "Fatura das notas fiscais de simples remessa: 1, 2, 3, 4 e 5."</br>
Um dos clientes do nosso sistema que utiliza essa funcionalidade nos trouxe a necessidade de querer ver</br>
essas informações junto com o valor, no seguinte formato:</br>
"Fatura das notas fiscais de simples remessa: 1 cujo valor é R$ 10,00, 2 cujo valor é R$ 35,00, 3 cujo valor é</br>
R$ 5,00, 4 cujo valor é R$ 1.500,00 e 5 cujo valor é R$ 0,30. Total = 1.550,30."</br>
É uma prática comum nossa manter o comportamento já existente do sistema. Para isso, é necessário</br>
suportar que ambas as opções coexistam e estejam disponíveis em funcionamento (o código legado por ser</br>
alterado, mas o seu comportamento deve ser mantido com funcionamento igual ao atual).</br>
Ao final da implementação, enviar as classes de produção e testes que atendem as necessidades acima.</br>
Além das classes, detalhar no README.md os aspectos negativos do código atual e os motivos que</br>
incentivaram as possíveis mudanças no código.</br>