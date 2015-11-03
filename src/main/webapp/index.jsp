<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%  
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html>
<html>
  <head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0,minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

  <title> | Phoenix</title>
  <meta name="description" content="通信系的学生,误打误撞进入了计算机行业,吃力的摸爬滚打.fighting!!!">
	<script type="text/javascript">
	  (function(w,d,t,u,n,s,e){w['SwiftypeObject']=n;w[n]=w[n]||function(){
	  (w[n].q=w[n].q||[]).push(arguments);};s=d.createElement(t);
	  e=d.getElementsByTagName(t)[0];s.async=1;s.src=u;e.parentNode.insertBefore(s,e);
	  })(window,document,'script','//s.swiftypecdn.com/install/v2/st.js','_st');

	  _st('install','NV346tFRj_zPPVDcipmx','2.0.0');
	</script>
  
  <link rel="stylesheet" href="<%= basePath%>assets/css/bootstrap.css">
  <link rel="stylesheet" href="<%= basePath%>assets/css/font-awesome.css">
  <link rel="stylesheet" href="<%= basePath%>assets/js/fancybox/jquery.fancybox.css" media="screen">
  <link rel="stylesheet" href="<%= basePath%>assets/css/main.css" >
  <link rel="stylesheet" href="<%= basePath%>assets/js/prettify/prettify.css">
  <link rel="shortcut icon" href="<%= basePath%>assets/img/favicon.ico" />
  <link rel="canonical" href="http://sherkyoung.github.io//">
  <link rel="alternate" type="application/rss+xml" title="Phoenix" href="http://sherkyoung.github.io//feed.xml" />
  <script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
  <script type="text/javascript" src="<%= basePath%>assets/js/embed.js"></script>
  <script type="text/javascript" src="<%= basePath%>assets/js/ua-parser.js"></script> 
  <script>var duoshuoQuery = {short_name:"sherkyoungys"};</script>
</head>


  <body>
    <header class="site-header">
	<div class="container">
		<div class="row">
			<nav class="navbar navbar-default" role="navigation">
			
				    <div class="navbar-header col-xs-12 col-sm-12 col-md-3 col-lg-3 center" >
				   	      <button type="button" class="navbar-toggle" data-toggle="collapse"  data-target="#example-navbar-collapse">
					         <span class="icon-bar"></span>
					         <span class="icon-bar"></span>
					         <span class="icon-bar"></span>
					      </button>
					      <div class="sitehome">
						 	<a href="/" title="首页"><i class="fa fa-home fa-2x homeicon"></i><a><a class="site-title" href="/">Phoenix</a>
						</div>
				   </div>
				  
				  
				  <div class="col-md-6 col-lg-6 hidden-xs hidden-sm center">				  			
							<nav class="site-nav">
								        <ul class="nav nav-pills">
											<li class="select"><a class="page-link pjaxlink" href="/pages/tech.html">技术</a></li>
											<li class="select"><a class="page-link pjaxlink" href="/pages/life.html">生活</a></li>
											<li class="select"><a class="page-link pjaxlink" href="/pages/read.html">书架</a></li>
											<li class="select"><a class="page-link pjaxlink" href="/pages/archive.html">归档</a></li>
											<li class="select"><a class="page-link pjaxlink" href="/pages/about.html">关于</a></li>
								        </ul>
							</nav>
				  </div>
				  
				   <div class="col-md-3 col-lg-3 hidden-xs hidden-sm">
				   		<div class="search">
						  	<input type="text" class="st-default-search-input" placeholder="Search">
				   		</div>
				   </div>
				   
				   
				   <div class="collapse navbar-collapse" id="example-navbar-collapse">
						<ul class="nav navbar-nav phone-nav center">
							<li class="phoneselect"><a class="page-link pjaxlink" href="/"><i class="fa fa-home"></i>&nbsp;首页</a></li>
							<li class="phoneselect"><a class="page-link pjaxlink" href="/pages/tech.html"><i class="fa fa-book"></i>&nbsp;技术</a></li>
							<li class="phoneselect"><a class="page-link pjaxlink" href="/pages/life.html"><i class="fa fa-book"></i>&nbsp;生活</a></li>
							<li class="phoneselect"><a class="page-link pjaxlink" href="/pages/read.html"><i class="fa fa-tasks"></i>&nbsp;书架</a></li>
							<li class="phoneselect"><a class="page-link pjaxlink" href="/pages/tags.html"><i class="fa fa-tags"></i>&nbsp;标签</a></li>
							<li class="phoneselect"><a class="page-link pjaxlink" href="/pages/archive.html"><i class="fa fa-archive"></i>&nbsp;归档</a></li>
							<li class="phoneselect"><a class="page-link pjaxlink" href="/pages/about.html"><i class="fa fa-user"></i>&nbsp;关于</a></li>
						</ul>
				   </div>
				   
			</nav>
		</div>
	</div>
