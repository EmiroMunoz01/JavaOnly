package poo.area;
public class Rectangulo {
    //tenemos que recibir los valores que importamos
    //justo aquí

    //crearemos el constructor
    //siempre que creamos un constructor dentro de
    // una clase tiene que tener la palabra public,
    //seguido del nombre de la clase donde estamos 
    //trabajando
    
    // crearemos el espacio en memoria donde llegaran los
    // valores
    //estructuraremos la parte logica de esta clase,
    //para ello lo primero que hacemos es crear variables
    //de tipo privado que solo podra utilizar la clase Rectangulo
    //esto debido a que solo las usaremos dentro del constructor
    //

    private int base, altura, area;

    public Rectangulo(int base, int altura){

    //como estamos dentro del constructor, yo le quiero indicar
    //a mi programa que el valor de la variable base, lo va a guardar
    //dentro del valor de la variable base que definimos como privada
    // tomar en cuenta que las tres variables que declaramos de tipo privado
    // son las que unicamente puede utilizar mi clase Rectangulo y las dos
    // variable sque tenemos dentro del constructor rectangulo son las que
    // me estan enviando desde la clase principal que es Rectangulo Main

    //haremos uso de la palabra this, recordemos que cuando colocamos
    //la palabra this, es para hacer referencia a las variables de esta
    // clase, entonces voy a colocar this.base, añadiremos un igual
    // para decir que ahí quiero que se aloje lo que me estan enviando
    // desde la clase principal que es RectanguloMain y que me han enviado
    // a traves de la variable llamada base
    
        this.base = base;
        this.altura = altura;

    // entonces decimos que el valor de altura que esta a la derecha,
    // que me lo recupere y lo almacene dentro de la variable llamada
    // altura, -la que esta con la palabra this, que es el 
    // equivalente a la que declaramos de tipo privado arriba-
    }
    //finalmente vamos a calcular el area

    //dentro de este metodo agregaremos el valor, o en este caso
    //la operacion para calcular el area
    public void CalculoArea(){
        // void se utiliza para indicar que el método que estamos definiendo 
        // realizará un procedimiento que NO retornará ningún atributo de 
        // salida y, por tal motivo, ese método no incluirá la instrucción 
        // "return" dentro de su cuerpo.  Es por eso que al definir el 
        // método, en su encabezado colocamos la palabra "void" que significa 
        // "vacío" en lugar de colocar, por ej. "int", que sería el tipo de 
        // valor que colocaría en lugar de "void" si el método retornara un 
        // valor entero.
        area = base * altura;

    }
    //lo ultimo que hacemos es agregar el metodo que nos permite
    // imprimir el resultado en pantalla, para eso vamos a crear el metodo
    // imprimir :v

    public void Imprimir () {
        // desde aqui vamos a colocar el metodo calcular, ya que lo
        // estoy indicando que lo necesitamos aca, porque ahí se
        // almacena el valor del area
        CalculoArea();
        //poseriormente agregaremos la impresión.

        System.out.println("El area es: " + area);
    }
    //Con esto hemos terminado de programar la parte logica,
    //regresemos a la clase principal donde invocaremos al metodo
    // que nos permite imprimir el resultado.

    //para ello colocamos el metodo mensajero:

   
}
