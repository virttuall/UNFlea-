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
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("signUP")],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("register.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',9,['src':("bootstrap.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('image','asset',19,['src':("home.png"),'alt':("UNFlea+"),'height':("25px"),'width':("50px")],-1)
printHtmlPart(6)
})
invokeTag('link','g',19,['controller':("index")],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('message','g',20,['code':("login")],-1)
printHtmlPart(9)
})
invokeTag('link','g',20,['controller':("user"),'action':("viewLogin")],2)
printHtmlPart(10)
invokeTag('set','g',29,['var':("foo"),'value':(g.message(code: 'emailVar')),'scope':("page")],-1)
printHtmlPart(11)
invokeTag('message','g',31,['code':("emailVar")],-1)
printHtmlPart(12)
expressionOut.print(foo)
printHtmlPart(13)
invokeTag('message','g',34,['code':("emailRegister")],-1)
printHtmlPart(14)
invokeTag('set','g',40,['var':("foo1"),'value':(g.message(code: 'usernameVar')),'scope':("page")],-1)
printHtmlPart(15)
invokeTag('message','g',41,['code':("usernameVar")],-1)
printHtmlPart(16)
expressionOut.print(foo1)
printHtmlPart(17)
invokeTag('message','g',44,['code':("username")],-1)
printHtmlPart(18)
invokeTag('set','g',49,['var':("foo2"),'value':(g.message(code: 'firstname')),'scope':("page")],-1)
printHtmlPart(19)
invokeTag('message','g',50,['code':("firstname")],-1)
printHtmlPart(20)
expressionOut.print(foo2)
printHtmlPart(13)
invokeTag('message','g',53,['code':("firstnameVar")],-1)
printHtmlPart(18)
invokeTag('set','g',58,['var':("foo3"),'value':(g.message(code: 'lastname')),'scope':("page")],-1)
printHtmlPart(21)
invokeTag('message','g',59,['code':("lastname")],-1)
printHtmlPart(22)
expressionOut.print(foo3)
printHtmlPart(13)
invokeTag('message','g',62,['code':("lastnameVar")],-1)
printHtmlPart(23)
invokeTag('set','g',67,['var':("foo4"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(24)
invokeTag('message','g',68,['code':("password")],-1)
printHtmlPart(25)
expressionOut.print(foo4)
printHtmlPart(13)
invokeTag('message','g',71,['code':("passwordVar")],-1)
printHtmlPart(23)
invokeTag('set','g',76,['var':("foo5"),'value':(g.message(code: 'passwordConfirm')),'scope':("page")],-1)
printHtmlPart(26)
invokeTag('message','g',77,['code':("passwordConfirm")],-1)
printHtmlPart(27)
expressionOut.print(foo5)
printHtmlPart(13)
invokeTag('message','g',80,['code':("passwordConfirmVar")],-1)
printHtmlPart(28)
invokeTag('message','g',85,['code':("uploadImage")],-1)
printHtmlPart(29)
invokeTag('message','g',88,['code':("format")],-1)
printHtmlPart(30)
invokeTag('message','g',95,['code':("terms")],-1)
printHtmlPart(31)
invokeTag('message','g',103,['code':("login")],-1)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',111,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1410899754000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
