package unfleaplus

import javax.mail.Session;

class ChatController {
	def userReciveMessage=""
	def userSendMessage=""
    def index() { }
	def retrieveLatestMessages() {
		def messages = Message.findAll("from Message as b where (username=? or username=?) and (user1=? or user1=?)",[userSendMessage,userReciveMessage,userSendMessage,userReciveMessage])
//		
		[messages:messages]
	}
	def submitMessage(String message) {
		String[] tokens=message.split("///////////////")
		userReciveMessage=tokens[1]
		userSendMessage=session.user
		print tokens[1]
		print tokens[0]
		new Message(username: session.user.trim(), message:tokens[0],date: new Date(),user1:userReciveMessage.trim()).save()
		//new Message(username: userReciveMessage.trim(), message:tokens[0],date: new Date(),user1:session.user.trim()).save()
		render "<script>retrieveLatestMessages()</script>"
	}
	
}
