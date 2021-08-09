object Caesar_Cipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encryption = (letter: Char, text:String, key:Int) => text((text.indexOf(letter.toUpper) + key) % text.length)

  val decryption = (letter: Char, text:String, key:Int) => text((text.indexOf(letter.toUpper) - key + text.length) % text.length)

  val CipherFunction = (f: (Char,String,Int) => Char, alph: String, key:Int , text: String) => text.map(f(_,alph, key))

  println(CipherFunction(encryption,alphabet,17,"hello"))
  println(CipherFunction(decryption,alphabet,17,CipherFunction(encryption,alphabet,17,"hello")))
}