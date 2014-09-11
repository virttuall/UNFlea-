import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_userregister_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/register.gsp" }
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
invokeTag('message','g',5,['code':("signUP")],-1)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',6,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("register.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',8,['src':("bootstrap.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',16,['code':("signUP")],-1)
printHtmlPart(5)
invokeTag('message','g',22,['code':("usernameVar")],-1)
printHtmlPart(6)
invokeTag('set','g',23,['var':("foo"),'value':(g.message(code: 'username')),'scope':("page")],-1)
printHtmlPart(7)
expressionOut.print(foo)
printHtmlPart(8)
invokeTag('message','g',30,['code':("emailVar")],-1)
printHtmlPart(6)
invokeTag('set','g',31,['var':("foo1"),'value':(g.message(code: 'emailRegister')),'scope':("page")],-1)
printHtmlPart(9)
expressionOut.print(foo1)
printHtmlPart(10)
invokeTag('message','g',37,['code':("firstname")],-1)
printHtmlPart(6)
invokeTag('set','g',38,['var':("foo2"),'value':(g.message(code: 'firstnameVar')),'scope':("page")],-1)
printHtmlPart(11)
expressionOut.print(foo2)
printHtmlPart(10)
invokeTag('message','g',44,['code':("lastname")],-1)
printHtmlPart(6)
invokeTag('set','g',45,['var':("foo3"),'value':(g.message(code: 'lastnameVar')),'scope':("page")],-1)
printHtmlPart(12)
expressionOut.print(foo3)
printHtmlPart(13)
invokeTag('message','g',51,['code':("password")],-1)
printHtmlPart(6)
invokeTag('set','g',52,['var':("foo4"),'value':(g.message(code: 'passwordVar')),'scope':("page")],-1)
printHtmlPart(14)
expressionOut.print(foo4)
printHtmlPart(13)
invokeTag('message','g',58,['code':("passwordConfirm")],-1)
printHtmlPart(6)
invokeTag('set','g',59,['var':("foo5"),'value':(g.message(code: 'passwordConfirmVar')),'scope':("page")],-1)
printHtmlPart(15)
expressionOut.print(foo5)
printHtmlPart(16)
invokeTag('message','g',65,['code':("uploadImage")],-1)
printHtmlPart(17)
invokeTag('message','g',67,['code':("format")],-1)
printHtmlPart(18)
invokeTag('message','g',75,['code':("terms")],-1)
printHtmlPart(19)
invokeTag('message','g',85,['code':("signUP")],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',101,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1410327035000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
