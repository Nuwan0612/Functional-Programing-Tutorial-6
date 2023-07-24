package Caeser

object Ceasar {

  def encrypt(key: Int, str: String): String = {
    str.map{ c =>
      if(c.isLetter) {
        val base = 'A'
        (((c - base + (key%26) + 26) % 26) + base).toChar
      }else {
        c
      }
    }
  }

  def decrypt(key: Int, str: String): String = encrypt(-key, str)

  def callFunction(key: Int, str: String, func:(Int, String)=>String): String = func(key, str)

  def main(args:Array[String]): Unit = {
    val key = 27
    val text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
    val encryptText = callFunction(key,text, encrypt)
    val decryptText = callFunction(key,encryptText, decrypt)
    println(encryptText)
    println(decryptText)
  }
}
