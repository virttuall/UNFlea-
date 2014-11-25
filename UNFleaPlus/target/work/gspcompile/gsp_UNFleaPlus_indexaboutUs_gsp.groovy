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
invokeTag('javascript','asset',10,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',11,['src':("modal.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',12,['src':("bootstrap-typeahead.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',13,['src':("search.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('link','g',34,['controller':("index"),'action':("viewHome")],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('set','g',40,['var':("search1"),'value':(g.message(code:'myProducts')),'scope':("page")],-1)
printHtmlPart(7)
expressionOut.print(search1)
printHtmlPart(8)
invokeTag('message','g',43,['code':("searchText")],-1)
printHtmlPart(9)
})
invokeTag('form','g',46,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('message','g',49,['code':("signUP")],-1)
printHtmlPart(12)
})
invokeTag('link','g',50,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(13)
invokeTag('message','g',52,['code':("howUse")],-1)
printHtmlPart(14)
invokeTag('message','g',55,['code':("login")],-1)
printHtmlPart(15)
invokeTag('set','g',58,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(11)
invokeTag('set','g',60,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(16)
expressionOut.print(foo)
printHtmlPart(17)
expressionOut.print(foo1)
printHtmlPart(18)
invokeTag('message','g',79,['code':("rememberMe")],-1)
printHtmlPart(19)
invokeTag('message','g',83,['code':("login")],-1)
printHtmlPart(20)
})
invokeTag('form','g',86,['role':("form"),'controller':("user"),'action':("login"),'method':("post")],2)
printHtmlPart(21)
invokeTag('message','g',89,['code':("more")],-1)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('message','g',93,['code':("contactUs")],-1)
printHtmlPart(24)
})
invokeTag('link','g',94,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('message','g',96,['code':("aboutUs")],-1)
printHtmlPart(24)
})
invokeTag('link','g',97,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(26)
invokeTag('image','asset',111,['class':("img-circle"),'src':("UNFlea.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(27)
invokeTag('message','g',118,['code':("unfleaDescription")],-1)
printHtmlPart(28)
invokeTag('image','asset',123,['class':("img-circle"),'src':("FabianConejo.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(29)
invokeTag('message','g',130,['code':("fabianDescription")],-1)
printHtmlPart(30)
invokeTag('image','asset',136,['class':("img-circle"),'src':("AndresGutierrez.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(31)
invokeTag('message','g',143,['code':("andresDescription")],-1)
printHtmlPart(32)
invokeTag('image','asset',155,['class':("img-circle"),'src':("SamuelCabezas.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(33)
invokeTag('message','g',162,['code':("samuelDescription")],-1)
printHtmlPart(28)
invokeTag('image','asset',167,['class':("img-circle"),'src':("YeisonGarcia.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(34)
invokeTag('message','g',174,['code':("yeisonDescription")],-1)
printHtmlPart(35)
invokeTag('image','asset',181,['class':("img-circle"),'src':("MateoNieto.png"),'alt':("Generic placeholder imag"),'height':("140px"),'width':("140px")],-1)
printHtmlPart(36)
invokeTag('message','g',188,['code':("mateoDescription")],-1)
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
invokeTag('image','asset',201,['src':("USA.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(39)
})
invokeTag('link','g',202,['controller':("index"),'action':("viewAboutUs"),'params':([lang:'en'])],2)
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(38)
invokeTag('image','asset',205,['src':("espana.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(39)
})
invokeTag('link','g',206,['controller':("index"),'action':("viewAboutUs"),'params':([lang:'es'])],2)
printHtmlPart(40)
invokeTag('message','g',224,['code':("tutorial")],-1)
printHtmlPart(41)
expressionOut.print(search)
printHtmlPart(42)
})
invokeTag('captureBody','sitemesh',246,[:],1)
printHtmlPart(43)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416867373000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 15, 15, 15, 15, 34, 34, 34, 34, 40, 40, 40, 40, 41, 41, 43, 43, 46, 46, 46, 49, 49, 49, 50, 50, 50, 50, 52, 52, 55, 55, 58, 60, 60, 62, 66, 66, 66, 66, 73, 73, 79, 79, 83, 83, 86, 86, 86, 89, 89, 93, 93, 93, 94, 94, 94, 94, 96, 96, 96, 97, 97, 97, 97, 111, 111, 118, 118, 123, 123, 130, 130, 136, 136, 143, 143, 155, 155, 162, 162, 167, 167, 174, 174, 181, 181, 188, 188, 201, 201, 201, 202, 202, 202, 203, 205, 205, 205, 206, 206, 206, 206, 224, 224, 233, 233, 246, 246, 246, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "aboutUs.gsp"
)
class ___LineNumberPlaceholder { }
