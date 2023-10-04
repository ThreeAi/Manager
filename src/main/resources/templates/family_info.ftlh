<!DOCTYPE html>
<html>
<head>
    <title>example</title>
</head>
<body>
<h1>Manager</h1>
<hr>
<h4>Информация о семействе</h4>
<b>Название товара: </b> ${family.title}<br>
<b>Описание: </b> ${family.description}<br>
<hr>
<form action="/family/delete/${family.id}" method="post">
    <input type="submit" value="Удалить"/>
</form>
</body>
</html>
