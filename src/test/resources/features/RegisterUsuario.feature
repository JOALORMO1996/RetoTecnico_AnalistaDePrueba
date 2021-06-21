# Autor: José Alejandro Ortega
@stories
Feature: RegistroUsuario
  @scenario1

  Scenario Outline: Registro Usuario
    Given que el usuario accede al formulartio de registro
    When  El usuario dilingencia los datos
    Then  el ve su cuenta creada
    Examples:
    |strNombres|trApellido|strEmail|f_ano|f_dia|f_mes|idiomas|ciudad|codigoPostal|pais| pc|version|lenguaje_disp|dispMovil|modelMovil| soMovil| strContrasena| strConfirmarContrasena|
    |alejandro | ortega   |josealejandroortegamora@gmail.com|1996|15|01|Spanish|Montería|230002|Colombia|Windows|10|Spanish|Motorola|Moto G7 Play|Android 10|Joalormo_4258| Joalormo_4258|


