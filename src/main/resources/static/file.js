$(function (){
    $("#file").change(function(){
        var file=$("#file")[0].files[0];
        var formdata=new FormData();
        formdata.append("file",file);
        $.ajax({
            url:"http://localhost:8080/commodity/upload",
            type:"post",
            data: formdata,
            processData:false,
            contentType:false,
            success:function (res){
                $("#img").attr("src",res.img);
                $("#file1").val(res.img)
            },error:function (ref){

            }
        })
    })
})