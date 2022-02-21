
window.onload=function () {
    alert("刷新");
    //ajax
    $.ajax({
        url:"/path",
        type:"get",
        dataType:"json",
        success:function (data){
            mytable.depts=data;
        }
    });

}


var model2 = new Vue({
    el:'#modalModify2',
    data:{
        dept1:{"deptno":1,"dname":"张三","loc":"中国"}
    }
});

var model1 = new Vue({
    el:'#modalModify',
    data:{
        dept1:{"deptno":1,"dname":"张三","loc":"中国"}
    }
});



var mytable =  new Vue({
    el:'#mytable',
    data:{
        depts:[]
    },
    methods:{
        del:function(id){
            if(confirm("are you sure?")){
                alert(1);
                $.ajax({
                    url:'del/'+id,
                    type:"delete",
                    dataType:"json",
                    success:function (data) {
                        if(data.code==200){
                            for(var i=0;i<mytable.depts.length;i++){
                                if(mytable.depts[i].deptno==id){
                                    alert("000");
                                    mytable.depts.splice(i,1);
                                    break;
                                }
                            }
                        }
                    }
                });
            }

        },

        edit:function (id) {
            $("#modalModify2").modal("show");
            var dept=mytable.depts;
            for(var i=0;i<dept.length;i++){
                if(dept[i].deptno==id){
                   model2.dept1.deptno = id;
                   model2.dept1.dname =dept[i].dname;
                   model2.dept01.loc =dept[i].loc;
                break;
                }
            }
        }
    }
});


//点击添加事件
$(function () {
    $("#addBt").click(function () {
        $("#modalModify").modal("show");
    });
//添加事件
    $("#add").click(function (){
        $.ajax({
            url:"/add",
            type: "post",
            contentType:"application/json",
            data: JSON.stringify(model1.dept1),
            dataType: "json",
            success:function (data) {
                mytable.depts.push(data);
            }
        });
        $("#modalModify").modal("hide");
    })
//修改事件
$("#update").click(function (){
    $.ajax({
        url:"/update",
        type: "put",
        contentType:"application/json",
        data: JSON.stringify(model2.dept1),
        dataType: "json",
        success:function (data) {
            for(var i = 0;i<mytable.depts.length;i++){
                if(mytable.depts[i].deptno==model2.dept1.deptno){
                    mytable.depts[i].dname=model2.dept1.dname;
                    mytable.depts[i].loc=model2.dept1.loc;
                    break;
                 }
            }
        }
    });
    $("#modalModify2").modal("hide");
})

})


