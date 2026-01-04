🛒  ***Synapsis - Sistema de Gestión de Ventas y Stock***

Synapsis es una aplicación de escritorio desarrolada en Java/Swing diseñada para optimizar el control de inventario y la facturación de pequeñas y medianas empresas. 
El proyecto destaca por una robusta lógica de negocio aplicada a la integridad de los datos en memoria

🚀 ***Caracteristicas principales***:
* **Gestion Integral(ABM)**: Control completo de Clientes, Productos, Usuarios y Proveedores.
* **Venta en tiempo**: Interfaz dinámica para la carga de productos con validación de stock inmediata.
* **Lógica de Stock Inteligente**: Reposición automatica de stock al editar o eliminar ventas, con calculo de inventario mediante el manejo de referencias y copias de colecciones Java.
* **Generación de documentos**: Emisión de Remitos en formato PDF utilizando la libreria *OpenPDF*.
* **Interfaz Moderna**: Uso de componentes personalizados y filtros para mejorar la experiencia de usuario.

🛠️ ***Tecnologias utilizadas***: 
* **Lenguaje**: Java 24
* **Interfaz Gráfica**: Java Swing / NetBenas GUI Builder.
* **Arquitectura**: Programación Orientada a Objetos (POO) con patrones *Singleton* y *DAO* (Data Access Object) simulado en memoria.
* **Librerías Externas**: [*OpenPDF*](https://mvnrepository.com/artifact/com.github.LibrePDF.OpenPDF/openpdf) para la generacion de reportes y remitos

📋***Lógica de Negocio Destacada***:
  Uno de los mayores desafios resueltos en este proyecto fue mantener la coherencia del inventario. El sistema implementa una lógica de "reposición antes de edición", donde al modificar una venta:
  1. Se restaura temporalmente el stock original de los productos vendidos.
  2. Se procesan las nuevas cantidades.
  3. Se aplica el descuento final de stock. Esto previene errores de duplicidad de datos y asegurai que el stock físico siempre coincida con el digital.

📌***Alta, Baja y Modficiación***:

* El sistema cuenta con mulitples botones que derivan en sus correspondientes modulos. 
<img width="605" height="514" alt="image" src="https://github.com/user-attachments/assets/b1b7c47b-bea6-44da-b206-5bab667a5d6c" />

* Todos los modulos tienen interfaces similares e intuitivas para la facilidad de su uso.

![render1](https://github.com/user-attachments/assets/8bb83087-6c76-4eb7-a1b0-54eb69fde28f)

* Las altas se pueden dar desde el menu en la esquina superior izquierda. Para poder dar el alta en los modulos se deben respetar los siguientes puntos (de lo contrario el alta no será validada):
  1. Todos los campos deben estar **rellenados** con su respectiva información.
  2. Los campos de CUIT deben contener 11 caracateres, ni más ni menos.
  3. Los campos de correo deben contener los caracteres de "@" y ".".
  4. El sistema no admite CUIT **repetidos** entre clientes y/o proveedores.
     
Los campos estan limitados a sus respectivos tipos de caracteres para poder mantener la coherencia de datos. Los ID de todas las entidades **no son manipulables por el usuario** y son generados de forma automatica por el sistema.

![render2](https://github.com/user-attachments/assets/bce34988-5b6b-4664-a0fa-365cece907c7)

* La modificación de una entidad cumple con las mismos puntos expresados más arriba. Tanto la eliminación como baja de una entudad es validada si la misma es seleccionada. 

![render3](https://github.com/user-attachments/assets/74e3e294-212c-4f62-b33f-07d09ed9dd40)

![render4](https://github.com/user-attachments/assets/ca73dbf4-0325-4070-8623-061b29b1dd47)

📌***Ventas y remitos***:

* Para las ventas debe existir previamente como minimo un cliente y un producto. El stock se va modificando a medida que se van agregando los productos en la venta. Una vez realizada una venta, automaticamente se genera un remito en la pestaña de remitos.
  Los remitos, a diferencia de los demás modulos, no puede ser modificados ni eliminados. Los remitos persisten todo el tiempo, incluso si la venta correspondiente fue eliminada. Sin embargo, si la venta se modifica, el remito también se modificará. 

![render5](https://github.com/user-attachments/assets/14a95a79-5910-45bf-a9c8-d3f06b2bdbf6)

* El stock trabaja en tiempo real. Tanto en la realización de la venta como en su creación y/o eliminación, el stock se modifica para poder mantener la coherencia en todo momento.

![render6](https://github.com/user-attachments/assets/abe35a2e-fdbb-4bad-afc0-9018f64e8931)

📌***Usuarios***:

* Los usuarios pueden ser administrados **solamente por usuarios con rol ADMIN**.

![render7](https://github.com/user-attachments/assets/854630dd-bd82-4221-b8bc-7827f1558cce)



