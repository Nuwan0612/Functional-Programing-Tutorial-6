package Caeser

object Ceasar {

  def encrypt(key: Int, str: String): String = {
    str.map{ c =>
      if(c.isLetter) {
        (c + key).toChar
      }else {
        c
      }
    }
  }

  def decrypt(key: Int, str: String): String = encrypt(-key, str)

  def callFunction(key: Int, str: String, func:(Int, String)=>String): String = func(key, str)

  def main(args:Array[String]): Unit = {
    val key = 2
    val encryptText = callFunction(key,"hello", encrypt)
    val decryptText = callFunction(key,encryptText, decrypt)
    println(encryptText)
    println(decryptText)
  }
}
