<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Enterprise Manager</title>
    <link rel="stylesheet" href="<c:url value="/resources/style.css" />" type="text/css" media="screen"/>
    <script type="text/javascript" src="<c:url value="/resources/jquery.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/script.js" />"></script>
</head>
<body>
<div id="art-page-background-glare">
    <div id="art-page-background-glare-image">
        <div id="art-main">
            <div class="art-sheet">
                <div class="art-sheet-tl"></div>
                <div class="art-sheet-tr"></div>
                <div class="art-sheet-bl"></div>
                <div class="art-sheet-br"></div>
                <div class="art-sheet-tc"></div>
                <div class="art-sheet-bc"></div>
                <div class="art-sheet-cl"></div>
                <div class="art-sheet-cr"></div>
                <div class="art-sheet-cc"></div>
                <div class="art-sheet-body">
                    <div class="art-header">
                        <div class="art-header-center">
                            <div class="art-header-png"></div>
                            <div class="art-header-jpeg"></div>
                        </div>
                        <div class="art-logo">
                            <h1 id="name-text" class="art-logo-name"><a href="./index">Enterprise Manager Quality
                                Assurance</a></h1>
                        </div>
                    </div>
                    <div class="art-content-layout">
                        <div class="art-content-layout-row">
                            <div class="art-layout-cell art-content">
                                <div class="art-post">
                                    <div class="art-post-body">
                                        <div class="art-post-inner art-article">
                                            <div class="art-postcontent">

                                                <table class="art-article" border="0" cellspacing="0" cellpadding="0"
                                                       style=" margin: 0; width: 100%;">
                                                    <tbody>
                                                    <tr>
                                                        <td style="border-top-width: 0; border-right-width: 0; border-bottom-width: 0; border-left-width: 0; padding-top: 0; padding-right: 0; padding-bottom: 0; padding-left: 0; width: 50%;"
                                                            rowspan="1" colspan="1">
                                                            <div class="art-block-body">
                                                                <div class="art-blockheader">
                                                                    <div class="l"></div>
                                                                    <div class="r"></div>
                                                                    <h3 class="t">About Enterprise Manager</h3>
                                                                </div>
                                                                <div class="art-blockcontent">
                                                                </div>
                                                                <div class="cleared"></div>
                                                            </div>

                                                            <ul>
                                                                <li>
                                                                    <br/>&nbsp;&nbsp;&nbsp; &nbsp;Oracle Enterprise
                                                                    Manager is Oracle's integrated enterprise IT
                                                                    management product line, which provides the
                                                                    industry's only complete, integrated and
                                                                    business-driven enterprise cloud management
                                                                    solution. Oracle Enterprise Manager creates business
                                                                    value from IT by leveraging the built-in management
                                                                    capabilities of the Oracle stack for traditional and
                                                                    cloud environments, allowing customers to achieve
                                                                    unprecedented efficiency gains while dramatically
                                                                    increasing agility and service levels..<br/><br/>
                                                                </li>

                                                            </ul>
                                                        </td>
                                                        <td style="border-top-width: 0; border-right-width: 0; border-bottom-width: 0; border-left-width: 0; padding-top: 0; padding-right: 0; padding-bottom: 0; padding-left: 0; width: 5%;"
                                                            rowspan="1" colspan="1"> 
                                                        </td>
                                                        <td style="border-top-width: 0; border-right-width: 0; border-bottom-width: 0; border-left-width: 0; padding-top: 0; padding-right: 0; padding-bottom: 0; padding-left: 0;"
                                                            rowspan="1" colspan="1">
                                                            <div class="art-block-body">
                                                                <div class="art-blockheader">
                                                                    <div class="l"></div>
                                                                    <div class="r"></div>
                                                                    <h3 class="t">Team Member Login</h3>
                                                                </div>
                                                                <div class="art-blockcontent">
                                                                </div>
                                                                <div class="cleared"></div>
                                                            </div>
                                                            <br/><br/><br/>
                                                            <c:url var="LoginAction" value="/index/login"></c:url>
                                                            <c:if test="${message!=null}">    <c:url var="LoginAction" value="/index/login"></c:url>
                                                                <c:if test="${message!=null}">
                                                                <span class="t" style="color: red">
                                                                    <fmt:message key="${message}">
                                                                    </fmt:message>
                                                                </span>
                                                            </c:if>
                                                            <form:form action="${LoginAction}" commandName="login">
                                                                <table class="art-article" border="0" cellspacing="0"
                                                                       cellpadding="0" style=" margin: 0; width: 100%;">
                                                                    <tbody>
                                                                    <tr>
                                                                        <td style="text-align: center; padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 20%;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                          E-Mail
                                                                        </td>
                                                                        <td style="padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 50%;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                            <input type="text"  name="userName" style="width: 75%;"/>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="text-align: center; padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 20%;"
                                                                            align="left" rowspan="1" colspan="1">Password
                                                                        </td>
                                                                        <td style="padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 50%;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                            <input type="password" value="" name="password" style="width: 75%;" />
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td style="text-align: center; padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 20%;"
                                                                            align="left" rowspan="1" colspan="2">
                                                                            <button name="button" type="submit">Submit</button>
                                                                            <button name="button" type="reset">Reset</button>

                                                                            <!--
                                                                            <span class="art-button-wrapper"><span class="art-button-l"> </span><span class="art-button-r"> </span>
                                                                                <a class="art-button" href="javascript:{}" onclick="document.getElementById('login').submit();">Submit</a>
                                                                            </span>
                                                                            <span class="art-button-wrapper"><span class="art-button-l"> </span><span class="art-button-r"> </span>
                                                                                <a class="art-button" href="javascript:{}" onclick="document.getElementById('login').reset();">Reset</a>
                                                                            </span>
                                                                            -->
                                                                        </td>
                                                                    </tr>
                                                                    </tbody>
                                                                </table>

                                                            </form:form>

                                                            <br/>
                                                        </td>
                                                    </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                            <br/> <br/> <br/> <br/>  <br/>
                                            <div class="cleared"></div>
                                        </div>
                                        <div class="cleared"></div>
                                    </div>
                                </div>
                                <div class="cleared"></div>
                            </div>
                        </div>
                    </div>
                    <div class="cleared"></div>
                    <div class="art-footer">
                        <div class="art-footer-t"></div>
                        <div class="art-footer-l"></div>
                        <div class="art-footer-b"></div>
                        <div class="art-footer-r"></div>
                        <div class="art-footer-body">
                            <div class="art-footer-text">
                                <p>Copyright©2014. All Rights Reserved.</p>
                            </div>
                            <div class="cleared"></div>
                        </div>
                    </div>
                    <div class="cleared"></div>
                </div>
            </div>
            <div class="cleared"></div>
        </div>
    </div>
</div>
</body>
</html>
