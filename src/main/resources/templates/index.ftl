<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Post Site</title>

    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">

    <script src="webjars/jquery/1.11.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <h1>POSTS:</h1>
        <#if posts?size == 0>
            No content yet, add something.
        <#else>
            <table class="table">
                <tr>
                    <th>Author</th>
                    <th>Content</th>
                </tr>
                <#list posts as post>
                <tr>
                    <td>${post.author}</td>
                    <td>${post.content}</td>
                </tr>
                </#list>
            </table>
        </#if>
    </div>
    <div class="container">
        <form action="/" name="post" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <div class="form-group">
                <label for="content">Content</label>
                <textarea name="content" class="form-control" id="content" cols="30" rows="10" required></textarea>
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</body>
</html>