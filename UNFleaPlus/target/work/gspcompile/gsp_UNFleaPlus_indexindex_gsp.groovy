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
invokeTag('javascript','g',5,['library':("jquery"),'plugin':("jquery")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("welcome")],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
invokeTag('stylesheet','asset',8,['src':("bootstrap.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',9,['src':("init.css")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',10,['src':("bootstrap.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',11,['src':("init.js")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('image','asset',18,['src':("REARU.png"),'alt':("UNFlea+"),'height':("50px"),'width':("150px")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',23,['code':("signUP")],-1)
})
invokeTag('link','g',23,['controller':("user"),'action':("viewRegister.gsp")],2)
printHtmlPart(7)
invokeTag('message','g',24,['code':("howUse")],-1)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',25,['code':("login")],-1)
})
invokeTag('link','g',25,['controller':("user"),'action':("viewLogin")],2)
printHtmlPart(9)
invokeTag('message','g',27,['code':("more")],-1)
printHtmlPart(10)
invokeTag('message','g',29,['code':("contactUs")],-1)
printHtmlPart(11)
invokeTag('message','g',30,['code':("aboutUs")],-1)
printHtmlPart(12)
invokeTag('message','g',44,['code':("message")],-1)
printHtmlPart(13)
invokeTag('message','g',58,['code':("develomentTeam")],-1)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('image','asset',88,['src':("USA.png"),'alt':("UNFlea+"),'height':("90px"),'width':("90px")],-1)
printHtmlPart(2)
})
invokeTag('link','g',89,['params':([lang:'en'])],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('image','asset',91,['src':("Colombia.png"),'alt':("UNFlea+"),'height':("100px"),'width':("100px")],-1)
printHtmlPart(2)
})
invokeTag('link','g',92,['params':([lang:'es'])],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',95,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1410289403000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
