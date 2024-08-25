# Simulando Uma Conta Bancária Através Do Terminal/Console

Projeto realizado no módulo de <b>Sintaxe Básica com Java<b>, com o professor <a href="https://github.com/glysns">Gleyson Sampaio</a> no <a href="[https://www.dio.me/bootcamp/coding-future-gft-desenvolvimento-java-com-ia](https://www.dio.me/bootcamp/coding-the-future-claro-java-spring-boot)">Bootcamp Claro - Java com Spring Boot</a>, da <a href="https://www.dio.me/">DIO em parceria com a Claro</a>.
<br><br>
### Proposta
<ul>
  <li>Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos.</li>  
  <li>Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.</li>  
  <li>Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo: "Por favor, digite o número da Agência !"</li>  
  <li>Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem: "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".</li>  
</ul>
<br>

### 🚀Como eu já estava um pouco mais avançado e para dar um pouco mais de emoção, fiz algumas alterações no meu projeto:
<ul>
  <li>✅ O usuário **NÃO** digita um número qualquer de agência, mas sim recebe uma lista predefinida das agências disponíveis e a partir desse número, usando um switch case, nossa classe principal busca o número correto da agência; </li>
  <li>✅ O usuário **NÃO** digita um número qualquer de agência, mas sim o sistema faz a geração interna desse número, seguindo o padrão que pre-estabelecemos.</li>
</ul>
<br>

### Resultado
![terminal](https://github.com/bmattosrs/dio-trilha-java-basico/blob/main/ContaBanco/src/clarobank-cli.jpg))
<br><br>

### Como utilizar o código?
A partir do arquivo ContaTerminal.java interaja com a classe ContaBanco. 