</header>

      
    <div class="content">
   	<div class="container">	
   		<div class="row">  		
   		
			<div class="col-md-3 col-lg-3 hidden-xs hidden-sm aside1 fadein-left">
				<div class="profile box-shadow center">
					<div class="overlay"></div>
					<div class="center gavatar">
						<a href="/" class="profile_gavatar"><img class="circle" src="<%= basePath%>/assets/img/gavatar.png"></a>
					</div>
					<div class="address">
						<h5><span class="fa fa-map-marker"></span> NanJing JiangSu, China</h5>
					</div>
					<div class="center profile_desc">
						任谁都有迷茫和困惑<br>我能做的就是不断求知<br>前进的道路上免不了风雨<br>唯有始终如一<br>
					</div>
				</div>
				
				<div class="tag-cloud-text">
					<a href="http://sherkyoung.github.io/pages/tags.html" title="标签" class="pjaxlink"><p class="center">标签</p></a>
				</div>
				<div class="tag-cloud ">	
					<hr>
					<div class="page-tag">
							
								<a href="http://sherkyoung.github.io/pages/tags.html#LAMP" name="LAMP" class="pjaxlink"><i class="fa fa-tags"></i>LAMP(1)</a>
							
								<a href="http://sherkyoung.github.io/pages/tags.html#floodlight+mininet" name="floodlight+mininet" class="pjaxlink"><i class="fa fa-tags"></i>floodlight+mininet(1)</a>
							
								<a href="http://sherkyoung.github.io/pages/tags.html#ubuntu" name="ubuntu" class="pjaxlink"><i class="fa fa-tags"></i>ubuntu(1)</a>
							
								<a href="http://sherkyoung.github.io/pages/tags.html#ovs" name="ovs" class="pjaxlink"><i class="fa fa-tags"></i>ovs(1)</a>
							
								<a href="http://sherkyoung.github.io/pages/tags.html#floodlight-vm" name="floodlight-vm" class="pjaxlink"><i class="fa fa-tags"></i>floodlight-vm(1)</a>
							
								<a href="http://sherkyoung.github.io/pages/tags.html#floodlight" name="floodlight" class="pjaxlink"><i class="fa fa-tags"></i>floodlight(5)</a>
							
								<a href="http://sherkyoung.github.io/pages/tags.html#openstack" name="openstack" class="pjaxlink"><i class="fa fa-tags"></i>openstack(1)</a>
							
					</div>					
				</div>
				<div class="clear"></div>
				<div class="recentcome box-shadow">
	 				<p>最近访客 <i class="fa fa-user"></i></p>
	 				<ul class="ds-recent-visitors" data-num-items="15"></ul>
	 			</div>
	 			<div class="comment box-shadow">
	 				<p>最新评论 <i class="fa fa-comments"></i></p>
	 				<dl class="ds-recent-comments"  data-num-items="5" data-show-avatars="1" data-show-time="1" data-show-title="1"  data-show-admin="1" data-excerpt-length="50"></dl>
	 			</div>

	 			
	 			<div class="recentuse">
	 					<p>常用链接</p>
	 					<hr>
	 					<ul>
		 					<li><a href = "http://www.fnic.cn/">江苏省未来网络创新研究院</a></li>
		 					<li><a href = "http://blog.csdn.net/sherkyoung">CSDN博客</a></li>
	 					</ul>
	 			</div>
				
				<div class="friendlink">
	 					<p>友情链接</p>
	 					<hr>						
		 				<a href = "http://www.muzixing.com/">muzi</a> 					
	 			</div>
				
			</div>
			
			<div class="col-xs-12 col-sm-12 col-md-9 col-lg-9 box-shadow fadein-right aside2">					 		
					<div class="page-content" id="pjax"><div>

   

		<div class="postbox">
			<div class="post-format-icon">
                <a class="item-date pjaxlink" href="/2015/10/07/booklist.html"><span>书单</span></a>
            </div>
			<div class="allpost">
				<div class="title"><a class="pjaxlink" href="/2015/10/07/booklist.html">2015上半年阅读书单</a></div>
				<hr>
				<div class="info">
					<i class="fa fa-calendar"></i>&nbsp;2015-10-07
					
				</div>
				<div class="contentAbstract">
