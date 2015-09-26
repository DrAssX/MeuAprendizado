Exemplo de aplicação Cliente/Servidor em que é feito o carregamento de uma imagem utilizando Android e a imagem é recuperada utilizando servidor Apache.

> Instalação Apache no Linux Debian (ou equivalente)

1. Download
  1. Abra o Terminal
  2. Execute o seguinte comando: sudo apt-get install apache2
  3. Execute o comando: sudo chmod 777 /var/www (ou informe os privilégios desejados por você)

> Instalação Apache no Microsoft Windows

1. Download
  1. Acesse o site: http://www.apachelounge.com/download/
  2. Escolha o arquivo .zip de acordo com o seu sistema operacional httpd-x-win64-x.zip para x64 ou httpd-x-win32-x.zip para x32 e faça o download
  3. Descompacte o arquivo em C:/
  4. Abra o CMD com privilégios administrativos
  5. Navegue até a pasta C:/Apache24/bin
  6. Execute o comando httpd.exe -k install (O Apache será iniciado como um serviço)

> Preparando o servidor para a execução do exemplo:

1. Linux Debian (ou equivalente)
  1. Copie a pasta Server do projeto para o diretório /var/www
  2. Teste acessando a URL: localhost/Server
  3. Se abrir o conteúdo do diretório Server está funcionando corretamente.

2. Microsoft Windows
  1. Copie a pasta Server do projeto para o diretório C:/Apache24/htdocs
  2. Teste acessando a URL: localhost/Server
  3. Se abrir o conteúdo do diretório server está funcionando corretamente.

> Referências

  - [The Code Central - Setting Up Your Own Web Server on a Windows Machine (Apache HTTP Server)](http://thecodecentral.com/2007/03/24/setting-up-your-own-web-server-with-apache-http-server-php-and-mysql-on-a-windows-machine)

  - [Digital Ocean - How To Install Linux, Apache, MySQL, PHP (LAMP) stack on Ubuntu](https://www.digitalocean.com/community/tutorials/how-to-install-linux-apache-mysql-php-lamp-stack-on-ubuntu)

  - [Viva O Linux - Tutorial de instalação e configuração do Apache no Linux](http://www.vivaolinux.com.br/artigo/Tutorial-de-instalacao-e-configuracao-do-Apache-no-Linux)

  - [Adiel Cristo - Instalando o Apache no Windows](http://www.adielcristo.com/blog/pt/2011/11/instalando-o-apache-no-windows/) 



