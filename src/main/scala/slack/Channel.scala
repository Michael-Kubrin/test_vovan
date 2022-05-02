package slack

import java.util.Date

case class Channel(nameOfChannel: String, Users: List[User], dateOfMessages: Date)
