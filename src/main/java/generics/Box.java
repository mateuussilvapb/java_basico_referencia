package generics;

public class Box<T> {
    private T objeto;

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return this.objeto;
    }
}
