import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_productshowRequest_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/showRequest.gsp" }
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
invokeTag('message','g',6,['code':("updateProduct")],-1)
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
invokeTag('stylesheet','asset',10,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',11,['src':("search.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',12,['src':("modal.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',13,['src':("search.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("jquery.elevatezoom.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("request.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("lightbox.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',17,['src':("lightbox.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',18,['src':("thumbelina.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',19,['src':("thumbelina.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',20,['src':("showRequest.css")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',23,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('link','g',39,['controller':("index"),'action':("viewHome")],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('set','g',47,['var':("search1"),'value':(g.message(code:'myProducts')),'scope':("page")],-1)
printHtmlPart(7)
expressionOut.print(search1)
printHtmlPart(8)
invokeTag('message','g',52,['code':("searchText")],-1)
printHtmlPart(9)
})
invokeTag('form','g',56,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('message','g',60,['code':("signUP")],-1)
printHtmlPart(12)
})
invokeTag('link','g',61,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(13)
invokeTag('message','g',63,['code':("howUse")],-1)
printHtmlPart(14)
invokeTag('message','g',66,['code':("login")],-1)
printHtmlPart(15)
invokeTag('set','g',69,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(11)
invokeTag('set','g',71,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(17)
expressionOut.print(foo)
printHtmlPart(18)
expressionOut.print(foo1)
printHtmlPart(19)
invokeTag('message','g',91,['code':("rememberMe")],-1)
printHtmlPart(20)
invokeTag('message','g',95,['code':("login")],-1)
printHtmlPart(21)
})
invokeTag('form','g',98,['role':("form"),'controller':("user"),'action':("login"),'method':("post")],2)
printHtmlPart(22)
invokeTag('message','g',105,['code':("more")],-1)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('message','g',109,['code':("contactUs")],-1)
printHtmlPart(25)
})
invokeTag('link','g',110,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('message','g',112,['code':("aboutUs")],-1)
printHtmlPart(25)
})
invokeTag('link','g',113,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(27)
expressionOut.print(product.name)
printHtmlPart(28)
if(true && (product.type == 'NORMAL')) {
printHtmlPart(29)
invokeTag('message','g',133,['code':("normalVar")],-1)
printHtmlPart(30)
}
else {
printHtmlPart(31)
if(true && (product.type == 'AUCTION')) {
printHtmlPart(32)
invokeTag('message','g',138,['code':("auctionVar")],-1)
printHtmlPart(33)
}
else {
printHtmlPart(34)
invokeTag('message','g',142,['code':("donateVar")],-1)
printHtmlPart(33)
}
printHtmlPart(28)
}
printHtmlPart(35)
if(true && (product.image)) {
printHtmlPart(36)
expressionOut.print(createLink(controller:'product', action:'large_image', id:product.image[0].getId()))
printHtmlPart(37)
expressionOut.print(createLink(controller:'product', action:'normal_image', id:product.image[0].getId()))
printHtmlPart(38)
expressionOut.print(createLink(controller:'product', action:'large_image', id:product.image[0].getId()))
printHtmlPart(39)
}
printHtmlPart(40)
for( images in (product.image) ) {
printHtmlPart(25)
for( image in (images) ) {
printHtmlPart(41)
if(true && (product.image[0].getId()==images.getId())) {
printHtmlPart(42)
expressionOut.print(createLink(controller:'product', action:'large_image', id:image.getId()))
printHtmlPart(43)
expressionOut.print(createLink(controller:'product', action:'normal_image', id:image.getId()))
printHtmlPart(44)
expressionOut.print(createLink(controller:'product', action:'large_image', id:image.getId()))
printHtmlPart(45)
expressionOut.print(createLink(controller:'product', action:'small_image', id:image.getId()))
printHtmlPart(46)
}
else {
printHtmlPart(42)
expressionOut.print(createLink(controller:'product', action:'large_image', id:image.getId()))
printHtmlPart(47)
expressionOut.print(createLink(controller:'product', action:'normal_image', id:image.getId()))
printHtmlPart(44)
expressionOut.print(createLink(controller:'product', action:'large_image', id:image.getId()))
printHtmlPart(45)
expressionOut.print(createLink(controller:'product', action:'small_image', id:image.getId()))
printHtmlPart(46)
}
printHtmlPart(48)
}
printHtmlPart(16)
}
printHtmlPart(49)
invokeTag('message','g',206,['code':("descriptionVar")],-1)
printHtmlPart(50)
expressionOut.print(product.description)
printHtmlPart(28)
if(true && (product.type == 'AUCTION')) {
printHtmlPart(51)
invokeTag('message','g',211,['code':("dateStartVar")],-1)
printHtmlPart(52)
expressionOut.print(product.openingDate)
printHtmlPart(51)
invokeTag('message','g',215,['code':("dateEndVar")],-1)
printHtmlPart(52)
expressionOut.print(product.closingDate)
printHtmlPart(51)
invokeTag('message','g',219,['code':("curPriceVar")],-1)
printHtmlPart(52)
expressionOut.print(product.currentPrice)
printHtmlPart(53)
}
else if(true && (product.type == 'DONATE')) {
printHtmlPart(51)
invokeTag('message','g',226,['code':("dateStartVar")],-1)
printHtmlPart(52)
expressionOut.print(product.openingDate)
printHtmlPart(51)
invokeTag('message','g',230,['code':("dateEndVar")],-1)
printHtmlPart(52)
expressionOut.print(product.closingDate)
printHtmlPart(28)
}
printHtmlPart(54)
if(true && ((session.user && !myProducts.find {it.getId() == product.getId()}))) {
printHtmlPart(55)
if(true && (product.type == 'NORMAL')) {
printHtmlPart(56)
invokeTag('message','g',249,['code':("request")],-1)
printHtmlPart(57)
}
else if(true && (product.type == 'AUCTION')) {
printHtmlPart(58)
invokeTag('message','g',255,['code':("request")],-1)
printHtmlPart(57)
}
else {
printHtmlPart(59)
invokeTag('message','g',261,['code':("request")],-1)
printHtmlPart(57)
}
printHtmlPart(60)
}
else if(true && (session.user && myProducts.find {it.getId() == product.getId()})) {
printHtmlPart(61)
invokeTag('message','g',271,['code':("request")],-1)
printHtmlPart(62)
}
else if(true && (session.user==null)) {
printHtmlPart(63)
invokeTag('message','g',278,['code':("request")],-1)
printHtmlPart(62)
}
printHtmlPart(64)
invokeTag('message','g',291,['code':("sendRequestVar")],-1)
printHtmlPart(65)
invokeTag('message','g',296,['code':("sendRequestMessagevar")],-1)
printHtmlPart(66)
createTagBody(2, {->
printHtmlPart(67)
expressionOut.print(product.getId())
printHtmlPart(68)
expressionOut.print(product.user.username)
printHtmlPart(69)
invokeTag('message','g',309,['code':("sendRequestMoneyVar")],-1)
printHtmlPart(70)
invokeTag('message','g',322,['code':("sendRequestProductsVar")],-1)
printHtmlPart(71)
for( product in (myProducts) ) {
printHtmlPart(72)
if(true && (product.type == 'NORMAL')) {
printHtmlPart(73)
expressionOut.print(product.getId())
printHtmlPart(74)
expressionOut.print(createLink(controller:'user', action:'product_image', id:product.image[0].getId()))
printHtmlPart(75)
}
printHtmlPart(76)
}
printHtmlPart(77)
})
invokeTag('form','g',342,['id':("formNormalSendRequest"),'url':([action:'sendNormalRequest',controller:'product']),'method':("post")],2)
printHtmlPart(78)
invokeTag('message','g',351,['code':("cancelVar")],-1)
printHtmlPart(79)
invokeTag('message','g',355,['code':("send")],-1)
printHtmlPart(80)
invokeTag('message','g',373,['code':("sendRequestVar")],-1)
printHtmlPart(65)
invokeTag('message','g',378,['code':("sendRequestMessagevar")],-1)
printHtmlPart(66)
createTagBody(2, {->
printHtmlPart(67)
expressionOut.print(product.getId())
printHtmlPart(68)
expressionOut.print(product.user.username)
printHtmlPart(81)
expressionOut.print(product.currentPrice + 0.1)
printHtmlPart(82)
expressionOut.print(product.currentPrice + 0.1)
printHtmlPart(83)
})
invokeTag('form','g',399,['id':("formAuctionSendRequest"),'url':([action:'sendAuctionRequest',controller:'product']),'method':("post")],2)
printHtmlPart(84)
invokeTag('message','g',404,['code':("cancelVar")],-1)
printHtmlPart(85)
invokeTag('message','g',408,['code':("send")],-1)
printHtmlPart(86)
invokeTag('message','g',424,['code':("login")],-1)
printHtmlPart(87)
createTagBody(2, {->
printHtmlPart(88)
invokeTag('message','g',430,['code':("loginVar")],-1)
printHtmlPart(89)
expressionOut.print(foo)
printHtmlPart(90)
expressionOut.print(foo1)
printHtmlPart(91)
invokeTag('message','g',434,['code':("rememberMe")],-1)
printHtmlPart(25)
createTagBody(3, {->
printHtmlPart(92)
invokeTag('message','g',435,['code':("register")],-1)
printHtmlPart(93)
})
invokeTag('link','g',436,['controller':("user"),'action':("viewRegister")],3)
printHtmlPart(94)
})
invokeTag('form','g',438,['url':([action:'loginSearch',controller:'user']),'id':("formLogin"),'class':("form-signin"),'role':("form")],2)
printHtmlPart(95)
invokeTag('message','g',442,['code':("login")],-1)
printHtmlPart(96)
invokeTag('message','g',457,['code':("sameRequestVar")],-1)
printHtmlPart(97)
invokeTag('message','g',461,['code':("sameRequestMessageVar")],-1)
printHtmlPart(98)
invokeTag('message','g',483,['code':("sendRequestVar")],-1)
printHtmlPart(97)
createTagBody(2, {->
printHtmlPart(67)
expressionOut.print(product.getId())
printHtmlPart(99)
expressionOut.print(product.user.username)
printHtmlPart(100)
})
invokeTag('form','g',495,['id':("formDonateSendRequest"),'url':([action:'sendDonateRequest',controller:'product']),'method':("post")],2)
printHtmlPart(84)
invokeTag('message','g',500,['code':("cancelVar")],-1)
printHtmlPart(101)
invokeTag('message','g',504,['code':("send")],-1)
printHtmlPart(102)
createTagBody(2, {->
printHtmlPart(31)
invokeTag('image','asset',521,['src':("USA.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(28)
})
invokeTag('link','g',522,['controller':("product"),'action':("viewRequest"),'params':([lang:'en'])],2)
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(31)
invokeTag('image','asset',525,['src':("espana.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(28)
})
invokeTag('link','g',526,['controller':("product"),'action':("viewRequest"),'params':([lang:'es'])],2)
printHtmlPart(103)
invokeTag('message','g',544,['code':("tutorial")],-1)
printHtmlPart(104)
})
invokeTag('captureBody','sitemesh',553,[:],1)
printHtmlPart(105)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416895729000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 23, 23, 23, 25, 39, 39, 39, 39, 47, 47, 47, 47, 49, 49, 52, 52, 56, 56, 56, 60, 60, 60, 61, 61, 61, 61, 63, 63, 66, 66, 69, 71, 71, 74, 78, 78, 78, 78, 85, 85, 91, 91, 95, 95, 98, 98, 98, 105, 105, 109, 109, 109, 110, 110, 110, 110, 112, 112, 112, 113, 113, 113, 113, 130, 131, 131, 131, 133, 133, 134, 135, 136, 136, 136, 138, 138, 139, 140, 140, 142, 142, 143, 144, 144, 144, 150, 150, 152, 152, 155, 155, 156, 156, 158, 158, 166, 167, 167, 167, 172, 172, 174, 174, 175, 175, 176, 176, 178, 178, 180, 181, 181, 183, 183, 185, 185, 186, 186, 188, 188, 190, 194, 194, 196, 196, 196, 206, 206, 208, 209, 209, 209, 211, 211, 213, 213, 215, 215, 217, 217, 219, 219, 221, 223, 223, 224, 224, 226, 226, 228, 228, 230, 230, 232, 233, 233, 233, 242, 242, 246, 246, 249, 249, 251, 252, 252, 255, 255, 257, 258, 258, 261, 261, 263, 263, 267, 268, 268, 271, 271, 273, 274, 274, 278, 278, 280, 280, 291, 291, 296, 296, 302, 302, 302, 302, 304, 304, 309, 309, 322, 322, 327, 328, 328, 328, 331, 331, 332, 332, 335, 336, 336, 336, 342, 342, 342, 351, 351, 355, 355, 373, 373, 378, 378, 384, 384, 384, 384, 386, 386, 393, 393, 394, 394, 399, 399, 399, 404, 404, 408, 408, 424, 424, 430, 430, 430, 430, 431, 431, 432, 432, 434, 435, 435, 435, 435, 435, 436, 436, 436, 438, 438, 438, 442, 442, 457, 457, 461, 461, 483, 483, 491, 491, 491, 491, 493, 493, 495, 495, 495, 500, 500, 504, 504, 521, 521, 521, 522, 522, 522, 523, 525, 525, 525, 526, 526, 526, 526, 544, 544, 553, 553, 553, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "showRequest.gsp"
)
class ___LineNumberPlaceholder { }
