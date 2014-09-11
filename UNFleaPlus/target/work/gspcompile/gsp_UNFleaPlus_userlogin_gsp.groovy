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
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',5,['code':("login")],-1)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',6,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("login.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',8,['src':("bootstrap.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('image','asset',15,['src':("REARU.png"),'alt':("UNFlea+"),'height':("50px"),'width':("150px")],-1)
printHtmlPart(5)
invokeTag('message','g',22,['code':("login")],-1)
printHtmlPart(6)
invokeTag('set','g',24,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(7)
invokeTag('set','g',25,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(8)
expressionOut.print(foo)
printHtmlPart(9)
expressionOut.print(foo1)
printHtmlPart(10)
invokeTag('message','g',29,['code':("rememberMe")],-1)
printHtmlPart(11)
invokeTag('message','g',33,['code':("login")],-1)
printHtmlPart(12)
invokeTag('message','g',36,['code':("reset")],-1)
printHtmlPart(13)
invokeTag('message','g',42,['code':("register")],-1)
printHtmlPart(14)
createTagBody(2, {->
invokeTag('message','g',42,['code':("registered")],-1)
})
invokeTag('link','g',42,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(15)
invokeTag('image','asset',55,['src':("REARU.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px"),'border-radius':("100%")],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',67,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1410318220000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
