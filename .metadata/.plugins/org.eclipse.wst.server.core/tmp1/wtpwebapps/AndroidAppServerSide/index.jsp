<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
    <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    <style>
        .myButtonStyle
        {
            border-radius: 25px;
            padding :20px;

        }
        .textNegative
        {
            color:white;
            text-shadow:0 2px 0 #000000;
        }
    </style>
    <script type="text/javascript">
        function clearWhatToDoTextArea()
        {
            document.getElementById("itemText").value = "";
            document.getElementById("itemTitle").value = "";
        }

        toDoListItem = function (title, whatToDo, creationDate, deadLine) {
            this.Title = title;
            this.WhatToDo = whatToDo;
            this.CreationDate = creationDate;
            this.DeadLine = deadLine;
        }



        var toDoListItemList = [new toDoListItem("lunch","go eat","now","run Frodo!"),new toDoListItem("title2","bodytext2","creationDate2","deadline2")];

        function ShowItems()
        {
            for(var i=0; i <= toDoListItemList.length; i++)
            {
                var place = document.getElementById("listPlace");
                place.innerHTML = "";
                var newhtml = "";
                newhtml += "<div style='width:100%;background-color:dimgray;border-radius:20px;padding:5px'>";
                newhtml += "<h2 class='textNegative'>" + toDoListItemList[i].Title + "</h2>";
                newhtml += "<h2 class='textNegative'>" + toDoListItemList[i].WhatToDo + "</h2>";
                newhtml += "<h2 class='textNegative'>" + toDoListItemList[i].CreationDate + "</h2>";
                newhtml += "<h2 class='textNegative'>" + toDoListItemList[i].DeadLine + "</h2></div><br>";
                place.innerHTML += newhtml;
            }
        }

        function OpenSearchTab()
        {
            document.getElementById("").style.visibility = "visible";
        }

    </script>

</head>
<body>
	<!-- @@@@@@@@@@@@@ LOGIN PAGE @@@@@@@@@@@@@@ -->
    <div data-role="page" id="LoginPage">
        <div data-role="header">
            <h1>To Do List App:</h1>
        </div>

        <div data-role="main" class="ui-content">
            <form name="logInForm">
                <input type="text" data-clear-btn="true" placeholder="Username" >
                <input type="password" data-clear-btn="true" placeholder="Password" >
                <a href="#MainPage" class="ui-btn" data-transition="slide">Log In</a>
            </form>
        </div>

        <div data-role="footer">
            <h1>All Rights Reserved to J&R Inc.</h1>
        </div>
    </div>

    <!-- @@@@@@@@@@@@@ MAIN PAGE @@@@@@@@@@@@@@ -->
    <div data-role="page" id="MainPage">
        <div data-role="header">
            <h1>Welcome User</h1>
        </div>

        <div data-role="main" class="ui-content">
            <div data-role="controlgroup" data-type="horizontal" >
                <a href="#addMemo" class="ui-btn ui-icon-check ui-btn-icon-left ui-shadow ui-corner-all" style="background-color:#e65c00;color:white;text-shadow:0 2px 0 #000000" data-transition="slide">Add</a>
                <a href="#LoginPage" class="ui-btn ui-icon-delete ui-btn-icon-left" style="background-color:#e60000;color:white;text-shadow:0 2px 0 #000000" data-transition="slide" data-direction="reverse">Log Out</a>
            </div>

            <input type="search" id="searchBar" name="searchBar" id="search-basic" value="" placeholder="Search Memo's" />

            <div id="listPlace" style="width:100%;margin:auto;border-radius: 20px;">
				
            </div>

        </div>



        <div data-role="footer">
            <h1>All Rights Reserved to J&R Inc.</h1>
        </div>
    </div>

	<!-- @@@@@@@@@@@@@ ADD ITEM PAGE @@@@@@@@@@@@@@ -->
    <div data-role="page" id="addMemo">
        <div data-role="header">
            <h1>Add a Memo</h1>
        </div>

        <div data-role="main" class="ui-content">

                <div data-role="controlgroup" data-type="horizontal" >
                    <a href="#MainPage" class="ui-btn ui-icon-back ui-btn-icon-left" style="background-color:#e65c00;color:white;text-shadow:0 2px 0 #000000" data-transition="slide" data-direction="reverse">Return</a>
                    <a href="#LoginPage" class="ui-btn ui-icon-delete ui-btn-icon-left" style="background-color:#e60000;color:white;text-shadow:0 2px 0 #000000" data-transition="slide" data-direction="reverse">Log Out</a>
                </div>

            <form>
                <input name="itemTitle" id="itemTitle" type="text" data-clear-btn="true" placeholder="Title" >
                <textarea data-clear-btn="true" placeholder="What to do..." name="itemText" id="itemText"></textarea>
                <input type="button" value="Clear" onclick="clearWhatToDoTextArea()" >
                <label for="finalDate">Select Goal Date:</label>
                <input type="date" name="finalDate" id="finalDate">
                <input type="button" value="Add">

            </form>

        </div>

        <div data-role="footer">
            <h1>All Rights Reserved to J&R Inc.</h1>
        </div>
    </div>
<script>
   // ShowItems();
</script>
</body>
</html>