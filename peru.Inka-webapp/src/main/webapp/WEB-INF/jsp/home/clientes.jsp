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

Listado de Clientes

<br>
<a href="frmCliente">Cliente</a>
<br>
<display:table name="${listCliente}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombres" property="nombre" />
	<display:column title="Ape Paterno" property="apePa" />
	<display:column title="Ape Paterno" property="apeMa" />
	<display:column title="Tipo Documento" property="tipDoc" />
	<display:column title="Nro Documento" property="nroDoc" />
	<display:column title="Telefono" property="fono" />
	<display:column title="Estado" property="estado" />
	<display:column title="OPC">
		<a href="editCliente?id_=${item.id}">Modificar</a>
		<a href="deleteCliente?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>