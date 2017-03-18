/**
 * Arquivo: Pessoa.java
 *
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Edson Melo de Souza (prof.edson.melo@gmail.com)
 * @since 18/03/2017, 01:02:24
 * @version 1.0
 */
public class Pessoa implements Serializable {

    // criação dos atributos
    private String nome;
    private String sobreNome;
    private String sexo;
    private int idade;

    // método construtor
    // ALT + INSERT (opções para geração dos construtores e métodos)
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
