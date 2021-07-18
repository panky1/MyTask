package com.pankaj.mytask.utils

/*
*   Safe Try-Catch block
*/
fun safeExecute(body:()->Unit){
    try{
        body()
    }catch (ex : Exception){
        ex.printStackTrace()
    }
}