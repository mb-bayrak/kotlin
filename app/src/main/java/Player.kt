



class Player(private val name: String,
             private var lives: Int = 3,
             private var level: Int = 1,
             private var score: Int = 0) {

    var weapon: Weapon = Weapon( "Fist", 1)
    val inventory = ArrayList<Loot>()


    fun show(){
        println(""" 
                    name: $name
                    lives: $lives
                    level: $level
                    score: $score  
                    weapon: ${weapon.name}          
                    damage: ${weapon.damageInflicted}          
                """)
    }

    override fun toString(): String {
        return """ 
                    name: $name
                    lives: $lives
                    level: $level
                    score: $score  
                    weapon: ${weapon.name}          
                    damage: ${weapon.damageInflicted}          
                """
    }

    fun showInventory(){
        println("$name's Inventory:'")
        println(inventory.get(0).name)
        println("=========================")
    }
}

