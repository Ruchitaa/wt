<%@page import="javax.jms.Session"%>
<html>
    <head> 

        <title>BIRTHDAY CARDS</title>
        <!-- load stylesheets -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  
    <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="font-awesome-4.5.0/css/font-awesome.min.css">                
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/bootstrap.min.css">                                      
    <!-- Bootstrap style -->
    <link rel="stylesheet" href="css/hero-slider-style.css">                              
    <!-- Hero slider style (https://codyhouse.co/gem/hero-slider/) -->
    <link rel="stylesheet" href="css/magnific-popup.css">                                 
    <!-- Magnific popup style (http://dimsemenov.com/plugins/magnific-popup/) -->
    <link rel="stylesheet" href="css/templatemo-style.css">                                   
    <!-- Templatemo style -->
    </head>
    <body>
 <h1 style="font-family: 'montserrat-bold'; font-size: 60px" align="center">  BIRTHDAY CARDS </h1>
        <div class="cd-full-width">
            Add Your Text:<input type="text" name="content" />
            <div class="container-fluid js-tm-page-content" data-page-no="3">

                <div class="tm-img-gallery-container">

                    <div class="tm-img-gallery gallery-one">

                        <div class="tm-img-gallery-info-container">

                        </div>

                        <div class="grid-item" id="outer-box">
                            <% String c="img/b1.jpg";
                                session.setAttribute("param1",c);
                            %>
                            <a href="../image?param1=img/b1.jpg"> <img src="img/b1.jpg" alt="Image" class="edit-img"></a> 
                            


                        </div>

                        <div class="grid-item" id="outer-box">
                            <div id="inner-box">

                                <button name="small" class="button"><a class="smoothscroll" href=small.html title="">SMALL SIZE</a></button>
                                <button name="big" class="button"><a class="smoothscroll"  href="big.html" title="">BIG SIZE</a></button>

                            </div>  

                            <img src="img/b2.jpg" alt="Image" class="edit-img">                                                

                        </div>
                        <div class="grid-item" id="outer-box">
                            <div id="inner-box">

                                <button name="small" class="button"><a class="smoothscroll" href=small.html title="">SMALL SIZE</a></button>
                                <button name="big" class="button"><a class="smoothscroll"  href="big.html" title="">BIG SIZE</a></button>

                            </div>              
                            <img src="img/b3.jpg" alt="Image" class="edit-img">                                                

                        </div>
                        <div class="grid-item" id="outer-box">
                            <div id="inner-box">

                                <button name="small" class="button"><a class="smoothscroll" href=small.html title="">SMALL SIZE</a></button>
                                <button name="big" class="button"><a class="smoothscroll"  href="big.html" title="">BIG SIZE</a></button>

                            </div>               
                            <img src="img/b4.jpg" alt="Image" class="edit-img">                                                

                        </div>
                        <div class="grid-item" id="outer-box">
                            <div id="inner-box">

                                <button name="small" class="button"><a class="smoothscroll" href=small.html title="">SMALL SIZE</a></button>
                                <button name="big" class="button"><a class="smoothscroll"  href="big.html" title="">BIG SIZE</a></button>

                            </div>  

                            <img src="img/b5.jpg" alt="Image" class="edit-img">                                                

                        </div>
                        <div class="grid-item" id="outer-box">
                            <div id="inner-box">

                                <button name="small" class="button"><a class="smoothscroll" href=small.html title="">SMALL SIZE</a></button>
                                <button name="big" class="button"><a class="smoothscroll"  href="big.html" title="">BIG SIZE</a></button>

                            </div>  

                            <img src="img/b6.jpg" alt="Image" class="edit-img">                                                

                        </div>                                
                        <div class="grid-item" id="outer-box">

                            <div id="inner-box">

                                <button name="small" class="button"><a class="smoothscroll" href=small.html title="">SMALL SIZE</a></button>
                                <button name="big" class="button"><a class="smoothscroll"  href="big.html" title="">BIG SIZE</a></button>

                            </div>  

                            <img src="img/b7.jpg" alt="Image" class="edit-img">                                                

                        </div>
  <div class="grid-item" id="outer-box">
                            <% String r="img/b8.jpg";
                                session.setAttribute("param1",r);%>
                            <a href="../image?param1=img/b8.jpg"> <img src="img/b8.jpg" alt="Image" class="edit-img"></a> 
                            


                        </div>                                        
                    </div>

                </div> <!-- .tm-img-gallery-container -->

            </div> <!-- .container-fluid -->

        </div> <!-- .cd-full-width --> <div id="overlay">
        </div>
    </body>
</html>