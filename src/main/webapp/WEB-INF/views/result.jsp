<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
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
                                    <div class="art-logo">
                                        <h1 id="name-text" class="art-logo-name"><a href="./index">EMQA Topics Vote Online</a></h1>
                                    </div>
								</div>
							</div>
							<div class="art-nav">
								<div class="l"></div>
								<div class="r"></div>
								<ul class="art-menu">
									<li><a href="./main"><span class="l"> </span><span class="r"> </span><span class="t">Voting</span></a></li>

									<li><a href="./result"  class="active"><span class="l"> </span><span class="r"> </span><span class="t">Result</span></a></li>

                                    <li><a href="./add"><span class="l"> </span><span class="r"> </span><span class="t">Add New Topic</span></a></li>
                                    <!--
									<li><a href="./calendar.html"><span class="l"> </span><span class="r"> </span><span class="t">Calendar</span></a></li>
									<li><a href="./statistics.html"><span class="l"> </span><span class="r"> </span><span class="t">Statistics</span></a></li>
									<li><a href="./photos-2.html"><span class="l"> </span><span class="r"> </span><span class="t">Photos</span></a></li>
									<li><a href="./about.html"><span class="l"> </span><span class="r"> </span><span class="t">About Us</span></a></li>
									<li><a href="./contacts.html"><span class="l"> </span><span class="r"> </span><span class="t">Contacts</span></a></li>
									-->
								</ul>
							</div>
							<div class="art-content-layout">
								<div class="art-content-layout-row">
									<div class="art-layout-cell art-content">
										<div class="art-post">
											<div class="art-post-body">
												<div class="art-post-inner art-article">
													<div class="art-postcontent">

                                                        <div class="art-block-body">
                                                            <div class="art-blockheader">
                                                                <div class="l"></div>
                                                                <div class="r"></div>
                                                                <h3 class="t">
                                                                    Following Is the Results for Topics!!!
                                                                </h3>
                                                            </div>
                                                            <div class="art-blockcontent">
                                                            </div>
                                                            <div class="cleared"></div>
                                                        </div>
                                                            <fieldset>
                                                                <table class="art-article" border="0" cellspacing="0"
                                                                       cellpadding="0" style=" margin: 0; width: 100%;">
                                                                    <tbody>
                                                                    <tr>
                                                                        <td style="padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width:35%; font-weight: bold;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                            <a href="./result" style="color: red">Topic Name</a><br>
                                                                        </td>
                                                                        <td style="padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 20%; font-weight: bold;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                           Topic Owner<br>
                                                                        <td style="padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 20%;font-weight: bold;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                          <a href="./sort" style="color: red"> Result(Percentage)</a><br>
                                                                        </td>
                                                                        <td style="padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 25%;font-weight: bold;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                            Recommand Presentor<br>
                                                                        </td>
                                                                    </tr>
                                                                    <c:forEach  items="${voteResultList}"  var="topic" >
                                                                    <tr>
                                                                        <td style=" padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 35%;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                            ${topic.topicName}
                                                                        </td>
                                                                        <td style="padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 20%;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                                ${topic.topicOwner}<br>
                                                                        </td>
                                                                        <td style="padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 20%;"
                                                                            align="left" rowspan="1" colspan="1">
                                                                            ${topic.percentage}<br>
                                                                        </td>
                                                                        <td style="padding-top: 5px; padding-right: 5px; padding-bottom: 5px; padding-left: 5px; width: 25%;"
                                                                            align="left" rowspan="1" colspan="1">
																				${topic.presenter}<br>
                                                                        </td>

                                                                    </tr>
                                                                    </c:forEach>
                                                                </table>
                                                            </fieldset>
													</div>
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
