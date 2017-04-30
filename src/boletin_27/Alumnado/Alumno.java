package boletin_27.Alumnado;

public class Alumno {

    String nome, apelido, curso;

    public Alumno(String nome, String apelido, String curso) {
        this.nome = nome;
        this.apelido = apelido;
        this.curso = curso;
    }

    public Alumno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", apelido=" + apelido + ", curso=" + curso + '}';
    }

}
