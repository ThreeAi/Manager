<!DOCTYPE html>
<html>
<head>
    <title>example</title>
</head>
<body>
<h1>Manager</h1>
<h4>Семейства</h4>
<#list families as family>
    <div>
        <p>${family.title} ${family.description} | <a href="/family/${family.id}">Подробнее... </a></p>
    </div>
</#list>
<hr>
<h3>Создать новый продукт</h3>
<form action="/family/create" method="post">
    Название семейства: <input type="text" name="title"/><br>
    Описание семейства: <input type="text" name="description"/><br>
    <input type="submit" value="Добавить"/>
</form>
</body>
</html>
