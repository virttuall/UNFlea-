import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_indexcontactUs_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/contactUs.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('javascript','g',4,['library':("jquery"),'plugin':("jquery")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("contactUs")],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("contact.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',11,['src':("navbar.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("sticky-footer.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',13,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("modal.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("bootstrap-typeahead.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',17,['src':("search.js")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',22,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
if(true && (session.user)) {
printHtmlPart(5)
if(true && (user.avatar)) {
printHtmlPart(6)
createTagBody(4, {->
printHtmlPart(7)
expressionOut.print(createLink(controller:'user', action:'avatar_image', id:user.ident()))
printHtmlPart(8)
})
invokeTag('link','g',43,['controller':("user"),'action':("viewHome"),'class':("font-menu")],4)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(11)
expressionOut.print(user.username)
printHtmlPart(12)
})
invokeTag('link','g',50,['controller':("user"),'action':("viewHome"),'class':("navbar-brand font-menu")],3)
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
invokeTag('set','g',59,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(15)
expressionOut.print(search1)
printHtmlPart(16)
})
invokeTag('form','g',68,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],3)
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
invokeTag('message','g',72,['code':("default.home.label")],-1)
printHtmlPart(19)
})
invokeTag('link','g',73,['controller':("index"),'action':("viewHome")],3)
printHtmlPart(20)
createTagBody(3, {->
printHtmlPart(18)
invokeTag('message','g',75,['code':("myProducts")],-1)
printHtmlPart(19)
})
invokeTag('link','g',76,['controller':("user"),'action':("viewHome")],3)
printHtmlPart(21)
if(true && (requests)) {
printHtmlPart(22)
expressionOut.print(requests.size())
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (requests)) {
printHtmlPart(25)
for( request in (requests) ) {
printHtmlPart(26)
createTagBody(5, {->
printHtmlPart(27)
expressionOut.print(request)
printHtmlPart(28)
})
invokeTag('link','g',91,['controller':("user"),'action':("userRequest"),'params':([name:request])],5)
printHtmlPart(29)
}
printHtmlPart(30)
}
printHtmlPart(31)
createTagBody(3, {->
printHtmlPart(18)
invokeTag('message','g',98,['code':("logout")],-1)
printHtmlPart(19)
})
invokeTag('link','g',99,['controller':("user"),'action':("logout")],3)
printHtmlPart(32)
invokeTag('message','g',101,['code':("more")],-1)
printHtmlPart(33)
createTagBody(3, {->
printHtmlPart(25)
invokeTag('message','g',105,['code':("contactUs")],-1)
printHtmlPart(34)
})
invokeTag('link','g',106,['controller':("index"),'action':("viewContactUs")],3)
printHtmlPart(35)
createTagBody(3, {->
printHtmlPart(25)
invokeTag('message','g',108,['code':("aboutUs")],-1)
printHtmlPart(34)
})
invokeTag('link','g',109,['controller':("index"),'action':("viewAboutUs")],3)
printHtmlPart(36)
}
else {
printHtmlPart(37)
invokeTag('link','g',131,['controller':("index"),'action':("viewHome")],-1)
printHtmlPart(38)
createTagBody(3, {->
printHtmlPart(39)
invokeTag('set','g',139,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(40)
expressionOut.print(search1)
printHtmlPart(41)
})
invokeTag('form','g',149,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],3)
printHtmlPart(42)
createTagBody(3, {->
printHtmlPart(25)
invokeTag('message','g',153,['code':("signUP")],-1)
printHtmlPart(34)
})
invokeTag('link','g',154,['controller':("user"),'action':("viewRegister")],3)
printHtmlPart(43)
invokeTag('message','g',156,['code':("howUse")],-1)
printHtmlPart(44)
invokeTag('message','g',160,['code':("login")],-1)
printHtmlPart(45)
invokeTag('set','g',163,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(25)
invokeTag('set','g',165,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(46)
createTagBody(3, {->
printHtmlPart(47)
expressionOut.print(foo)
printHtmlPart(48)
expressionOut.print(foo1)
printHtmlPart(49)
invokeTag('message','g',184,['code':("rememberMe")],-1)
printHtmlPart(50)
invokeTag('message','g',190,['code':("login")],-1)
printHtmlPart(51)
})
invokeTag('form','g',193,['role':("form"),'controller':("user"),'action':("login"),'method':("post")],3)
printHtmlPart(52)
invokeTag('message','g',196,['code':("more")],-1)
printHtmlPart(53)
createTagBody(3, {->
printHtmlPart(28)
invokeTag('message','g',200,['code':("contactUs")],-1)
printHtmlPart(54)
})
invokeTag('link','g',201,['controller':("index"),'action':("viewContactUs")],3)
printHtmlPart(55)
createTagBody(3, {->
printHtmlPart(28)
invokeTag('message','g',203,['code':("aboutUs")],-1)
printHtmlPart(54)
})
invokeTag('link','g',204,['controller':("index"),'action':("viewAboutUs")],3)
printHtmlPart(56)
}
printHtmlPart(57)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('set','g',228,['var':("username_input"),'value':(g.message(code: 'usernameVar')),'scope':("page")],-1)
printHtmlPart(12)
invokeTag('set','g',230,['var':("email_input"),'value':(g.message(code: 'emailRegister')),'scope':("page")],-1)
printHtmlPart(12)
invokeTag('set','g',232,['var':("comments_input"),'value':(g.message(code: 'commentsVar')),'scope':("page")],-1)
printHtmlPart(58)
invokeTag('message','g',235,['code':("contactUs")],-1)
printHtmlPart(59)
invokeTag('message','g',241,['code':("usernameVar")],-1)
printHtmlPart(60)
expressionOut.print(username_input)
printHtmlPart(61)
invokeTag('message','g',252,['code':("emailVar")],-1)
printHtmlPart(62)
expressionOut.print(email_input)
printHtmlPart(63)
invokeTag('message','g',262,['code':("comments")],-1)
printHtmlPart(64)
expressionOut.print(comments_input)
printHtmlPart(65)
invokeTag('message','g',274,['code':("send")],-1)
printHtmlPart(66)
})
invokeTag('form','g',279,['class':("form-horizontal"),'controller':("user"),'action':("sendEmail"),'method':("post")],2)
printHtmlPart(67)
expressionOut.print(search)
printHtmlPart(68)
invokeTag('message','g',297,['code':("tutorial")],-1)
printHtmlPart(69)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('image','asset',312,['src':("ingles.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(9)
})
invokeTag('link','g',313,['controller':("index"),'action':("viewHome"),'params':([lang:'en'])],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('image','asset',316,['src':("espanol.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(9)
})
invokeTag('link','g',317,['controller':("index"),'action':("viewHome"),'params':([lang:'es'])],2)
printHtmlPart(70)
invokeTag('image','asset',322,['src':("facebook.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(71)
invokeTag('image','asset',324,['src':("twitter.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(72)
invokeTag('image','asset',326,['src':("github.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(73)
})
invokeTag('captureBody','sitemesh',334,[:],1)
printHtmlPart(74)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418056499000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 17, 17, 22, 22, 22, 23, 26, 26, 26, 26, 39, 40, 42, 42, 42, 42, 43, 43, 44, 44, 48, 49, 49, 49, 50, 50, 50, 50, 59, 59, 59, 59, 61, 61, 68, 68, 68, 72, 72, 72, 73, 73, 73, 73, 75, 75, 75, 76, 76, 76, 76, 79, 79, 81, 81, 83, 83, 86, 87, 87, 87, 90, 90, 90, 91, 91, 91, 91, 92, 94, 94, 94, 98, 98, 98, 99, 99, 99, 99, 101, 101, 105, 105, 105, 106, 106, 106, 106, 108, 108, 108, 109, 109, 109, 109, 115, 116, 116, 131, 131, 139, 139, 139, 139, 141, 141, 149, 149, 149, 153, 153, 153, 154, 154, 154, 154, 156, 156, 160, 160, 163, 165, 165, 168, 172, 172, 172, 172, 178, 178, 184, 184, 190, 190, 193, 193, 193, 196, 196, 200, 200, 200, 201, 201, 201, 201, 203, 203, 203, 204, 204, 204, 204, 215, 215, 228, 228, 228, 230, 230, 232, 232, 232, 235, 235, 241, 241, 244, 244, 252, 252, 255, 255, 262, 262, 265, 265, 274, 274, 279, 279, 279, 286, 286, 297, 297, 312, 312, 312, 313, 313, 313, 314, 316, 316, 316, 317, 317, 317, 317, 322, 322, 324, 324, 326, 326, 334, 334, 334, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "contactUs.gsp"
)
class ___LineNumberPlaceholder { }
