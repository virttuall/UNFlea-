import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_email_request_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/email/_request.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',2,['code':("hi")],-1)
printHtmlPart(1)
expressionOut.print(user1.username)
printHtmlPart(2)
invokeTag('message','g',3,['code':("requestVar")],-1)
printHtmlPart(3)
expressionOut.print(user.username)
printHtmlPart(1)
invokeTag('message','g',3,['code':("with")],-1)
printHtmlPart(1)
expressionOut.print(user.email)
printHtmlPart(4)
invokeTag('message','g',4,['code':("requestVar1")],-1)
printHtmlPart(1)
expressionOut.print(product.name)
printHtmlPart(1)
invokeTag('message','g',4,['code':("priceVar")],-1)
printHtmlPart(3)
expressionOut.print(price)
printHtmlPart(5)
invokeTag('message','g',5,['code':("requestVar2")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416940741000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_request.gsp"
)
class ___LineNumberPlaceholder { }
