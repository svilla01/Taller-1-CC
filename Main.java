
/*
@autores : Carrasco Claudio y Villa Sebastian
 */
public class Main {

    public static void main(String [] args){

        CSVreader lector = new CSVreader();
        Info [] data = lector.entregarArreglo();
        ArrayIns ordInsertion = new ArrayIns(data.length);
        ArrayInsTwo ordQuick = new ArrayInsTwo(data.length);

        long initInsert;
        long endInsert;
        long finalInsert;

        long initQuick;
        long endQuick;
        long finalQuick;

        //este for sirve para verificar que efectivamente
        //estamos accediendo a los datos del archivo y tomando el Volumen
        for(Info i: data){
            long info = i.getVolume();
            ordInsertion.insert(info); 
            ordQuick.insert(info);
        }
        
        //sin ordenar
        //ordInsertion.display();
        //System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        //ordenando con insertion sort
        initInsert = System.nanoTime();
        ordInsertion.insertionSort();
        endInsert = System.nanoTime();
        finalInsert =  endInsert - initInsert;
        //mostrando Tiempo de insertionSort
        System.out.print("insertionSort tarda:\n");
        System.out.println(finalInsert/1e6 +" ms ");
        //mostrando de nuevo
        //ordInsertion.display();


        //para quickSort
        initQuick = System.nanoTime();
        //ordQuick.display();
        ordQuick.quickSort();
        //System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        //ordQuick.display();
        endQuick = System.nanoTime();
        finalQuick = endQuick - initQuick;
        System.out.print("QuickSort tarda:\n");
        System.out.println((finalQuick/1e6) +"ms");


    }
    
}
