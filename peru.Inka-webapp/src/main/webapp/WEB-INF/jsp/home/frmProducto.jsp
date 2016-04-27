<%@ page import="org.springframework.web.util.UrlPathHelper"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

Formulario Producto : ${opc}<br>

<form:form commandName="producto" action="saveProducto" method="POST">

id: <form:input path="id" id="id"/><br>
Nombre: <form:input path="nombre" id="nombre"/><br>
Precio: <form:input path="precio" id="precio"/><br>
Descripcion: <form:input path="descrip" id="descrip"/><br>
Atributo: <form:input path="atribut" id="atribut"/><br>
<form:label path="estado">Estado:</form:label>
	<form:select path="estado">
		<form:option value="1">Activo</form:option>
		<form:option value="0">Inactivo</form:option>
	</form:select>
	<br>
SucursalId: <form:input path="sucursalId" id="sucursalId"/><br>
<form:label path="producto">Tipo Producto:</form:label>
	<form:select path="producto">
		<form:option value="0">Habitacion</form:option>
		<form:option value="1">Servicio Lavanderia</form:option>
		<form:option value="2">Comida</form:option>
		<form:option value="3">Bazar</form:option>
		<form:option value="4">Bar</form:option>
	</form:select>
	<br>

<input type="text" name="opc" id="opc" value="${opc}"><br>

<button type="submit">Guardar</button>

</form:form>