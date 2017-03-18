<%-- 
    Document   : saida
    Created on : 18/03/2017, 01:01:10
    Author     : Edson Melo de Souza (prof.edson.melo@gmail.com)
--%>

<%@page import="bean.Pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Resultado</title>
    </head>
    <body>
        <h1>Resultado Postado</h1>
        <%
            /**
             * Abertura da TAG JSP para inclusão dos códigos
             */

            // Criando uma Pessoa
            Pessoa pResultado = (Pessoa) request.getAttribute("pessoa");

            out.print("Nome: " + pResultado.getNome() + " " + pResultado.getSobreNome() + "<br>");
            out.print("Sexo: " + pResultado.getSexo() + "<br>");
            out.print("Idade: " + pResultado.getIdade());
        %>
        <br><br>
        <a href="index.html">Voltar</a>
    </body>
</html>
