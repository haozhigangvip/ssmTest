<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<button onclick="loadDrugs();">生成</button>


<div style="padding:10px;clear: both;">
    <div id="psLine" style="height:600px;"></div>
</div>


</body>


<script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>

<script type="text/javascript">
    //图表
    var psLineChar = echarts.init(document.getElementById('psLine'));
 
    //查询
    function loadDrugs() {
       psLineChar.clear();
       psLineChar.showLoading({text: '正在努力的读取数据中...'});
       $.getJSON('${pageContext.request.contextPath}/sumItem'), function (data) {

			console.log("123");
			console.log(data);
           //psLineChar.setOption(data, true);
     		console.log(123)
           psLineChar.hideLoading();
    
   
  
};
    }
    //载入图表
    loadDrugs();
</script>


</html>