object q2 {
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(word => word.length)
    val totalOccurrences = wordLengths.reduce((len1, len2) => len1 + len2)
    totalOccurrences
  }

  def main(args: Array[String]): Unit = {
    val inputWords = List("apple", "banana", "cherry", "date")
    val totalOccurrences = countLetterOccurrences(inputWords)
    println(s"Total count of letter occurrences: $totalOccurrences")
  }
}
