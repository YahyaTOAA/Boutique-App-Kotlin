package Boutique

import java.io.BufferedWriter
import java.io.FileWriter

class Boutique(var Produits:ArrayList<Produit>) {
    fun indiceDe(code:Int):Int{
        for (i in 1..Produits.size){
            if (Produits.get(i).code==code){
                return i;
            }
        }
        return -1
    }
    fun ajouter(p:Produit){
        var F =indiceDe(p.code)
        when(F){
            -1 ->Produits.add(p)
            else ->"Produit deja existe"
        }
    }
    fun supprimer(code:Int):Boolean{
        var F =indiceDe(code)
        if (F==-1){
            return false
        }else{
            for (i in 1..Produits.size){
                if (Produits.get(i).code == code) {
                    Produits.removeAt(i)
                }
            }
            return true
        }
    }
    fun supprimer(p:Produit): Boolean {
        if (Produits.contains(p)){
            Produits.remove(p)
            return true
        }else{
            return false
        }
    }
    fun nombreProduitsEnSolde(): Int {
        var nombreProduitsEnSolde=0
        for(i in 1..Produits.size){
            nombreProduitsEnSolde+=Produits.get(i).code
        }
        return nombreProduitsEnSolde
    }
    fun enregistrer(chemin:String){
        var writer = BufferedWriter(FileWriter(chemin))
        for(i in 1..Produits.size){
            writer.write("Produit : ${Produits.get(i).code} Prix : ${Produits.get(i).prixProduit()}")
        }
        writer.close()
    }
}