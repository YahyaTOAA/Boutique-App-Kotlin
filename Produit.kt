package Boutique

import java.util.Objects

open class Produit(var code:Int,var prix:Double) {
    open fun prixProduit():Double{
        return this.prix
    }

    override fun toString(): String {
        return "Produit ; Prix\n"+this.code+" ; "+this.prix;
    }
    fun equals(obj:Objects):Boolean {
        var statut:Boolean= when{
            this.code==(obj as Produit).code->true
            else->false
        }
        return statut
    }
}