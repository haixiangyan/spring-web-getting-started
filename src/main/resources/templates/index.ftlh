<!doctype html>
<html lang="zh-Hans">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>排行榜</title>
</head>
<body>
    <h1>排行榜</h1>
    <table>
        <tr>
            <th>排名</th>
            <th>名字</th>
            <th>分数</th>
        </tr>

        <#list rankItems as rankItem>
            <tr>
                <td>${rankItem?index}</td>
                <td>${rankItem.user.name}</td>
                <td>${rankItem.score}</td>
            </tr>
        </#list>
    </table>
</body>
</html>