import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_useruserRequest_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/userRequest.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('javascript','g',3,['library':("jquery"),'plugin':("jquery")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("requestsVar")],-1)
printHtmlPart(2)
expressionOut.print(user.username)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',8,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',9,['src':("bootstrap-typeahead.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("home.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',11,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("navbar.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',13,['src':("sticky-footer.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("home.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("img-modal.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("search.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',17,['src':("search.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',18,['src':("modal.js")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
if(true && (user.avatar)) {
printHtmlPart(5)
createTagBody(3, {->
printHtmlPart(6)
expressionOut.print(createLink(controller:'user', action:'avatar_image', id:user.ident()))
printHtmlPart(7)
})
invokeTag('link','g',40,['controller':("user"),'action':("viewHome"),'class':("font-menu")],3)
printHtmlPart(8)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(user.username)
printHtmlPart(8)
})
invokeTag('link','g',45,['controller':("user"),'action':("viewHome"),'class':("navbar-brand font-menu")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('set','g',54,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(11)
expressionOut.print(search1)
printHtmlPart(12)
})
invokeTag('form','g',62,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',66,['code':("default.home.label")],-1)
printHtmlPart(15)
})
invokeTag('link','g',67,['controller':("index"),'action':("viewHome")],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',69,['code':("myProducts")],-1)
printHtmlPart(15)
})
invokeTag('link','g',70,['controller':("user"),'action':("viewHome")],2)
printHtmlPart(17)
expressionOut.print(requests.size())
printHtmlPart(18)
if(true && (requests)) {
printHtmlPart(19)
for( request in (requests) ) {
printHtmlPart(20)
createTagBody(4, {->
printHtmlPart(21)
expressionOut.print(request)
printHtmlPart(22)
})
invokeTag('link','g',85,['controller':("user"),'action':("userRequest"),'params':([name:request])],4)
printHtmlPart(23)
}
printHtmlPart(24)
}
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',94,['code':("logout")],-1)
printHtmlPart(15)
})
invokeTag('link','g',95,['controller':("user"),'action':("logout")],2)
printHtmlPart(26)
invokeTag('message','g',97,['code':("more")],-1)
printHtmlPart(27)
createTagBody(2, {->
printHtmlPart(28)
invokeTag('message','g',101,['code':("contactUs")],-1)
printHtmlPart(19)
})
invokeTag('link','g',102,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(28)
invokeTag('message','g',104,['code':("aboutUs")],-1)
printHtmlPart(19)
})
invokeTag('link','g',105,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(30)
invokeTag('message','g',126,['code':("requestsVar")],-1)
printHtmlPart(31)
invokeTag('message','g',134,['code':("homeMenu")],-1)
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(33)
invokeTag('message','g',142,['code':("profile")],-1)
printHtmlPart(34)
})
invokeTag('link','g',144,['controller':("user"),'action':("viewHome")],2)
printHtmlPart(35)
invokeTag('message','g',149,['code':("products")],-1)
printHtmlPart(36)
createTagBody(2, {->
printHtmlPart(37)
invokeTag('message','g',157,['code':("addProduct")],-1)
printHtmlPart(38)
})
invokeTag('link','g',159,['controller':("product"),'action':("viewAddProduct")],2)
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
invokeTag('message','g',163,['code':("deleteProduct")],-1)
printHtmlPart(38)
})
invokeTag('link','g',165,['controller':("product"),'action':("viewDeleteProduct")],2)
printHtmlPart(41)
for( request in (requests1) ) {
printHtmlPart(42)
invokeTag('message','g',177,['code':("theUserVar")],-1)
printHtmlPart(43)
if(true && (request.user.avatar)) {
printHtmlPart(44)
expressionOut.print(createLink(controller:'user', action:'avatar_image', id:request.user.ident()))
printHtmlPart(45)
}
printHtmlPart(46)
expressionOut.print(request.user)
printHtmlPart(47)
expressionOut.print(request.user)
printHtmlPart(48)
invokeTag('message','g',197,['code':("offerVar")],-1)
printHtmlPart(49)
if(true && (request.money>0)) {
printHtmlPart(50)
invokeTag('message','g',205,['code':("moneyVar")],-1)
printHtmlPart(51)
expressionOut.print(request.money)
printHtmlPart(52)
}
printHtmlPart(28)
if(true && (products)) {
printHtmlPart(53)
invokeTag('message','g',217,['code':("products")],-1)
printHtmlPart(54)
for( product in (products) ) {
printHtmlPart(55)
if(true && (request.user == product.user)) {
printHtmlPart(56)
expressionOut.print(product.name)
printHtmlPart(57)
for( images in (product.image.take(4)) ) {
printHtmlPart(58)
for( image in (images) ) {
printHtmlPart(59)
expressionOut.print(createLink(controller:'user', action:'product_image', id:image.getId()))
printHtmlPart(60)
}
printHtmlPart(61)
}
printHtmlPart(62)
}
printHtmlPart(63)
}
printHtmlPart(64)
}
printHtmlPart(65)
}
printHtmlPart(66)
expressionOut.print(search)
printHtmlPart(67)
createTagBody(2, {->
printHtmlPart(68)
invokeTag('image','asset',317,['src':("ingles.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(69)
})
invokeTag('link','g',318,['controller':("index"),'action':("viewHome"),'params':([lang:'en'])],2)
printHtmlPart(69)
createTagBody(2, {->
printHtmlPart(68)
invokeTag('image','asset',321,['src':("espanol.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(69)
})
invokeTag('link','g',322,['controller':("index"),'action':("viewHome"),'params':([lang:'es'])],2)
printHtmlPart(70)
invokeTag('image','asset',327,['src':("facebook.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(71)
invokeTag('image','asset',329,['src':("twitter.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(72)
invokeTag('image','asset',331,['src':("github.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(73)
invokeTag('remoteFunction','g',347,['action':("submitMessage"),'controller':("chat"),'params':("\'message=\'+message+'///////////////'+myUser"),'update':("temp")],-1)
printHtmlPart(74)
invokeTag('remoteFunction','g',362,['action':("submitMessage"),'controller':("chat"),'params':("\'message=\'+message+'///////////////'+myUser"),'update':("temp")],-1)
printHtmlPart(75)
invokeTag('remoteFunction','g',371,['action':("retrieveLatestMessages"),'controller':("chat"),'update':("chatMessages")],-1)
printHtmlPart(76)
})
invokeTag('captureBody','sitemesh',379,[:],1)
printHtmlPart(77)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418058040000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 21, 21, 21, 22, 36, 36, 36, 37, 39, 39, 39, 39, 40, 40, 41, 41, 43, 44, 44, 44, 45, 45, 45, 45, 54, 54, 54, 54, 56, 56, 62, 62, 62, 66, 66, 66, 67, 67, 67, 67, 69, 69, 69, 70, 70, 70, 70, 75, 75, 80, 81, 81, 81, 84, 84, 84, 85, 85, 85, 85, 86, 88, 88, 88, 94, 94, 94, 95, 95, 95, 95, 97, 97, 101, 101, 101, 102, 102, 102, 102, 104, 104, 104, 105, 105, 105, 105, 126, 126, 134, 134, 142, 142, 142, 142, 144, 144, 144, 149, 149, 157, 157, 157, 157, 159, 159, 159, 163, 163, 163, 163, 165, 165, 165, 170, 170, 177, 177, 182, 182, 184, 184, 185, 185, 187, 187, 189, 189, 197, 197, 201, 201, 205, 205, 209, 209, 212, 213, 213, 213, 217, 217, 222, 223, 223, 223, 225, 225, 229, 230, 230, 230, 236, 236, 240, 241, 241, 241, 243, 244, 244, 244, 248, 248, 253, 253, 307, 307, 317, 317, 317, 318, 318, 318, 319, 321, 321, 321, 322, 322, 322, 322, 327, 327, 329, 329, 331, 331, 347, 347, 362, 362, 371, 371, 379, 379, 379, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "userRequest.gsp"
)
class ___LineNumberPlaceholder { }
