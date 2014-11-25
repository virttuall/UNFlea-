import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_useruserRequest_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/userRequest.gsp" }
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
invokeTag('message','g',6,['code':("default.home.label")],-1)
printHtmlPart(2)
expressionOut.print(user.username)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',8,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("home.css")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
if(true && (user.avatar)) {
printHtmlPart(5)
expressionOut.print(createLink(controller:'user', action:'avatar_image', id:user.ident()))
printHtmlPart(6)
}
printHtmlPart(7)
expressionOut.print(user.username)
printHtmlPart(8)
expressionOut.print(totalRequest)
printHtmlPart(9)
if(true && (requests)) {
printHtmlPart(10)
for( request in (requests) ) {
printHtmlPart(11)
createTagBody(4, {->
printHtmlPart(12)
expressionOut.print(request)
printHtmlPart(12)
})
invokeTag('link','g',51,['controller':("user"),'action':("userRequest"),'params':([name:request])],4)
printHtmlPart(13)
}
printHtmlPart(14)
}
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',62,['controller':("user"),'action':("logout")],2)
printHtmlPart(17)
for( request in (requests1) ) {
printHtmlPart(18)
expressionOut.print(request.user)
printHtmlPart(19)
expressionOut.print(request.money)
printHtmlPart(20)
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',83,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416899570000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 15, 15, 15, 16, 28, 28, 28, 28, 30, 30, 31, 31, 32, 32, 44, 44, 48, 49, 49, 49, 51, 51, 51, 51, 51, 51, 51, 53, 55, 55, 55, 62, 62, 62, 78, 78, 79, 79, 80, 80, 81, 81, 83, 83, 83, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "userRequest.gsp"
)
class ___LineNumberPlaceholder { }