</div>				
			</div>
			<a href="/2015/10/07/booklist.html"  class="readmore pjaxlink">Read More <i class="glyphicon glyphicon-chevron-right"></i></a>
		</div>

   

		<div class="postbox">
			<div class="post-format-icon">
                <a class="item-date pjaxlink" href="/2014/08/10/history-of-openstack-networking.html"><span>云计算</span></a>
            </div>
			<div class="allpost">
				<div class="title"><a class="pjaxlink" href="/2014/08/10/history-of-openstack-networking.html">OpenStack网络的前世今生</a></div>
				<hr>
				<div class="info">
					<i class="fa fa-calendar"></i>&nbsp;2014-08-10
					
				      <i class="fa fa-tags"></i>
					<span class="index-post-tag">
						
							<a class="pjaxlink" href="/pages/tags.html#openstack">openstack</a>
						
					</span>
					
				</div>
				<div class="contentAbstract"><blockquote>
  <p>声明：  <br />
本文转自OpenStack中国社区，原文链接：<a href="http://www.openstack.cn/p353.html">http://www.openstack.cn/p353.html</a>，作者<a href="http://www.openstack.cn/pauthor/joshua">Joshua</a>，转载请注明。</p>
</blockquote>

</div>				
			</div>
			<a href="/2014/08/10/history-of-openstack-networking.html"  class="readmore pjaxlink">Read More <i class="glyphicon glyphicon-chevron-right"></i></a>
		</div>

   

		<div class="postbox">
			<div class="post-format-icon">
                <a class="item-date pjaxlink" href="/2014/05/31/floodlight-develop-5.html"><span>SDN</span></a>
            </div>
			<div class="allpost">
				<div class="title"><a class="pjaxlink" href="/2014/05/31/floodlight-develop-5.html">【译】FloodLight官网开发者文档五</a></div>
				<hr>
				<div class="info">
					<i class="fa fa-calendar"></i>&nbsp;2014-05-31
					
				      <i class="fa fa-tags"></i>
					<span class="index-post-tag">
						
							<a class="pjaxlink" href="/pages/tags.html#floodlight">floodlight</a>
						
					</span>
					
				</div>
				<div class="contentAbstract"><h2 id="floodlight-rest-api">Floodlight rest API开发</h2>

</div>				
			</div>
			<a href="/2014/05/31/floodlight-develop-5.html"  class="readmore pjaxlink">Read More <i class="glyphicon glyphicon-chevron-right"></i></a>
		</div>

   

		<div class="postbox">
			<div class="post-format-icon">
                <a class="item-date pjaxlink" href="/2014/05/31/floodlight-develop-4.html"><span>SDN</span></a>
            </div>
			<div class="allpost">
				<div class="title"><a class="pjaxlink" href="/2014/05/31/floodlight-develop-4.html">【译】FloodLight官网开发者文档四</a></div>
				<hr>
				<div class="info">
					<i class="fa fa-calendar"></i>&nbsp;2014-05-31
					
				      <i class="fa fa-tags"></i>
					<span class="index-post-tag">
						
							<a class="pjaxlink" href="/pages/tags.html#floodlight">floodlight</a>
						
					</span>
					
				</div>
				<div class="contentAbstract"><h2 id="section">添加模块</h2>

