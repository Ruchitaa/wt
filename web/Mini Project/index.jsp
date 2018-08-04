<!DOCTYPE html>
<!--[if IE 8 ]><html class="no-js oldie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="no-js oldie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
<head>

   <!--- basic page needs
   ================================================== -->
   <meta charset="utf-8">
	<title>Surprises Inside</title>
	<meta name="description" content="">  
	<meta name="author" content="">

   <!-- mobile specific metas
   ================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

 	<!-- CSS
   ================================================== -->
   <link rel="stylesheet" href="css/base.css">  
   <link rel="stylesheet" href="css/main.css">
   <link rel="stylesheet" href="css/vendor.css">  
      
</head>

<body id="top">

   <!-- script
   ================================================== -->
	<script src="js/modernizr.js"></script>

   <!-- favicons
	================================================== -->
	<link rel="icon" type="image/png" href="favicon.png">

	<!-- header 
   ================================================== -->
   <header>

   	<div class="row">

   		<div class="logo">
	         <a href="index.html">Surprises Inside</a>
	      </div>

	   	<nav id="main-nav-wrap">
				<ul class="main-navigation">
					<li class="current"><a class="smoothscroll"  href="#intro" title=""> HOME </a></li>
					<li><a class="smoothscroll"  href="#process" title=""> CATEGORIES </a></li>
					<li><a class="smoothscroll"  href="#features" title=""> FEATURES </a></li>
                                        <li><a class="smoothscroll"  href="#reviews" title=""> REVIEWS </a></li>
					<li><a class="smoothscroll"  href="#faq" title=""> FAQ </a>					
					 					<%String user;
                                        user=(String)session.getAttribute("username");
                                            if(user==null){
                                        %>
					<li class="highlight with-sep"><a href="../login/index.html" title=""> SIGN UP </a></li>
                                        <%}
                                            else
                                            {%>
                                        <li class="highlight with sep"> <a class="drop" href="#">
                                            <% out.println(user);
                                                
                                %></a><ul>  <li><a href="cart.jsp">CART</a></li>
                                    <li><a href="logout.jsp">LOGOUT</a></li>
                                </ul>
                                        </li><%}%>				
				</ul>
			</nav>

			<a class="menu-toggle" href="#"><span>Menu</span></a>
   		
   	</div>   

