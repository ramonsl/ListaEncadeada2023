public class Main {
    public static void main(String[] args) {
        Elemento a= new Elemento();
        a.valor=10;
        Elemento b= new Elemento();
        b.valor=12;
        Elemento c= new Elemento();
        c.valor=14;
        Elemento d= new Elemento();
        d.valor=120;

        Lista minhaLista= new Lista();
        minhaLista.add(a);
        minhaLista.add(b);
        minhaLista.addFim(c);
        minhaLista.addFim(d);

        minhaLista.exibir();
        System.out.println("\nRemovendo na posicao 2");
        minhaLista.removerAt(2);
        minhaLista.exibir();
        System.out.println("\nRemovendo Inicio");
        minhaLista.removerInicio();
        minhaLista.exibir();
        System.out.println("\nRemovendo fim");
        minhaLista.removerFim();
        minhaLista.exibir();
        System.out.println("\nRemovendo Inicio");
        minhaLista.removerAt(0);
        minhaLista.exibir();

    }
}
