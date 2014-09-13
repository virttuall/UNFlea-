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
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',14,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('image','asset',28,['src':("REARU.png"),'alt':("UNFlea+"),'height':("50px"),'width':("150px")],-1)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',33,['code':("signUP")],-1)
})
invokeTag('link','g',33,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(6)
invokeTag('message','g',34,['code':("howUse")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',35,['code':("login")],-1)
})
invokeTag('link','g',35,['controller':("user"),'action':("viewLogin")],2)
printHtmlPart(8)
invokeTag('message','g',37,['code':("more")],-1)
printHtmlPart(9)
createTagBody(2, {->
invokeTag('message','g',39,['code':("contactUs")],-1)
})
invokeTag('link','g',39,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(10)
createTagBody(2, {->
invokeTag('message','g',40,['code':("aboutUs")],-1)
})
invokeTag('link','g',40,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(11)
invokeTag('message','g',63,['code':("message")],-1)
printHtmlPart(12)
invokeTag('message','g',75,['code':("develomentTeam")],-1)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('image','asset',97,['src':("USA.png"),'alt':("UNFlea+"),'height':("55px"),'width':("55px")],-1)
printHtmlPart(15)
})
invokeTag('link','g',98,['params':([lang:'en'])],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('image','asset',100,['src':("espana.png"),'alt':("UNFlea+"),'height':("55px"),'width':("55px")],-1)
printHtmlPart(15)
})
invokeTag('link','g',101,['params':([lang:'es'])],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',105,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1410572104000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
