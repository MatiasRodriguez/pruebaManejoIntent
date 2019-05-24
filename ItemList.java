package com.example.a41639786.intentadapter;

import java.util.ArrayList;

public class ItemList {
    private static int[] imagenes={
            R.drawable.apple,
            R.drawable.cuore,
            R.drawable.smile

    } ;
    int imagen;
    int cantidad;
    int index;

    public  item_lista(int image , int cant , int ind){
        this.imagen=image;
        this.cantidad=cant;
        this.index=ind;
    }

    public int getImagen(){

        return  imagen;
    }
    public String getCantidad(){
    return "Cant :"+ cantidad;
    }

    public String getProducto(){
        if(index ==0){
            return "Manzana";
        }else if(index == 1){
            return "Corazon";
        }else {
            return "Sonrisa";
        }
    }

    public static ArrayList<ItemList> construirList(int[] elementos){
        ArrayList<ItemList> retorno =new ArrayList<ItemList>();
        addElementos(elementos[0],new ItemList(imagenes[0],imagenes[0],0)retorno);
        addElementos(elementos[1],new ItemList(imagenes[1],imagenes[1],1)retorno);
        addElementos(elementos[2],new ItemList(imagenes[2],imagenes[2],2)retorno);
        return retorno;
    }

    private static void addElementos(int maxIndex,ItemList item , ArrayList<ItemList> list){
        for (int i=0; i< maxIndex;i++){
            list.add(item);
        }

    }

}
