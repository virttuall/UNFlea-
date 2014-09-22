import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_indexindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/index.gsp" }
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
invokeTag('message','g',7,['code':("welcome")],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("init.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',10,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',11,['src':("modal.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('image','asset',31,['src':("REARU.png"),'alt':("UNFlea+"),'height':("50px"),'width':("150px")],-1)
printHtmlPart(5)
})
invokeTag('link','g',32,['controller':("index"),'action':("viewHome")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',38,['code':("signUP")],-1)
})
invokeTag('link','g',38,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(7)
invokeTag('message','g',39,['code':("howUse")],-1)
printHtmlPart(8)
invokeTag('message','g',41,['code':("login")],-1)
printHtmlPart(9)
invokeTag('set','g',43,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(10)
invokeTag('set','g',44,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
expressionOut.print(foo)
printHtmlPart(13)
expressionOut.print(foo1)
printHtmlPart(14)
invokeTag('message','g',63,['code':("rememberMe")],-1)
printHtmlPart(15)
invokeTag('message','g',66,['code':("login")],-1)
printHtmlPart(16)
})
invokeTag('form','g',68,['role':("form"),'controller':("user"),'action':("home"),'method':("post")],2)
printHtmlPart(17)
invokeTag('message','g',76,['code':("more")],-1)
printHtmlPart(18)
createTagBody(2, {->
invokeTag('message','g',78,['code':("contactUs")],-1)
})
invokeTag('link','g',78,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(19)
createTagBody(2, {->
invokeTag('message','g',79,['code':("aboutUs")],-1)
})
invokeTag('link','g',79,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(20)
invokeTag('message','g',105,['code':("message")],-1)
printHtmlPart(21)
invokeTag('message','g',116,['code':("develomentTeam")],-1)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('image','asset',137,['src':("USA.png"),'alt':("UNFlea+"),'height':("55px"),'width':("55px")],-1)
printHtmlPart(24)
})
invokeTag('link','g',138,['params':([lang:'en'])],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('image','asset',140,['src':("espana.png"),'alt':("UNFlea+"),'height':("55px"),'width':("55px")],-1)
printHtmlPart(24)
})
invokeTag('link','g',141,['params':([lang:'es'])],2)
printHtmlPart(26)
invokeTag('message','g',152,['code':("tutorial")],-1)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',162,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1411276383000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
