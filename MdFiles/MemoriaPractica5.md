### ¿Qué tipo de relación hay entre `Biblioteca` y `Sala`? ¿Por qué?
*Tienen relación de agregación, ya que son un dato que existe independientemente primero y luego se agrega a la biblioteca. En realidad debería ser agregación.*
### ¿Qué pasaría con las salas si se destruye la biblioteca?
*Si se destruyese la biblioteca, las salas también deberían desaparecer. Pongo un pin en esto para solucionarlo más adelante.*
### ¿En qué se diferencia la agregación de la composición en tu código?
*Por ejemplo, userInCharge es una instancia de User que tiene relación de Composición, mientras que las otras instancias de usuario tienen relación de Agregación.*
### ¿Por qué tiene sentido que `LibroDigital` y `LibroFisico` hereden de `Libro`?
*Porque comparten todos los atributos y métodos de libro, lo que permite repetir menos código y tener clases más legibles.*
### ¿Qué ventaja ofrece la herencia al definir distintos tipos de personas?
*Poder definir todos los atributos y datos básicos y comunes en una clase padre. De esta manera dejamos las clases hijas solamente con los atributos y métodos relevantes a estas.*
### ¿Dónde usarías `@Override` en tu implementación?
*Lo he usado en todos los métodos .info() que heredan de las clases Book, User y Room.*

![[CapturaFuncionando.png]]