package n06_Colas;

public class ColaPrioridadAcotada<T> {
    private ColaADT<T> [] colas;
    private int mayorPrioridad;

    public ColaPrioridadAcotada(int mp) {
        this.mayorPrioridad = mp;
        colas = new ColaADT[this.mayorPrioridad];
        for (int i = 0; i < colas.length; i++) {
            colas[i] = new ColaADT<>();
        }
    }

    public boolean estaVacia() {
        for (int i = 0; i < colas.length; i++) {
            if(!colas[i].estaVacia()) {
                return false;
            }
        }
        return true;
    }

    public void encolar(int prioridad,T elemento) {
        if (prioridad >0 && prioridad < this.mayorPrioridad) {
            colas[prioridad].encolar(elemento);
        }

    }
}
