<?php
    namespace Laradex\Http\Controllers; // contenedor para codigo de php

    use Laradex\Http\Controllers\Controller;
    class PruebaController extends Controller{

        public function prueba($param){
            return 'Estoy dentro de PruebaController :V con '.$param;
        }
    }
