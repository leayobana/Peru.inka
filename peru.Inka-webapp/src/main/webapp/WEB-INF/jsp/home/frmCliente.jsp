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

Formulario Cliente : ${opc}<br>

<form:form commandName="cliente" action="saveCliente" method="POST">

id: <form:input path="id" id="id"/><br>
Nombre: <form:input path="nombre" id="nombre"/><br>
ApePateno: <form:input path="apePa" id="apePa"/><br>
ApeMateno: <form:input path="apeMa" id="apeMa"/><br>
TipoDocumento: <form:input path="tipDoc" id="tipDoc"/><br>
NroDocumento: <form:input path="nroDoc" id="nroDoc"/><br>
Telefono: <form:input path="fono" id="fono"/><br>
Estado: <form:input path="estado" id="estado"/><br>

<input type="text" name="opc" id="opc" value="${opc}"><br>

<button type="submit">Guardar</button>

</form:form>