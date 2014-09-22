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
printHtmlPart(1)
invokeTag('javascript','asset',10,['src':("register.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('image','asset',28,['src':("REARU.png"),'alt':("UNFlea+"),'height':("50px"),'width':("150px")],-1)
printHtmlPart(5)
})
invokeTag('link','g',29,['controller':("index"),'action':("viewHome")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',35,['code':("signUP")],-1)
})
invokeTag('link','g',35,['controller':("user"),'action':("viewRegister")],2)
printHtmlPart(7)
invokeTag('message','g',36,['code':("howUse")],-1)
printHtmlPart(8)
invokeTag('message','g',38,['code':("login")],-1)
printHtmlPart(9)
invokeTag('set','g',40,['var':("foo"),'value':(g.message(code: 'email')),'scope':("page")],-1)
printHtmlPart(10)
invokeTag('set','g',41,['var':("foo1"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
expressionOut.print(foo)
printHtmlPart(13)
expressionOut.print(foo1)
printHtmlPart(14)
invokeTag('message','g',60,['code':("rememberMe")],-1)
printHtmlPart(15)
invokeTag('message','g',63,['code':("login")],-1)
printHtmlPart(16)
})
invokeTag('form','g',65,['role':("form"),'controller':("user"),'action':("home"),'method':("post")],2)
printHtmlPart(17)
invokeTag('message','g',73,['code':("more")],-1)
printHtmlPart(18)
createTagBody(2, {->
invokeTag('message','g',75,['code':("contactUs")],-1)
})
invokeTag('link','g',75,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(19)
createTagBody(2, {->
invokeTag('message','g',76,['code':("aboutUs")],-1)
})
invokeTag('link','g',76,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(20)
invokeTag('message','g',91,['code':("create")],-1)
printHtmlPart(21)
invokeTag('message','g',92,['code':("personal")],-1)
printHtmlPart(22)
invokeTag('message','g',96,['code':("create")],-1)
printHtmlPart(23)
invokeTag('set','g',98,['var':("foo"),'value':(g.message(code: 'emailVar')),'scope':("page")],-1)
printHtmlPart(24)
invokeTag('set','g',104,['var':("temp"),'value':(g.message(code: 'emailRegister')),'scope':("page")],-1)
printHtmlPart(25)
expressionOut.print(temp)
printHtmlPart(26)
expressionOut.print(foo)
printHtmlPart(27)
invokeTag('set','g',111,['var':("foo1"),'value':(g.message(code: 'usernameVar')),'scope':("page")],-1)
printHtmlPart(28)
invokeTag('set','g',114,['var':("temp1"),'value':(g.message(code: 'username')),'scope':("page")],-1)
printHtmlPart(25)
expressionOut.print(temp1)
printHtmlPart(29)
expressionOut.print(foo1)
printHtmlPart(30)
invokeTag('set','g',121,['var':("foo4"),'value':(g.message(code: 'password')),'scope':("page")],-1)
printHtmlPart(28)
invokeTag('set','g',124,['var':("temp2"),'value':(g.message(code: 'passwordVar')),'scope':("page")],-1)
printHtmlPart(31)
expressionOut.print(temp2)
printHtmlPart(32)
expressionOut.print(foo4)
printHtmlPart(30)
invokeTag('set','g',131,['var':("foo5"),'value':(g.message(code: 'passwordConfirm')),'scope':("page")],-1)
printHtmlPart(28)
invokeTag('set','g',134,['var':("temp3"),'value':(g.message(code: 'passwordConfirmVar')),'scope':("page")],-1)
printHtmlPart(25)
expressionOut.print(temp3)
printHtmlPart(33)
expressionOut.print(foo5)
printHtmlPart(34)
invokeTag('message','g',141,['code':("next")],-1)
printHtmlPart(35)
invokeTag('message','g',146,['code':("personal")],-1)
printHtmlPart(36)
invokeTag('set','g',148,['var':("foo2"),'value':(g.message(code: 'firstname')),'scope':("page")],-1)
printHtmlPart(37)
invokeTag('set','g',152,['var':("temp4"),'value':(g.message(code: 'firstnameVar')),'scope':("page")],-1)
printHtmlPart(38)
expressionOut.print(temp4)
printHtmlPart(39)
expressionOut.print(foo2)
printHtmlPart(40)
invokeTag('set','g',161,['var':("foo3"),'value':(g.message(code: 'lastname')),'scope':("page")],-1)
printHtmlPart(37)
invokeTag('set','g',165,['var':("temp5"),'value':(g.message(code: 'lastnameVar')),'scope':("page")],-1)
printHtmlPart(38)
expressionOut.print(temp5)
printHtmlPart(41)
expressionOut.print(foo3)
printHtmlPart(42)
invokeTag('message','g',177,['code':("format")],-1)
printHtmlPart(43)
invokeTag('message','g',188,['code':("male")],-1)
printHtmlPart(44)
invokeTag('message','g',193,['code':("female")],-1)
printHtmlPart(45)
invokeTag('message','g',201,['code':("terms")],-1)
printHtmlPart(46)
invokeTag('message','g',204,['code':("previous")],-1)
printHtmlPart(47)
invokeTag('message','g',205,['code':("signUP")],-1)
printHtmlPart(48)
})
invokeTag('captureBody','sitemesh',213,[:],1)
printHtmlPart(49)
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
