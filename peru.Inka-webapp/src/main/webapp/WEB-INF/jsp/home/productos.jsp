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

Listado de Productos

<br>
<a href="frmProducto">Producto</a>
<br>
<display:table name="${listProducto}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombres" property="nombre" />
	<display:column title="Precio" property="precio" />
	<display:column title="Descripcion" property="descrip" />
	<display:column title="Atributo" property="atribut" />
	<display:column title="Estado" property="estado" />
	<display:column title="SucursalId" property="sucursalId" />
	<display:column title="Tipo Producto" property="producto" />
	<display:column title="OPC">
		<a href="editProducto?id_=${item.id}">Modificar</a>
		<a href="deleteProducto?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>