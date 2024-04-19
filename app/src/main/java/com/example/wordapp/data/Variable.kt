package com.example.wordapp.data

import com.example.wordapp.model.Alphabet

class Variable {
    companion object {
        val alphabetList: List<Alphabet> = listOf(
            Alphabet("A", listOf("Apple", "Airplane", "Arrow")),
            Alphabet("B", listOf("Ball", "Banana", "Butterfly")),
            Alphabet("C", listOf("Car", "Cat", "Cake")),
            Alphabet("D", listOf("Dog", "Door", "Diamond")),
            Alphabet("E", listOf("Elephant", "Egg", "Earth")),
            Alphabet("F", listOf("Fish", "Fire", "Flower")),
            Alphabet("G", listOf("Goat", "Guitar", "Grass")),
            Alphabet("H", listOf("House", "Hat", "Horse")),
            Alphabet("I", listOf("Ice Cream", "Island", "Insect")),
            Alphabet("J", listOf("Jellyfish", "Jam", "Jacket")),
            Alphabet("K", listOf("Kangaroo", "Key", "Kite")),
            Alphabet("L", listOf("Lion", "Lamp", "Leaf")),
            Alphabet("M", listOf("Monkey", "Moon", "Mountain")),
            Alphabet("N", listOf("Nest", "Net", "Nose")),
            Alphabet("O", listOf("Owl", "Orange", "Ocean")),
            Alphabet("P", listOf("Penguin", "Piano", "Pineapple")),
            Alphabet("Q", listOf("Queen", "Quail", "Quilt")),
            Alphabet("R", listOf("Rabbit", "Rain", "Robot")),
            Alphabet("S", listOf("Sun", "Star", "Ship")),
            Alphabet("T", listOf("Tiger", "Tree", "Table")),
            Alphabet("U", listOf("Umbrella", "Unicorn", "Uniform")),
            Alphabet("V", listOf("Van", "Violin", "Volcano")),
            Alphabet("W", listOf("Whale", "Watermelon", "Window")),
            Alphabet("X", listOf("Xylophone", "X-ray", "Xenon")),
            Alphabet("Y", listOf("Yak", "Yarn", "Yoga")),
            Alphabet("Z", listOf("Zebra", "Zoo", "Zombie"))
        )
    }
}
