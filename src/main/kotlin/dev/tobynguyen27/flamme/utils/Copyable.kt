package dev.tobynguyen27.flamme.utils

/** This is an alternative to Cloneable, which allows us to clone an object without type casting and non-shallow copy */
interface Copyable<T> {
    fun copy(): T
}
