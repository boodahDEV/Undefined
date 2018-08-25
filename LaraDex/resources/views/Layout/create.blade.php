@extends('Layout.app') <!--directiva, hereda la vista del layout  app -->




@section('title','Trainers Create')
@section('content') 
        <div class="form-group">
            <label for="">Nombre</label>
            <input type="text" class="form-control">
        </div>
        <!-- SEPARATOR -->
        <button type="submit" class="btn-primary">Guardar</button>
    <!-- SEPARATOR -->
    <!--<p>HOla mundo desde mi primer views</p> -->
@endsection