</div>				
			</div>
			<a href="/2014/05/31/floodlight-develop-4.html"  class="readmore pjaxlink">Read More <i class="glyphicon glyphicon-chevron-right"></i></a>
		</div>

   

		<div class="postbox">
			<div class="post-format-icon">
                <a class="item-date pjaxlink" href="/2014/05/31/floodlight-develop-3.html"><span>SDN</span></a>
            </div>
			<div class="allpost">
				<div class="title"><a class="pjaxlink" href="/2014/05/31/floodlight-develop-3.html">【译】FloodLight官网开发者文档三</a></div>
				<hr>
				<div class="info">
					<i class="fa fa-calendar"></i>&nbsp;2014-05-31
					
				      <i class="fa fa-tags"></i>
					<span class="index-post-tag">
						
							<a class="pjaxlink" href="/pages/tags.html#floodlight">floodlight</a>
						
					</span>
					
				</div>
				<div class="contentAbstract"><p>声明：  <br />
本博客欢迎转发，但请保留原作者信息!  <br />
新浪微博：<a href="http://weibo.com/yangshuailogo">@杨帅Login</a>；   <br />
博客地址：<a href="http://sherkyoung.github.io/">http://sherkyoung.github.io/</a>  <br />
内容系本人学习、研究和总结，如有雷同，实属荣幸！</p>

</div>				
			</div>
			<a href="/2014/05/31/floodlight-develop-3.html"  class="readmore pjaxlink">Read More <i class="glyphicon glyphicon-chevron-right"></i></a>
		</div>

   



	
		<div class="pagination center">
			  
			  
			  
				    
				      <span class="active_page x1">1</span>
				    
			  
				    
				      <a class="pjaxlink" href="/page2"><span class="x1">2</span></a>
				    
			  
				    
				      <a class="pjaxlink" href="/page3"><span class="x1">3</span></a>
				    
			  

			  
			   	 <a class="pjaxlink" href="/page2"><span class="x1" style="margin-left:5px;">下一页 <i class="glyphicon glyphicon-chevron-right"></i></span></a>
			  
		</div>
	

<!--
	<div class="pagination">
	  
	    <span class="pagination-item newer">已经是最新的博文</span>
	  

	  
	    <a class="pagination-item older" href="/page2">更早的博文</a>
	  
	</div>


  <ul class="post-list">
    
      <li>
        <span class="post-meta">Oct 7, 2015</span>

        <h2>
          <a class="post-link" href="/2015/10/07/booklist.html">2015上半年阅读书单</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">Aug 10, 2014</span>

        <h2>
          <a class="post-link" href="/2014/08/10/history-of-openstack-networking.html">OpenStack网络的前世今生</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">May 31, 2014</span>

        <h2>
          <a class="post-link" href="/2014/05/31/floodlight-develop-5.html">【译】FloodLight官网开发者文档五</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">May 31, 2014</span>

        <h2>
          <a class="post-link" href="/2014/05/31/floodlight-develop-4.html">【译】FloodLight官网开发者文档四</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">May 31, 2014</span>

        <h2>
          <a class="post-link" href="/2014/05/31/floodlight-develop-3.html">【译】FloodLight官网开发者文档三</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">May 31, 2014</span>

        <h2>
          <a class="post-link" href="/2014/05/31/floodlight-develop-2.html">【译】FloodLight官网开发者文档二</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">May 31, 2014</span>

        <h2>
          <a class="post-link" href="/2014/05/31/floodlight-develop-1.html">【译】FloodLight官网开发者文档一</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">Apr 16, 2014</span>

        <h2>
          <a class="post-link" href="/2014/04/16/floodlight-vm.html">使用Floodlight-vm（官网提供）搭建OpenFlow测试平台</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">Apr 12, 2014</span>

        <h2>
          <a class="post-link" href="/2014/04/12/openflow-openvswitch.html">【译】OpenvSwitch + OpenFlow:Let’s get start(翻译自国外某大牛)</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">Apr 12, 2014</span>

        <h2>
          <a class="post-link" href="/2014/04/12/linux-ubuntu.html">虚拟机安装Ubuntu教程</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">Apr 12, 2014</span>

        <h2>
          <a class="post-link" href="/2014/04/12/floodlight-mininet.html">基于ubuntu12.04的Floodlight+mininet搭建OpenFlow测试平台</a>
        </h2>
      </li>
    
      <li>
        <span class="post-meta">Apr 10, 2014</span>

        <h2>
          <a class="post-link" href="/2014/04/10/linux-LAMP.html">LAMP配置web服务器(Ubuntu12.04LTS)</a>
        </h2>
      </li>
    
  </ul>
