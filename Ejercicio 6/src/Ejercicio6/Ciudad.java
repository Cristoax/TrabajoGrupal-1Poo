package Ejercicio6;

public class Ciudad {

    private final double [][] temperaturas;

    public Ciudad(){
        temperaturas = new double [4][7];
    }

    public boolean registroTemperatura(int semana, int dia, double valor){
        if (semana >= 0 && semana < 4 && dia >= 0 && dia < 7 && valor >= -50 && valor <= 60){
            temperaturas[semana][dia] = valor;
            return true;
        }
        return false;
    }

    public double promedioSemanal(int semana){
        if (semana < 0 || semana >= 4) return -1;
        double suma = 0;
        for (int dia = 0; dia < 7; dia++){
            suma += temperaturas[semana][dia];
        }
        return suma / 7;
    }

    public double temperaturaMaximaMes(){
        double max = temperaturas[0][0];
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++){
                if (temperaturas[semana][dia] > max){
                    max = temperaturas[semana][dia];
                }
            }
        }
        return max;
    }
    public String diaMasFrio(){
        double min = temperaturas [0][0];
        int semanaMin = 0;
        int diaMin = 0;

        for  (int semana = 0; semana < 4; semana++){
            for (int dia = 0; dia < 7; dia++){
                if (temperaturas[semana][dia] > min){
                    min = temperaturas[semana][dia];
                    semanaMin = semana;
                    diaMin = dia;
                }
            }
        }
        return "Dia mas frio: Semana " + (semanaMin + 1) + ". Dia: " + (diaMin + 1) + " con " + String.format("%.2f", min) + "°C";
    }
    public void mostrarMatriz(){
        System.out.println ("Matriz de temperaturas: ");
        for (int semana = 0; semana < 4; semana++){
            System.out.print("Semana " + (semana + 1) + ": ");
            for (int dia = 0; dia < 7; dia++){
                System.out.print(String.format("%.2f", temperaturas[semana][dia]) + "°C ");
            }
            System.out.println();
        }
    }
}
