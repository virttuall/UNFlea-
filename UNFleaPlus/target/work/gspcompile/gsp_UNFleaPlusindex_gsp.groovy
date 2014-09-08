import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlusindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
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
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("welcome")],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("init.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',9,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',10,['src':("init.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('image','asset',17,['src':("REARU.png"),'alt':("UNFlea+"),'height':("50px"),'width':("150px")],-1)
printHtmlPart(5)
invokeTag('message','g',22,['code':("signUP")],-1)
printHtmlPart(6)
invokeTag('message','g',23,['code':("howUse")],-1)
printHtmlPart(7)
invokeTag('message','g',24,['code':("login")],-1)
printHtmlPart(8)
invokeTag('message','g',26,['code':("more")],-1)
printHtmlPart(9)
invokeTag('message','g',28,['code':("contactUs")],-1)
printHtmlPart(10)
invokeTag('message','g',29,['code':("aboutUs")],-1)
printHtmlPart(11)
invokeTag('message','g',43,['code':("message")],-1)
printHtmlPart(12)
invokeTag('message','g',57,['code':("develomentTeam")],-1)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',87,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1410144807000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
