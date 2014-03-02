<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Signin</title>
        <link href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="modal-body span6 centering">
                    <div class="well">
                        <form class="form-horizontal" action='<%=request.getContextPath()%>/j_spring_security_check' method="POST">
                            <fieldset>
                                <div id="legend">
                                    <legend class="">Login</legend>
                                </div>
                                <c:if test="${showError}">
                                	<div class="alert alert-error">
                                    	<button type="button" class="close" data-dismiss="alert">×</button>
                                    	<strong>Access Denied!</strong> Please provide valid authorization.
                                	</div>
                            	</c:if>
                                <div class="control-group">
                                    <!-- Username -->
                                    <label class="control-label" for="j_username">Username</label>
                                    <div class="controls">
                                        <input type="text" id="j_username" name="j_username" placeholder="" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <!-- Password-->
                                    <label class="control-label" for="j_password">Password</label>
                                    <div class="controls">
                                        <input type="password" id="j_password" name="j_password" placeholder="" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <!-- Button -->
                                    <div class="controls">
                                        <label class="checkbox">
                                            <input type="checkbox" id="_spring_security_remember_me" name="_spring_security_remember_me"> Keep me signed in
                                            <a href="#" class="btn btn-link">Forgot my password</a>
                                        </label>
                                        <button class="btn btn-success">Login</button>
                                    </div>
                                </div>
                            </fieldset>                           
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>