package unfleaplus

class ChatController {

	def index() {
		render(view: 'chat')
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
}
