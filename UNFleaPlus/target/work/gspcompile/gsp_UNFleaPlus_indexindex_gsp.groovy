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
invokeTag('image','asset',30,['src':("REARU.png"),'alt':("UNFlea+"),'height':("50px"),'width':("150px")],-1)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',36,['code':("signUP")],-1)
})
invokeTag('link','g',36,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(6)
invokeTag('message','g',37,['code':("howUse")],-1)
printHtmlPart(7)
invokeTag('message','g',39,['code':("login")],-1)
printHtmlPart(8)
invokeTag('set','g',41,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(9)
invokeTag('set','g',42,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
expressionOut.print(foo)
printHtmlPart(12)
expressionOut.print(foo1)
printHtmlPart(13)
invokeTag('message','g',61,['code':("rememberMe")],-1)
printHtmlPart(14)
invokeTag('message','g',64,['code':("login")],-1)
printHtmlPart(15)
})
invokeTag('form','g',66,['role':("form "),'controller':("user"),'action':("home"),'method':("post")],2)
printHtmlPart(16)
invokeTag('message','g',74,['code':("more")],-1)
printHtmlPart(17)
createTagBody(2, {->
invokeTag('message','g',76,['code':("contactUs")],-1)
})
invokeTag('link','g',76,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(18)
createTagBody(2, {->
invokeTag('message','g',77,['code':("aboutUs")],-1)
})
invokeTag('link','g',77,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(19)
invokeTag('message','g',103,['code':("message")],-1)
printHtmlPart(20)
invokeTag('message','g',114,['code':("develomentTeam")],-1)
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
invokeTag('image','asset',135,['src':("USA.png"),'alt':("UNFlea+"),'height':("55px"),'width':("55px")],-1)
printHtmlPart(23)
})
invokeTag('link','g',136,['params':([lang:'en'])],2)
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(22)
invokeTag('image','asset',138,['src':("espana.png"),'alt':("UNFlea+"),'height':("55px"),'width':("55px")],-1)
printHtmlPart(23)
})
invokeTag('link','g',139,['params':([lang:'es'])],2)
printHtmlPart(25)
invokeTag('message','g',150,['code':("tutorial")],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',160,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1411259262000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
