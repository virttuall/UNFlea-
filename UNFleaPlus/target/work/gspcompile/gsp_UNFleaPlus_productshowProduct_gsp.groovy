import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_productshowProduct_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/showProduct.gsp" }
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
invokeTag('stylesheet','asset',8,['src':("navbar.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("search.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',11,['src':("slider.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("sticky-footer.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',13,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("bootstrap-slider.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("bootstrap-typeahead.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("toogleMenu.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',17,['src':("CountryState.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',18,['src':("search.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',19,['src':("slider.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',21,['src':("home.js")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',27,[:],1)
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
expressionOut.print(country)
printHtmlPart(55)
expressionOut.print(state)
printHtmlPart(56)
invokeTag('message','g',235,['code':("filterMenu")],-1)
printHtmlPart(57)
invokeTag('message','g',243,['code':("filter")],-1)
printHtmlPart(58)
invokeTag('message','g',246,['code':("aboutFilter")],-1)
printHtmlPart(59)
createTagBody(2, {->
printHtmlPart(60)
invokeTag('message','g',255,['code':("order")],-1)
printHtmlPart(61)
if(true && (nameOrder)) {
printHtmlPart(62)
invokeTag('message','g',260,['code':("nameVar")],-1)
printHtmlPart(63)
}
else {
printHtmlPart(64)
invokeTag('message','g',266,['code':("nameVar")],-1)
printHtmlPart(63)
}
printHtmlPart(18)
if(true && (usernameOrder)) {
printHtmlPart(65)
invokeTag('message','g',272,['code':("usernameVar")],-1)
printHtmlPart(63)
}
else {
printHtmlPart(66)
invokeTag('message','g',278,['code':("usernameVar")],-1)
printHtmlPart(63)
}
printHtmlPart(18)
if(true && (countryOrder)) {
printHtmlPart(67)
invokeTag('message','g',284,['code':("country")],-1)
printHtmlPart(63)
}
else {
printHtmlPart(68)
invokeTag('message','g',290,['code':("country")],-1)
printHtmlPart(63)
}
printHtmlPart(18)
if(true && (cityOrder)) {
printHtmlPart(69)
invokeTag('message','g',296,['code':("state")],-1)
printHtmlPart(63)
}
else {
printHtmlPart(70)
invokeTag('message','g',302,['code':("state")],-1)
printHtmlPart(63)
}
printHtmlPart(18)
if(true && (priceOrder)) {
printHtmlPart(71)
invokeTag('message','g',308,['code':("price")],-1)
printHtmlPart(18)
}
else {
printHtmlPart(72)
invokeTag('message','g',313,['code':("price")],-1)
printHtmlPart(73)
}
printHtmlPart(74)
invokeTag('message','g',320,['code':("type")],-1)
printHtmlPart(75)
if(true && (normal)) {
printHtmlPart(76)
invokeTag('message','g',326,['code':("sale")],-1)
printHtmlPart(77)
}
else {
printHtmlPart(78)
invokeTag('message','g',332,['code':("sale")],-1)
printHtmlPart(77)
}
printHtmlPart(17)
if(true && (subasta)) {
printHtmlPart(79)
invokeTag('message','g',338,['code':("auctionVar")],-1)
printHtmlPart(77)
}
else {
printHtmlPart(80)
invokeTag('message','g',344,['code':("auctionVar")],-1)
printHtmlPart(77)
}
printHtmlPart(17)
if(true && (donacion)) {
printHtmlPart(81)
invokeTag('message','g',350,['code':("donateVar")],-1)
printHtmlPart(17)
}
else {
printHtmlPart(82)
invokeTag('message','g',355,['code':("donateVar")],-1)
printHtmlPart(17)
}
printHtmlPart(83)
invokeTag('message','g',362,['code':("price")],-1)
printHtmlPart(75)
if(true && (priceMin)) {
printHtmlPart(42)
if(true && (priceMax)) {
printHtmlPart(24)
invokeTag('message','g',367,['code':("interval")],-1)
printHtmlPart(84)
expressionOut.print(priceMin)
printHtmlPart(85)
expressionOut.print(priceMax)
printHtmlPart(86)
}
printHtmlPart(17)
}
else {
printHtmlPart(42)
invokeTag('message','g',379,['code':("interval")],-1)
printHtmlPart(87)
}
printHtmlPart(88)
invokeTag('message','g',392,['code':("country")],-1)
printHtmlPart(89)
invokeTag('message','g',402,['code':("state")],-1)
printHtmlPart(90)
})
invokeTag('form','g',417,['controller':("product"),'action':("searchProduct"),'name':("filtros"),'method':("get")],2)
printHtmlPart(91)
for( product in (products) ) {
printHtmlPart(92)
if(true && (product.image)) {
printHtmlPart(93)
expressionOut.print(createLink(controller:'user', action:'product_image', id:product.image[0].getId()))
printHtmlPart(94)
}
printHtmlPart(95)
expressionOut.print(product.user.username)
printHtmlPart(96)
expressionOut.print(product.user.userCountry)
printHtmlPart(96)
expressionOut.print(product.user.userCity)
printHtmlPart(96)
expressionOut.print(product.name)
printHtmlPart(96)
expressionOut.print(product.type)
printHtmlPart(97)
createTagBody(3, {->
printHtmlPart(98)
expressionOut.print(product.getId())
printHtmlPart(99)
invokeTag('message','g',449,['code':("details")],-1)
printHtmlPart(100)
})
invokeTag('form','g',452,['controller':("product"),'action':("viewRequest")],3)
printHtmlPart(101)
}
printHtmlPart(102)
if(true && (totalProduct<10)) {
printHtmlPart(103)
invokeTag('paginate','g',465,['controller':("product"),'action':("searchProduct"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(104)
}
else {
printHtmlPart(105)
invokeTag('paginate','g',475,['controller':("product"),'action':("searchProduct"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(104)
}
printHtmlPart(106)
expressionOut.print(search)
printHtmlPart(107)
invokeTag('message','g',499,['code':("tutorial")],-1)
printHtmlPart(108)
createTagBody(2, {->
printHtmlPart(109)
invokeTag('image','asset',514,['src':("ingles.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(110)
})
invokeTag('link','g',515,['controller':("index"),'action':("viewHome"),'params':([lang:'en'])],2)
printHtmlPart(110)
createTagBody(2, {->
printHtmlPart(109)
invokeTag('image','asset',518,['src':("espanol.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(110)
})
invokeTag('link','g',519,['controller':("index"),'action':("viewHome"),'params':([lang:'es'])],2)
printHtmlPart(111)
invokeTag('image','asset',524,['src':("facebook.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(112)
invokeTag('image','asset',526,['src':("twitter.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(113)
invokeTag('image','asset',528,['src':("github.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(114)
})
invokeTag('captureBody','sitemesh',536,[:],1)
printHtmlPart(115)
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
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 21, 21, 27, 27, 27, 28, 31, 31, 31, 31, 44, 45, 47, 47, 47, 47, 48, 48, 49, 49, 52, 53, 53, 53, 54, 54, 54, 54, 63, 63, 63, 63, 65, 65, 72, 72, 72, 76, 76, 76, 77, 77, 77, 77, 79, 79, 79, 80, 80, 80, 80, 83, 83, 85, 85, 87, 87, 90, 91, 91, 91, 94, 94, 94, 95, 95, 95, 95, 96, 98, 98, 98, 102, 102, 102, 103, 103, 103, 103, 105, 105, 109, 109, 109, 110, 110, 110, 110, 112, 112, 112, 113, 113, 113, 113, 119, 120, 120, 135, 135, 143, 143, 143, 143, 145, 145, 153, 153, 153, 157, 157, 157, 158, 158, 158, 158, 160, 160, 164, 164, 167, 169, 169, 172, 176, 176, 176, 176, 182, 182, 188, 188, 194, 194, 197, 197, 197, 200, 200, 204, 204, 204, 205, 205, 205, 205, 207, 207, 207, 208, 208, 208, 208, 219, 219, 225, 225, 228, 228, 235, 235, 243, 243, 246, 246, 255, 255, 255, 255, 257, 257, 260, 260, 262, 263, 263, 266, 266, 268, 269, 269, 269, 272, 272, 274, 275, 275, 278, 278, 280, 281, 281, 281, 284, 284, 286, 287, 287, 290, 290, 292, 293, 293, 293, 296, 296, 298, 299, 299, 302, 302, 304, 305, 305, 305, 308, 309, 309, 310, 310, 313, 315, 315, 315, 320, 320, 323, 323, 326, 326, 328, 329, 329, 332, 332, 334, 335, 335, 335, 338, 338, 340, 341, 341, 344, 344, 346, 347, 347, 347, 350, 351, 351, 352, 352, 355, 356, 356, 356, 362, 362, 365, 366, 366, 367, 367, 367, 373, 373, 373, 373, 376, 377, 377, 378, 379, 379, 379, 387, 387, 392, 392, 402, 402, 417, 417, 417, 421, 421, 424, 424, 426, 426, 428, 428, 431, 431, 434, 434, 437, 437, 440, 440, 443, 443, 448, 448, 448, 448, 449, 449, 452, 452, 452, 459, 459, 461, 461, 465, 465, 470, 471, 471, 475, 475, 480, 480, 487, 487, 499, 499, 514, 514, 514, 515, 515, 515, 516, 518, 518, 518, 519, 519, 519, 519, 524, 524, 526, 526, 528, 528, 536, 536, 536, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "showProduct.gsp"
)
class ___LineNumberPlaceholder { }
