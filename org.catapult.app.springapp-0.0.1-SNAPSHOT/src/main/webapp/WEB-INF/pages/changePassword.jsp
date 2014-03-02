<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Change password</title>
        <link href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    <body>
        <div class="container">
        <div class="row">
                <div class="modal-body span6 centering">
                    <div class="well">
                        <form:form class="form-horizontal"  modelAttribute='changePassword' action='${pageContext.request.contextPath}/security/changePassword' method="POST">
                            <fieldset>
                                <div id="legend">
                                    <legend class="">Change Password</legend>
                                </div>
                                <c:if test="${showError}">
                                	<div class="alert alert-error">
                                    	<form:errors path="*" cssClass="errorblock" element="div" />
                                	</div>
                            	</c:if>
                                
                                <div class="control-group">
                                    <!-- Password-->
                                    <label class="control-label" for="oldPassword">Password</label>
                                    <div class="controls">
                                        <form:input type="password" id="oldPassword" name="oldPassword" path="oldPassword" placeholder="" class="input-xlarge"/>
                                    </div>
                                </div>
                                 <div class="control-group">
                                    <!-- Password-->
                                    <label class="control-label" for="oldPassword">New Password</label>
                                    <div class="controls">
                                        <form:input type="password" id="newPassword" name="newPassword" path="newPassword" placeholder="" class="input-xlarge"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <!-- Password-->
                                    <label class="control-label" for="confirmPassword">Confirmed Password</label>
                                    <div class="controls">
                                        <form:input type="password" id="confirmedPassword" name="confirmedPassword" path="confirmedPassword" placeholder="" class="input-xlarge"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <!-- Button -->
                                    <div class="controls">                                        
                                        <input class="btn btn-success" type="submit" value="OK" name="ok"/>
                                        <input class="btn" type="submit" value="Cancel" name="cancel"/>                                                                              
                                    </div>
                                </div>
                            </fieldset>                           
                        </form:form>
                    </div>
                </div>
            </div>
		</div>
	</body>
</html>