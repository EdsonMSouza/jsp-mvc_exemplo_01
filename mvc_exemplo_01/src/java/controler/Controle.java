/*
 * Apenas para fins educacionais.
 * Citar a fonte em caso de uso para terceiros
 */
package controler;

import bean.Pessoa;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Edson Melo de Souza (prof.edson.melo@gmail.com)
 */
public class Controle extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /**
         * Recuperando os dados do formulário:
         * request.getParameter("nome_do_campo") e atribuindo ao objeto Pessoa -
         * manipular via os métodos do objeto
         */
        
        // Criando uma pessoa
        Pessoa p = new Pessoa();
        
        // Atribuir os valores que vieram do formulário
        p.setNome(request.getParameter("nome"));
        p.setSobreNome(request.getParameter("sobreNome"));
        p.setSexo(request.getParameter("sexo"));
        
        // Como idade é inteiro, preciso fazer a conversão
        p.setIdade(Integer.parseInt(request.getParameter("idade")));
        
        /**
         * Pegar o objeto pessoa e pasar para a View (saida.jsp)
         */
        request.setAttribute("pessoa", p);
        
        /**
         * Redirecionar para a página (view) saida.jsp
         */
        RequestDispatcher rd = request.getRequestDispatcher("saida.jsp");
        rd.forward(request, response);
    }
}
