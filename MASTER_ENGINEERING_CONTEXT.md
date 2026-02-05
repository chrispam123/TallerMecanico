
MASTER_ENGINEERING_CONTEXT
1. Filosofía de Arquitectura (Clean Code)
Separación de Responsabilidades (MVC): El código debe dividirse estrictamente en:

Entidades: Objetos de datos puros (ej. Vehiculo.java).

Controladores: Lógica de negocio y gestión de colecciones (ej. Taller.java).

GUI/Vista: Interfaz de usuario (ej. VentanaTaller.java). Nunca debe contener lógica de cálculos o búsqueda.

Encapsulamiento: Atributos privados y acceso mediante métodos públicos.

Escritura Step-by-Step: El código se desarrolla y explica de forma incremental para asegurar la comprensión total.

2. Estándares de Git y Control de Versiones
Ciclo de Estabilidad: El flujo obligatorio es: Modificar → Compilar (javac) → Probar (java) → Git Commit.

Estrategia de Ramas (Branching):

main: Versión estable y funcional.

feature/nombre-funcion: Ramas temporales para experimentos y nuevas características.

Commits Atómicos y Profesionales: Uso de prefijos:

feat: nuevas funcionalidades.

refactor: mejoras al código existente sin cambiar su función.

fix: corrección de errores.

docs: cambios en documentación.

Punto de Restauración: Uso de git checkout . para revertir experimentos fallidos antes del commit.

3. Gestión de Datos y Persistencia
Persistencia en Archivos: Uso de FileWriter y BufferedReader para mantener el estado del sistema entre ejecuciones.

Proceso ETL (Extract, Transform, Load): Capacidad de ingesta de datos desde archivos externos (.txt o .csv).

Idempotencia y Protección: Verificación obligatoria de existencia de IDs (números de ID, placas, etc.) antes de insertar datos para evitar duplicados en cargas sucesivas.

Prevención de Colisiones: Uso de rangos de identificación distintos para datos migrados vs. datos nuevos.

4. Calidad y Verificación
Compilación Obligatoria: No se reconoce código que no pase la prueba de javac *.java.

Manejo de Excepciones: Uso de bloques try-catch y try-with-resources para gestionar errores de entrada/salida y de formato.

Documentación Viva: Mantenimiento del archivo de contexto actualizado para que el mapa siempre coincida con el territorio del código.