--> 
  <p class="rss-subscribe">subscribe <a href="/feed.xml">via RSS</a></p>

</div>
</div>				
			</div>
			


 		</div>	
	</div>
    </div>
    
	
	<div class="profile_social">
		<a class="rss" href="/feed.xml" target="_blank"></a>
		<a class="github" href="https://github.com/sherkyoung"  target="_blank"></a>
		<a class="weibo" href="http://weibo.com/yangshuailogo"  target="_blank"></a>
	</div>
	
    <div id="backtotop">
    		<a href="#"><i class="fa fa-arrow-circle-up"></i></a>
    </div>
    
    <div class="pjax_loading"></div>
    
    <footer class="site-footer">

  <div class="wrapper">

    <h2 class="footer-heading">Phoenix's blog</h2>

    <div class="footer-col-wrapper">
      <div class="footer-col  footer-col-1">
        <ul class="contact-list">
          <li>Phoenix</li>
          <li><a href="mailto:sherkyoung@gmail.com">sherkyoung@gmail.com</a></li>
        </ul>
      </div>

      <div class="footer-col  footer-col-2">
        <ul class="social-media-list">
          
          <li>
            <a class="github" href="https://github.com/sherkyoung"  target="_blank"></a>
          </li>
          

          
          <li>
            <a class="weibo" href="http://weibo.com/yangshuailogo"  target="_blank"></a>
          </li>
          
        </ul>
      </div>

      <div class="footer-col  footer-col-3">
        <p class="text">通信系的学生,误打误撞进入了计算机行业,吃力的摸爬滚打.fighting!!!</p>
      </div>
    </div>
    <div class="center sitedesc">
    	Powered by <a href ="http://jekyllrb.com/">Jekyll</a>  |  © 2015 GY  |  Hosted on <a href="https://github.com//.github.io"> Github</a>
    </div>
  </div>
	
  <!--站内搜索代码-->
  <script type="text/javascript">
	  (function(w,d,t,u,n,s,e){w['SwiftypeObject']=n;w[n]=w[n]||function(){
	  (w[n].q=w[n].q||[]).push(arguments);};s=d.createElement(t);
	  e=d.getElementsByTagName(t)[0];s.async=1;s.src=u;e.parentNode.insertBefore(s,e);
	  })(window,document,'script','//s.swiftypecdn.com/install/v2/st.js','_st');
	  
	  _st('install','yeJZSeBF6XzYF_iNno8P','2.0.0');
  </script>
  <script type="text/javascript" src="<%= basePath%>assets/js/jquery.js"></script>
  <script type="text/javascript" src="<%= basePath%>assets/js/bootstrap.js"></script>
  <script type="text/javascript" src="<%= basePath%>assets/js/jquery.pjax.js"></script> 
  <script type="text/javascript" src="<%= basePath%>assets/js/prettify/prettify.js"></script>
  <script type="text/javascript" src="<%= basePath%>assets/js/stickUp.min.js"></script>
  <script type="text/javascript" src="<%= basePath%>assets/js/fancybox/jquery.fancybox.pack.js"></script>
  <script type="text/javascript" src="<%= basePath%>assets/js/fancybox/jquery.mousewheel-3.0.6.pack.js"></script>
  <script type="text/javascript" src="<%= basePath%>assets/js/main.js"></script>
  <!--多说代码-->
  <link rel="stylesheet" href="<%= basePath%>assets/css/duoshuo.css"> 
  
</footer>


  </body>

</html>
