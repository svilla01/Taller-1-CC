/*
@autores : Carrasco Claudio y Villa Sebastian
 */

public class Main2 {
    public static void main(String [] args){

        //probando QUEUE
        CSVreader lector = new CSVreader();
        Info [] data = lector.entregarArreglo();
        Queue cola = new Queue(data.length);

        //Aqui metemos todos los datos de Volumen por cada Info en data
        for(Info i: data){
            long info = i.getVolume();
            cola.insert(info);
        }

        //removiendo algunos datos (10 datos) 
        for(int i = 0; i < 10; i++){
            cola.remove();
        }

        //insertando algunos datos

        cola.insert(123456);
        cola.insert(9876543);
        cola.insert(456756);
        cola.insert(98765);



        

    }
    
}
