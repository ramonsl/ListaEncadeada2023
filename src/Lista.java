public class Lista implements ListaEncadeada { //head/cabeça/descritor
    Elemento inicio;
    Elemento fim;
    int tamanho;

    @Override
    public boolean add(Elemento e) {
        if (this.inicio == null){
              addFirst(e);
              return true;
        }
        if(inicio != null){
            Elemento aux= fim;
            aux.proximo=e;
            fim=e;
            tamanho++;
            return true;
        }
        return false;
    }

    @Override
    public void add(int index, Elemento element)  throws IndexOutOfBoundsException {     //trows
       //adicionar mesmo que nao tenha o indice
        if(inicio==null){
            addFirst(element);
        }
        if (index==tamanho-1){
            addLast(element);
        }

        if(index>tamanho){
            throw new IndexOutOfBoundsException("Erro ao adcionar na posição " +index);
        }
        if (inicio!=null){
            int cont=0;
            Elemento pos=this.inicio;
            while (pos.proximo!=null){
                if (cont==index){
                    break;
                }
                cont++;
                pos=pos.proximo;
            }
            //add
            element.proximo= pos.proximo;
            pos.proximo= element;
            tamanho++;
        }


    }

    @Override
    public void addFirst(Elemento e) { //trows
        this.inicio =e;
        this.fim=e;
        this.tamanho++;
    }

    @Override
    public void addLast(Elemento e) {//trows

        if (this.inicio ==null){
            addFirst(e);
        }

        if(this.inicio!=null){
            Elemento aux= fim;
            aux.proximo=e;
            fim=e;
            tamanho++;
        }
    }

    @Override
    public void clear() {
        tamanho=0;
        inicio=null;
        fim= null;
    }

    @Override
    public Elemento get(int index) {
        int cont=0;

        if (index==0){
            return getFirst();
        }
        if (index==tamanho-1){
            return getLast();
        }
        if ((index>0) && (index<tamanho)) {
            Elemento aux= inicio;
            while (aux!=null){
                if(cont == index){
                    return aux;
                }
                aux=aux.proximo;
                cont++;
            }
        }
        return null;
    }

    @Override
    public Elemento getFirst() {
        Elemento e= inicio;
        if (e!=null){
            return e;
        }
        return null;

    }

    @Override
    public Elemento getLast() {
        Elemento e= fim;
        if (fim!= null){
            return fim;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
            //Elemento a= (Elemento) o;
            int cont=-1;//significa que nao esta na lista
            Elemento aux= inicio;
            while (aux!=null) {
                cont++;
                if (aux.equals(o)) {
                    return cont;
                }
                aux = aux.proximo;
            }
            return -1;
    }

    @Override
    public Elemento remove() {
        return removeFirst();
    }

    @Override
    public Elemento remove(int index) {

        Elemento e= get(index);

        if(index==0){
           return removeFirst();
        }
        if (index ==tamanho-1){
            return removeLast();

        }
        int cont=0;
        Elemento remocao=this.inicio;
        Elemento anterior=this.inicio;
        while (remocao.proximo!=null){
            if (remocao==e){
                break;
            }
            cont++;
            anterior=remocao;
            remocao=remocao.proximo;
        }
        anterior.proximo=remocao.proximo;
        tamanho--;
        return remocao;

    }

    @Override
    public boolean remove(Object o) {
        Elemento e=(Elemento) o;

        if(e==inicio){
            removeFirst();
            return true;
        }
        if (e==fim){
            removeLast();
            return true;
        }
        int cont=0;

        Elemento remocao=this.inicio;
        Elemento anterior=this.inicio;
        while (remocao.proximo!=null){
            if (remocao==e){
                break;
            }
            cont++;
            anterior=remocao;
            remocao=remocao.proximo;
        }
        anterior.proximo=remocao.proximo;
        tamanho--;
        return true;


    }

    @Override
    public Elemento removeFirst() {
        Elemento r=inicio;
        if (r==null){
            return null;
        }
        if (tamanho==1){
            inicio=null;
            fim= null;
            tamanho=0;
            return r;
        }
        if (tamanho!=1){
            Elemento primeiro=inicio;
            inicio=primeiro.proximo;
            tamanho--;
            return r;
        }
        return  null;
    }

    @Override
    public Elemento removeLast() {
        Elemento current=this.inicio;
        if (current==null){
            return null;
        }
        Elemento anterior=this.inicio;
        while (current.proximo!=null){
            anterior=current;
            current=current.proximo;
        }
        anterior.proximo=null;
        fim=anterior;
        tamanho--;
        return current;
    }

    @Override
    public int size() {
        return this.tamanho;
    }


    public void show() {

        Elemento current = this.inicio;
        if(current==null){
            System.out.println("Lista Vazia");
        }

        while (current != null) {
            System.out.print(current.valor + " ");
            current = current.proximo;
        }
        System.out.println("");
    }
/*
    public boolean add(Elemento e){
        if (this.inicio ==null){
            addFirst(e);
        }else{
            e.proximo=this.inicio;
            this.inicio =e;
            this.tamanho++;
        }

        return true;
    }

    public int getTamanho2(){
       int tam=0;
       Elemento e=this.inicio;
        while (e!=null){
            tam++;
            e=e.proximo;
        }
        return tam;
    }
    public int getTamanho(){
        return this.tamanho;
    }

    public boolean addFim(Elemento e){
        if (this.inicio ==null){
            addFirst(e);
        }else{
            Elemento aux= inicio;
            while (aux.proximo!=null){
                aux=aux.proximo;
            }
            aux.proximo=e;
            fim=e;
            tamanho++;
        }

        return true;
    }
    public boolean addFirst(Elemento e){
        this.inicio =e;
        this.fim=e;
        this.tamanho++;
        return  true;
    }

    public boolean addFim2(Elemento e){
        if (this.inicio ==null){
            addFirst(e);
        }else{
            Elemento aux= fim;
            aux.proximo=e;
            fim=e;
            tamanho++;
        }

        return true;
    }

    public boolean removerInicio(){
        if (tamanho==1){
            inicio=null;
            fim= null;
            tamanho=0;
            return true;
        }
        if (tamanho!=1){
            Elemento primeiro=inicio;
            inicio=primeiro.proximo;
            tamanho--;
        }
        return  false;

    }
    public boolean removerFim(){

        Elemento current=this.inicio;
        Elemento anterior=this.inicio;
        while (current.proximo!=null){
            anterior=current;
            current=current.proximo;
        }
        anterior.proximo=null;
        fim=anterior;
        tamanho--;
        return true;

    }
    public boolean removerAt(int p){
        if (p==0){
           return removerInicio();
        }
        if (p==tamanho-1){
            return removerFim();
        }
        int cont=0;
        Elemento remocao=this.inicio;
        Elemento anterior=this.inicio;
        while (remocao.proximo!=null){
            if (cont==p){
                break;
            }
            cont++;
            anterior=remocao;
            remocao=remocao.proximo;
        }
        anterior.proximo=remocao.proximo;
        tamanho--;
        return true;

    }


    public void  exibir() {

        Elemento current = this.inicio;
        if(current==null){
            System.out.println("Lista Vazia");
        }

        while (current != null) {
            System.out.print(current.valor + " ");
            current = current.proximo;
        }
    }
*/
}



