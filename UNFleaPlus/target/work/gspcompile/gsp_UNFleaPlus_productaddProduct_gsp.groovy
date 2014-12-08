import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_productaddProduct_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/addProduct.gsp" }
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
invokeTag('message','g',6,['code':("addProduct")],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("addProduct.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("dropzone.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("home.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',11,['src':("navbar.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("search.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',13,['src':("sticky-footer.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("addProduct.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("bootstrap-typeahead.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',17,['src':("dropzoneAddProduct.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',18,['src':("home.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',19,['src':("search.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',20,['src':("toogleMenu.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',22,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
if(true && (user.avatar)) {
printHtmlPart(4)
createTagBody(3, {->
printHtmlPart(5)
expressionOut.print(createLink(controller:'user', action:'avatar_image', id:user.ident()))
printHtmlPart(6)
})
invokeTag('link','g',41,['controller':("user"),'action':("viewHome"),'class':("font-menu")],3)
printHtmlPart(7)
}
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(4)
expressionOut.print(user.username)
printHtmlPart(7)
})
invokeTag('link','g',46,['controller':("user"),'action':("viewHome"),'class':("navbar-brand font-menu")],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('set','g',55,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(10)
expressionOut.print(search1)
printHtmlPart(11)
})
invokeTag('form','g',63,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('message','g',67,['code':("default.home.label")],-1)
printHtmlPart(14)
})
invokeTag('link','g',68,['controller':("index"),'action':("viewHome")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('message','g',70,['code':("myProducts")],-1)
printHtmlPart(14)
})
invokeTag('link','g',71,['controller':("user"),'action':("viewHome")],2)
printHtmlPart(16)
if(true && (requests)) {
printHtmlPart(17)
expressionOut.print(requests.size())
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (requests)) {
printHtmlPart(20)
for( request in (requests) ) {
printHtmlPart(21)
createTagBody(4, {->
printHtmlPart(22)
expressionOut.print(request)
printHtmlPart(23)
})
invokeTag('link','g',86,['controller':("user"),'action':("userRequest"),'params':([name:request])],4)
printHtmlPart(24)
}
printHtmlPart(25)
}
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('message','g',93,['code':("logout")],-1)
printHtmlPart(14)
})
invokeTag('link','g',94,['controller':("user"),'action':("logout")],2)
printHtmlPart(27)
invokeTag('message','g',96,['code':("more")],-1)
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('message','g',100,['code':("contactUs")],-1)
printHtmlPart(29)
})
invokeTag('link','g',101,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('message','g',103,['code':("aboutUs")],-1)
printHtmlPart(29)
})
invokeTag('link','g',104,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(31)
invokeTag('message','g',119,['code':("addProduct")],-1)
printHtmlPart(32)
invokeTag('message','g',127,['code':("homeMenu")],-1)
printHtmlPart(33)
createTagBody(2, {->
printHtmlPart(34)
invokeTag('message','g',135,['code':("profile")],-1)
printHtmlPart(35)
})
invokeTag('link','g',137,['controller':("user"),'action':("viewHome")],2)
printHtmlPart(36)
invokeTag('message','g',142,['code':("products")],-1)
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
invokeTag('message','g',150,['code':("addProduct")],-1)
printHtmlPart(39)
})
invokeTag('link','g',152,['controller':("product"),'action':("viewAddProduct")],2)
printHtmlPart(40)
createTagBody(2, {->
printHtmlPart(41)
invokeTag('message','g',156,['code':("deleteProduct")],-1)
printHtmlPart(39)
})
invokeTag('link','g',158,['controller':("product"),'action':("viewDeleteProduct")],2)
printHtmlPart(42)
invokeTag('set','g',169,['var':("name_input"),'value':(g.message(code: 'nameVar')),'scope':("page")],-1)
printHtmlPart(29)
invokeTag('set','g',171,['var':("description_input"),'value':(g.message(code: 'descriptionVar')),'scope':("page")],-1)
printHtmlPart(29)
invokeTag('set','g',173,['var':("state_input"),'value':(g.message(code: 'stateVar')),'scope':("page")],-1)
printHtmlPart(43)
invokeTag('message','g',178,['code':("nameVar")],-1)
printHtmlPart(44)
expressionOut.print(name_input)
printHtmlPart(45)
invokeTag('message','g',189,['code':("descriptionVar")],-1)
printHtmlPart(46)
expressionOut.print(description_input)
printHtmlPart(47)
invokeTag('message','g',201,['code':("stateVar")],-1)
printHtmlPart(48)
invokeTag('message','g',206,['code':("normalVar")],-1)
printHtmlPart(49)
invokeTag('message','g',210,['code':("auctionVar")],-1)
printHtmlPart(50)
invokeTag('message','g',214,['code':("donateVar")],-1)
printHtmlPart(51)
invokeTag('set','g',218,['var':("date_now"),'value':(dateNow = new Date())],-1)
printHtmlPart(52)
invokeTag('message','g',223,['code':("minimumCostVar")],-1)
printHtmlPart(53)
invokeTag('message','g',235,['code':("dateStartVar")],-1)
printHtmlPart(54)
invokeTag('datePicker','g',239,['name':("myDateStart"),'id':("myDateStart"),'value':(dateNow),'precision':("minute"),'years':(date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2)],-1)
printHtmlPart(55)
invokeTag('message','g',244,['code':("dateEndVar")],-1)
printHtmlPart(54)
invokeTag('datePicker','g',248,['name':("myDateEnd"),'id':("myDateEnd"),'value':(dateNow),'precision':("minute"),'years':(date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2)],-1)
printHtmlPart(56)
invokeTag('datePicker','g',270,['name':("dateStart"),'id':("dateStart"),'value':(dateNow),'precision':("minute"),'years':(date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2)],-1)
printHtmlPart(57)
invokeTag('datePicker','g',274,['name':("dateEnd"),'id':("dateEnd"),'value':(dateNow),'precision':("minute"),'years':(date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2)],-1)
printHtmlPart(58)
invokeTag('message','g',281,['code':("send")],-1)
printHtmlPart(59)
expressionOut.print(search)
printHtmlPart(60)
createTagBody(2, {->
printHtmlPart(61)
invokeTag('image','asset',308,['src':("ingles.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(62)
})
invokeTag('link','g',309,['controller':("index"),'action':("viewHome"),'params':([lang:'en'])],2)
printHtmlPart(62)
createTagBody(2, {->
printHtmlPart(61)
invokeTag('image','asset',312,['src':("espanol.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(62)
})
invokeTag('link','g',313,['controller':("index"),'action':("viewHome"),'params':([lang:'es'])],2)
printHtmlPart(63)
invokeTag('image','asset',318,['src':("facebook.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(64)
invokeTag('image','asset',320,['src':("twitter.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(65)
invokeTag('image','asset',322,['src':("github.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(66)
})
invokeTag('captureBody','sitemesh',330,[:],1)
printHtmlPart(67)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418055795000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 22, 22, 22, 23, 37, 37, 37, 38, 40, 40, 40, 40, 41, 41, 42, 42, 44, 45, 45, 45, 46, 46, 46, 46, 55, 55, 55, 55, 57, 57, 63, 63, 63, 67, 67, 67, 68, 68, 68, 68, 70, 70, 70, 71, 71, 71, 71, 74, 74, 76, 76, 78, 78, 81, 82, 82, 82, 85, 85, 85, 86, 86, 86, 86, 87, 89, 89, 89, 93, 93, 93, 94, 94, 94, 94, 96, 96, 100, 100, 100, 101, 101, 101, 101, 103, 103, 103, 104, 104, 104, 104, 119, 119, 127, 127, 135, 135, 135, 135, 137, 137, 137, 142, 142, 150, 150, 150, 150, 152, 152, 152, 156, 156, 156, 156, 158, 158, 158, 169, 171, 171, 173, 173, 173, 178, 178, 181, 181, 189, 189, 193, 193, 201, 201, 206, 206, 210, 210, 214, 214, 218, 218, 223, 223, 235, 235, 239, 239, 244, 244, 248, 248, 270, 270, 274, 274, 281, 281, 300, 300, 308, 308, 308, 309, 309, 309, 310, 312, 312, 312, 313, 313, 313, 313, 318, 318, 320, 320, 322, 322, 330, 330, 330, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "addProduct.gsp"
)
class ___LineNumberPlaceholder { }