</div>
	
   	
   </header> <!-- /header -->

	<!-- intro section
   ================================================== -->
   <section id="intro">

      <div class="shadow-overlay"></div>

      <div class="intro-content">
         <div class="row">

            <div class="col-twelve">

               

               
               <h1 style="font-family: 'montserrat-bold'; font-size: 70px">  SURPRISES  INSIDE  </h1>

               <a href="paint/index.html"><h1 style="font-family: 'montserrat-bold';font-size:50px">MAKE CARDS</h1></a>
            </div>  
            
         </div>               
      </div> 

   	
   </section> <!-- /intro -->


   <!-- Process Section
   ================================================== -->
   <section id="process">  

   	<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">

   			<h5>Categories</h5>
   			
   		</div>   		
   	</div>

   	<div class="row process-content">

   		<div class="left-side">

   			<div class="item" data-item="1">

   				<h5>Birthday Cards</h5>

   				<p>Send a happy birthday greeting with a special touch from our personalised birthday card selection. You can add photos and/or text to all of our card designs to make your greeting stand out from the rest. </p>
   					
   			</div>

   			<div class="item" data-item="3">

	   			<h5>Gratitude Cards</h5>

	   			<p>Browse our selection of gratitude cards and create something special to show your appreciation. You?ll find all types of cards where you can add one or more photos to a more simple text-personalised designs</p>
   					
   			</div>


   			<div class="item" data-item="5">

   				<h5>Special Day Cards</h5>

   				<p>Surprise your mother, father or friend and make them feel special using our personalised mother's day, father's day and friendship's day card collection. Customize them to your hearts content! </p>
   					
   			</div>
   				
   		</div> <!-- /left-side -->
   		
   		<div class="right-side">
   				
   			<div class="item" data-item="2">

   				<h5>Wedding Cards</h5>

   				<p>Need a card for your wedding? Find a wide range of personalised and unique choices at Surprises Inside or customize and create your own wedding card for that special occasion.</p>
   					
   			</div>

   			<div class="item" data-item="4">

   				<h5>Festival Cards</h5>

   				<p>Make and send personalised Festival cards this year from our range of unique designs. You?ll find a range of festive themes including anything from funny cards to photo upload and cute cards.</p>
   					
   			</div>

   			<div class="item" data-item="6">

   				<h5>Valentine's Week Cards</h5>

   				<p>Choose the perfect Valentine?s Week's cards from our range of personalised designs. Edit each design with a name and add a romantic message inside to show your partner how much you love them.</p>
   					
   			</div>

   		</div> <!-- /right-side -->  

   		<div class="image-part"></div>  			

   	</div> <!-- /process-content --> 

   </section> <!-- /process-->    


   <!-- features Section
   ================================================== -->
	<section id="features">

		<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">

   			<h5>Features</h5>
   			<h1>Great features you'll love.</h1>
   		</div>   		
   	</div>
            
   	<div class="row features-content">

   		<div class="features-list block-1-3 block-s-1-2 block-tab-full group">

	      	<div class="bgrid feature">	

	      		<span class="icon"><i class="icon-window"></i></span>            

	            <div class="service-content">	

	            	 <h3 class="h05">Choose It</h3>

                         <p>Select a card from our exclusive online catalog or create your own.</p>
	         		
	         	</div> 	         	 

				</div> <!-- /bgrid -->

				

			   <div class="bgrid feature">

			   	<span class="icon"><i class="icon-paint-brush"></i></span>		            

	            <div class="service-content">
	            	<h3 class="h05">Personalize It</h3>

                        <p>Write a personal message and add pictures</p>

	        			
	            </div> 	            	               

			   </div> <!-- /bgrid -->

				<div class="bgrid feature">

					<span class="icon"><i class="icon-file"></i></span>	              

	            <div class="service-content">
	            	<h3 class="h05">Send It</h3>

                        <p>We'll print, stuff, stamp and mail everything for you.</p>

	         		
	            </div>                

				
			   </div> <!-- /bgrid -->

	      </div> <!-- features-list -->
   		
   	</div> <!-- features-content -->
		
	</section> <!-- /features -->
	
   <!-- reviews Section
   ================================================== -->
   <section id="reviews">

   	<div class="row">
   		<div class="col-twelve">
   			<h2 class="h01">Hear What Are Clients Say.</h2>
   		</div>   		
   	</div>   	

      <div class="row flex-container">
    
         <div id="testimonial-slider" class="flexslider">

            <ul class="slides">

               <li>
               	<div class="testimonial-author">
                    	<img src="images/avatars/avatar-1.jpg" alt="Author image">
                    	<div class="author-info">
                    		Steve Jobs
                    		<span class="position">CEO, Apple.</span>
                    	</div>
                  </div>

                  <p>
                  The selection of cards are many. The designs and quality are top notch. 						
                  </p>                  
             	</li> <!-- /slide -->

               <li> 

               	<div class="testimonial-author">
                    	<img src="images/avatars/avatar-2.jpg" alt="Author image">
                    	<div class="author-info">
                    		John Doe
                    		<span>CEO, ABC Corp.</span>
                    	</div>
                  </div> 

                  <p>
                  I am a regular customer of Surprises Inside. I love sending personalized cards to my dear ones
                  on special occasions like anniversaries and birthdays.
                  </p>
                                         
               </li> <!-- /slide -->

            </ul> <!-- /slides -->

         </div> <!-- /testimonial-slider -->         
        
      </div> <!-- /flex-container -->

   </section> <!-- /reviews -->


   <!-- faq
   ================================================== -->
   <section id="faq">

   	<div class="row section-intro">
   		<div class="col-twelve with-bottom-line">

   			<h5>Faq</h5>
   			<h1>Questions and Answers.</h1>

   			</div>   		
   	</div>

   	<div class="row faq-content">

   		<div class="q-and-a block-1-2 block-tab-full group">

   			<div class="bgrid">

   				<h3>How Can I Register With Surprises Inside?</h3>

   				<p>
                                    To start shopping with SurprisesInside.com you can easily register yourself   
                                    by providing us necessary information like-Your Name, E-mail, Mobile No.,
                                    Address, City, etc. We assure you that your information is secure with us.
                                    The information you provide will help us to contact you regarding your orders
                                    and transactions.
                                </p>

   			</div>

   			<div class="bgrid">

   				<h3>Why do I Set up an Account?</h3>

   				<p>There are numerous of benefits to creating an account for SurprisesInside.com.
                                    With this account you can:<br>
                                    Personalize cards<br>
                                    Edit Your Account Details <br>
                                    Check your Order History<br>
                                    
                                </p>
                        </div>

   			<div class="bgrid">

   				<h3>What if there is a Problem in the Order?</h3>

   				<p>If there is any problem in the order that you have placed, our customer care will help you and answer your queries. 
                                    Email: SurprisesInside@gmail.com
                                </p>
                        </div>

   			<div class="bgrid">

                            <h3>Why to Shop with Suprises Inside</h3>

   				<p>The key success to Surprises Inside is the quality of products. Everything that you buy online is exclusive.
                                </p>
                        </div>

   			
   		</div> <!-- /q-and-a --> 
   		
   	</div> <!-- /faq-content --> 

      </section> <!-- /faq --> 

   <!-- cta
   ================================================== -->
   <!-- footer
   ================================================== -->
   <footer>

   	<div class="footer-main">

   		<div class="row">  

	      	<div class="col-four tab-full mob-full footer-info">            

	            <div class="footer-logo"></div>

	     		      </div> <!-- /footer-info -->

	      	<div class="col-two tab-1-3 mob-1-2 site-links">

	      		<h4>Site Links</h4>

	      		<ul>
	      			<li><a href="#">About Us</a></li>
						<li><a href="#">Blog</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Terms</a></li>
						<li><a href="#">Privacy Policy</a></li>
					</ul>

	      	</div> <!-- /site-links -->  

	      	<div class="col-two tab-1-3 mob-1-2 social-links">

	      		<h4>Social</h4>

	      		<ul>
	      			<li><a href="#">Twitter</a></li>
						<li><a href="#">Facebook</a></li>
						
					</ul>
	      	           	
	      	</div> <!-- /social --> 

	      	<div class="col-four tab-1-3 mob-full footer-subscribe">

	      		<h4>Subscribe</h4>

	      		<p>Keep yourself updated. Subscribe to our newsletter.</p>

	      		<div class="subscribe-form">
	      	
	      			<form id="mc-form" class="group" novalidate="true">

							<input type="email" value="" name="dEmail" class="email" id="mc-email" placeholder="type email &amp; hit enter" required=""> 
	   		
			   			<input type="submit" name="subscribe" >
		   	
		   				<label for="mc-email" class="subscribe-message"></label>
			
						</form>

	      		</div>	      		
	      	           	
	      	</div> <!-- /subscribe -->         

	      </div> <!-- /row -->

   	</div> <!-- /footer-main -->


      <div class="footer-bottom">

      	<div class="row">

      		<div class="col-twelve">
	      		<div class="copyright">
		         	<span>� Copyright SURPRISES INSIDE (2017)</span> 
		         	<span>Designed by Occasions.Inc </a></span>		         	
		         </div>

		         <div id="go-top" style="display: block;">
		            <a class="smoothscroll" title="Back to Top" href="#top"><i class="icon ion-android-arrow-up"></i></a>
		         </div>         
	      	</div>

      	</div> <!-- /footer-bottom -->     	

      </div>

   </footer>  

   <div id="preloader"> 
    	<div id="loader"></div>
   </div> 

   <!-- Java Script
   ================================================== --> 
   <script src="js/jquery-1.11.3.min.js"></script>
   <script src="js/jquery-migrate-1.2.1.min.js"></script>
   <script src="js/plugins.js"></script>
   <script src="js/main.js"></script>

</body>

</html>