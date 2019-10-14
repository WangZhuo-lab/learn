<!DOCTYPE html>
 <html lang="zh-CN">
   <head>
     <meta charset="utf-8">
     <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <meta name="viewport" content="width=device-width, initial-scale=1">
     <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
     <title>主页</title>

     <!-- Bootstrap -->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

     <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
     <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
     <!--[if lt IE 9]>
       <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
       <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
     <![endif]-->
   </head>
   <body>
   <div class="container">
     <div class="row">
       <div class="col-md-4">
         <ul class="nav nav-pills nav-stacked">
           <li role="presentation" class="active"><a href="/piano/list">列表</a></li>
           <li role="presentation"><a href="/piano/add">新增</a></li>
         </ul>
       </div>
       <div class="col-md-8">      
         <table class="table table-hover">
           <thead>
           <th>ID</th><th>曲名</th><th>和弦</th>
           </thead>
           <tbody>
           <#list pianos as piano>
           <tr>
           <td>${piano.id}</td><td>${piano.name}</td><td>${piano.chord}</td>
           </tr>
           </#list>
           </tbody>
         </table>
       </div>
     </div>
   </div>

     <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
     <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
     <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
   </body>
 </html> 