<%-- 
    Document   : newjsp
    Created on : 25/08/2021, 12:31:20
    Author     : manu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi muebleria - Inicio de Sesion</title>
        <link rel="stylesheet" href="resources/css/estilo-login.css"> 
    </head>
    <body>
        <div  name="all" class="all">
            <div class="sesion">
                <div class = "box-all">
                    <div class = "backbox-welcome">
                        <h3>¡Bienvenido!</h3>
                        <p>Para continuar por favor inicia sesion</p>
                        <button id="inicio-sesion">Iniciar sesion</button>
                    </div> 
                    <div class = "backbox-start">

                        <p>Llena todos lo datos correctamente</p>
                        <button id="inicio-sesion">Volver</button>
                    </div>
                </div>
                <!-- fomrulario login -->
                <div class ="login-start">
                    <form action="action" id="login-form">
                        <h2>Inicio de sesión</h2>
                        <input name="input-user" type="text" placeholder="Usuario">
                        <input name="input-pasword" type="password" placeholder="Contraseña">
                        <button type="submit" id="ingreso-sesion">Ingresar</button>
                    </form>
                </div>

            </div>
        </div>
    </body>
</html>
