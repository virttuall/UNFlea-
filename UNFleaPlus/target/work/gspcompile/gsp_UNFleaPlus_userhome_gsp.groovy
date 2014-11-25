import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_UNFleaPlus_userhome_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/home.gsp" }
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
invokeTag('stylesheet','asset',8,['src':("home.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',9,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',10,['src':("home.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',11,['src':("dropzoneUpdateProduct.js")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',13,['src':("dropzone.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("toogleMenu.js")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',16,[:],1)
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
invokeTag('link','g',52,['controller':("user"),'action':("userRequest"),'params':([name:request])],4)
printHtmlPart(13)
}
printHtmlPart(14)
}
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',63,['controller':("user"),'action':("logout")],2)
printHtmlPart(17)
invokeTag('message','g',84,['code':("myProducts")],-1)
printHtmlPart(18)
invokeTag('message','g',92,['code':("homeMenu")],-1)
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('message','g',100,['code':("profile")],-1)
printHtmlPart(21)
})
invokeTag('link','g',102,['controller':("user"),'action':("viewHome")],2)
printHtmlPart(22)
invokeTag('message','g',107,['code':("products")],-1)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('message','g',115,['code':("addProduct")],-1)
printHtmlPart(25)
})
invokeTag('link','g',117,['controller':("product"),'action':("viewAddProduct")],2)
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
invokeTag('message','g',121,['code':("deleteProduct")],-1)
printHtmlPart(25)
})
invokeTag('link','g',123,['controller':("product"),'action':("viewDeleteProduct")],2)
printHtmlPart(28)
invokeTag('message','g',130,['code':("type")],-1)
printHtmlPart(29)
invokeTag('message','g',133,['code':("normalVar")],-1)
printHtmlPart(30)
invokeTag('message','g',137,['code':("auctionVar")],-1)
printHtmlPart(31)
invokeTag('message','g',141,['code':("donateVar")],-1)
printHtmlPart(32)
for( product in (products) ) {
printHtmlPart(33)
expressionOut.print(product.type+'_TYPE')
printHtmlPart(34)
expressionOut.print(product.name)
printHtmlPart(35)
if(true && (product.type == 'NORMAL')) {
printHtmlPart(36)
invokeTag('message','g',152,['code':("normalVar")],-1)
printHtmlPart(37)
}
else {
printHtmlPart(38)
if(true && (product.type == 'AUCTION')) {
printHtmlPart(39)
invokeTag('message','g',157,['code':("auctionVar")],-1)
printHtmlPart(40)
}
else {
printHtmlPart(41)
invokeTag('message','g',161,['code':("donateVar")],-1)
printHtmlPart(40)
}
printHtmlPart(42)
expressionOut.print(product.type)
printHtmlPart(43)
expressionOut.print(product.currentPrice)
printHtmlPart(44)
expressionOut.print(product.openingDate.format('M-d-yyyy h:mm a'))
printHtmlPart(45)
expressionOut.print(product.closingDate.format('M-d-yyyy h:mm a'))
printHtmlPart(46)
}
printHtmlPart(47)
expressionOut.print(product.getId())
printHtmlPart(48)
expressionOut.print(product.getId())
printHtmlPart(49)
expressionOut.print(product.image.size())
printHtmlPart(50)
expressionOut.print(product.getId())
printHtmlPart(51)
expressionOut.print(product.getName())
printHtmlPart(52)
expressionOut.print(product.getDescription())
printHtmlPart(53)
for( images in (product.image) ) {
printHtmlPart(54)
for( image in (images) ) {
printHtmlPart(55)
expressionOut.print(product.getId())
printHtmlPart(56)
expressionOut.print(image.getId())
printHtmlPart(57)
expressionOut.print(createLink(controller:'user', action:'product_image', id:image.getId()))
printHtmlPart(58)
}
printHtmlPart(59)
}
printHtmlPart(60)
}
printHtmlPart(61)
if(true && (totalProduct<10)) {
printHtmlPart(62)
invokeTag('paginate','g',216,['controller':("user"),'action':("list"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(63)
}
else {
printHtmlPart(64)
invokeTag('paginate','g',222,['controller':("user"),'action':("list"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(63)
}
printHtmlPart(65)
invokeTag('message','g',259,['code':("addImage")],-1)
printHtmlPart(66)
createTagBody(2, {->
printHtmlPart(59)
invokeTag('set','g',267,['var':("name_input"),'value':(g.message(code: 'nameVar')),'scope':("page")],-1)
printHtmlPart(59)
invokeTag('set','g',269,['var':("description_input"),'value':(g.message(code: 'descriptionVar')),'scope':("page")],-1)
printHtmlPart(59)
invokeTag('set','g',271,['var':("state_input"),'value':(g.message(code: 'stateVar')),'scope':("page")],-1)
printHtmlPart(67)
invokeTag('message','g',277,['code':("nameVar")],-1)
printHtmlPart(68)
expressionOut.print(name_input)
printHtmlPart(69)
invokeTag('message','g',288,['code':("descriptionVar")],-1)
printHtmlPart(70)
expressionOut.print(description_input)
printHtmlPart(71)
invokeTag('message','g',298,['code':("updateSend")],-1)
printHtmlPart(72)
})
invokeTag('form','g',301,['class':("form-horizontal"),'id':("update"),'url':([action:'updateData',controller:'product']),'method':("post")],2)
printHtmlPart(73)
invokeTag('message','g',321,['code':("addImage")],-1)
printHtmlPart(74)
createClosureForHtmlPart(75, 2)
invokeTag('form','g',332,['url':([action:'addImage',controller:'product']),'method':("post"),'class':("dropzone dz-clickable"),'enctype':("multipart/form-data"),'id':("updateImage"),'name':("files")],2)
printHtmlPart(76)
invokeTag('message','g',340,['code':("updateSend")],-1)
printHtmlPart(77)
invokeTag('message','g',357,['code':("additionalInfoVar")],-1)
printHtmlPart(78)
invokeTag('message','g',364,['code':("curPriceVar")],-1)
printHtmlPart(79)
invokeTag('message','g',371,['code':("dateStartVar")],-1)
printHtmlPart(80)
invokeTag('message','g',378,['code':("dateEndVar")],-1)
printHtmlPart(81)
invokeTag('message','g',399,['code':("confirmDeleteVar")],-1)
printHtmlPart(82)
invokeTag('message','g',405,['code':("deleteProductMessageVar")],-1)
printHtmlPart(83)
createClosureForHtmlPart(84, 2)
invokeTag('form','g',410,['id':("formDeleteProduct"),'url':([action:'deleteProduct',controller:'product']),'method':("post")],2)
printHtmlPart(85)
invokeTag('message','g',415,['code':("cancelVar")],-1)
printHtmlPart(86)
invokeTag('message','g',419,['code':("delete")],-1)
printHtmlPart(87)
invokeTag('message','g',436,['code':("confirmDeleteVar")],-1)
printHtmlPart(82)
invokeTag('message','g',442,['code':("deleteImageMessageVar")],-1)
printHtmlPart(83)
createClosureForHtmlPart(88, 2)
invokeTag('form','g',448,['id':("formDeleteImage"),'url':([action:'deleteImage',controller:'product']),'method':("post")],2)
printHtmlPart(85)
invokeTag('message','g',453,['code':("cancelVar")],-1)
printHtmlPart(89)
invokeTag('message','g',457,['code':("delete")],-1)
printHtmlPart(90)
})
invokeTag('captureBody','sitemesh',460,[:],1)
printHtmlPart(91)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416899145000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [462, 462, 462, 462, 462, 462, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 16, 16, 16, 17, 29, 29, 29, 29, 31, 31, 32, 32, 33, 33, 45, 45, 49, 50, 50, 50, 52, 52, 52, 52, 52, 52, 52, 54, 56, 56, 56, 63, 63, 63, 84, 84, 92, 92, 100, 100, 100, 100, 102, 102, 102, 107, 107, 115, 115, 115, 115, 117, 117, 117, 121, 121, 121, 121, 123, 123, 123, 130, 130, 133, 133, 137, 137, 141, 141, 143, 143, 144, 144, 147, 147, 150, 150, 152, 152, 153, 154, 155, 155, 155, 157, 157, 158, 159, 159, 161, 161, 162, 162, 165, 165, 166, 166, 167, 167, 168, 168, 172, 172, 176, 176, 180, 180, 181, 181, 185, 185, 185, 185, 186, 186, 192, 193, 193, 193, 199, 199, 200, 200, 204, 204, 208, 209, 209, 209, 212, 213, 213, 213, 216, 216, 218, 219, 219, 222, 222, 224, 224, 259, 259, 267, 267, 267, 269, 269, 271, 271, 271, 277, 277, 280, 280, 288, 288, 292, 292, 298, 298, 301, 301, 301, 321, 321, 332, 332, 333, 340, 340, 357, 357, 364, 364, 371, 371, 378, 378, 399, 399, 405, 405, 410, 410, 410, 415, 415, 419, 419, 436, 436, 442, 442, 448, 448, 448, 453, 453, 457, 457, 460, 460, 461, 462, 462, 462, 462, 462, 462, 462, 462, 462, 462, 462, 462, 462, 462],
	sourceName = "home.gsp"
)
class ___LineNumberPlaceholder { }
