package t02Array3dAdt;

public class t02Array3dAdt <T>{
    private int x;
    private int y;
    private int z;
    private T[][][] datos;

    public t02Array3dAdt(int x,int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        datos = (T[][][]) new Object[x][y][z];
    }

    public T obtenerElemento(int indexX,int indexY,int indexZ){
        return datos[indexX][indexY][indexZ];
    }

    public void establecerElemento(T dato, int indexX,int indexY,int indexZ){
        datos[indexX][indexY][indexZ] = dato;
    }

    public int obtenerLongitudX (){
        return x;
    }

    public int obtenerLongitudY (){
        return y;
    }

    public int obtenerLongitudZ(){
        return z;
    }

    public void limpiar(T dato){
        for(int i=0;i<datos.length;i++){
            for(int j=0;j<datos[0].length;j++){
                for(int k=0;k<datos[0][0].length;k++){
                    datos[i][j][k] = dato;
                }
            }
        }
    }

    public String toString(){
        String res = "";
        for(int i =0;i<datos.length;i++){
            for(int j=0;j<datos[0].length;j++){
                for(int k=0;k<datos[0][0].length;k++){
                    res += datos[i][j][k] + " --> ";
                }
            }
        }
        return res;
    }


}
