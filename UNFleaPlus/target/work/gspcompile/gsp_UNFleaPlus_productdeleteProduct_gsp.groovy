import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_productdeleteProduct_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/deleteProduct.gsp" }
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
invokeTag('stylesheet','asset',6,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',7,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("deleteProduct.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',10,['src':("deleteProduct.js")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
expressionOut.print(params.name)
printHtmlPart(4)
createClosureForHtmlPart(5, 2)
invokeTag('link','g',31,['controller':("user"),'action':("logout")],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
for( product in (products) ) {
printHtmlPart(8)
expressionOut.print(product.name)
printHtmlPart(9)
expressionOut.print(product.getId())
printHtmlPart(10)
expressionOut.print(product.getId())
printHtmlPart(11)
expressionOut.print(product.name)
printHtmlPart(12)
expressionOut.print(product.name)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('message','g',47,['code':("delete")],-1)
printHtmlPart(15)
})
invokeTag('form','g',51,['class':("form-horizontal"),'controller':("product"),'action':("deleteProduct1"),'method':("post"),'name':("myForm")],2)
printHtmlPart(16)
if(true && (totalProduct<10)) {
printHtmlPart(17)
invokeTag('paginate','g',58,['controller':("product"),'action':("viewDeleteProduct"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(18)
}
else {
printHtmlPart(19)
invokeTag('paginate','g',64,['controller':("product"),'action':("viewDeleteProduct"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(18)
}
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',72,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416867372000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 12, 12, 12, 13, 24, 24, 24, 24, 31, 31, 31, 43, 43, 43, 43, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 45, 45, 47, 47, 51, 51, 51, 55, 55, 58, 58, 60, 61, 61, 64, 64, 66, 66, 72, 72, 72, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "deleteProduct.gsp"
)
class ___LineNumberPlaceholder { }
