(ns thao12)
 (try  (do (require '[ngontinh.libpath :as l]
           '[sodahead.render :as r]
           '[ngontinh.util.truyen :as truyen]
           '[clojure.java.io :as io]
)) (catch Exception e e))

(defn render [params]
(let [blocks [ (str "")
 (str "


<!DOCTYPE html>
<html lang=\"en\">
<head>

")
 (try  (do  (def path (params :path))
   (def doctruyen-raw (peek (truyen/getTruyen2 (str "SELECT * FROM truyeneng where path ='" path "'"))))
   (def doctruyen (assoc doctruyen-raw :newstate (if (= (compare (doctruyen-raw :state) 1) 0) "Full" "Ongoing")))

   nil) (catch Exception e e))
 (str "


    <meta charset=\"utf-8\">
    <title>Read ")
 (try (doctruyen :title) (catch Exception e e))
 (str " - ")
 (try (doctruyen :newstate) (catch Exception e e))
 (str " - ")
 (try (doctruyen :author) (catch Exception e e))
 (str " | Trang Ngôn Tình</title>
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> 
    <link rel=\"icon\" href=\"")
 (try (l/paths :icon) (catch Exception e e))
 (str "\" type=\"image/gif\" sizes=\"16x16\">
    <!-- Bootstrap -->  
    <link href=\"")
 (try (l/paths :bootcss) (catch Exception e e))
 (str "\" rel=\"stylesheet\" media=\"screen\" type=\"text/css\"> 
    <link rel=\"stylesheet\" href=\"")
 (try (l/paths :bootstheme) (catch Exception e e))
 (str "\">
    <link href=\"")
 (try (l/paths :docscss) (catch Exception e e))
 (str "\" rel=\"stylesheet\">  
    <link href=\"")
 (try (l/paths :bootsresponsive) (catch Exception e e))
 (str "\" rel=\"stylesheet\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"")
 (try (l/paths :stylesheet2) (catch Exception e e))
 (str "\">
    <style>
        body{
          background-image:url(\"")
 (try (l/paths :bgr) (catch Exception e e))
 (str "\"); 
        }  
        @font-face {
          font-family: 'Glyphicons Halflings';
          src:  url('")
 (try (l/paths :font1) (catch Exception e e))
 (str "');
          src:  url('")
 (try (l/paths :font1) (catch Exception e e))
 (str "?#iefix') format('embedded-opentype'), 
                url('")
 (try (l/paths :font2) (catch Exception e e))
 (str "') format('woff'), 
                url('")
 (try (l/paths :font3) (catch Exception e e))
 (str "') format('truetype'), 
                url('")
 (try (l/paths :font4) (catch Exception e e))
 (str "#glyphicons_halflingsregular') format('svg');
        }
    </style>

</head>

<!--================================================== -->
   <body class=\"maubody1\">
<div class=\"le\">  

   ")
 (try  (do (require '[ngontinh.libpath :as l]
          '[clojure.java.io :as io]
)) (catch Exception e e))
 (str "

 <header class=\"navbar navbar-static-top top hidden-xs\">
  <div class=\"container\">       
      <ul class=\"nav navbar-nav\">
        <li>
          <a href=\"#\" class=\"black\">Blog</a>
        </li>
        <li>
          <a href=\"#\" class=\"black\">About</a>
        </li>       
      </ul>
      <ul class=\"nav navbar-nav navbar-right\">
        <li><a href=\"")
 (try (str l/hostPath "dangtruyen") (catch Exception e e))
 (str "\" class=\"orange\">Đăng Truyện</a></li>
        <li><a href=\"#\" class=\"orange\" id=\"hiendangnhap\">Đăng Nhập</a>
            <div class=\"anHien dangnhap whiteBgr\" id=\"dangnhapblock\">
              <form class=\"form-signin\">        
                <input type=\"email\" class=\"form-control\" id=\"nhapemail\" placeholder=\"Nhập Email\">
                <br>
                <input type=\"password\" class=\"form-control\" id=\"nhapmatkhau\" placeholder=\"Nhập Mật Khẩu\">
                <label class=\"checkbox\"><input type=\"checkbox\" value=\"remember-me\"> Nhớ Thông Tin</label>
                <button class=\"btn btn-success\" type=\"submit\">Đăng Nhập</button>
              </form>
            </div>     
        </li>        
        <li><a href=\"")
 (try (str l/hostPath "dangky") (catch Exception e e))
 (str "\" class=\"orange\">Đăng Ký</a></li>
      </ul>
    
  </div>
</header>

<!--================================================== -->

  <div class=\"container\">
    <div class=\"row-fluid orangebackground\">
        <div class=\"span5\">
            <a href=\"")
l/hostPath (str "\" ><img src=\"")
 (try (l/paths :logo3) (catch Exception e e))
 (str "\" class=\"imgFloat\" width=\"300\" height=\"110\"></a>
        </div>
        <div class=\"span7 hidden-xs\">
            <div class=\"socialicon\">
                <a href=\"#\" ><img src=\"")
 (try (l/paths :facebook) (catch Exception e e))
 (str "\" class=\"socialicon1\" width=\"50\" height=\"50\"></a>
                <a href=\"#\" ><img src=\"")
 (try (l/paths :twitter) (catch Exception e e))
 (str "\" class=\"socialicon1\" width=\"50\" height=\"50\"></a>
                <a href=\"#\" ><img src=\"")
 (try (l/paths :rss) (catch Exception e e))
 (str "\" class=\"socialicon1\" width=\"50\" height=\"50\"></a> 
                <a href=\"#\" ><img src=\"")
 (try (l/paths :google+) (catch Exception e e))
 (str "\" class=\"socialicon1\" width=\"50\" height=\"50\"></a> 
            </div>  
        </div>
    </div> 
  </div>


  <!--================================================== -->


   <div class=\"navbar-wrapper\">
      <div class=\"container\">
        <div class=\"navbar navbar-custom navbar-static-top\" role=\"navigation\">
          <div class=\"container\">
            <div class=\"navbar-header\">
              <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".bs-navbar-collapse\">
                <span class=\"sr-only\">Toggle navigation</span>
                <span class=\"icon-bar\"></span>
                <span class=\"icon-bar\"></span>
                <span class=\"icon-bar\"></span>
              </button>
              <a class=\"navbar-brand \" href=\"")
l/hostPath (str "\"><b>Trang Ngôn Tình</b></a>
            </div>
            <div class=\"collapse navbar-collapse bs-navbar-collapse\">
              <ul class=\"nav navbar-nav\">
                <li><a href=\"")
l/hostPath (str "\"><b>HOME</b></a></li>                
                <li><a href=\"")
 (try (str l/hostPath "listtruyen") (catch Exception e e))
 (str "\"><b>DANH SÁCH TRUYỆN</b></a></li>   
                <li><a href=\"")
 (try (str l/hostPath "gridtruyen/pgnumber/1") (catch Exception e e))
 (str "\"><b>ĐỌC TRUYỆN</b></a></li> 
                <li><a href=\"")
 (try (str l/hostPath "englishnovel/pgnumber/1") (catch Exception e e))
 (str "\"><b>ENGLISH NOVEL</b></a></li>
                <li><a href=\"")
 (try (str l/hostPath "advancedsearch") (catch Exception e e))
 (str "\"><b>TÌM TRUYỆN</b></a></li>              
                <li><a href=\"")
 (try (str l/hostPath "upload") (catch Exception e e))
 (str "\"><b>GÓC SÁNG TÁC</b></a></li> 
              </ul>
            </div>
          </div>
        </div>

      </div>
    </div>




  <!--================================================== -->

<div class=\"container-fluid big-wrapper maubody\">

    <div class=\"row-fluid\">
      <div class=\"form-group form-inline col-xs-pull-2 bentrai2\" style=\"float:right;\">

        <form action=\"search\" method=\"get\">
          <input type=\"text\" name=\"term\" class=\"form-control\" placeholder=\"Search ...\">
          <button type=\"submit\" class=\"btn btn-default\">Tìm</button>       

          <a href = \"")
 (try (str l/hostPath "advancedsearch") (catch Exception e e))
 (str "\" class=\"btn btn-success\" role=\"button\">Tìm kiếm nâng cao</a>
        </form>
      </div>
    </div>


  <!--================================================== -->
 

  <div class=\"row-fluid\">     
      <div class=\"span3\">     


            ")
 (try (r/render "util/similargenre.html" {:genre (doctruyen :genre)}) (catch Exception e e))
 (str "


            <br>
            <br>

            ")
 (try (r/render "util/sameauthor.html" {:author (doctruyen :author)}) (catch Exception e e))
 (str "
            
        </div>

           <!--================================================== -->

          <div class=\"span9\">            
            <div class=\"whiteBgr\">
                <div class=\"row-fluid\" id=\"bcrumb\">
                  <span id=\"template3\" style=\"display:none\">
                  <ol class=\"breadcrumb\">
                      <li><a href=\"")
l/hostPath (str "\">Home</a></li>
                      <li><a href=\"")
 (try (str l/hostPath "englishnovel/pgnumber/1") (catch Exception e e))
 (str "\">English Novel</a></li>
                      <li class=\"active\">")
 (try (doctruyen :title) (catch Exception e e))
 (str "</li>
                    </ol>
                  </span>  
                </div><br>                
                

           <div class=\"row-fluid\">    
              <div class=\"span4\">
                <img src=\"")
 (try (doctruyen :linkanh) (catch Exception e e))
 (str "\" class=\"thumbnail img-responsive\" width=\"300\" height=\"425\">
              </div>
              <div class=\"span6\">
                <a href=\"")
 (try (doctruyen :linktruyen) (catch Exception e e))
 (str "\"><h2 class=\"green\"><b>")
 (try (doctruyen :title) (catch Exception e e))
 (str "</b></h2></a>
                <br>
                <p><i>Author</i>:  <a href=\"[[(doctruyen :searchauthor)]]\">")
 (try (doctruyen :author) (catch Exception e e))
 (str "</a></p>
                <p><i>Genre</i>:  <a href=\"[[(doctruyen :searchgenre)]]\">")
 (try (doctruyen :genre) (catch Exception e e))
 (str "</a></p>
                <p><i>Status</i>:  <a href=\"[[(doctruyen :searchstate)]]\">")
 (try (doctruyen :newstate) (catch Exception e e))
 (str "</a></p>
                <p><i>Source</i>: ")
 (try (doctruyen :source) (catch Exception e e))
 (str "</p>
                <p><i>Views</i>: ")
 (try (doctruyen :view) (catch Exception e e))
 (str "</p>
                <p><i>Date Added</i>: ")
 (try (doctruyen :date_added) (catch Exception e e))
 (str "</p>
              </div>
            </div>         
            

           <div class=\"row-fluid hidden-xs\">
              <div class=\"span7\">
                <h5 class=\"orange\"><b>Latest Chapters</b></h5>    
                <div class=\"panel panel-success\">                
                  <div class=\"panel-body\">

                    ")
 (try  (do (defn chuongmoi [linkchap num title]
                        (str "<a href='" linkchap "'>Chap " num ": " title "</a><br>"))


      (def chapmoi (truyen/getChap2 (str "select * from chapeng where truyen = '" (doctruyen :path) "'order by num desc limit 5")))


                        (apply str (for [x chapmoi] 
                            (chuongmoi (x :linkchap) (x :num) (x :title))))
                    ) (catch Exception e e))
 (str "

                  </div>
                </div>  
              </div>          
            </div>

            <br>

             ")
 (try  (do (def overview (slurp (str l/local-file-path "Stories/" (doctruyen :path) "/Overview.txt")))
               (def raw-first-overview (subs overview 12 (min 300 (count overview))))
               (def first-overview (clojure.string/replace (clojure.string/triml raw-first-overview) #"\n" "<br>"))
               (def remain-overview (clojure.string/replace (subs overview (+ 12 (count raw-first-overview))) #"\n" "<br>"))
               nil
             ) (catch Exception e e))
 (str "


           <h4 class=\"orange\"><b>Overview of </b><i class=\"green\">")
 (try (doctruyen :title) (catch Exception e e))
 (str "</i></h4>
                <div class=\"well\">
                  <p>")
first-overview (str " </p>
                  <div id=\"hiddenBlock\" class=\"anHien\">
                    <p>")
remain-overview (str " </p>
                  </div>

                  <button id=\"xemThem\" type=\"button\" class=\"btn btn-default btn-sm btn-block 1\">Read More</button>
                </div>           

            <br>
            <br>

            
               <h4 class=\"orange\"><b>Table of Contents: </b><i class=\"green\">")
 (try (doctruyen :title) (catch Exception e e))
 (str "</i></h4>
                
                <div class=\"table-responsive\">
                  <table class=\"table table-striped table-hover \">
                    <thead>
                      <tr>
                        <th>#</th>
                        <th>Chapter Name</th>                        
                        <th>Date Added</th>                        
                      </tr>
                    </thead>
                    <tbody>

                      ")
 (try  (do (defn mucluc [num linkchap title date_added]
                         (str "<tr class=''>                  
                                  <td><a href='" linkchap "'>" num "</a></td>
                                  <td><a href='" linkchap "'><b>" title "</b></a></td>
                                  <td>" date_added "</td>
                               </tr>"))

    (def chapter (truyen/getChap2 (str "select * from chapeng where truyen = '" (doctruyen :path) "' order by num asc")))

                            (apply str (for [x chapter] 
                                (mucluc (x :num) (x :linkchap) (x :title) (x :date_added))))
                      ) (catch Exception e e))
 (str "                               
                  
                    </tbody>
                  </table>
                </div>

          
          </div><!--Row-fluid-->

          <br>
          <br>
          

          <div class=\"row-fluid whiteBgr\">    
            <div class=\"span12\">
              <h4 class=\"white highlight\">Comments</h4>    
              <br>
              <form class=\"form-horizontal\">
                  <div class=\"form-group\">
                      <label for=\"inputEmail\" class=\"control-label col-xs-2\">Name</label>
                      <div class=\"col-xs-4\">
                          <input type=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\">
                      </div>
                  </div>

                  <div class=\"form-group\">
                      <label for=\"inputEmail\" class=\"control-label col-xs-2\">Topic</label>
                      <div class=\"col-xs-4\">
                          <input type=\"email\" class=\"form-control\" id=\"chude\" placeholder=\"Email\">
                      </div>
                  </div>

                  <div class=\"form-group\">
                      <label for=\"inputText\" class=\"control-label col-xs-2\">Your Comment</label>
                      <div class=\"col-xs-10\">                
                          <textarea class=\"form-control\" id=\"myTextarea\" rows=\"3\" placeholder=\"Express yourself here ...\"></textarea>
                      </div>
                  </div>
                  
                  <div class=\"form-group\">
                      <div class=\"col-xs-offset-2 col-xs-10\">
                          <button id=\"cmtbutton\" type=\"button\" class=\"btn btn-default\">Post</button>                          
                      </div>
                  </div>
              </form>    

              <hr>              

              </br>
              <div class=\"media span9\" id=\"try\">
                
              </div>
           
            </div><!--Span12-->
  
    </div><!--Span11-->
  </div><!--Row fluid-->


          </div><!--Span9-269-->
    
    
  </div><!--Row fluid-137-->
</div><!--Container fluid-->

</div><!--le-->


")
 (try  (do (require '[ngontinh.libpath :as l]
)) (catch Exception e e))
 (str "


<a href=\"#\" class=\"blue\"><h5 class=\"heavyText text-center\">
  <span class=\"glyphicon glyphicon-arrow-up\"></span> Trở về Đầu</h5></a>

<header class=\"subhead2\">  
  <div class=\"container\">
    <div class=\"row-fluid text-muted\">

      <div class=\"span1\"><h1 class=\"glypbottom\"><span class=\"glyphicon glyphicon-user\"></span></h1></div>
      <div class=\"span2\">
        <h3 class=\"heavyText white\">About</h3>
        <p>Trang Ngôn Tình là trang web đọc truyện miễn phí. Truyện bao gồm các thể loại nổi bật nhất của dòng truyện ngôn tình. Truyện được sưu tầm và đăng tải từ các nguồn trên mạng.</p>
      </div> 

      <div class=\"span1\"><h1 class=\"glypbottom\"><span class=\"glyphicon glyphicon-upload\"></span></h1></div>
      <div class=\"span2\">           
        <h3 class=\"heavyText white\">Đăng Tải Truyện</h3>
        <p>Hoan nghênh mọi sự đóng góp từ bạn đọc. Hãy chung tay xây dựng Trang Ngôn Tình tốt hơn và phù hợp với nhu cầu đọc sách của độc giả.</p>
      </div> 

      <div class=\"span1\"><h1 class=\"glypbottom\"><span class=\"glyphicon glyphicon-bullhorn\"></span></h1></div>
      <div class=\"span2\">
        <h3 class=\"heavyText white\">Quảng Cáo</h3>
        <p>Để quảng cáo, xin vui lòng liên hệ qua địa chỉ: trangngontinh@gmail.com</p>
      </div> 
      <div class=\"span3\">
        <hr>
        <ul class=\"linkbottom\">
          <li><a href=\"")
l/hostPath (str "\" class=\"text-muted\">Trang chủ</a></li>
          <li><a href=\"")
 (try (str l/hostPath "listtruyen") (catch Exception e e))
 (str "\" class=\"text-muted\">Danh Sách Truyện</a></li>
          <li><a href=\"")
 (try (str l/hostPath "gridtruyen/pgnumber/1") (catch Exception e e))
 (str "\" class=\"text-muted\">Đọc truyện</a></li>
          <li><a href=\"")
 (try (str l/hostPath "englishnovel/pgnumber/1") (catch Exception e e))
 (str "\" class=\"text-muted\">English Novel</a></li>          
          <li><a href=\"")
 (try (str l/hostPath "advancedsearch") (catch Exception e e))
 (str "\" class=\"text-muted\">Tìm kiếm nâng cao</a></li>
          <li><a href=\"trangngontinh.com/dangky\" class=\"text-muted\">Đăng Ký</a></li>
          <li><a href=\"trangngontinh.com/dangtruyen\" class=\"text-muted\">Đăng Truyện</a></li>
          <li><a href=\"trangngontinh.com/chiase\" class=\"text-muted\">Chia sẻ</a></li>
        </ul>
      </div> 
    </div>  
  </div>
</header>

<footer class=\"subhead3\">
  <div class=\"container\">
    <br>
    <p>© 2014 TrangNgonTinh, CA</p>          
  </div>
</footer>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
     <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>
   <!-- <script src=\"bootstrap.js\"></script> 
    <script src=\"bootstrap-example/js/bootstrap-transition.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-alert.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-modal.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-dropdown.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-scrollspy.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-tab.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-tooltip.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-popover.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-button.js\"></script>-->
    <script src=\"")
 (try (l/paths :bootcollapsejs) (catch Exception e e))
 (str "\"></script>
   <!--<script src=\"bootstrap-example/js/bootstrap-carousel.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-typeahead.js\"></script>  -->    
<script>
  
  $(\"#xemThem\").click(function(){
     $(\"#hiddenBlock\").slideToggle();    
  });

  $(\"#hiendangnhap\").click(function(){
        $(\"#dangnhapblock\").slideToggle();    
  });

  $(\"#cmtbutton\").click(function(){
      var cmt = $(\"#myTextarea\").val();
      var d = new Date();
      var tieude = $(\"#chude\").val();
      var ten = $(\"#ten\").val();
      var ngay = d.toLocaleDateString();
      var time = d.toLocaleTimeString();
      $(\"#try\").prepend(\"<img class='media-object img-circle pull-left' src='image/7.jpg' width='64' height='64'>\" +
                        \"<div class='media-body'>\"+
                          \"<span class='heavyText orange'>\" + ten + \"</span>\"+ \"<br>\"+
                          \"<span class='media-heading'>\" + tieude + \"</span>\"+
                          \"<span class='bentrai2 text-muted small'>\" +\"Dang ngay \"+ ngay +
                                                                      \" luc \"+ time +\"</span>\"+\"<br>\"+
                            cmt+\"</div>\"+\"<hr>\");    
    });

  $(document).ready(function(){
    $(\".list-group-item:even\").addClass(\"list-group-item-warning\");
    $(\".list-group-item:odd\").addClass(\"list-group-item-success\");
    $(\"tr:odd\").addClass(\"success\");
  });
  
</script>

  </body>
</html>")
]]
(apply str blocks)))