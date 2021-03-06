<!DOCTYPE html>
<html lang="en">
<head> 
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 
    <!-- titulo  -->
    <title>Sistema Estadístico Aeroportuario</title>

    <!-- Favicon  -->
    <link rel="icon" href="Resources_views/img/core-img/favicon.ico">

    <!-- Style CSS -->
    <link rel="stylesheet" href="Resources_views/style.css">
</head>
<body>

    <!-- ***** MENUBAR PRINCIPAL ***** -->
    <header class="header-area">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <nav class="navbar navbar-expand-lg">
                        <!-- Logo -->
                        <a class="navbar-brand" href="welcome.blade.php"><img src="Resources_views/img/core-img/logo-tocumen.png" alt="Logo"></a>
                        <!-- Navbar Toggler -->
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#worldNav" aria-controls="worldNav" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                        <!-- Navbar -->
                        <div class="collapse navbar-collapse" id="worldNav">
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item active">
                                    <a class="nav-link" href="welcome.blade.php">Home <span class="sr-only">(current)</span></a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pages</a>
                                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="indexSEA.html">Home</a>
                                        <a class="dropdown-item" href="x.html">None</a>
                                        <a class="dropdown-item" href="x.html">None</a>
                                        <a class="dropdown-item" href="x.html">None</a>
                                        <a class="dropdown-item" href="x.html">None</a>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">None</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">None</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">None</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">None</a>
                                </li>
                            </ul>
                            <!-- Search Form  AUN FALTA DEFINIR EL CODIGO PARA PROPORCIONAR O REALIZAR BUSQUEDAS -->
                            <div id="search-wrapper">
                                <form action="#"> 
                                    <input type="text" id="search" placeholder="Search something...">
                                    <div id="close-icon"></div>
                                    <input class="d-none" type="submit" value="">
                                </form>
                            </div>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!-- ***** MENUBAR PRINCIPAL ***** -->

    <!-- ********** AREA DE LA IMAGEN PRINCIPAL Y ANIMACION ********** -->
    <div class="hero-area">
        <!-- imagenes en slide -->
        <div class="hero-slides owl-carousel">
            <!-- IMAGEN Slide -->
            <div class="single-hero-slide bg-img background-overlay" style="background-image: url(Resources_views/img/blog-img/w_3.jpg);"></div>
            <!-- IMAGEN Slide -->
            <div class="single-hero-slide bg-img background-overlay" style="background-image: url(Resources_views/img/blog-img/w_2.jpg);"></div>
        </div>
    </div>
    <!-- ********** AREA DE LA IMAGEN PRINCIPAL Y ANIMACION ********** -->
    
    <!-- =============  DASHBOARD DEL AREA DE TRABAJO ============= -->
    <div class="world-catagory-area">
        <div class="post-content-area mb-100">
                <ul class="nav nav-tabs" id="myTab" role="tablist">
                        <li class="title">Gestion de Base de Datos</li>

                        <li class="nav-item">
                            <a class="nav-link active" id="tab1" data-toggle="tab" href="#world-tab-1" role="tab" aria-controls="world-tab-1" aria-selected="true">Definir DB</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" id="tab2" data-toggle="tab" href="#world-tab-2" role="tab" aria-controls="world-tab-2" aria-selected="false">Business</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" id="tab3" data-toggle="tab" href="#world-tab-3" role="tab" aria-controls="world-tab-3" aria-selected="false">Health &amp; Fitness</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" id="tab4" data-toggle="tab" href="#world-tab-4" role="tab" aria-controls="world-tab-4" aria-selected="false">Recipes</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" id="tab5" data-toggle="tab" href="#world-tab-5" role="tab" aria-controls="world-tab-5" aria-selected="false">Travel</a>
                        </li>
                </ul> <!-- Barra de opciones del dashboard -->

            <!-- ACCION DE CADA OPCION DEL MENU DEL DASHBOARD -->
                <div class="tab-pane fade show active" id="world-tab-1" role="tabpanel" aria-labelledby="tab1">
                    <form action="" method="POST" enctype="multipart/form-data">
                        <br>
                        <div class="col-8">
                            <button class="btn">Subir</button>
                           
                        </div>

                        <div class="col-4">
                            <input type="file" class="form-control-file btn" name="archivo" accept="file/xls, .xls">
                        </div>
                    </form>
                </div>
            <!-- ******************************************************************************************************** -->
                <div class="tab-pane fade" id="world-tab-2" role="tabpanel" aria-labelledby="tab2">

                </div>
            <!-- ACCION DE CADA OPCION DEL MENU DEL DASHBOARD -->
        </div>
    </div>
    <!-- =============  DASHBOARD DEL AREA DE TRABAJO ============= -->





   <!-- jQuery (Necessary for All JavaScript Plugins) -->
   <script src="/Resources_views/js/jquery/jquery-2.2.4.min.js"></script>
   <script src="/Resources_views/js/bootstrap.min.js"></script>
   <script src="/Resources_views/js/popper.min.js"></script>
   <script src="/Resources_views/js/plugins.js"></script>
   <script src="/Resources_views/js/active.js"></script>
  
</body>
</html>