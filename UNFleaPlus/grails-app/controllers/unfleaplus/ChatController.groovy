package unfleaplus

class ChatController {
	
	String chatMessage
	def lista
	
	def renderV()
	{
		render(controller:'chat',view:'chat')
	}
	def index() {
		chatMessage = params.chatMessage
		saveMessage()
		render(view:'chat')
	}
	def retrieveLatestMessages() {
		def messages = Message.listOrderByDate(order: 'desc', max:30)
		[messages:messages.reverse()]
	}
	def submitMessage(String message) {
		//new Message(nickname: session.nickname, message:message).save()
		new Message(nickname: session.user, message:message).save()
		render "<script>retrieveLatestMessages()</script>"
	}
	
	def saveMessage(){
		def newMessage = new Message(nickname:session.user,date: new Date(), message: chatMessage)
		newMessage.save()
		def lista = Message.list()
		for(Message m : lista ){
			print m.nickname + " " + m.date +" " + m.message + "\n"
		}
	}
	
	
	
}
