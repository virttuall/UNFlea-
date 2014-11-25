import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_email_registrationConfirmation_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/email/_registrationConfirmation.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',2,['code':("greeting")],-1)
printHtmlPart(1)
expressionOut.print(user.firstName)
printHtmlPart(2)
invokeTag('message','g',2,['code':("welcome")],-1)
printHtmlPart(3)
invokeTag('message','g',3,['code':("usernameVar")],-1)
printHtmlPart(4)
expressionOut.print(user.username)
printHtmlPart(5)
invokeTag('message','g',4,['code':("password")],-1)
printHtmlPart(4)
expressionOut.print(password)
printHtmlPart(5)
invokeTag('message','g',5,['code':("toValidateAccount")],-1)
printHtmlPart(6)
invokeTag('createLink','g',6,['controller':("user"),'action':("confirmEmail"),'base':("http://localhost:8080/UNFleaPlus"),'params':([email: user.email, password:password])],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416931238000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_registrationConfirmation.gsp"
)
class ___LineNumberPlaceholder { }
