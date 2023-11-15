# CRUD
Springboot Rest API CRUD MySQL Database
<img src="https://raw.githubusercontent.com/MicaelliMedeiros/micaellimedeiros/master/image/computer-illustration.png" min-width="400px" max-width="400px" width="400px" align="right">

<p align="left"> 
  O objetivo desta aplicação é fornecer operações <strong>CRUD (Create, Read, Update, Delete)</strong> via requisições HTML usando <strong>Postman</strong> em uma tabela <strong>MySQL</strong> por meio de uma <strong>API Restful</strong> construída com <strong>Spring Boot</strong>.
</p>
<br>
<p align="left">
🪖 <strong>Principais funcionalidades:</strong> <br>
<strong>Create:</strong> Adicionar novos registros à tabela no banco de dados.<br>
<strong>Read:</strong> Visualizar informações da tabela.<br>
<strong>Update:</strong> Atualizar registros existentes na tabela.<br>
<strong>Delete:</strong> Remover registros da tabela.<br>
</p>
<br>
<p align="left">
📡 <strong>Tecnologias Utilizadas:</strong> <br>
<strong>Spring Boot:</strong> Framework Java para criação de aplicativos em rápida execução.<br>
<strong>Lombok:</strong> Biblioteca que simplifica o código Java eliminando a necessidade de escrever getters, setters e outros métodos comuns.<br>
<strong>Java:</strong> Linguagem de programação principal.<br>
<strong>Maven:</strong> Ferramenta de gerenciamento de projetos e construção.<br>
<strong>MySQL:</strong> Sistema de gerenciamento de banco de dados relacional.<br>
<strong>JpaRepository:</strong> Interface que simplifica as operações de acesso a dados em um banco de dados relacional usando Spring Data JPA.<br>
<strong>Postman:</strong> Ferramenta para testar e documentar APIs.<br>
</p>
<br>
<p align="left">
📜 <strong>Instruções de Uso:</strong> <br>
Faça o download do arquivo ZIP no repositório e extraia-o.<br>
Abra o projeto em sua IDE de preferência.<br>
Configure um banco de dados <strong>MySQL</strong> e crie um usuário com acesso total a ele.<br>
Acesse o arquivo <strong>application.yml</strong> em <strong>src/main/resources/templates</strong> e ajuste os dados de username, password e a parte final da URL de acordo com o nome da <strong>Schema</strong> do seu banco de dados.<br>
Certifique-se de ter o <strong>Springboot, Lombok, MySQL, Postman, Maven e Java</strong> instalados e devidamente configurados em sua máquina.<br>
Rode o arquivo como um <strong>Spring Boot App.</strong>
</p>
<br>
<p align="left">
💡 <strong>Exemplificações:</strong> <br>
</p>
<p >
Após baixar o pacote zip, <strong>extrair e importá-lo</strong> para sua IDE, configurar seu <strong>usuário, senha e Schema no .yml</strong>, além de instalar as tecnologias necessárias, você pode rodar a aplicação, como <strong>Spring Boot App</strong>. Se tudo estiver correto, você deve visualizar no console algo parecido com isso:<br>
</p>
<br>

