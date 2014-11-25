import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_indexcontactUs_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/contactUs.gsp" }
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
invokeTag('message','g',7,['code':("contactUs")],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("contact.css")],-1)
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
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('link','g',33,['controller':("index"),'action':("viewHome")],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('set','g',39,['var':("search1"),'value':(g.message(code:'myProducts')),'scope':("page")],-1)
printHtmlPart(6)
expressionOut.print(search1)
printHtmlPart(7)
invokeTag('message','g',42,['code':("searchText")],-1)
printHtmlPart(8)
})
invokeTag('form','g',45,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('message','g',49,['code':("signUP")],-1)
printHtmlPart(11)
})
invokeTag('link','g',50,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(12)
invokeTag('message','g',52,['code':("howUse")],-1)
printHtmlPart(13)
invokeTag('message','g',55,['code':("login")],-1)
printHtmlPart(14)
invokeTag('set','g',58,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(10)
invokeTag('set','g',60,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
expressionOut.print(foo)
printHtmlPart(17)
expressionOut.print(foo1)
printHtmlPart(18)
invokeTag('message','g',80,['code':("rememberMe")],-1)
printHtmlPart(19)
invokeTag('message','g',84,['code':("login")],-1)
printHtmlPart(20)
})
invokeTag('form','g',87,['role':("form"),'controller':("user"),'action':("login"),'method':("post")],2)
printHtmlPart(21)
invokeTag('message','g',94,['code':("more")],-1)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('message','g',98,['code':("contactUs")],-1)
printHtmlPart(24)
})
invokeTag('link','g',99,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('message','g',101,['code':("aboutUs")],-1)
printHtmlPart(24)
})
invokeTag('link','g',102,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
invokeTag('set','g',122,['var':("username_input"),'value':(g.message(code: 'usernameVar')),'scope':("page")],-1)
printHtmlPart(27)
invokeTag('set','g',124,['var':("email_input"),'value':(g.message(code: 'emailRegister')),'scope':("page")],-1)
printHtmlPart(27)
invokeTag('set','g',126,['var':("comments_input"),'value':(g.message(code: 'commentsVar')),'scope':("page")],-1)
printHtmlPart(28)
invokeTag('message','g',129,['code':("contactUs")],-1)
printHtmlPart(29)
invokeTag('message','g',135,['code':("usernameVar")],-1)
printHtmlPart(30)
expressionOut.print(username_input)
printHtmlPart(31)
invokeTag('message','g',145,['code':("emailVar")],-1)
printHtmlPart(32)
expressionOut.print(email_input)
printHtmlPart(33)
invokeTag('message','g',155,['code':("comments")],-1)
printHtmlPart(34)
expressionOut.print(comments_input)
printHtmlPart(35)
invokeTag('message','g',167,['code':("send")],-1)
printHtmlPart(36)
})
invokeTag('form','g',172,['class':("form-horizontal"),'controller':("user"),'action':("sendEmail"),'method':("post")],2)
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(27)
invokeTag('image','asset',184,['src':("USA.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(38)
})
invokeTag('link','g',185,['controller':("index"),'action':("viewContactUs"),'params':([lang:'en'])],2)
printHtmlPart(38)
createTagBody(2, {->
printHtmlPart(27)
invokeTag('image','asset',188,['src':("espana.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(38)
})
invokeTag('link','g',189,['controller':("index"),'action':("viewContactUs"),'params':([lang:'es'])],2)
printHtmlPart(39)
expressionOut.print(search)
printHtmlPart(40)
invokeTag('message','g',208,['code':("tutorial")],-1)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',218,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416867371000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 17, 17, 17, 18, 33, 33, 33, 33, 39, 39, 39, 39, 40, 40, 42, 42, 45, 45, 45, 49, 49, 49, 50, 50, 50, 50, 52, 52, 55, 55, 58, 60, 60, 63, 67, 67, 67, 67, 74, 74, 80, 80, 84, 84, 87, 87, 87, 94, 94, 98, 98, 98, 99, 99, 99, 99, 101, 101, 101, 102, 102, 102, 102, 122, 122, 122, 124, 124, 126, 126, 126, 129, 129, 135, 135, 138, 138, 145, 145, 148, 148, 155, 155, 158, 158, 167, 167, 172, 172, 172, 184, 184, 184, 185, 185, 185, 186, 188, 188, 188, 189, 189, 189, 189, 198, 198, 208, 208, 218, 218, 218, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "contactUs.gsp"
)
class ___LineNumberPlaceholder { }
