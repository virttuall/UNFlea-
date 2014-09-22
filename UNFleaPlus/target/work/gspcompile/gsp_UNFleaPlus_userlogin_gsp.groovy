import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_userlogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/login.gsp" }
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
invokeTag('message','g',6,['code':("login")],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("login.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',9,['src':("bootstrap.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('image','asset',17,['src':("home.png"),'alt':("UNFlea+"),'height':("25px"),'width':("50px")],-1)
printHtmlPart(5)
})
invokeTag('link','g',17,['controller':("index")],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('message','g',18,['code':("signUP")],-1)
printHtmlPart(8)
})
invokeTag('link','g',18,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(9)
invokeTag('image','asset',28,['src':("user.png"),'alt':("UNFlea+"),'class':("user")],-1)
printHtmlPart(10)
invokeTag('set','g',31,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(11)
invokeTag('set','g',32,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(12)
expressionOut.print(foo)
printHtmlPart(13)
expressionOut.print(foo1)
printHtmlPart(14)
invokeTag('message','g',48,['code':("rememberMe")],-1)
printHtmlPart(15)
invokeTag('message','g',58,['code':("login")],-1)
printHtmlPart(16)
invokeTag('message','g',63,['code':("reset")],-1)
printHtmlPart(17)
invokeTag('message','g',71,['code':("register")],-1)
printHtmlPart(18)
createTagBody(2, {->
invokeTag('message','g',71,['code':("registered")],-1)
})
invokeTag('link','g',71,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(19)
invokeTag('image','asset',94,['src':("REARU.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px"),'border-radius':("100%")],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',109,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1411143442000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
