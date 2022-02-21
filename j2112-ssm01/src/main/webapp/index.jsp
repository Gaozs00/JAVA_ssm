<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<script src="js_v/jquery.min.js"> </script>
<script src="js_v/bootstrap.js"></script>
<script src="js_v/vue2.min.js"></script>
<h2>Hello World!</h2>
<div>
<button id="addBt">add</button>
    <table id="mytable">
        <tr>
            <th>deptno</th>
            <th>dname</th>
            <th>loc</th>
            <th>action1</th>
            <th>action2</th>
        </tr>
        <tr v-for="dept in depts">
            <td>{{dept.deptno}}</td>
            <td>{{dept.dname}}</td>
            <td>{{dept.loc}}</td>
            <td><button @click="edit(dept.deptno)">update</button></td>
            <td><button @click="del(dept.deptno)">delete</button></td>
        </tr>
    </table>
    <div class="modal fade" id="modalModify">
        <div class="modal-dialog" >
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">X</button>
                    <h4 class="modal-title">add dept：</h4>
                </div>
                <div class ="modal-body" >
                    <div class="input-group">
                        <span class="input-group-addon">deptno:</span>
                        <input class="input-sm" type="text" id="deptno" placeholder="1" v-model="dept1.deptno" />
                    </div>
                    <br/>
                    <div class="input-group">
                        <span class="input-group-addon">dname:</span>
                        <input class="input-sm" type="text" id="dname" placeholder="1" v-model="dept1.dname" />
                    </div>
                    <br/>
                    <div class="input-group">
                        <span class="input-group-addon">loc:</span>
                        <input class="input-sm" type="text" id="loc" placeholder="1" v-model="dept1.loc" />
                    </div>
                    <br/>
                </div>
                <div class = "modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss ="modal">取消</button>
                    <button type="button" class="btn btn-primary" id="add">确定</button>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="modalModify2">
        <div class="modal-dialog" >
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">X</button>
                    <h4 class="modal-title">add dept：</h4>
                </div>
                <div class ="modal-body" >
                    <div class="input-group">
                        <span class="input-group-addon">deptno:</span>
                        <input class="input-sm" type="text" readonly placeholder="1" v-model="dept1.deptno" />
                    </div>
                    <br/>
                    <div class="input-group">
                        <span class="input-group-addon">dname:</span>
                        <input class="input-sm" type="text"  placeholder="1" v-model="dept1.dname" />
                    </div>
                    <br/>
                    <div class="input-group">
                        <span class="input-group-addon">loc:</span>
                        <input class="input-sm" type="text"  placeholder="1" v-model="dept1.loc" />
                    </div>
                    <br/>
                </div>
                <div class = "modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss ="modal">取消</button>
                    <button type="button" class="btn btn-primary" id="update">确定</button>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="js/index.js"></script>
</body>
<script>


</script>
</html>
