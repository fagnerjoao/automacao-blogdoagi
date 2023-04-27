# automacao-blogdoagi

Este é um projeto de testes automatizados utilizando Java, Selenium, JUnit e Cucumber para testar a funcionalidade do um website https://blogdoagi.com.br/.


# Antes de executar este projeto, é necessário instalar os seguintes softwares:

    Java Development Kit (JDK) 8 ou superior
    Maven
    ChromeDriver
    FirefoxDriver


# Configuração

    Clone o repositório para a sua máquina local
    Abra o projeto em sua IDE preferida (ex: IntelliJ, Eclipse). Recomendo o Intellij
    Baixe as dependências do Maven de acordo com o que está no arquivo POM do projeto
    Certifique-se de que o ChromeDriver/FirefoxDriver está instalado corretamente (de acordo com a versão do browser) e configurado no PATH do seu sistema operacional

# Execução

Existem duas maneiras de executar os testes automatizados: através da linha de comando ou através do IDE.

# Executando através da linha de comando

    Abra o terminal ou prompt de comando
    Navegue até o diretório raiz do projeto
    Execute o seguinte comando para executar todos os testes:
        Para gerar relatório "formated-reports" -> mvn test -Dtest=**/*Runner cluecumber-report:reporting
        Para executar informando tag especofícias -> mvn test -Dcucumber.options="--tags @tagDesejada.



# Executando através do IDE

    Abra o projeto em sua IDE preferida (ex: IntelliJ, Eclipse)
    Navegue até a classe Runner localizada no diretório src/test/java/runner/Runner.java
    Clique com o botão direito na classe Runner e selecione "Run" (também irá gerar logs)

# Estrutura do projeto

    src/test/java - Contém todas as classes de teste.
    src/test/resources - Contém os arquivos de configuração do Cucumber
    target - Contém os arquivos logs,compilados e gerados pelo Maven

# Tecnologias utilizadas

    Java
    Maven
    Selenium WebDriver
    JUnit
    Cucumber

# Autor

    Fagner Silva - fagnerjoao@gmail.com
    Linkedin: https://www.linkedin.com/in/fagner-silva-a924777a/