![console spring boot](https://github.com/clovisks/CRUD/assets/103525851/9410b6f0-fb7e-4fdc-ad9d-0012cf682f32)

Dessa forma, já é possível visualizar a tabela sendo criada no Banco de Dados.
<br>
Agora, acesse seu MySQL e selecione o Banco configurado ao projeto. Escreva os seguintes dados no console do MySQL e, após selecionar linha por linha dos dados e clicar no raio no canto superior, receberá a notificação abaixo de que funcionou. Lembre-se de alterar o <strong>use spring;</strong> visto que esse é o nome da <strong>Schema.</strong>
<br>
<br>

![sql init](https://github.com/clovisks/CRUD/assets/103525851/eec5ebf5-1688-4039-98e2-391f93460883)

<br>
Agora que ja temos nossa tabela pronta, vamos fazer algumas requests e inserir alguns dados nela. Para isso, iniciaremos com o método <strong>POST</strong>. Dessa forma, dentro do <strong>Postman</strong>, insira a rota que foi configurada na aplicação, neste caso, <strong>localhost:8080/course</strong>, selecione <strong>Body e raw</strong> e passe o nome e o valor das variáveis. Clique em <strong>send</strong> e observe o resultado abaixo.
<br>
<br>

![metodo post enviando](https://github.com/clovisks/CRUD/assets/103525851/8e5f8282-73ad-413b-ba32-65f68f9e95ce)

<br>
Se voltarmos para o <strong>MySQL</strong>, selecionarmos a ultima linha escrita (tem a função de buscar a tabela) e clicar no raio novamente, veremos o resultado.
<br>
<br>

![resultado post AJUST](https://github.com/clovisks/CRUD/assets/103525851/e3c953f1-1361-40f0-9055-89a98f345a81)

<br>
Agora outro método a ser utilizado é o <strong>PUT</strong>, que cumpre o papel de editar os dados da tabela, somente é necessário passar seu <strong>"cid"</strong>, que no caso é o <strong>course_id</strong>. Juntamente com isso, as alterações a fazer.
<br>
<br>

![metodo put enviando AJUST](https://github.com/clovisks/CRUD/assets/103525851/c67cf05f-ec38-41c5-bb74-30f9ced9fca8)

<br>
Novamente, ao voltarmos no <strong>MySQL</strong> e repetirmos o processo, veremos que a alteração ja foi feita.
<br>
<br>

![resultado put AJUST](https://github.com/clovisks/CRUD/assets/103525851/c740b973-13dd-4176-bb58-1ca00b3103c7)

<br>
Adicionei mais um curso à nossa tabela, para exemplificar o método <strong>GET</strong>. Para este método, temos dois modos de utilizá-lo, sendo eles o GetById, ou seja, busca pelo número do Id, e também o GetAll, que traz todos os cursos presentes na tabela. Como esse método apenas busca o que está presente na tabela, não é necessário voltar ao <strong>MySQL</strong> para ver o resultado, os dados da tabela são apresentados diretamente no <strong>Postman</strong>.
<br>
<br>

![metodo getall AJUST](https://github.com/clovisks/CRUD/assets/103525851/e22609ea-78f2-4667-9d25-fe0e8d1e0d8a)

<br>
Como foi visto acima, utilizamos <strong>localhost:8080/courses</strong> como rota para essa requisição, visto que nesse caso a rota que define ser GetAll ao invés de ser GetById. Se o método desejado for o GetById, temos que usar <strong>/course/{cid}</strong>, ou seja, o Id do curso.
<br>
<br>

![metodo getbyid AJUST](https://github.com/clovisks/CRUD/assets/103525851/db668420-7bd8-4818-9471-2db163373373)

<br>
Por último, o método <strong>Delete</strong>, que é somente por Id. Dessa forma, temos que utilizar a rota da mesma maneira que o GetById, <strong>/course/{cid}</strong>.
<br>
<br>

![metodo delete AJUST](https://github.com/clovisks/CRUD/assets/103525851/15fe5310-701a-4d9d-b94b-2dc1da4ee435)

<br>
Enviando a requisição com o course_id equivalente a 1, excluíremos o primeiro curso de nossa tabela. Podemos ver que o resultado foi <strong>Delete Success</strong>, mas se tivessemos passado uma rota vazia, ele retornaria que não achou conteúdo para excluir.
<br>
<br>

![metodo delete error AJUST](https://github.com/clovisks/CRUD/assets/103525851/729b642d-a3e8-43ae-9b59-39cf0fa6cb54)

<br>
E o resultado da exclusão anterior, podemos ver tanto no próprio <Strong>Postmanm</Strong>, requisitando um método Get, quanto no <strong>MySQL</strong>, requisitando os dados da tabela.
<br>
<br>

![metodo delete resultado postman AJUST](https://github.com/clovisks/CRUD/assets/103525851/f8defa65-ada2-4d65-ad49-efd6f3ca379e)


![metodo delete resultado sql AJUST](https://github.com/clovisks/CRUD/assets/103525851/0931f2f6-5674-4187-8717-b6dc2b44ec4d)

<br>
<br>
Dessa forma, os métodos cruciais para um <strong>CRUD</strong> foram todos executados.



