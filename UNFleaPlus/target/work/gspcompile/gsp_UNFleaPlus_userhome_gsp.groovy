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
invokeTag('stylesheet','asset',8,['src':("dropzone.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("init.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("home.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',11,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',12,['src':("navbar.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',13,['src':("search.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',14,['src':("sticky-footer.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("bootstrap-typeahead.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',17,['src':("home.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',18,['src':("img-modal.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',19,['src':("dropzoneUpdateProduct.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',20,['src':("search.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',21,['src':("toogleMenu.js")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',26,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
if(true && (user.avatar)) {
printHtmlPart(5)
createTagBody(3, {->
printHtmlPart(6)
expressionOut.print(createLink(controller:'user', action:'avatar_image', id:user.ident()))
printHtmlPart(7)
})
invokeTag('link','g',45,['controller':("user"),'action':("viewHome"),'class':("font-menu")],3)
printHtmlPart(8)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(user.username)
printHtmlPart(8)
})
invokeTag('link','g',50,['controller':("user"),'action':("viewHome"),'class':("navbar-brand font-menu")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('set','g',59,['var':("search1"),'value':(g.message(code:'searchProducts')),'scope':("page")],-1)
printHtmlPart(11)
expressionOut.print(search1)
printHtmlPart(12)
})
invokeTag('form','g',69,['class':("navbar-form navbar-left"),'role':("search"),'controller':("product"),'action':("searchProduct")],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',73,['code':("default.home.label")],-1)
printHtmlPart(15)
})
invokeTag('link','g',74,['controller':("index"),'action':("viewHome")],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',76,['code':("myProducts")],-1)
printHtmlPart(15)
})
invokeTag('link','g',77,['controller':("user"),'action':("viewHome")],2)
printHtmlPart(17)
expressionOut.print(totalMessages)
printHtmlPart(18)
invokeTag('remoteFunction','g',85,['action':("ChatMessages"),'controller':("user"),'update':("totalMessages")],-1)
printHtmlPart(19)
if(true && (messages)) {
printHtmlPart(20)
for( message in (remoteFunction(
                           action:'ChatMessages',
						   controller:'usre' 
                            )) ) {
printHtmlPart(21)
expressionOut.print(message)
printHtmlPart(22)
expressionOut.print(message)
printHtmlPart(23)
}
printHtmlPart(24)
}
printHtmlPart(25)
expressionOut.print(totalRequest)
printHtmlPart(26)
if(true && (requests)) {
printHtmlPart(27)
for( request in (requests) ) {
printHtmlPart(28)
createTagBody(4, {->
printHtmlPart(29)
expressionOut.print(request)
printHtmlPart(20)
})
invokeTag('link','g',120,['controller':("user"),'action':("userRequest"),'params':([name:request])],4)
printHtmlPart(30)
}
printHtmlPart(31)
}
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',130,['code':("logout")],-1)
printHtmlPart(15)
})
invokeTag('link','g',131,['controller':("user"),'action':("logout")],2)
printHtmlPart(33)
invokeTag('message','g',133,['code':("more")],-1)
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('message','g',142,['code':("contactUs")],-1)
printHtmlPart(27)
})
invokeTag('link','g',143,['controller':("index"),'action':("viewContactUs")],2)
printHtmlPart(35)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('message','g',145,['code':("aboutUs")],-1)
printHtmlPart(27)
})
invokeTag('link','g',146,['controller':("index"),'action':("viewAboutUs")],2)
printHtmlPart(36)
invokeTag('message','g',169,['code':("myProducts")],-1)
printHtmlPart(37)
invokeTag('message','g',177,['code':("homeMenu")],-1)
printHtmlPart(38)
createTagBody(2, {->
printHtmlPart(39)
invokeTag('message','g',185,['code':("profile")],-1)
printHtmlPart(40)
})
invokeTag('link','g',187,['controller':("user"),'action':("viewHome")],2)
printHtmlPart(41)
invokeTag('message','g',192,['code':("products")],-1)
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
invokeTag('message','g',200,['code':("addProduct")],-1)
printHtmlPart(44)
})
invokeTag('link','g',202,['controller':("product"),'action':("viewAddProduct")],2)
printHtmlPart(45)
createTagBody(2, {->
printHtmlPart(46)
invokeTag('message','g',206,['code':("deleteProduct")],-1)
printHtmlPart(44)
})
invokeTag('link','g',208,['controller':("product"),'action':("viewDeleteProduct")],2)
printHtmlPart(47)
invokeTag('message','g',215,['code':("type")],-1)
printHtmlPart(48)
invokeTag('message','g',218,['code':("normalVar")],-1)
printHtmlPart(49)
invokeTag('message','g',222,['code':("auctionVar")],-1)
printHtmlPart(50)
invokeTag('message','g',226,['code':("donateVar")],-1)
printHtmlPart(51)
for( product in (products) ) {
printHtmlPart(52)
expressionOut.print(product.type+'_TYPE')
printHtmlPart(53)
expressionOut.print(product.name)
printHtmlPart(54)
if(true && (product.type == 'NORMAL')) {
printHtmlPart(55)
invokeTag('message','g',237,['code':("normalVar")],-1)
printHtmlPart(56)
}
else {
printHtmlPart(20)
if(true && (product.type == 'AUCTION')) {
printHtmlPart(57)
invokeTag('message','g',242,['code':("auctionVar")],-1)
printHtmlPart(58)
}
else {
printHtmlPart(59)
invokeTag('message','g',246,['code':("donateVar")],-1)
printHtmlPart(58)
}
printHtmlPart(60)
expressionOut.print(product.type)
printHtmlPart(61)
expressionOut.print(product.currentPrice)
printHtmlPart(62)
expressionOut.print(product.openingDate.format('M-d-yyyy h:mm a'))
printHtmlPart(63)
expressionOut.print(product.closingDate.format('M-d-yyyy h:mm a'))
printHtmlPart(64)
}
printHtmlPart(65)
expressionOut.print(product.getId())
printHtmlPart(66)
expressionOut.print(product.getId())
printHtmlPart(67)
expressionOut.print(product.image.size())
printHtmlPart(68)
expressionOut.print(product.getId())
printHtmlPart(69)
expressionOut.print(product.getName())
printHtmlPart(70)
expressionOut.print(product.getDescription())
printHtmlPart(71)
for( images in (product.image) ) {
printHtmlPart(24)
for( image in (images) ) {
printHtmlPart(72)
expressionOut.print(product.getId())
printHtmlPart(73)
expressionOut.print(image.getId())
printHtmlPart(74)
expressionOut.print(createLink(controller:'user', action:'product_image', id:image.getId()))
printHtmlPart(75)
}
printHtmlPart(27)
}
printHtmlPart(76)
}
printHtmlPart(5)
if(true && (totalProduct<10)) {
printHtmlPart(77)
invokeTag('paginate','g',301,['controller':("user"),'action':("list"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(78)
}
else {
printHtmlPart(79)
invokeTag('paginate','g',307,['controller':("user"),'action':("list"),'max':("10"),'total':(totalProduct?:0)],-1)
printHtmlPart(78)
}
printHtmlPart(80)
invokeTag('message','g',344,['code':("addImage")],-1)
printHtmlPart(81)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('set','g',352,['var':("name_input"),'value':(g.message(code: 'nameVar')),'scope':("page")],-1)
printHtmlPart(15)
invokeTag('set','g',354,['var':("description_input"),'value':(g.message(code: 'descriptionVar')),'scope':("page")],-1)
printHtmlPart(15)
invokeTag('set','g',356,['var':("state_input"),'value':(g.message(code: 'stateVar')),'scope':("page")],-1)
printHtmlPart(82)
invokeTag('message','g',362,['code':("nameVar")],-1)
printHtmlPart(83)
expressionOut.print(name_input)
printHtmlPart(84)
invokeTag('message','g',373,['code':("descriptionVar")],-1)
printHtmlPart(85)
expressionOut.print(description_input)
printHtmlPart(86)
invokeTag('message','g',383,['code':("updateSend")],-1)
printHtmlPart(87)
})
invokeTag('form','g',386,['class':("form-horizontal"),'id':("update"),'url':([action:'updateData',controller:'product']),'method':("post")],2)
printHtmlPart(88)
invokeTag('message','g',406,['code':("addImage")],-1)
printHtmlPart(89)
createClosureForHtmlPart(90, 2)
invokeTag('form','g',417,['url':([action:'addImage',controller:'product']),'method':("post"),'class':("dropzone dz-clickable"),'enctype':("multipart/form-data"),'id':("updateImage"),'name':("files")],2)
printHtmlPart(91)
invokeTag('message','g',425,['code':("updateSend")],-1)
printHtmlPart(92)
invokeTag('message','g',442,['code':("additionalInfoVar")],-1)
printHtmlPart(93)
invokeTag('message','g',449,['code':("curPriceVar")],-1)
printHtmlPart(94)
invokeTag('message','g',456,['code':("dateStartVar")],-1)
printHtmlPart(95)
invokeTag('message','g',463,['code':("dateEndVar")],-1)
printHtmlPart(96)
invokeTag('message','g',484,['code':("confirmDeleteVar")],-1)
printHtmlPart(97)
invokeTag('message','g',490,['code':("deleteProductMessageVar")],-1)
printHtmlPart(98)
createClosureForHtmlPart(99, 2)
invokeTag('form','g',494,['id':("formDeleteProduct"),'url':([action:'deleteProduct',controller:'product']),'method':("post")],2)
printHtmlPart(100)
invokeTag('message','g',498,['code':("cancelVar")],-1)
printHtmlPart(101)
invokeTag('message','g',502,['code':("delete")],-1)
printHtmlPart(102)
invokeTag('message','g',519,['code':("confirmDeleteVar")],-1)
printHtmlPart(97)
invokeTag('message','g',524,['code':("deleteImageMessageVar")],-1)
printHtmlPart(98)
createClosureForHtmlPart(103, 2)
invokeTag('form','g',531,['id':("formDeleteImage"),'url':([action:'deleteImage',controller:'product']),'method':("post")],2)
printHtmlPart(100)
invokeTag('message','g',535,['code':("cancelVar")],-1)
printHtmlPart(104)
invokeTag('message','g',539,['code':("delete")],-1)
printHtmlPart(105)
expressionOut.print(search)
printHtmlPart(106)
if(true && (flash.message)) {
printHtmlPart(107)
expressionOut.print(flash.message)
printHtmlPart(108)
}
printHtmlPart(109)
createTagBody(2, {->
printHtmlPart(110)
invokeTag('image','asset',561,['src':("ingles.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(111)
})
invokeTag('link','g',561,['controller':("index"),'action':("viewHome"),'params':([lang:'en'])],2)
printHtmlPart(111)
createTagBody(2, {->
printHtmlPart(110)
invokeTag('image','asset',565,['src':("espanol.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(111)
})
invokeTag('link','g',565,['controller':("index"),'action':("viewHome"),'params':([lang:'es'])],2)
printHtmlPart(112)
invokeTag('image','asset',572,['src':("facebook.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(113)
invokeTag('image','asset',574,['src':("twitter.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(114)
invokeTag('image','asset',576,['src':("github.png"),'alt':("UNFlea+"),'height':("40px"),'width':("40px")],-1)
printHtmlPart(115)
expressionOut.print(search)
printHtmlPart(116)
invokeTag('remoteFunction','g',622,['action':("submitMessage"),'controller':("chat"),'params':("\'message=\'+message+'///////////////'+myUser"),'update':("temp")],-1)
printHtmlPart(117)
invokeTag('remoteFunction','g',637,['action':("submitMessage"),'controller':("chat"),'params':("\'message=\'+message+'///////////////'+myUser"),'update':("temp")],-1)
printHtmlPart(118)
invokeTag('remoteFunction','g',646,['action':("retrieveLatestMessages"),'controller':("chat"),'update':("chatMessages")],-1)
printHtmlPart(119)
})
invokeTag('captureBody','sitemesh',650,[:],1)
printHtmlPart(120)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418061970000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [652, 652, 652, 652, 652, 652, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 26, 26, 26, 27, 41, 41, 41, 42, 44, 44, 44, 44, 45, 45, 46, 46, 48, 49, 49, 49, 50, 50, 50, 50, 59, 59, 59, 59, 61, 61, 69, 69, 69, 73, 73, 73, 74, 74, 74, 74, 76, 76, 76, 77, 77, 77, 77, 83, 83, 85, 85, 87, 91, 91, 91, 92, 92, 93, 93, 96, 97, 97, 97, 109, 109, 115, 116, 116, 116, 119, 119, 119, 120, 120, 120, 120, 121, 123, 123, 123, 130, 130, 130, 131, 131, 131, 131, 133, 133, 142, 142, 142, 143, 143, 143, 143, 145, 145, 145, 146, 146, 146, 146, 169, 169, 177, 177, 185, 185, 185, 185, 187, 187, 187, 192, 192, 200, 200, 200, 200, 202, 202, 202, 206, 206, 206, 206, 208, 208, 208, 215, 215, 218, 218, 222, 222, 226, 226, 228, 228, 229, 229, 232, 232, 235, 235, 237, 237, 238, 239, 240, 240, 240, 242, 242, 243, 244, 244, 246, 246, 247, 247, 250, 250, 251, 251, 252, 252, 253, 253, 257, 257, 261, 261, 265, 265, 266, 266, 270, 270, 270, 270, 271, 271, 277, 278, 278, 278, 284, 284, 285, 285, 289, 289, 293, 294, 294, 294, 297, 298, 298, 298, 301, 301, 303, 304, 304, 307, 307, 309, 309, 344, 344, 352, 352, 352, 354, 354, 356, 356, 356, 362, 362, 365, 365, 373, 373, 377, 377, 383, 383, 386, 386, 386, 406, 406, 417, 417, 418, 425, 425, 442, 442, 449, 449, 456, 456, 463, 463, 484, 484, 490, 490, 494, 494, 494, 498, 498, 502, 502, 519, 519, 524, 525, 531, 531, 531, 535, 535, 539, 539, 546, 547, 553, 553, 554, 554, 555, 555, 561, 561, 561, 561, 561, 561, 564, 565, 565, 565, 565, 565, 565, 565, 572, 572, 574, 574, 576, 576, 610, 611, 622, 622, 637, 637, 646, 646, 650, 650, 652, 652, 652, 652, 652, 652, 652, 652, 652, 652, 652, 652, 652, 652, 652],
	sourceName = "home.gsp"
)
class ___LineNumberPlaceholder { }
