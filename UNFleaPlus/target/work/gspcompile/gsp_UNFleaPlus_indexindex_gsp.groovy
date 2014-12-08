import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_indexindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/index.gsp" }
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
invokeTag('message','g',7,['code':("welcome")],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("init.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("buscador.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',11,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("navbar.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',13,['src':("sticky-footer.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("modal.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("bootstrap-typeahead.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',17,['src':("carousel.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',19,['src':("search.js")],-1)
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
printHtmlPart(6)
}
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
expressionOut.print(user.username)
printHtmlPart(11)
})
invokeTag('link','g',49,['controller':("user"),'action':("viewHome"),'class':("navbar-brand font-menu")],3)
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(13)
invokeTag('set','g',58,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(14)
expressionOut.print(search1)
printHtmlPart(15)
})
invokeTag('form','g',67,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],3)
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',71,['code':("default.home.label")],-1)
printHtmlPart(18)
})
invokeTag('link','g',72,['controller':("index"),'action':("viewHome")],3)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',74,['code':("myProducts")],-1)
printHtmlPart(18)
})
invokeTag('link','g',75,['controller':("user"),'action':("viewHome")],3)
printHtmlPart(20)
if(true && (requests)) {
printHtmlPart(21)
expressionOut.print(requests.size())
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (requests)) {
printHtmlPart(24)
for( request in (requests) ) {
printHtmlPart(25)
createTagBody(5, {->
printHtmlPart(26)
expressionOut.print(request)
printHtmlPart(27)
})
invokeTag('link','g',91,['controller':("user"),'action':("userRequest"),'params':([name:request])],5)
printHtmlPart(28)
}
printHtmlPart(29)
}
printHtmlPart(30)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',98,['code':("logout")],-1)
printHtmlPart(18)
})
invokeTag('link','g',99,['controller':("user"),'action':("logout")],3)
printHtmlPart(31)
invokeTag('message','g',101,['code':("more")],-1)
printHtmlPart(32)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',105,['code':("contactUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',106,['controller':("index"),'action':("viewContactUs")],3)
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',108,['code':("aboutUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',109,['controller':("index"),'action':("viewAboutUs")],3)
printHtmlPart(35)
}
else {
printHtmlPart(36)
invokeTag('link','g',131,['controller':("index"),'action':("viewHome")],-1)
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(38)
invokeTag('set','g',139,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(39)
expressionOut.print(search1)
printHtmlPart(40)
})
invokeTag('form','g',149,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],3)
printHtmlPart(41)
createTagBody(3, {->
printHtmlPart(24)
invokeTag('message','g',153,['code':("signUP")],-1)
printHtmlPart(42)
})
invokeTag('link','g',154,['controller':("user"),'action':("viewRegister")],3)
printHtmlPart(43)
invokeTag('message','g',156,['code':("howUse")],-1)
printHtmlPart(44)
invokeTag('message','g',160,['code':("login")],-1)
printHtmlPart(45)
invokeTag('set','g',163,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(24)
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
printHtmlPart(32)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',200,['code':("contactUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',201,['controller':("index"),'action':("viewContactUs")],3)
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',203,['code':("aboutUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',204,['controller':("index"),'action':("viewAboutUs")],3)
printHtmlPart(53)
}
printHtmlPart(54)
invokeTag('message','g',231,['code':("message")],-1)
printHtmlPart(55)
invokeTag('message','g',242,['code':("develomentTeam")],-1)
printHtmlPart(56)
expressionOut.print(search)
printHtmlPart(57)
invokeTag('message','g',272,['code':("tutorial")],-1)
printHtmlPart(58)
if(true && (flash.message)) {
printHtmlPart(59)
expressionOut.print(flash.message)
printHtmlPart(60)
}
printHtmlPart(61)
createTagBody(2, {->
printHtmlPart(62)
invokeTag('image','asset',292,['src':("ingles.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(63)
})
invokeTag('link','g',293,['controller':("index"),'action':("viewHome"),'params':([lang:'en'])],2)
printHtmlPart(63)
createTagBody(2, {->
printHtmlPart(62)
invokeTag('image','asset',296,['src':("espanol.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(63)
})
invokeTag('link','g',297,['controller':("index"),'action':("viewHome"),'params':([lang:'es'])],2)
printHtmlPart(64)
invokeTag('image','asset',302,['src':("facebook.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(65)
invokeTag('image','asset',304,['src':("twitter.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(66)
invokeTag('image','asset',306,['src':("github.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(67)
})
invokeTag('captureBody','sitemesh',314,[:],1)
printHtmlPart(68)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418058283000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 19, 19, 22, 22, 22, 23, 26, 26, 26, 26, 39, 40, 42, 42, 42, 42, 43, 43, 44, 44, 47, 48, 48, 48, 49, 49, 49, 49, 58, 58, 58, 58, 60, 60, 67, 67, 67, 71, 71, 71, 72, 72, 72, 72, 74, 74, 74, 75, 75, 75, 75, 78, 78, 81, 81, 83, 83, 86, 87, 87, 87, 90, 90, 90, 91, 91, 91, 91, 92, 94, 94, 94, 98, 98, 98, 99, 99, 99, 99, 101, 101, 105, 105, 105, 106, 106, 106, 106, 108, 108, 108, 109, 109, 109, 109, 115, 116, 116, 131, 131, 139, 139, 139, 139, 141, 141, 149, 149, 149, 153, 153, 153, 154, 154, 154, 154, 156, 156, 160, 160, 163, 165, 165, 168, 172, 172, 172, 172, 178, 178, 184, 184, 190, 190, 193, 193, 193, 196, 196, 200, 200, 200, 201, 201, 201, 201, 203, 203, 203, 204, 204, 204, 204, 215, 215, 231, 231, 242, 242, 261, 261, 272, 272, 281, 281, 283, 283, 285, 285, 292, 292, 292, 293, 293, 293, 294, 296, 296, 296, 297, 297, 297, 297, 302, 302, 304, 304, 306, 306, 314, 314, 314, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
