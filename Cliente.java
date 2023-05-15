

public class Cliente {
//definen la clase Cliente, que tiene tres atributos privados: nombre, edad y meses. 
//Además, tiene un constructor que recibe estos tres valores y los asigna a los atributos correspondientes. 
//También tiene tres métodos para obtener el nombre, la edad y la cantidad de meses.
 
    private String nombre;
    private int edad;
    private int meses;

    public Cliente(String nombre, int edad, int meses) {
        // parte del constructor de la clase "Cliente". 
        //En Java, "this" se refiere al objeto actual que se está construyendo.
        //En este caso, "this.nombre" se refiere al atributo "nombre" del objeto
        //"Cliente" actual que se está construyendo, y "nombre" es el parámetro que se recibe en el constructor.
        
        this.nombre = nombre;
        this.edad = edad;
        this.meses = meses;
    }
    // objetos
    //métodos de la clase Cliente que se utilizan para obtener los 
    //valores de las variables nombre, edad y meses respectivamente.
   public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getMeses() {
        return meses;
    }
}
    

