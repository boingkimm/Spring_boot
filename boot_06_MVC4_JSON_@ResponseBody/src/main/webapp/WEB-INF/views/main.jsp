<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
   
     $(document).ready(function(){

    	 //aaa이벤트
    	 $("#aaa").on("click", function(){
    		 //ajax
    		 $.ajax({
    			 url:'aaa',
    			 type:"get",
    			 dataType:"text", //응답데이터
    			 success:function(data,status,xhr){
    				 console.log(data);
    				 $("#result").text(data);
    			 },
    			 error:function(xhr, status, error){
    				 
    			 }
    		 });//end ajax
    	 });//end aaa
    	 

    	 //bbb이벤트
    	 $("#bbb").on("click", function(){
    		 //ajax
    		 $.ajax({
    			 url:'bbb',
    			 type:"get",
    			 dataType:"json",
    			 success:function(data,status,xhr){
    				 console.log(data, typeof data);  //data가 json 객체
    				 var str_obj = JSON.stringify(data); //문자열로 변환
    				 $("#result2").text(str_obj);
    			 },
    			 error:function(xhr, status, error){
    				 
    			 }
    		 });//end ajax
    	 });//end bbb
    	 
    	 //ccc이벤트
    	 $("#ccc").on("click", function(){
    		 //ajax
    		 $.ajax({
    			 url:'ccc',
    			 type:"get",
    			 dataType:"json",
    			 success:function(data,status,xhr){
    				 //배열을 테이블 형태로 출력하기
    				 console.log(data);
    				 var tag = `<table border="1">`;
		    				 tag += `<tr>
		    				 					<th>부서번호</th>
		    				 					<th>부서명</th>
		    				 					<th>위치</th>
		    								 <tr>`;
		    					//data 반복
		    					$.each(data, function(idx,dto){  //배열에 저장된 데이터(data=DeptDTO)를 함수(dto)에 저장 
		    						console.log(data);
		    						//jQuery 사용 시 백틱에서는 \${변수}
		    						tag += `<tr>
				    				 					<th>\${dto.deptno}</th>
				    				 					<th>\${dto.dname}</th>
				    				 					<th>\${dto.loc}</th>
				    				 				<tr>`;
		    					});
		    					
		    					tag += `<table>`;
    					 
    					 $("#result3").html(tag);
    				 
    			 },
    			 error:function(xhr, status, error){
    			 }
    		 });//end ajax
    	 });//end ccc
    	 
    	//ddd이벤트
    	 $("#ddd").on("click", function(){
    		 //ajax
    		 $.ajax({
    			 url:'ddd',
    			 type:"get",
    			 dataType:"html",
    			 success:function(data,status,xhr){
    				 $("#result4").html(data);
    			 },
    			 error:function(xhr, status, error){
    				 
    			 }
    		 });//end ajax
    	 });//end ddd
    	 
    	 //eee이벤트
    	 $("#eee").on("click", function(){
    		 //ajax
    		 $.ajax({
    			 url:'eee',
    			 type:"get",
    			 dataType:"xml",
    			 success:function(data,status,xhr){
    				 $("#result5").text(data);
    			 },
    			 error:function(xhr, status, error){
    				 
    			 }
    		 });//end ajax
    	 });//end ddd
    	 
    	 
     });//end ready	

</script>
</head>
<body>
<h1>main.jsp</h1>
<button id="aaa">String반환</button><span id="result"></span><br>
<button id="bbb">DTO반환(JSON)</button><span id="result2"></span><br>
<button id="ccc">List반환(JSON)</button><span id="result3"></span><br>
<button id="ddd">html반환</button><span id="result4"></span><br>
<button id="eee">xml반환</button><span id="result5"></span><br>
</body>
</html>
