@extends('Layout.app') <!--directiva, hereda la vista del layout  app -->




@section('title','Trainers Create')
@section('content') 
    <form class="form-group" action="/trainers" method="POST"> <!-- la ruta es el nombre del recurso! -->
        @csrf <!-- directiva de blade para la proteccion del sitio -->
        <div class="form-group">
            <label for="">Nombre</label>
            <input type="text" name="nombre" class="form-control">
        </div>
        <!-- SEPARATOR -->
        <button type="submit" class="btn-primary">Guardar</button>
    
    </form>
    <!-- SEPARATOR -->
    <!--<p>HOla mundo desde mi primer views</p> -->
@endsection