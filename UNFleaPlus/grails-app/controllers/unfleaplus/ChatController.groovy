package unfleaplus

class ChatController {

    def index() { }
	def retrieveLatestMessages() {
		def messages = Message.list(sort:"date", order:"desc")
		[messages:messages.reverse()]
	}
	def submitMessage(String message) {
		new Message(username: session.user, message:message,date: new Date()).save()
		render "<script>retrieveLatestMessages()</script>"
	}
	def m(){
		print "hola"
		render "hola"
	}
}
