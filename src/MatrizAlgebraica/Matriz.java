package MatrizAlgebraica;

public class Matriz {
    private double[][] matriz;

    public Matriz(int n){
        this.matriz = new double[n][n];
    }
    public Matriz(int n,double valor){
        this(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;i++){
                this.matriz[i][j]=valor;
            }
        }
    }
    public Matriz(int n,int m){
        this.matriz=new double[n][m];
    }
    public Matriz(int n,int m,int valor){
        this(n,m);
        inicializarMatriz(n,m,valor);
    }
    public void inicializarMatriz(int filas,int columnas,double valor){
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j]=valor;
            }
        }
    }
    public Matriz(double [][]ini_valor){
        this(ini_valor.length,ini_valor[0].length);
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    matriz[i][j]=ini_valor[i][j];
                }
            }
    }
    public Matriz(Matriz m){
        this(m.matriz);
    }

    public double getElem(int i,int j){
        return matriz[i][j];
    }
    public void setElem(int i, int j,double val){
        this.matriz[i][j]=val;
    }

}
