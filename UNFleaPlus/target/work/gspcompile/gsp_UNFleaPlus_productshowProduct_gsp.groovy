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
invokeTag('stylesheet','asset',8,['src':("search.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',9,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',10,['src':("bootstrap-typeahead.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',11,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',12,['src':("toogleMenu.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',13,['src':("CountryState.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("search.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("bootstrap-slider.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("slider.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',17,['src':("slider.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',18,['src':("modal.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('link','g',37,['controller':("index"),'action':("viewHome")],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('set','g',45,['var':("search1"),'value':(g.message(code:'myProducts')),'scope':("page")],-1)
printHtmlPart(6)
expressionOut.print(search1)
printHtmlPart(7)
invokeTag('message','g',50,['code':("searchText")],-1)
printHtmlPart(8)
})
invokeTag('form','g',54,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('message','g',58,['code':("signUP")],-1)
printHtmlPart(11)
})
invokeTag('link','g',59,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(12)
invokeTag('message','g',61,['code':("howUse")],-1)
printHtmlPart(13)
invokeTag('message','g',64,['code':("login")],-1)
printHtmlPart(14)
invokeTag('set','g',67,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(10)
invokeTag('set','g',69,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
expressionOut.print(foo)
printHtmlPart(17)
expressionOut.print(foo1)
printHtmlPart(18)
invokeTag('message','g',89,['code':("rememberMe")],-1)
printHtmlPart(19)
invokeTag('message','g',93,['code':("login")],-1)
printHtmlPart(20)
})
invokeTag('form','g',96,['role':("form"),'controller':("user"),'action':("login"),'method':("post")],2)
printHtmlPart(21)
invokeTag('message','g',103,['code':("more")],-1)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('message','g',107,['code':("contactUs")],-1)
printHtmlPart(24)
})
invokeTag('link','g',108,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('message','g',110,['code':("aboutUs")],-1)
printHtmlPart(24)
})
invokeTag('link','g',111,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(26)
expressionOut.print(country)
printHtmlPart(27)
expressionOut.print(state)
printHtmlPart(28)
invokeTag('message','g',135,['code':("filterMenu")],-1)
printHtmlPart(29)
invokeTag('message','g',143,['code':("filter")],-1)
printHtmlPart(30)
invokeTag('message','g',146,['code':("aboutFilter")],-1)
printHtmlPart(31)
createTagBody(2, {->
printHtmlPart(32)
invokeTag('message','g',155,['code':("order")],-1)
printHtmlPart(33)
if(true && (nameOrder)) {
printHtmlPart(34)
invokeTag('message','g',160,['code':("nameVar")],-1)
printHtmlPart(35)
}
else {
printHtmlPart(36)
invokeTag('message','g',166,['code':("nameVar")],-1)
printHtmlPart(35)
}
printHtmlPart(11)
if(true && (usernameOrder)) {
printHtmlPart(37)
invokeTag('message','g',172,['code':("usernameVar")],-1)
printHtmlPart(35)
}
else {
printHtmlPart(38)
invokeTag('message','g',178,['code':("usernameVar")],-1)
printHtmlPart(35)
}
printHtmlPart(11)
if(true && (countryOrder)) {
printHtmlPart(39)
invokeTag('message','g',184,['code':("country")],-1)
printHtmlPart(35)
}
else {
printHtmlPart(40)
invokeTag('message','g',190,['code':("country")],-1)
printHtmlPart(35)
}
printHtmlPart(11)
if(true && (cityOrder)) {
printHtmlPart(41)
invokeTag('message','g',196,['code':("state")],-1)
printHtmlPart(35)
}
else {
printHtmlPart(42)
invokeTag('message','g',202,['code':("state")],-1)
printHtmlPart(35)
}
printHtmlPart(11)
if(true && (priceOrder)) {
printHtmlPart(43)
invokeTag('message','g',208,['code':("price")],-1)
printHtmlPart(11)
}
else {
printHtmlPart(44)
invokeTag('message','g',213,['code':("price")],-1)
printHtmlPart(45)
}
printHtmlPart(46)
invokeTag('message','g',220,['code':("type")],-1)
printHtmlPart(47)
if(true && (normal)) {
printHtmlPart(48)
invokeTag('message','g',226,['code':("sale")],-1)
printHtmlPart(49)
}
else {
printHtmlPart(50)
invokeTag('message','g',232,['code':("sale")],-1)
printHtmlPart(49)
}
printHtmlPart(10)
if(true && (subasta)) {
printHtmlPart(51)
invokeTag('message','g',238,['code':("auctionVar")],-1)
printHtmlPart(49)
}
else {
printHtmlPart(52)
invokeTag('message','g',244,['code':("auctionVar")],-1)
printHtmlPart(49)
}
printHtmlPart(10)
if(true && (donacion)) {
printHtmlPart(53)
invokeTag('message','g',250,['code':("donateVar")],-1)
printHtmlPart(10)
}
else {
printHtmlPart(54)
invokeTag('message','g',255,['code':("donateVar")],-1)
printHtmlPart(10)
}
printHtmlPart(55)
invokeTag('message','g',262,['code':("price")],-1)
printHtmlPart(47)
if(true && (priceMin)) {
printHtmlPart(24)
if(true && (priceMax)) {
printHtmlPart(23)
invokeTag('message','g',267,['code':("interval")],-1)
printHtmlPart(56)
expressionOut.print(priceMin)
printHtmlPart(57)
expressionOut.print(priceMax)
printHtmlPart(58)
}
printHtmlPart(10)
}
else {
printHtmlPart(24)
invokeTag('message','g',279,['code':("interval")],-1)
printHtmlPart(59)
}
printHtmlPart(60)
invokeTag('message','g',292,['code':("country")],-1)
printHtmlPart(61)
invokeTag('message','g',302,['code':("state")],-1)
printHtmlPart(62)
})
invokeTag('form','g',317,['controller':("product"),'action':("searchProduct"),'name':("filtros"),'method':("get")],2)
printHtmlPart(63)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('image','asset',325,['src':("USA.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(10)
})
invokeTag('link','g',326,['controller':("product"),'action':("searchProduct"),'params':([lang:'en'])],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('image','asset',330,['src':("espana.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(10)
})
invokeTag('link','g',331,['controller':("product"),'action':("searchProduct"),'params':([lang:'es'])],2)
printHtmlPart(64)
for( product in (products) ) {
printHtmlPart(65)
if(true && (product.image)) {
printHtmlPart(66)
expressionOut.print(createLink(controller:'user', action:'product_image', id:product.image[0].getId()))
printHtmlPart(67)
}
printHtmlPart(68)
expressionOut.print(product.user.username)
printHtmlPart(69)
expressionOut.print(product.user.userCountry)
printHtmlPart(69)
expressionOut.print(product.user.userCity)
printHtmlPart(69)
expressionOut.print(product.name)
printHtmlPart(70)
expressionOut.print(product.type)
printHtmlPart(71)
createTagBody(3, {->
printHtmlPart(72)
expressionOut.print(product.getId())
printHtmlPart(73)
invokeTag('message','g',369,['code':("details")],-1)
printHtmlPart(74)
})
invokeTag('form','g',372,['controller':("product"),'action':("viewRequest")],3)
printHtmlPart(75)
}
printHtmlPart(76)
if(true && (totalProduct<10)) {
printHtmlPart(77)
invokeTag('paginate','g',385,['controller':("product"),'action':("searchProduct"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(78)
}
else {
printHtmlPart(79)
invokeTag('paginate','g',395,['controller':("product"),'action':("searchProduct"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(78)
}
printHtmlPart(80)
expressionOut.print(search)
printHtmlPart(81)
invokeTag('message','g',419,['code':("tutorial")],-1)
printHtmlPart(82)
})
invokeTag('captureBody','sitemesh',430,[:],1)
printHtmlPart(83)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416868657000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 21, 21, 21, 22, 37, 37, 37, 37, 45, 45, 45, 45, 47, 47, 50, 50, 54, 54, 54, 58, 58, 58, 59, 59, 59, 59, 61, 61, 64, 64, 67, 69, 69, 72, 76, 76, 76, 76, 83, 83, 89, 89, 93, 93, 96, 96, 96, 103, 103, 107, 107, 107, 108, 108, 108, 108, 110, 110, 110, 111, 111, 111, 111, 125, 125, 128, 128, 135, 135, 143, 143, 146, 146, 155, 155, 155, 155, 157, 157, 160, 160, 162, 163, 163, 166, 166, 168, 169, 169, 169, 172, 172, 174, 175, 175, 178, 178, 180, 181, 181, 181, 184, 184, 186, 187, 187, 190, 190, 192, 193, 193, 193, 196, 196, 198, 199, 199, 202, 202, 204, 205, 205, 205, 208, 209, 209, 210, 210, 213, 215, 215, 215, 220, 220, 223, 223, 226, 226, 228, 229, 229, 232, 232, 234, 235, 235, 235, 238, 238, 240, 241, 241, 244, 244, 246, 247, 247, 247, 250, 251, 251, 252, 252, 255, 256, 256, 256, 262, 262, 265, 266, 266, 267, 267, 267, 273, 273, 273, 273, 276, 277, 277, 278, 279, 279, 279, 287, 287, 292, 292, 302, 302, 317, 317, 317, 325, 325, 325, 326, 326, 326, 328, 330, 330, 330, 331, 331, 331, 331, 343, 343, 346, 346, 348, 348, 350, 350, 353, 353, 356, 356, 359, 359, 362, 362, 364, 364, 368, 368, 368, 368, 369, 369, 372, 372, 372, 379, 379, 381, 381, 385, 385, 390, 391, 391, 395, 395, 400, 400, 407, 407, 419, 419, 430, 430, 430, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "showProduct.gsp"
)
class ___LineNumberPlaceholder { }
