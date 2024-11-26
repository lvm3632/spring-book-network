# Book Social Network - Backend API

Este proyecto es el backend de la aplicación **Book Social Network**, construido con **Spring Boot**. Proporciona una API RESTful para gestionar las funcionalidades principales de la aplicación, como la autenticación, administración de libros, manejo de usuarios, y más.

## Estructura del Proyecto

El proyecto sigue una arquitectura modular para mantener una separación clara de responsabilidades. A continuación, se describe la estructura de los paquetes principales:

### **Paquetes principales** (`src/main/java/com.codigotutorial.book`):

- **`auth/`**:
    - Gestión de autenticación e integración con **Keycloak** para seguridad avanzada.
    - Implementación de control de acceso basado en roles.

- **`book/`**:
    - Lógica principal para el manejo de libros.
    - CRUD (Crear, Leer, Actualizar, Eliminar) para la entidad de libros.

- **`common/`**:
    - Utilidades compartidas y constantes globales.

- **`config/`**:
    - Archivos de configuración de Spring, como seguridad y configuración de base de datos.

- **`email/`**:
    - Servicio de correo electrónico para notificaciones, como confirmación de cuenta.

- **`exception/`**:
    - Manejo centralizado de excepciones para devolver respuestas consistentes.

- **`feedback/`**:
    - Funcionalidad para gestionar comentarios y calificaciones de los libros.

- **`file/`**:
    - Manejo de archivos, como imágenes de perfil de usuario o portadas de libros.

- **`history/`**:
    - Registro del historial de lectura de los usuarios.

- **`role/`**:
    - Lógica para la gestión de roles y permisos.

- **`security/`**:
    - Configuración de seguridad con integración de **Keycloak** y **JWT**.

- **`user/`**:
    - Gestión de usuarios y perfiles.
