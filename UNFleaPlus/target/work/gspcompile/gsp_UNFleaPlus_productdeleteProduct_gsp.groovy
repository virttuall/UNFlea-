import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_productdeleteProduct_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/deleteProduct.gsp" }
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
invokeTag('stylesheet','asset',6,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("deleteProduct.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("home.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("navbar.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',11,['src':("search.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("sticky-footer.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',13,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("bootstrap-typeahead.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("deleteProduct.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("search.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',19,[:],1)
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
invokeTag('link','g',38,['controller':("user"),'action':("viewHome"),'class':("font-menu")],3)
printHtmlPart(7)
}
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(4)
expressionOut.print(user.username)
printHtmlPart(7)
})
invokeTag('link','g',43,['controller':("user"),'action':("viewHome"),'class':("navbar-brand font-menu")],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('set','g',52,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(10)
expressionOut.print(search1)
printHtmlPart(11)
})
invokeTag('form','g',60,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('message','g',64,['code':("default.home.label")],-1)
printHtmlPart(14)
})
invokeTag('link','g',65,['controller':("index"),'action':("viewHome")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('message','g',67,['code':("myProducts")],-1)
printHtmlPart(14)
})
invokeTag('link','g',68,['controller':("user"),'action':("viewHome")],2)
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
invokeTag('link','g',83,['controller':("user"),'action':("userRequest"),'params':([name:request])],4)
printHtmlPart(24)
}
printHtmlPart(25)
}
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('message','g',90,['code':("logout")],-1)
printHtmlPart(14)
})
invokeTag('link','g',91,['controller':("user"),'action':("logout")],2)
printHtmlPart(27)
invokeTag('message','g',93,['code':("more")],-1)
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('message','g',97,['code':("contactUs")],-1)
printHtmlPart(29)
})
invokeTag('link','g',98,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('message','g',100,['code':("aboutUs")],-1)
printHtmlPart(29)
})
invokeTag('link','g',101,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(31)
createTagBody(2, {->
printHtmlPart(32)
for( product in (products) ) {
printHtmlPart(33)
expressionOut.print(product.name)
printHtmlPart(34)
expressionOut.print(product.getId())
printHtmlPart(35)
expressionOut.print(product.getId())
printHtmlPart(36)
expressionOut.print(product.name)
printHtmlPart(37)
expressionOut.print(product.name)
printHtmlPart(38)
}
printHtmlPart(39)
invokeTag('message','g',125,['code':("delete")],-1)
printHtmlPart(40)
})
invokeTag('form','g',129,['class':("form-horizontal"),'controller':("product"),'action':("deleteProduct1"),'method':("post"),'name':("myForm")],2)
printHtmlPart(41)
if(true && (totalProduct<10)) {
printHtmlPart(42)
invokeTag('paginate','g',136,['controller':("product"),'action':("viewDeleteProduct"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(43)
}
else {
printHtmlPart(44)
invokeTag('paginate','g',142,['controller':("product"),'action':("viewDeleteProduct"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(43)
}
printHtmlPart(45)
expressionOut.print(search)
printHtmlPart(46)
createTagBody(2, {->
printHtmlPart(47)
invokeTag('image','asset',158,['src':("ingles.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(48)
})
invokeTag('link','g',159,['controller':("index"),'action':("viewHome"),'params':([lang:'en'])],2)
printHtmlPart(48)
createTagBody(2, {->
printHtmlPart(47)
invokeTag('image','asset',162,['src':("espanol.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(48)
})
invokeTag('link','g',163,['controller':("index"),'action':("viewHome"),'params':([lang:'es'])],2)
printHtmlPart(49)
invokeTag('image','asset',168,['src':("facebook.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(50)
invokeTag('image','asset',170,['src':("twitter.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(51)
invokeTag('image','asset',172,['src':("github.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(52)
})
invokeTag('captureBody','sitemesh',180,[:],1)
printHtmlPart(53)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418055796000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 19, 19, 19, 20, 34, 34, 34, 35, 37, 37, 37, 37, 38, 38, 39, 39, 41, 42, 42, 42, 43, 43, 43, 43, 52, 52, 52, 52, 54, 54, 60, 60, 60, 64, 64, 64, 65, 65, 65, 65, 67, 67, 67, 68, 68, 68, 68, 71, 71, 73, 73, 75, 75, 78, 79, 79, 79, 82, 82, 82, 83, 83, 83, 83, 84, 86, 86, 86, 90, 90, 90, 91, 91, 91, 91, 93, 93, 97, 97, 97, 98, 98, 98, 98, 100, 100, 100, 101, 101, 101, 101, 116, 116, 116, 116, 117, 117, 118, 118, 118, 118, 120, 120, 120, 120, 123, 123, 125, 125, 129, 129, 129, 133, 133, 136, 136, 138, 139, 139, 142, 142, 144, 144, 150, 150, 158, 158, 158, 159, 159, 159, 160, 162, 162, 162, 163, 163, 163, 163, 168, 168, 170, 170, 172, 172, 180, 180, 180, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "deleteProduct.gsp"
)
class ___LineNumberPlaceholder { }
