



fun main(args: Array<String>) {

    val byrock: Player = Player("Byrock", 8, 4)


    val dilek= Player("Dilek", 5, 4)

    val axe = Weapon("Axe", 10)
    val sword = Weapon("Sword", 14)
    val spear = Weapon("Spear", 18)

    byrock.weapon = axe

    dilek.weapon = sword

//    byrock.show()
//
//    dilek.show()

    val redPotion = Loot("RedPotion", LootType.ARMOR, 7.50)
    byrock.inventory.add(redPotion);

   println(byrock)



}

