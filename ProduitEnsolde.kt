package Boutique

class ProduitEnsolde(code:Int, prix:Double, var remise: IntRange =10..90):Produit(code,prix) {
    override fun prixProduit(): Double {
        return super.prixProduit()-(super.prixProduit()*(remise.start.toDouble()/100))
    }

    override fun toString(): String {
        return super.toString()+"\nProduit ; Nouveau Prix\n"+code+" ; "+prixProduit()
    }
}