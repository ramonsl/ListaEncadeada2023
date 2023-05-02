import java.util.Objects;

public class Elemento { //nó nodo
    int valor;
    Elemento proximo;


    @Override
    public String toString() {
        return "valor=" + valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elemento elemento = (Elemento) o; //cast
        return valor == elemento.valor;
    }
    //X 1000 e001
    //Busca 1000 e002
   // x.equals(Pessoa)

}
