data class Message(val address: String?, val topic: String?, val text : String?, val author : String?) { }

fun Message.toHTML(): String
{
    return "<table style=\"border-collapse: collapse;\">\n" +
            (address?.let { "<tr><td style='color: green;'>Address: </td><td style='padding: 0 5px;'><font face=\"lucida console\"> $it </font></td></tr>\n" } ?: run {""}) +
            (topic?.let { "<tr><td style='color: purple;'>Topic: </td><td style='padding: 0 5px;'><font face=\"lucida console\"> $it </font></td></tr>\n" } ?: run {""}) +
            (text?.let { "<tr><td style='color: navy;'>Text: </td><td style='padding: 0 5px;'><font face=\"lucida console\"> $it </font></td></tr>\n" } ?: run {""}) +
            (author?.let { "<tr><td style='color: aqua;'>Author: </td><td style='padding: 0 5px;'><font face=\"lucida console\"> $it </font></td></tr>\n" } ?: run {""}) +
            "</table>\n<br>"
}

fun main()
{
    val message1 = Message("super_site.com", null, "Update your status in personal account", null)
    val message2 = Message("casino-Siberia.sib", "Win 100000$", "You win more money", null)
    val message3 = Message("news-russia.ru", "Регистрация завершена", "Регистрация успешно завершена", "Администрация")

    println(message1.toHTML())
    println(message2.toHTML())
    println(message3.toHTML())
}