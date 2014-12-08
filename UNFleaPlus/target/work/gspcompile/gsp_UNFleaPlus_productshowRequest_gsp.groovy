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
invokeTag('stylesheet','asset',11,['src':("navbar.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("sticky-footer.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',13,['src':("search.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("modal.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',15,['src':("search.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("jquery.elevatezoom.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',17,['src':("request.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',18,['src':("lightbox.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',19,['src':("lightbox.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',20,['src':("thumbelina.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',21,['src':("thumbelina.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',22,['src':("showRequest.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',23,['src':("home.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',26,[:],1)
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
invokeTag('link','g',48,['controller':("user"),'action':("viewHome"),'class':("font-menu")],4)
printHtmlPart(6)
}
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
expressionOut.print(user.username)
printHtmlPart(11)
})
invokeTag('link','g',54,['controller':("user"),'action':("viewHome"),'class':("navbar-brand font-menu")],3)
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(13)
invokeTag('set','g',63,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(14)
expressionOut.print(search1)
printHtmlPart(15)
})
invokeTag('form','g',72,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],3)
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',76,['code':("default.home.label")],-1)
printHtmlPart(18)
})
invokeTag('link','g',77,['controller':("index"),'action':("viewHome")],3)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',79,['code':("myProducts")],-1)
printHtmlPart(18)
})
invokeTag('link','g',80,['controller':("user"),'action':("viewHome")],3)
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
invokeTag('link','g',95,['controller':("user"),'action':("userRequest"),'params':([name:request])],5)
printHtmlPart(28)
}
printHtmlPart(29)
}
printHtmlPart(30)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',102,['code':("logout")],-1)
printHtmlPart(18)
})
invokeTag('link','g',103,['controller':("user"),'action':("logout")],3)
printHtmlPart(31)
invokeTag('message','g',105,['code':("more")],-1)
printHtmlPart(32)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',109,['code':("contactUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',110,['controller':("index"),'action':("viewContactUs")],3)
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',112,['code':("aboutUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',113,['controller':("index"),'action':("viewAboutUs")],3)
printHtmlPart(35)
}
else {
printHtmlPart(36)
invokeTag('link','g',135,['controller':("index"),'action':("viewHome")],-1)
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(38)
invokeTag('set','g',143,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(39)
expressionOut.print(search1)
printHtmlPart(40)
})
invokeTag('form','g',153,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],3)
printHtmlPart(41)
createTagBody(3, {->
printHtmlPart(24)
invokeTag('message','g',157,['code':("signUP")],-1)
printHtmlPart(42)
})
invokeTag('link','g',158,['controller':("user"),'action':("viewRegister")],3)
printHtmlPart(43)
invokeTag('message','g',160,['code':("howUse")],-1)
printHtmlPart(44)
invokeTag('message','g',164,['code':("login")],-1)
printHtmlPart(45)
invokeTag('set','g',167,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(24)
invokeTag('set','g',169,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(46)
createTagBody(3, {->
printHtmlPart(47)
expressionOut.print(foo)
printHtmlPart(48)
expressionOut.print(foo1)
printHtmlPart(49)
invokeTag('message','g',188,['code':("rememberMe")],-1)
printHtmlPart(50)
invokeTag('message','g',194,['code':("login")],-1)
printHtmlPart(51)
})
invokeTag('form','g',197,['role':("form"),'controller':("user"),'action':("login"),'method':("post")],3)
printHtmlPart(52)
invokeTag('message','g',200,['code':("more")],-1)
printHtmlPart(32)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',204,['code':("contactUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',205,['controller':("index"),'action':("viewContactUs")],3)
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(27)
invokeTag('message','g',207,['code':("aboutUs")],-1)
printHtmlPart(33)
})
invokeTag('link','g',208,['controller':("index"),'action':("viewAboutUs")],3)
printHtmlPart(53)
}
printHtmlPart(54)
expressionOut.print(product.name)
printHtmlPart(6)
if(true && (product.type == 'NORMAL')) {
printHtmlPart(55)
invokeTag('message','g',230,['code':("normalVar")],-1)
printHtmlPart(56)
}
else {
printHtmlPart(11)
if(true && (product.type == 'AUCTION')) {
printHtmlPart(57)
invokeTag('message','g',235,['code':("auctionVar")],-1)
printHtmlPart(58)
}
else {
printHtmlPart(59)
invokeTag('message','g',239,['code':("donateVar")],-1)
printHtmlPart(58)
}
printHtmlPart(6)
}
printHtmlPart(60)
if(true && (product.image)) {
printHtmlPart(61)
expressionOut.print(createLink(controller:'product', action:'large_image', id:product.image[0].getId()))
printHtmlPart(62)
expressionOut.print(createLink(controller:'product', action:'normal_image', id:product.image[0].getId()))
printHtmlPart(63)
expressionOut.print(createLink(controller:'product', action:'large_image', id:product.image[0].getId()))
printHtmlPart(64)
}
printHtmlPart(65)
for( images in (product.image) ) {
printHtmlPart(42)
for( image in (images) ) {
printHtmlPart(66)
if(true && (product.image[0].getId()==images.getId())) {
printHtmlPart(67)
expressionOut.print(createLink(controller:'product', action:'large_image', id:image.getId()))
printHtmlPart(68)
expressionOut.print(createLink(controller:'product', action:'normal_image', id:image.getId()))
printHtmlPart(69)
expressionOut.print(createLink(controller:'product', action:'large_image', id:image.getId()))
printHtmlPart(70)
expressionOut.print(createLink(controller:'product', action:'small_image', id:image.getId()))
printHtmlPart(71)
}
else {
printHtmlPart(67)
expressionOut.print(createLink(controller:'product', action:'large_image', id:image.getId()))
printHtmlPart(72)
expressionOut.print(createLink(controller:'product', action:'normal_image', id:image.getId()))
printHtmlPart(69)
expressionOut.print(createLink(controller:'product', action:'large_image', id:image.getId()))
printHtmlPart(70)
expressionOut.print(createLink(controller:'product', action:'small_image', id:image.getId()))
printHtmlPart(71)
}
printHtmlPart(73)
}
printHtmlPart(74)
}
printHtmlPart(75)
invokeTag('message','g',303,['code':("descriptionVar")],-1)
printHtmlPart(76)
expressionOut.print(product.description)
printHtmlPart(6)
if(true && (product.type == 'AUCTION')) {
printHtmlPart(77)
invokeTag('message','g',308,['code':("dateStartVar")],-1)
printHtmlPart(78)
expressionOut.print(product.openingDate)
printHtmlPart(77)
invokeTag('message','g',312,['code':("dateEndVar")],-1)
printHtmlPart(78)
expressionOut.print(product.closingDate)
printHtmlPart(77)
invokeTag('message','g',316,['code':("curPriceVar")],-1)
printHtmlPart(78)
expressionOut.print(product.currentPrice)
printHtmlPart(79)
}
else if(true && (product.type == 'DONATE')) {
printHtmlPart(77)
invokeTag('message','g',323,['code':("dateStartVar")],-1)
printHtmlPart(78)
expressionOut.print(product.openingDate)
printHtmlPart(77)
invokeTag('message','g',327,['code':("dateEndVar")],-1)
printHtmlPart(78)
expressionOut.print(product.closingDate)
printHtmlPart(6)
}
printHtmlPart(80)
if(true && ((session.user && !myProducts.find {it.getId() == product.getId()}))) {
printHtmlPart(81)
if(true && (product.type == 'NORMAL')) {
printHtmlPart(82)
invokeTag('message','g',347,['code':("request")],-1)
printHtmlPart(83)
}
else if(true && (product.type == 'AUCTION')) {
printHtmlPart(84)
invokeTag('message','g',353,['code':("request")],-1)
printHtmlPart(83)
}
else {
printHtmlPart(85)
invokeTag('message','g',359,['code':("request")],-1)
printHtmlPart(83)
}
printHtmlPart(86)
}
else if(true && (session.user && myProducts.find {it.getId() == product.getId()})) {
printHtmlPart(87)
invokeTag('message','g',369,['code':("request")],-1)
printHtmlPart(88)
}
else if(true && (session.user==null)) {
printHtmlPart(89)
invokeTag('message','g',376,['code':("request")],-1)
printHtmlPart(88)
}
printHtmlPart(90)
invokeTag('message','g',389,['code':("sendRequestVar")],-1)
printHtmlPart(91)
invokeTag('message','g',394,['code':("sendRequestMessagevar")],-1)
printHtmlPart(92)
createTagBody(2, {->
printHtmlPart(93)
expressionOut.print(product.getId())
printHtmlPart(94)
expressionOut.print(product.user.username)
printHtmlPart(95)
invokeTag('message','g',407,['code':("sendRequestMoneyVar")],-1)
printHtmlPart(96)
invokeTag('message','g',420,['code':("sendRequestProductsVar")],-1)
printHtmlPart(97)
for( product in (myProducts) ) {
printHtmlPart(24)
if(true && (product.type == 'NORMAL')) {
printHtmlPart(98)
expressionOut.print(product.getId())
printHtmlPart(99)
expressionOut.print(createLink(controller:'user', action:'product_image', id:product.image[0].getId()))
printHtmlPart(100)
}
printHtmlPart(42)
}
printHtmlPart(101)
})
invokeTag('form','g',440,['id':("formNormalSendRequest"),'url':([action:'sendNormalRequest',controller:'product']),'method':("post")],2)
printHtmlPart(102)
invokeTag('message','g',449,['code':("cancelVar")],-1)
printHtmlPart(103)
invokeTag('message','g',453,['code':("send")],-1)
printHtmlPart(104)
invokeTag('message','g',471,['code':("sendRequestVar")],-1)
printHtmlPart(91)
invokeTag('message','g',476,['code':("sendRequestMessagevar")],-1)
printHtmlPart(92)
createTagBody(2, {->
printHtmlPart(93)
expressionOut.print(product.getId())
printHtmlPart(94)
expressionOut.print(product.user.username)
printHtmlPart(105)
expressionOut.print(product.currentPrice + 0.1)
printHtmlPart(106)
expressionOut.print(product.currentPrice + 0.1)
printHtmlPart(107)
})
invokeTag('form','g',497,['id':("formAuctionSendRequest"),'url':([action:'sendAuctionRequest',controller:'product']),'method':("post")],2)
printHtmlPart(108)
invokeTag('message','g',502,['code':("cancelVar")],-1)
printHtmlPart(109)
invokeTag('message','g',506,['code':("send")],-1)
printHtmlPart(110)
invokeTag('message','g',522,['code':("login")],-1)
printHtmlPart(111)
createTagBody(2, {->
printHtmlPart(112)
invokeTag('message','g',530,['code':("loginVar")],-1)
printHtmlPart(113)
expressionOut.print(foo)
printHtmlPart(114)
expressionOut.print(foo1)
printHtmlPart(115)
invokeTag('message','g',538,['code':("rememberMe")],-1)
printHtmlPart(42)
createTagBody(3, {->
printHtmlPart(116)
invokeTag('message','g',540,['code':("register")],-1)
printHtmlPart(117)
})
invokeTag('link','g',541,['controller':("user"),'action':("viewRegister")],3)
printHtmlPart(118)
})
invokeTag('form','g',543,['url':([action:'loginSearch',controller:'user']),'id':("formLogin"),'class':("form-signin"),'role':("form")],2)
printHtmlPart(119)
invokeTag('message','g',549,['code':("login")],-1)
printHtmlPart(120)
invokeTag('message','g',565,['code':("sameRequestVar")],-1)
printHtmlPart(121)
invokeTag('message','g',569,['code':("sameRequestMessageVar")],-1)
printHtmlPart(122)
invokeTag('message','g',590,['code':("sendRequestVar")],-1)
printHtmlPart(121)
createTagBody(2, {->
printHtmlPart(93)
expressionOut.print(product.getId())
printHtmlPart(123)
expressionOut.print(product.user.username)
printHtmlPart(124)
})
invokeTag('form','g',602,['id':("formDonateSendRequest"),'url':([action:'sendDonateRequest',controller:'product']),'method':("post")],2)
printHtmlPart(108)
invokeTag('message','g',607,['code':("cancelVar")],-1)
printHtmlPart(125)
invokeTag('message','g',611,['code':("send")],-1)
printHtmlPart(126)
invokeTag('message','g',630,['code':("tutorial")],-1)
printHtmlPart(127)
createTagBody(2, {->
printHtmlPart(128)
invokeTag('image','asset',645,['src':("ingles.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(129)
})
invokeTag('link','g',646,['controller':("index"),'action':("viewHome"),'params':([lang:'en'])],2)
printHtmlPart(129)
createTagBody(2, {->
printHtmlPart(128)
invokeTag('image','asset',649,['src':("espanol.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(129)
})
invokeTag('link','g',650,['controller':("index"),'action':("viewHome"),'params':([lang:'es'])],2)
printHtmlPart(130)
invokeTag('image','asset',655,['src':("facebook.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(131)
invokeTag('image','asset',657,['src':("twitter.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(132)
invokeTag('image','asset',659,['src':("github.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(133)
})
invokeTag('captureBody','sitemesh',667,[:],1)
printHtmlPart(134)
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
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23, 26, 26, 26, 28, 31, 31, 31, 31, 44, 45, 47, 47, 47, 47, 48, 48, 49, 49, 52, 53, 53, 53, 54, 54, 54, 54, 63, 63, 63, 63, 65, 65, 72, 72, 72, 76, 76, 76, 77, 77, 77, 77, 79, 79, 79, 80, 80, 80, 80, 83, 83, 85, 85, 87, 87, 90, 91, 91, 91, 94, 94, 94, 95, 95, 95, 95, 96, 98, 98, 98, 102, 102, 102, 103, 103, 103, 103, 105, 105, 109, 109, 109, 110, 110, 110, 110, 112, 112, 112, 113, 113, 113, 113, 119, 120, 120, 135, 135, 143, 143, 143, 143, 145, 145, 153, 153, 153, 157, 157, 157, 158, 158, 158, 158, 160, 160, 164, 164, 167, 169, 169, 172, 176, 176, 176, 176, 182, 182, 188, 188, 194, 194, 197, 197, 197, 200, 200, 204, 204, 204, 205, 205, 205, 205, 207, 207, 207, 208, 208, 208, 208, 219, 219, 227, 228, 228, 228, 230, 230, 231, 232, 233, 233, 233, 235, 235, 236, 237, 237, 239, 239, 240, 241, 241, 241, 247, 247, 249, 249, 252, 252, 253, 253, 255, 255, 263, 264, 264, 264, 269, 269, 271, 271, 272, 272, 273, 273, 275, 275, 277, 278, 278, 280, 280, 282, 282, 283, 283, 285, 285, 287, 291, 291, 293, 293, 293, 303, 303, 305, 306, 306, 306, 308, 308, 310, 310, 312, 312, 314, 314, 316, 316, 318, 320, 320, 321, 321, 323, 323, 325, 325, 327, 327, 329, 330, 330, 330, 340, 340, 344, 344, 347, 347, 349, 350, 350, 353, 353, 355, 356, 356, 359, 359, 361, 361, 365, 367, 367, 369, 369, 371, 372, 372, 376, 376, 378, 378, 389, 389, 394, 394, 400, 400, 400, 400, 402, 402, 407, 407, 420, 420, 424, 425, 425, 425, 428, 428, 430, 430, 433, 434, 434, 434, 440, 440, 440, 449, 449, 453, 453, 471, 471, 476, 476, 482, 482, 482, 482, 484, 484, 491, 491, 492, 492, 497, 497, 497, 502, 502, 506, 506, 522, 522, 530, 530, 530, 530, 533, 533, 535, 535, 538, 539, 540, 540, 540, 540, 541, 541, 541, 543, 543, 543, 549, 549, 565, 565, 569, 569, 590, 590, 598, 598, 598, 598, 600, 600, 602, 602, 602, 607, 607, 611, 611, 630, 630, 645, 645, 645, 646, 646, 646, 647, 649, 649, 649, 650, 650, 650, 650, 655, 655, 657, 657, 659, 659, 667, 667, 667, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "showRequest.gsp"
)
class ___LineNumberPlaceholder { }
