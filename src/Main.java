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

        Elemento z= new Elemento();
        z.valor=140;

        Elemento x= new Elemento();
        x.valor=1000;

        Lista minhaLista= new Lista();
        minhaLista.add(a);
        minhaLista.add(b);
        minhaLista.addFirst(c);
        minhaLista.addLast(d);

        //minhaLista.exibir();
       // System.out.println("\nRemovendo na posicao 2");
        minhaLista.add(z);
        minhaLista.exibir();
        //System.out.println("\nRemovendo Inicio");
      //  minhaLista.removerInicio();
        minhaLista.exibir();
       // System.out.println("\nRemovendo fim");
        //minhaLista.removerFim();
        minhaLista.add(1,x);
        minhaLista.exibir();
       // System.out.println("\nRemovendo Inicio");
       // minhaLista.removerAt(0);
        minhaLista.exibir();

    }
}
