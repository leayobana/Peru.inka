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

Formulario Sucursal : ${opc}<br>

<form:form commandName="sucursal" action="saveSucursal" method="POST">

id: <form:input path="id" id="id"/><br>
Razon Social: <form:input path="social" id="social"/><br>
RUC: <form:input path="ruc" id="ruc"/><br>
Direccion: <form:input path="direccion" id="direccion"/><br>
Telefono: <form:input path="nroTel" id="nroTel"/><br>
<form:label path="estado">Estado:</form:label>
	<form:select path="estado">
		<form:option value="1">Activo</form:option>
		<form:option value="0">Inactivo</form:option>
	</form:select>
	<br>

<input type="text" name="opc" id="opc" value="${opc}"><br>

<button type="submit">Guardar</button>

</form:form>