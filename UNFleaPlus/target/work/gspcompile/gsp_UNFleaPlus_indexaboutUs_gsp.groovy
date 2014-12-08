import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_indexaboutUs_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/aboutUs.gsp" }
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
invokeTag('message','g',7,['code':("AboutUs")],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("about.css")],-1)
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
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("search.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(3)
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
invokeTag('link','g',45,['controller':("user"),'action':("viewHome"),'class':("font-menu")],4)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(11)
expressionOut.print(user.username)
printHtmlPart(6)
})
invokeTag('link','g',51,['controller':("user"),'action':("viewHome"),'class':("navbar-brand font-menu")],3)
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(13)
invokeTag('set','g',60,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(14)
expressionOut.print(search1)
printHtmlPart(15)
})
invokeTag('form','g',69,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],3)
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',73,['code':("default.home.label")],-1)
printHtmlPart(18)
})
invokeTag('link','g',74,['controller':("index"),'action':("viewHome")],3)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',76,['code':("myProducts")],-1)
printHtmlPart(18)
})
invokeTag('link','g',77,['controller':("user"),'action':("viewHome")],3)
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
invokeTag('link','g',92,['controller':("user"),'action':("userRequest"),'params':([name:request])],5)
printHtmlPart(28)
}
printHtmlPart(29)
}
printHtmlPart(30)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',99,['code':("logout")],-1)
printHtmlPart(18)
})
invokeTag('link','g',100,['controller':("user"),'action':("logout")],3)
printHtmlPart(31)
invokeTag('message','g',102,['code':("more")],-1)
printHtmlPart(32)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',106,['code':("contactUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',107,['controller':("index"),'action':("viewContactUs")],3)
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',109,['code':("aboutUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',110,['controller':("index"),'action':("viewAboutUs")],3)
printHtmlPart(35)
}
else {
printHtmlPart(36)
invokeTag('link','g',132,['controller':("index"),'action':("viewHome")],-1)
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(38)
invokeTag('set','g',140,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(39)
expressionOut.print(search1)
printHtmlPart(40)
})
invokeTag('form','g',150,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],3)
printHtmlPart(41)
createTagBody(3, {->
printHtmlPart(24)
invokeTag('message','g',154,['code':("signUP")],-1)
printHtmlPart(42)
})
invokeTag('link','g',155,['controller':("user"),'action':("viewRegister")],3)
printHtmlPart(43)
invokeTag('message','g',157,['code':("howUse")],-1)
printHtmlPart(44)
invokeTag('message','g',161,['code':("login")],-1)
printHtmlPart(45)
invokeTag('set','g',164,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(24)
invokeTag('set','g',166,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(46)
createTagBody(3, {->
printHtmlPart(47)
expressionOut.print(foo)
printHtmlPart(48)
expressionOut.print(foo1)
printHtmlPart(49)
invokeTag('message','g',185,['code':("rememberMe")],-1)
printHtmlPart(50)
invokeTag('message','g',191,['code':("login")],-1)
printHtmlPart(51)
})
invokeTag('form','g',194,['role':("form"),'controller':("user"),'action':("login"),'method':("post")],3)
printHtmlPart(52)
invokeTag('message','g',197,['code':("more")],-1)
printHtmlPart(32)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',201,['code':("contactUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',202,['controller':("index"),'action':("viewContactUs")],3)
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',204,['code':("aboutUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',205,['controller':("index"),'action':("viewAboutUs")],3)
printHtmlPart(53)
}
printHtmlPart(54)
invokeTag('image','asset',226,['class':("img-circle"),'src':("UNFlea.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(55)
invokeTag('message','g',233,['code':("unfleaDescription")],-1)
printHtmlPart(56)
invokeTag('image','asset',238,['class':("img-circle"),'src':("FabianConejo.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(57)
invokeTag('message','g',245,['code':("fabianDescription")],-1)
printHtmlPart(58)
invokeTag('image','asset',251,['class':("img-circle"),'src':("AndresGutierrez.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(59)
invokeTag('message','g',258,['code':("andresDescription")],-1)
printHtmlPart(60)
invokeTag('image','asset',270,['class':("img-circle"),'src':("SamuelCabezas.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(61)
invokeTag('message','g',277,['code':("samuelDescription")],-1)
printHtmlPart(56)
invokeTag('image','asset',282,['class':("img-circle"),'src':("YeisonGarcia.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(62)
invokeTag('message','g',289,['code':("yeisonDescription")],-1)
printHtmlPart(63)
invokeTag('image','asset',296,['class':("img-circle"),'src':("MateoNieto.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(64)
invokeTag('message','g',303,['code':("mateoDescription")],-1)
printHtmlPart(65)
invokeTag('message','g',320,['code':("tutorial")],-1)
printHtmlPart(66)
expressionOut.print(search)
printHtmlPart(67)
createTagBody(2, {->
printHtmlPart(68)
invokeTag('image','asset',350,['src':("ingles.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(69)
})
invokeTag('link','g',351,['controller':("index"),'action':("viewHome"),'params':([lang:'en'])],2)
printHtmlPart(69)
createTagBody(2, {->
printHtmlPart(68)
invokeTag('image','asset',354,['src':("espanol.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(69)
})
invokeTag('link','g',355,['controller':("index"),'action':("viewHome"),'params':([lang:'es'])],2)
printHtmlPart(70)
invokeTag('image','asset',360,['src':("facebook.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(71)
invokeTag('image','asset',362,['src':("twitter.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(72)
invokeTag('image','asset',364,['src':("github.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(73)
})
invokeTag('captureBody','sitemesh',372,[:],1)
printHtmlPart(74)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418056500000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 21, 21, 21, 21, 28, 28, 28, 28, 41, 42, 44, 44, 44, 44, 45, 45, 46, 46, 49, 50, 50, 50, 51, 51, 51, 51, 60, 60, 60, 60, 62, 62, 69, 69, 69, 73, 73, 73, 74, 74, 74, 74, 76, 76, 76, 77, 77, 77, 77, 80, 80, 82, 82, 84, 84, 87, 88, 88, 88, 91, 91, 91, 92, 92, 92, 92, 93, 95, 95, 95, 99, 99, 99, 100, 100, 100, 100, 102, 102, 106, 106, 106, 107, 107, 107, 107, 109, 109, 109, 110, 110, 110, 110, 116, 117, 117, 132, 132, 140, 140, 140, 140, 142, 142, 150, 150, 150, 154, 154, 154, 155, 155, 155, 155, 157, 157, 161, 161, 164, 166, 166, 169, 173, 173, 173, 173, 179, 179, 185, 185, 191, 191, 194, 194, 194, 197, 197, 201, 201, 201, 202, 202, 202, 202, 204, 204, 204, 205, 205, 205, 205, 216, 216, 226, 226, 233, 233, 238, 238, 245, 245, 251, 251, 258, 258, 270, 270, 277, 277, 282, 282, 289, 289, 296, 296, 303, 303, 320, 320, 330, 330, 350, 350, 350, 351, 351, 351, 352, 354, 354, 354, 355, 355, 355, 355, 360, 360, 362, 362, 364, 364, 372, 372, 372, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "aboutUs.gsp"
)
class ___LineNumberPlaceholder { }
