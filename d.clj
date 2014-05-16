(ns sodahead1310)
 (try  (do (require '[ngontinh.libpath :as l])
) (catch Exception e "Exception happened"))

(defn render [params]
(let [blocks [ (str "")
 (str "

<!DOCTYPE html>
<html lang=\"en\">
<head>
<meta charset=\"utf-8\">
    <meta charset=\"utf-8\">
    <title>Nơi Đọc Truyện Lý Tưởng Của Bạn - Trang Chủ - Trang Ngôn Tình</title>  
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> 
    <link rel=\"icon\" href=\"")
 (try (l/paths :icon) (catch Exception e "Exception happened"))
 (str "\" type=\"image/gif\" sizes=\"16x16\">
    <!-- Bootstrap -->  
    <link href=\"")
 (try (l/paths :bootcss) (catch Exception e "Exception happened"))
 (str "\" rel=\"stylesheet\" media=\"screen\" type=\"text/css\"> 
    <link rel=\"stylesheet\" href=\"")
 (try (l/paths :bootstheme) (catch Exception e "Exception happened"))
 (str "\">
    <link href=\"")
 (try (l/paths :docscss) (catch Exception e "Exception happened"))
 (str "\" rel=\"stylesheet\">  
    <link href=\"")
 (try (l/paths :bootsresponsive) (catch Exception e "Exception happened"))
 (str "\" rel=\"stylesheet\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"")
 (try (l/paths :stylesheet) (catch Exception e "Exception happened"))
 (str "\">
    <style>
    body{
      background-image:url(\"")
 (try (l/paths :bgr) (catch Exception e "Exception happened"))
 (str "\"); 
    }  
    @font-face {
      font-family: 'Glyphicons Halflings';
      src:  url('")
 (try (l/paths :font1) (catch Exception e "Exception happened"))
 (str "');
      src:  url('")
 (try (l/paths :font1) (catch Exception e "Exception happened"))
 (str "?#iefix') format('embedded-opentype'), 
            url('")
 (try (l/paths :font2) (catch Exception e "Exception happened"))
 (str "') format('woff'), 
            url('")
 (try (l/paths :font3) (catch Exception e "Exception happened"))
 (str "') format('truetype'), 
            url('")
 (try (l/paths :font4) (catch Exception e "Exception happened"))
 (str "#glyphicons_halflingsregular') format('svg');
    }
    </style>
</head>

<!--================================================== -->
  <body class=\"maubody1\">
<div class=\"le\">  



    <header class=\"navbar navbar-static-top top\">
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
        <li><a href=\"trangngontinh.com/dangtruyen\" class=\"orange\">Đăng Truyện</a></li>
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
        <li><a href=\"trangngontinh.com/dangky\" class=\"orange\">Đăng Ký</a></li>
      </ul>
    
  </div>
</header>

<!--================================================== -->

  <div class=\"container\">
    <div class=\"row-fluid orangebackground\">
        <div class=\"span5\">
            <br>
            <a href=\"trangngontinh.com\" ><img src=\"[[((data :lib-path) :logo3)]]\" class=\"imgFloat\" width=\"360\" height=\"130\"></a>
        </div>
        <div class=\"span7\">
            <div class=\"socialicon\">
                <a href=\"#\" ><img src=\"[[((data :lib-path) :facebook)]]\" class=\"socialicon1\" width=\"50\" height=\"50\"></a>
                <a href=\"#\" ><img src=\"[[((data :lib-path) :twitter)]]\" class=\"socialicon1\" width=\"50\" height=\"50\"></a>
                <a href=\"#\" ><img src=\"[[((data :lib-path) :rss)]]\" class=\"socialicon1\" width=\"50\" height=\"50\"></a> 
                <a href=\"#\" ><img src=\"[[((data :lib-path) :google+)]]\" class=\"socialicon1\" width=\"50\" height=\"50\"></a> 
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
              <a class=\"navbar-brand \" href=\"trangngontinh.com\"><b>Trang Ngôn Tình</b></a>
            </div>
            <div class=\"collapse navbar-collapse bs-navbar-collapse\">
              <ul class=\"nav navbar-nav\">
                <li class=\"active\"><a href=\"trangngontinh.com\">HOME</a></li>                
                <li><a href=\"trangngontinh.com/danhsachtruyen\"><b>DANH SÁCH TRUYỆN</b></a></li>   
                <li><a href=\"trangngontinh.com/doctruyen\"><b>ĐỌC TRUYỆN</b></a></li> 
                <li><a href=\"trangngontinh.com/englishnovel\"><b>ENGLISH NOVEL</b></a></li>
                <li><a href=\"trangngontinh.com/timkiemnangcao\"><b>TÌM TRUYỆN</b></a></li>              
                <li><a href=\"trangngontinh.com/dangtruyen\"><b>GÓC SÁNG TÁC</b></a></li> 
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
          <input type=\"text\" class=\"form-control\" placeholder=\"Search ...\">
          <button href=\"[[(data :tim)]]\" type=\"submit\" class=\"btn btn-default\">Tìm</button>
          <a href = \"trangngontinh.com/advancedsearch\" class=\"btn btn-success\" role=\"button\">Tìm kiếm nâng cao</a>
      </div>
    </div>



    <!--================================================== -->

  <div class=\"row-fluid\">
    <div class=\"span3\">      

      <div class=\"row-fluid sideBar hidden-xs\">
        <div class=\"sideBarInside\">
              <div class=\"panel-body\">
                <h3 class=\"heavyText blue\">Đọc truyện</h3>
                <p class=\"text-justify\">Nơi đọc truyện trực tuyến lý tưởng. Truyện được nhiều độc giả quan tâm, danh sách truyện đầy đủ và hệ thống tìm kiếm giúp bạn đến với những trang sách dễ dàng hơn.<br><br>                      
                Chúc bạn có những giây phút thoải mái và thư giãn với <b>trangngontinh.com</b> </p>
              </div>
            
        </div><!--sideBarInside-->
      </div><!--sideBar-->

      <br>
      <br>

            <div class=\"hidden-xs\">                           
              <h3><span class=\"label label-custom label-danger-1\">Truyện Xem Nhiều</span></h3>            
              <div class=\"row-fluid sideBar\"> 
                  <div class=\"list-group\">

                    ")
 (try  (do (defn sidebar1 [linktruyen linkanh title author genre]
                     (str "<a href='" linktruyen "' class='list-group-item'>
                          <div class='row-fluid'>
                            <div class='span5'><img src='" linkanh "' class='thumbnail img-responsive imgFloatsidebar list-group-item-text' width='90' height='120'></div>
                            <div class='span7'>
                              <h4 class='list-group-item-heading'>" title "</h4>               
                              <p class='blue small'>Tác Giả: " author "<br>
                                                    Thể Loại: " genre "</p>
                            </div>
                         </div>                                   
                        </a>"))

                        (apply str (for [x (data :sidebar1)] 
                                  (sidebar1 (x :linktruyen) (x :linkanh) (x :title) (x :author) (x :genre))))
                      ) (catch Exception e "Exception happened"))
 (str "

                    
                </div><!--list group-->
            </div><!--sideBar-->
            </div><!--hiddenxs-->
              

            <br>
            <br>

            <div class=\"hidden-xs\">            
            <h3><span class=\"label label-custom\">Truyện Mới</span></h3>
            <div class=\"row-fluid sideBar\"><!--Side Bar-->                       
                  <div class=\"list-group\">

                    ")
 (try  (do (defn sidebar2 [linktruyen linkanh title author genre]
                     (str "<a href='" linktruyen "' class='list-group-item'>
                          <div class='row-fluid'>
                            <div class='span5'><img src='" linkanh "' class='thumbnail img-responsive imgFloatsidebar list-group-item-text' width='90' height='120'></div>
                            <div class='span7'>
                              <h4 class='list-group-item-heading'>" title "</h4>               
                              <p class='blue small'>Tác Giả: " author "<br>
                                                    Thể Loại: " genre "</p>
                            </div>
                         </div>                                   
                        </a>"))

                        (apply str (for [x (params :sidebar2)] 
                                  (sidebar2 (x :linktruyen) (x :linkanh) (x :title) (x :author) (x :genre))))
                      ) (catch Exception e "Exception happened"))
 (str "

                </div><!--list group-->
            </div><!--sideBar-->
            </div><!--hiddenxs-->

    </div><!--Span3-->

    
    <div class=\"span9 whiteBgr\">

      <a href=\"#\"><h3><span class=\"label label-warning trangchutitle\">Truyện Mới Cập Nhật</h3></a>
      <div class=\"row-fluid\">  
        <div class=\"lightblue2\">          
            <div class=\"table-responsive\">
              <table class=\"table table-striped table-hover \">                    
                <tbody>

                  ")
 (try  (do (defn updatechap [linktruyen title linkchap chapnumber titlechap date_added]
                      (str " <tr class='text-muted'>
                              <td><a href='" linktruyen "' class='tentruyen'>" title "</a></td>
                              <td><a href='" linkchap "'>Chương " chapnumber ": " titlechap "</a></td>
                              <td>" date_added "</td>                       
                            </tr>"))

                      (apply str (for [x (params :updatechap)] 
                          (updatechap (x :linktruyen) (x :title) (x :linkchap) (x :chapnumber) (x :titlechap) (x :date_added))))

                  ) (catch Exception e "Exception happened"))
 (str "
                 
                </tbody>
              </table>
            </div><!--Table-responsive-->   
        </div><!--lightBlue-->  
      </div><!--row-fluid-->
          
      <br>
      <br>

      <a href=\"trangngontinh/danhsachtruyen\"><h3><span class=\"label label-warning trangchutitle\">Danh Sách Truyện</h3></a>
      <div class=\"row-fluid lightblue\">
            <a href=\"trangngontinh/danhsachtruyen\"><img src=\"[[((params :lib-path) :linkanh1)]]\" class=\"thumbnail imgFloat\" width=\"270\" height=\"200\"></a>
            <br>            
            <a href=\"#\"><h4 class=\"blue\">&raquo; Truyện Cổ Đại</h4></a>
            <a href=\"#\"><h4 class=\"blue\">&raquo; Truyện Hiện Đại</h4></a>
            <br>
            <p>Danh Sách Truyện với đầy đủ các thông tin như giới thiệu, tác giả, số chương, thể loại... được hiển thị đồng thời, giúp bạn chọn lựa truyện một cách dễ dàng và hợp lý nhất. </p>
            
      </div>

          <br>
          <br>

      
      <div class=\"row-fluid\">    
        <a href=\"#\"><h3><span class=\"label label-warning trangchutitle\">Đọc Truyện</h3></a>  
        <div class=\"lightblue2\">
          <div class=\"row-fluid\">

            ")
 (try  (do (defn doctruyen1 [linktruyen linkanh title]
                      (str "<div class='span3'> 
                                <a href='" linktruyen "'><img src='" linkanh "' class='thumbnail img-responsive' width='120' height='160'></a>
                                <a href='" linktruyen" '><h4>" title" </h4></a>          
                            </div>"))

                      (apply str (for [x (params :doctruyen1)] 
                              (doctruyen1 (x :linktruyen) (x :linkanh) (x :title))))
            ) (catch Exception e "Exception happened"))
 (str "
           
          </div><!--row-fluid-->
          <br>
          <div class=\"row-fluid\">

            ")
 (try  (do (defn doctruyen2 [linktruyen linkanh title]
                      (str "<div class='span3'> 
                                <a href='" linktruyen "'><img src='" linkanh "' class='thumbnail img-responsive' width='120' height='160'></a>
                                <a href='" linktruyen" '><h4>" title" </h4></a>          
                            </div>"))

                      (apply str (for [x (params :doctruyen2)] 
                              (doctruyen2 (x :linktruyen) (x :linkanh) (x :title))))
            ) (catch Exception e "Exception happened"))
 (str "

          </div><!--row-fluid-->  
        </div><!--lightblue-->    
      </div><!--row-fluid-->

      <br>
      <br>


      <div class=\"row-fluid\">    
        <a href=\"trangngontinh.com/englishnovel\"><h3><span class=\"label label-warning trangchutitle\">English Novel</h3></a>  
        <div class=\"lightorange2\">
          <div class=\"row-fluid\">

            ")
 (try  (do (defn engnovel [linktruyen linkanh title]
                      (str "<div class='span3'> 
                                <a href='" linktruyen "'><img src='" linkanh "' class='thumbnail img-responsive' width='120' height='160'></a>
                                <a href='" linktruyen" '><h4>" title" </h4></a>          
                            </div>"))

                      (apply str (for [x (params :engnovel)] 
                              (engnovel (x :linktruyen) (x :linkanh) (x :title))))
            ) (catch Exception e "Exception happened"))
 (str "            
            
          </div><!--row-fluid-->           
        </div><!--lightblue-->    
      </div><!--row-fluid-->

  <!--    <br>
      <br>


      <a href=\"#\"><h3><span class=\"label label-warning trangchutitle\">Chia Sẻ</h3></a>
      <div class=\"row-fluid lightblue\">
            <a href=\"#\"><img src=\"[[((params :lib-path) :linkanh2)]]\" class=\"thumbnail img-responsive imgFloat\" width=\"270\" height=\"200\"></a>
            <br>            
            <a href=\"#\"><h4 class=\"blue\">&raquo; Hỏi Đáp</h4></a>
            <a href=\"#\"><h4 class=\"blue\">&raquo; Thư Viện Ảnh</h4></a>
            <br>
            <p class=\"columnText text-muted\">Drag and drop sections into place. My dear friend, so absorbed in the, that I neglect my talents. I should be incapable of drawing a single stroke at the present. We don’t transporting cakes  on pushbikes. Why don’t they know. If they don’t know, that means we never told anyone.</p>
      </div><!--span4-->      
  
      <br>
      <br>

      <a href=\"truyengontinh.com/dangtruyen\"><h3><span class=\"label label-warning trangchutitle\">Góc Sáng Tác</h3></a>
      <div class=\"row-fluid lightblue\">
            <a href=\"#\"><img src=\"[[((params :lib-path) :linkanh3)]]\" class=\"thumbnail img-responsive imgFloat\" width=\"270\" height=\"200\"></a>
            <br>
            <a href=\"#\"><h4 class=\"blue\">&raquo; Hướng Dẫn Đăng Tải</h4></a>
            <p class=\"columnText text-muted\">Hãy đăng các tác phầm của bạn để mọi người cùng được thưởng thức. Tác phẩm của bạn có thể là đoản văn, thơ, tiều thuyết, tranh ảnh... <br><br>Mọi hướng dẫn cụ thể về cách đăng truyện xin vui lòng tham khảo ở <a href =\"\"><span class=\"label label-info\">Đây</span></a></p>
      </div><!--span4-->
      <!--</div><!--row-fluid-->
  
      <br>
      <br>

<br>
<br>

    </div>
  </div>
</div>

</div><!--le-->

 <header class=\"navbar navbar-static-top top\">
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
        <li><a href=\"trangngontinh.com/dangtruyen\" class=\"orange\">Đăng Truyện</a></li>
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
        <li><a href=\"trangngontinh.com/dangky\" class=\"orange\">Đăng Ký</a></li>
      </ul>
    
  </div>
</header>

<!--================================================== -->

  <div class=\"container\">
    <div class=\"row-fluid orangebackground\">
        <div class=\"span5\">
            <br>
            <a href=\"trangngontinh.com\" ><img src=\"[[((data :lib-path) :logo3)]]\" class=\"imgFloat\" width=\"360\" height=\"130\"></a>
        </div>
        <div class=\"span7\">
            <div class=\"socialicon\">
                <a href=\"#\" ><img src=\"[[((data :lib-path) :facebook)]]\" class=\"socialicon1\" width=\"50\" height=\"50\"></a>
                <a href=\"#\" ><img src=\"[[((data :lib-path) :twitter)]]\" class=\"socialicon1\" width=\"50\" height=\"50\"></a>
                <a href=\"#\" ><img src=\"[[((data :lib-path) :rss)]]\" class=\"socialicon1\" width=\"50\" height=\"50\"></a> 
                <a href=\"#\" ><img src=\"[[((data :lib-path) :google+)]]\" class=\"socialicon1\" width=\"50\" height=\"50\"></a> 
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
              <a class=\"navbar-brand \" href=\"trangngontinh.com\"><b>Trang Ngôn Tình</b></a>
            </div>
            <div class=\"collapse navbar-collapse bs-navbar-collapse\">
              <ul class=\"nav navbar-nav\">
                <li class=\"active\"><a href=\"trangngontinh.com\">HOME</a></li>                
                <li><a href=\"trangngontinh.com/danhsachtruyen\"><b>DANH SÁCH TRUYỆN</b></a></li>   
                <li><a href=\"trangngontinh.com/doctruyen\"><b>ĐỌC TRUYỆN</b></a></li> 
                <li><a href=\"trangngontinh.com/englishnovel\"><b>ENGLISH NOVEL</b></a></li>
                <li><a href=\"trangngontinh.com/timkiemnangcao\"><b>TÌM TRUYỆN</b></a></li>              
                <li><a href=\"trangngontinh.com/dangtruyen\"><b>GÓC SÁNG TÁC</b></a></li> 
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
          <input type=\"text\" class=\"form-control\" placeholder=\"Search ...\">
          <button href=\"[[(data :tim)]]\" type=\"submit\" class=\"btn btn-default\">Tìm</button>
          <a href = \"trangngontinh.com/advancedsearch\" class=\"btn btn-success\" role=\"button\">Tìm kiếm nâng cao</a>
      </div>
    </div>

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
 (try (l/paths :bootcollapsejs) (catch Exception e "Exception happened"))
 (str "\"></script>
   <!--<script src=\"bootstrap-example/js/bootstrap-carousel.js\"></script>
    <script src=\"bootstrap-example/js/bootstrap-typeahead.js\"></script>  -->

<script>
    $(\"#hiendangnhap\").click(function(){
    $(\"#dangnhapblock\").slideToggle();    
    });

    $(document).ready(function(){
    $(\".list-group-item:even\").addClass(\"list-group-item-warning\");
    $(\".list-group-item:odd\").addClass(\"list-group-item-success\");
  });
    
</script>
  </body>
</html>
")
]]
(apply str blocks)))