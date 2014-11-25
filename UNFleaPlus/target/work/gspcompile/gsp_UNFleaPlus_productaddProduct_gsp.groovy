import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_productaddProduct_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/addProduct.gsp" }
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
invokeTag('message','g',6,['code':("addProduct")],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("addProduct.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',9,['src':("addProduct.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',10,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',11,['src':("dropzoneAddProduct.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("dropzone.css")],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
expressionOut.print(params.name)
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',33,['controller':("user"),'action':("logout")],2)
printHtmlPart(5)
invokeTag('set','g',47,['var':("name_input"),'value':(g.message(code: 'nameVar')),'scope':("page")],-1)
printHtmlPart(6)
invokeTag('set','g',49,['var':("description_input"),'value':(g.message(code: 'descriptionVar')),'scope':("page")],-1)
printHtmlPart(6)
invokeTag('set','g',51,['var':("state_input"),'value':(g.message(code: 'stateVar')),'scope':("page")],-1)
printHtmlPart(7)
invokeTag('message','g',54,['code':("addProduct")],-1)
printHtmlPart(8)
invokeTag('message','g',60,['code':("nameVar")],-1)
printHtmlPart(9)
expressionOut.print(name_input)
printHtmlPart(10)
invokeTag('message','g',71,['code':("descriptionVar")],-1)
printHtmlPart(11)
expressionOut.print(description_input)
printHtmlPart(12)
invokeTag('message','g',83,['code':("stateVar")],-1)
printHtmlPart(13)
invokeTag('message','g',87,['code':("normalVar")],-1)
printHtmlPart(14)
invokeTag('message','g',90,['code':("auctionVar")],-1)
printHtmlPart(15)
invokeTag('message','g',93,['code':("donateVar")],-1)
printHtmlPart(16)
invokeTag('set','g',97,['var':("date_now"),'value':(dateNow = new Date())],-1)
printHtmlPart(17)
invokeTag('message','g',102,['code':("minimumCostVar")],-1)
printHtmlPart(18)
invokeTag('message','g',113,['code':("dateStartVar")],-1)
printHtmlPart(19)
invokeTag('datePicker','g',117,['name':("myDateStart"),'id':("myDateStart"),'value':(dateNow),'precision':("minute"),'years':(date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2)],-1)
printHtmlPart(20)
invokeTag('message','g',122,['code':("dateEndVar")],-1)
printHtmlPart(19)
invokeTag('datePicker','g',126,['name':("myDateEnd"),'id':("myDateEnd"),'value':(dateNow),'precision':("minute"),'years':(date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2)],-1)
printHtmlPart(21)
invokeTag('datePicker','g',150,['name':("dateStart"),'id':("dateStart"),'value':(dateNow),'precision':("minute"),'years':(date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2)],-1)
printHtmlPart(22)
invokeTag('datePicker','g',154,['name':("dateEnd"),'id':("dateEnd"),'value':(dateNow),'precision':("minute"),'years':(date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2)],-1)
printHtmlPart(23)
invokeTag('message','g',161,['code':("send")],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',175,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416867371000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 26, 26, 26, 26, 33, 33, 33, 47, 49, 49, 51, 51, 51, 54, 54, 60, 60, 63, 63, 71, 71, 75, 75, 83, 83, 87, 87, 90, 90, 93, 93, 97, 97, 102, 102, 113, 113, 117, 117, 122, 122, 126, 126, 150, 150, 154, 154, 161, 161, 175, 175, 175, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "addProduct.gsp"
)
class ___LineNumberPlaceholder { }
