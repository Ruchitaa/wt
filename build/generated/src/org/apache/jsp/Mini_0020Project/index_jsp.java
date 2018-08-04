package org.apache.jsp.Mini_0020Project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8 ]><html class=\"no-js oldie ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 9 ]><html class=\"no-js oldie ie9\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html class=\"no-js\" lang=\"en\"> <!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("   <!--- basic page needs\n");
      out.write("   ================================================== -->\n");
      out.write("   <meta charset=\"utf-8\">\n");
      out.write("\t<title>Surprises Inside</title>\n");
      out.write("\t<meta name=\"description\" content=\"\">  \n");
      out.write("\t<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("   <!-- mobile specific metas\n");
      out.write("   ================================================== -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\n");
      out.write(" \t<!-- CSS\n");
      out.write("   ================================================== -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/base.css\">  \n");
      out.write("   <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/vendor.css\">  \n");
      out.write("      \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"top\">\n");
      out.write("\n");
      out.write("   <!-- script\n");
      out.write("   ================================================== -->\n");
      out.write("\t<script src=\"js/modernizr.js\"></script>\n");
      out.write("\n");
      out.write("   <!-- favicons\n");
      out.write("\t================================================== -->\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"favicon.png\">\n");
      out.write("\n");
      out.write("\t<!-- header \n");
      out.write("   ================================================== -->\n");
      out.write("   <header>\n");
      out.write("\n");
      out.write("   \t<div class=\"row\">\n");
      out.write("\n");
      out.write("   \t\t<div class=\"logo\">\n");
      out.write("\t         <a href=\"index.html\">Surprises Inside</a>\n");
      out.write("\t      </div>\n");
      out.write("\n");
      out.write("\t   \t<nav id=\"main-nav-wrap\">\n");
      out.write("\t\t\t\t<ul class=\"main-navigation\">\n");
      out.write("\t\t\t\t\t<li class=\"current\"><a class=\"smoothscroll\"  href=\"#intro\" title=\"\"> HOME </a></li>\n");
      out.write("\t\t\t\t\t<li><a class=\"smoothscroll\"  href=\"#process\" title=\"\"> CATEGORIES </a></li>\n");
      out.write("\t\t\t\t\t<li><a class=\"smoothscroll\"  href=\"#features\" title=\"\"> FEATURES </a></li>\n");
      out.write("                                        <li><a class=\"smoothscroll\"  href=\"#reviews\" title=\"\"> REVIEWS </a></li>\n");
      out.write("\t\t\t\t\t<li><a class=\"smoothscroll\"  href=\"#faq\" title=\"\"> FAQ </a>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t \t\t\t\t\t");
String user;
                                        user=(String)session.getAttribute("username");
                                            if(user==null){
                                        
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"highlight with-sep\"><a href=\"../login/index.html\" title=\"\"> SIGN UP </a></li>\n");
      out.write("                                        ");
}
                                            else
                                            {
      out.write("\n");
      out.write("                                        <li class=\"highlight with sep\"> <a class=\"drop\" href=\"#\">\n");
      out.write("                                            ");
 out.println(user);
                                                
                                
      out.write("</a><ul>  <li><a href=\"cart.jsp\">CART</a></li>\n");
      out.write("                                    <li><a href=\"logout.jsp\">LOGOUT</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                        </li>");
}
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t<a class=\"menu-toggle\" href=\"#\"><span>Menu</span></a>\n");
      out.write("   \t\t\n");
      out.write("   \t</div>   \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("   \t\n");
      out.write("   </header> <!-- /header -->\n");
      out.write("\n");
      out.write("\t<!-- intro section\n");
      out.write("   ================================================== -->\n");
      out.write("   <section id=\"intro\">\n");
      out.write("\n");
      out.write("      <div class=\"shadow-overlay\"></div>\n");
      out.write("\n");
      out.write("      <div class=\"intro-content\">\n");
      out.write("         <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-twelve\">\n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("               \n");
      out.write("               <h1 style=\"font-family: 'montserrat-bold'; font-size: 70px\">  SURPRISES  INSIDE  </h1>\n");
      out.write("\n");
      out.write("               <a href=\"paint/index.html\"><h1 style=\"font-family: 'montserrat-bold';font-size:50px\">MAKE CARDS</h1></a>\n");
      out.write("            </div>  \n");
      out.write("            \n");
      out.write("         </div>               \n");
      out.write("      </div> \n");
      out.write("\n");
      out.write("   \t\n");
      out.write("   </section> <!-- /intro -->\n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- Process Section\n");
      out.write("   ================================================== -->\n");
      out.write("   <section id=\"process\">  \n");
      out.write("\n");
      out.write("   \t<div class=\"row section-intro\">\n");
      out.write("   \t\t<div class=\"col-twelve with-bottom-line\">\n");
      out.write("\n");
      out.write("   \t\t\t<h5>Categories</h5>\n");
      out.write("   \t\t\t\n");
      out.write("   \t\t</div>   \t\t\n");
      out.write("   \t</div>\n");
      out.write("\n");
      out.write("   \t<div class=\"row process-content\">\n");
      out.write("\n");
      out.write("   \t\t<div class=\"left-side\">\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"item\" data-item=\"1\">\n");
      out.write("\n");
      out.write("   \t\t\t\t<h5>Birthday Cards</h5>\n");
      out.write("\n");
      out.write("   \t\t\t\t<p>Send a happy birthday greeting with a special touch from our personalised birthday card selection. You can add photos and/or text to all of our card designs to make your greeting stand out from the rest. </p>\n");
      out.write("   \t\t\t\t\t\n");
      out.write("   \t\t\t</div>\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"item\" data-item=\"3\">\n");
      out.write("\n");
      out.write("\t   \t\t\t<h5>Gratitude Cards</h5>\n");
      out.write("\n");
      out.write("\t   \t\t\t<p>Browse our selection of gratitude cards and create something special to show your appreciation. You?ll find all types of cards where you can add one or more photos to a more simple text-personalised designs</p>\n");
      out.write("   \t\t\t\t\t\n");
      out.write("   \t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"item\" data-item=\"5\">\n");
      out.write("\n");
      out.write("   \t\t\t\t<h5>Special Day Cards</h5>\n");
      out.write("\n");
      out.write("   \t\t\t\t<p>Surprise your mother, father or friend and make them feel special using our personalised mother's day, father's day and friendship's day card collection. Customize them to your hearts content! </p>\n");
      out.write("   \t\t\t\t\t\n");
      out.write("   \t\t\t</div>\n");
      out.write("   \t\t\t\t\n");
      out.write("   \t\t</div> <!-- /left-side -->\n");
      out.write("   \t\t\n");
      out.write("   \t\t<div class=\"right-side\">\n");
      out.write("   \t\t\t\t\n");
      out.write("   \t\t\t<div class=\"item\" data-item=\"2\">\n");
      out.write("\n");
      out.write("   \t\t\t\t<h5>Wedding Cards</h5>\n");
      out.write("\n");
      out.write("   \t\t\t\t<p>Need a card for your wedding? Find a wide range of personalised and unique choices at Surprises Inside or customize and create your own wedding card for that special occasion.</p>\n");
      out.write("   \t\t\t\t\t\n");
      out.write("   \t\t\t</div>\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"item\" data-item=\"4\">\n");
      out.write("\n");
      out.write("   \t\t\t\t<h5>Festival Cards</h5>\n");
      out.write("\n");
      out.write("   \t\t\t\t<p>Make and send personalised Festival cards this year from our range of unique designs. You?ll find a range of festive themes including anything from funny cards to photo upload and cute cards.</p>\n");
      out.write("   \t\t\t\t\t\n");
      out.write("   \t\t\t</div>\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"item\" data-item=\"6\">\n");
      out.write("\n");
      out.write("   \t\t\t\t<h5>Valentine's Week Cards</h5>\n");
      out.write("\n");
      out.write("   \t\t\t\t<p>Choose the perfect Valentine?s Week's cards from our range of personalised designs. Edit each design with a name and add a romantic message inside to show your partner how much you love them.</p>\n");
      out.write("   \t\t\t\t\t\n");
      out.write("   \t\t\t</div>\n");
      out.write("\n");
      out.write("   \t\t</div> <!-- /right-side -->  \n");
      out.write("\n");
      out.write("   \t\t<div class=\"image-part\"></div>  \t\t\t\n");
      out.write("\n");
      out.write("   \t</div> <!-- /process-content --> \n");
      out.write("\n");
      out.write("   </section> <!-- /process-->    \n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- features Section\n");
      out.write("   ================================================== -->\n");
      out.write("\t<section id=\"features\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"row section-intro\">\n");
      out.write("   \t\t<div class=\"col-twelve with-bottom-line\">\n");
      out.write("\n");
      out.write("   \t\t\t<h5>Features</h5>\n");
      out.write("   \t\t\t<h1>Great features you'll love.</h1>\n");
      out.write("   \t\t</div>   \t\t\n");
      out.write("   \t</div>\n");
      out.write("            \n");
      out.write("   \t<div class=\"row features-content\">\n");
      out.write("\n");
      out.write("   \t\t<div class=\"features-list block-1-3 block-s-1-2 block-tab-full group\">\n");
      out.write("\n");
      out.write("\t      \t<div class=\"bgrid feature\">\t\n");
      out.write("\n");
      out.write("\t      \t\t<span class=\"icon\"><i class=\"icon-window\"></i></span>            \n");
      out.write("\n");
      out.write("\t            <div class=\"service-content\">\t\n");
      out.write("\n");
      out.write("\t            \t <h3 class=\"h05\">Choose It</h3>\n");
      out.write("\n");
      out.write("                         <p>Select a card from our exclusive online catalog or create your own.</p>\n");
      out.write("\t         \t\t\n");
      out.write("\t         \t</div> \t         \t \n");
      out.write("\n");
      out.write("\t\t\t\t</div> <!-- /bgrid -->\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t   <div class=\"bgrid feature\">\n");
      out.write("\n");
      out.write("\t\t\t   \t<span class=\"icon\"><i class=\"icon-paint-brush\"></i></span>\t\t            \n");
      out.write("\n");
      out.write("\t            <div class=\"service-content\">\n");
      out.write("\t            \t<h3 class=\"h05\">Personalize It</h3>\n");
      out.write("\n");
      out.write("                        <p>Write a personal message and add pictures</p>\n");
      out.write("\n");
      out.write("\t        \t\t\t\n");
      out.write("\t            </div> \t            \t               \n");
      out.write("\n");
      out.write("\t\t\t   </div> <!-- /bgrid -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"bgrid feature\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"icon-file\"></i></span>\t              \n");
      out.write("\n");
      out.write("\t            <div class=\"service-content\">\n");
      out.write("\t            \t<h3 class=\"h05\">Send It</h3>\n");
      out.write("\n");
      out.write("                        <p>We'll print, stuff, stamp and mail everything for you.</p>\n");
      out.write("\n");
      out.write("\t         \t\t\n");
      out.write("\t            </div>                \n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t   </div> <!-- /bgrid -->\n");
      out.write("\n");
      out.write("\t      </div> <!-- features-list -->\n");
      out.write("   \t\t\n");
      out.write("   \t</div> <!-- features-content -->\n");
      out.write("\t\t\n");
      out.write("\t</section> <!-- /features -->\n");
      out.write("\t\n");
      out.write("   <!-- reviews Section\n");
      out.write("   ================================================== -->\n");
      out.write("   <section id=\"reviews\">\n");
      out.write("\n");
      out.write("   \t<div class=\"row\">\n");
      out.write("   \t\t<div class=\"col-twelve\">\n");
      out.write("   \t\t\t<h2 class=\"h01\">Hear What Are Clients Say.</h2>\n");
      out.write("   \t\t</div>   \t\t\n");
      out.write("   \t</div>   \t\n");
      out.write("\n");
      out.write("      <div class=\"row flex-container\">\n");
      out.write("    \n");
      out.write("         <div id=\"testimonial-slider\" class=\"flexslider\">\n");
      out.write("\n");
      out.write("            <ul class=\"slides\">\n");
      out.write("\n");
      out.write("               <li>\n");
      out.write("               \t<div class=\"testimonial-author\">\n");
      out.write("                    \t<img src=\"images/avatars/avatar-1.jpg\" alt=\"Author image\">\n");
      out.write("                    \t<div class=\"author-info\">\n");
      out.write("                    \t\tSteve Jobs\n");
      out.write("                    \t\t<span class=\"position\">CEO, Apple.</span>\n");
      out.write("                    \t</div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <p>\n");
      out.write("                  The selection of cards are many. The designs and quality are top notch. \t\t\t\t\t\t\n");
      out.write("                  </p>                  \n");
      out.write("             \t</li> <!-- /slide -->\n");
      out.write("\n");
      out.write("               <li> \n");
      out.write("\n");
      out.write("               \t<div class=\"testimonial-author\">\n");
      out.write("                    \t<img src=\"images/avatars/avatar-2.jpg\" alt=\"Author image\">\n");
      out.write("                    \t<div class=\"author-info\">\n");
      out.write("                    \t\tJohn Doe\n");
      out.write("                    \t\t<span>CEO, ABC Corp.</span>\n");
      out.write("                    \t</div>\n");
      out.write("                  </div> \n");
      out.write("\n");
      out.write("                  <p>\n");
      out.write("                  I am a regular customer of Surprises Inside. I love sending personalized cards to my dear ones\n");
      out.write("                  on special occasions like anniversaries and birthdays.\n");
      out.write("                  </p>\n");
      out.write("                                         \n");
      out.write("               </li> <!-- /slide -->\n");
      out.write("\n");
      out.write("            </ul> <!-- /slides -->\n");
      out.write("\n");
      out.write("         </div> <!-- /testimonial-slider -->         \n");
      out.write("        \n");
      out.write("      </div> <!-- /flex-container -->\n");
      out.write("\n");
      out.write("   </section> <!-- /reviews -->\n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- faq\n");
      out.write("   ================================================== -->\n");
      out.write("   <section id=\"faq\">\n");
      out.write("\n");
      out.write("   \t<div class=\"row section-intro\">\n");
      out.write("   \t\t<div class=\"col-twelve with-bottom-line\">\n");
      out.write("\n");
      out.write("   \t\t\t<h5>Faq</h5>\n");
      out.write("   \t\t\t<h1>Questions and Answers.</h1>\n");
      out.write("\n");
      out.write("   \t\t\t</div>   \t\t\n");
      out.write("   \t</div>\n");
      out.write("\n");
      out.write("   \t<div class=\"row faq-content\">\n");
      out.write("\n");
      out.write("   \t\t<div class=\"q-and-a block-1-2 block-tab-full group\">\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"bgrid\">\n");
      out.write("\n");
      out.write("   \t\t\t\t<h3>How Can I Register With Surprises Inside?</h3>\n");
      out.write("\n");
      out.write("   \t\t\t\t<p>\n");
      out.write("                                    To start shopping with SurprisesInside.com you can easily register yourself   \n");
      out.write("                                    by providing us necessary information like-Your Name, E-mail, Mobile No.,\n");
      out.write("                                    Address, City, etc. We assure you that your information is secure with us.\n");
      out.write("                                    The information you provide will help us to contact you regarding your orders\n");
      out.write("                                    and transactions.\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("   \t\t\t</div>\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"bgrid\">\n");
      out.write("\n");
      out.write("   \t\t\t\t<h3>Why do I Set up an Account?</h3>\n");
      out.write("\n");
      out.write("   \t\t\t\t<p>There are numerous of benefits to creating an account for SurprisesInside.com.\n");
      out.write("                                    With this account you can:<br>\n");
      out.write("                                    Personalize cards<br>\n");
      out.write("                                    Edit Your Account Details <br>\n");
      out.write("                                    Check your Order History<br>\n");
      out.write("                                    \n");
      out.write("                                </p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"bgrid\">\n");
      out.write("\n");
      out.write("   \t\t\t\t<h3>What if there is a Problem in the Order?</h3>\n");
      out.write("\n");
      out.write("   \t\t\t\t<p>If there is any problem in the order that you have placed, our customer care will help you and answer your queries. \n");
      out.write("                                    Email: SurprisesInside@gmail.com\n");
      out.write("                                </p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("   \t\t\t<div class=\"bgrid\">\n");
      out.write("\n");
      out.write("                            <h3>Why to Shop with Suprises Inside</h3>\n");
      out.write("\n");
      out.write("   \t\t\t\t<p>The key success to Surprises Inside is the quality of products. Everything that you buy online is exclusive.\n");
      out.write("                                </p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("   \t\t\t\n");
      out.write("   \t\t</div> <!-- /q-and-a --> \n");
      out.write("   \t\t\n");
      out.write("   \t</div> <!-- /faq-content --> \n");
      out.write("\n");
      out.write("      </section> <!-- /faq --> \n");
      out.write("\n");
      out.write("   <!-- cta\n");
      out.write("   ================================================== -->\n");
      out.write("   <!-- footer\n");
      out.write("   ================================================== -->\n");
      out.write("   <footer>\n");
      out.write("\n");
      out.write("   \t<div class=\"footer-main\">\n");
      out.write("\n");
      out.write("   \t\t<div class=\"row\">  \n");
      out.write("\n");
      out.write("\t      \t<div class=\"col-four tab-full mob-full footer-info\">            \n");
      out.write("\n");
      out.write("\t            <div class=\"footer-logo\"></div>\n");
      out.write("\n");
      out.write("\t     \t\t      </div> <!-- /footer-info -->\n");
      out.write("\n");
      out.write("\t      \t<div class=\"col-two tab-1-3 mob-1-2 site-links\">\n");
      out.write("\n");
      out.write("\t      \t\t<h4>Site Links</h4>\n");
      out.write("\n");
      out.write("\t      \t\t<ul>\n");
      out.write("\t      \t\t\t<li><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Blog</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Terms</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t      \t</div> <!-- /site-links -->  \n");
      out.write("\n");
      out.write("\t      \t<div class=\"col-two tab-1-3 mob-1-2 social-links\">\n");
      out.write("\n");
      out.write("\t      \t\t<h4>Social</h4>\n");
      out.write("\n");
      out.write("\t      \t\t<ul>\n");
      out.write("\t      \t\t\t<li><a href=\"#\">Twitter</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t      \t           \t\n");
      out.write("\t      \t</div> <!-- /social --> \n");
      out.write("\n");
      out.write("\t      \t<div class=\"col-four tab-1-3 mob-full footer-subscribe\">\n");
      out.write("\n");
      out.write("\t      \t\t<h4>Subscribe</h4>\n");
      out.write("\n");
      out.write("\t      \t\t<p>Keep yourself updated. Subscribe to our newsletter.</p>\n");
      out.write("\n");
      out.write("\t      \t\t<div class=\"subscribe-form\">\n");
      out.write("\t      \t\n");
      out.write("\t      \t\t\t<form id=\"mc-form\" class=\"group\" novalidate=\"true\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" value=\"\" name=\"dEmail\" class=\"email\" id=\"mc-email\" placeholder=\"type email &amp; hit enter\" required=\"\"> \n");
      out.write("\t   \t\t\n");
      out.write("\t\t\t   \t\t\t<input type=\"submit\" name=\"subscribe\" >\n");
      out.write("\t\t   \t\n");
      out.write("\t\t   \t\t\t\t<label for=\"mc-email\" class=\"subscribe-message\"></label>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t      \t\t</div>\t      \t\t\n");
      out.write("\t      \t           \t\n");
      out.write("\t      \t</div> <!-- /subscribe -->         \n");
      out.write("\n");
      out.write("\t      </div> <!-- /row -->\n");
      out.write("\n");
      out.write("   \t</div> <!-- /footer-main -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"footer-bottom\">\n");
      out.write("\n");
      out.write("      \t<div class=\"row\">\n");
      out.write("\n");
      out.write("      \t\t<div class=\"col-twelve\">\n");
      out.write("\t      \t\t<div class=\"copyright\">\n");
      out.write("\t\t         \t<span>© Copyright SURPRISES INSIDE (2017)</span> \n");
      out.write("\t\t         \t<span>Designed by Occasions.Inc </a></span>\t\t         \t\n");
      out.write("\t\t         </div>\n");
      out.write("\n");
      out.write("\t\t         <div id=\"go-top\" style=\"display: block;\">\n");
      out.write("\t\t            <a class=\"smoothscroll\" title=\"Back to Top\" href=\"#top\"><i class=\"icon ion-android-arrow-up\"></i></a>\n");
      out.write("\t\t         </div>         \n");
      out.write("\t      \t</div>\n");
      out.write("\n");
      out.write("      \t</div> <!-- /footer-bottom -->     \t\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("   </footer>  \n");
      out.write("\n");
      out.write("   <div id=\"preloader\"> \n");
      out.write("    \t<div id=\"loader\"></div>\n");
      out.write("   </div> \n");
      out.write("\n");
      out.write("   <!-- Java Script\n");
      out.write("   ================================================== --> \n");
      out.write("   <script src=\"js/jquery-1.11.3.min.js\"></script>\n");
      out.write("   <script src=\"js/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("   <script src=\"js/plugins.js\"></script>\n");
      out.write("   <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}