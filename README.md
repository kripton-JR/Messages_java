# Messages_java
Liberia destinada a la creación de mensajes de alerta mas personalizados para el lenguaje de programación java 

Para hacer uso de esta libreria "Messages.jar" basta con importarla al proyeto destino e importar las clases:
# com.messages.Message_Error;
# com.messages.Message_Alert;
# com.messages.Message_Correct;

una vez echo esto dependera de usted el lugar a colocar los mensajes utilizando un objeto de las clases siguientes:
# Message_Error
# Message_Alert
# Message_Correct

ejemplo:

    if("".equals(nombre)){
    
         Message_Alert A = new Message_Alert("EL CAMPO *NOMBRE* ESTA VACIO");
         A.setVisible(true);
                             }
*PUEDE OBSERVAR LAS CAPTURAS ADJUNTAS*
    
