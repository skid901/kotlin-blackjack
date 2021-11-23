package blackjack.model

@JvmInline
value class Names private constructor(private val names: List<Name>) {

    fun toList(): List<Name> = names

    companion object {
        fun from(names: List<Name>) = Names(names)
    }
}