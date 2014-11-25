if(Object.isUndefined(Effect))throw"dragdrop.js requires including script.aculo.us' effects.js library";var Droppables={drops:[],remove:function(e){this.drops=this.drops.reject(function(t){return t.element==$(e)})},add:function(e){e=$(e);var t=Object.extend({greedy:true,hoverclass:null,tree:false},arguments[1]||{});if(t.containment){t._containers=[];var n=t.containment;if(Object.isArray(n)){n.each(function(e){t._containers.push($(e))})}else{t._containers.push($(n))}}if(t.accept)t.accept=[t.accept].flatten();Element.makePositioned(e);t.element=e;this.drops.push(t)},findDeepestChild:function(e){deepest=e[0];for(i=1;i<e.length;++i)if(Element.isParent(e[i].element,deepest.element))deepest=e[i];return deepest},isContained:function(e,t){var n;if(t.tree){n=e.treeNode}else{n=e.parentNode}return t._containers.detect(function(e){return n==e})},isAffected:function(e,t,n){return n.element!=t&&(!n._containers||this.isContained(t,n))&&(!n.accept||Element.classNames(t).detect(function(e){return n.accept.include(e)}))&&Position.within(n.element,e[0],e[1])},deactivate:function(e){if(e.hoverclass)Element.removeClassName(e.element,e.hoverclass);this.last_active=null},activate:function(e){if(e.hoverclass)Element.addClassName(e.element,e.hoverclass);this.last_active=e},show:function(e,t){if(!this.drops.length)return;var n,r=[];this.drops.each(function(n){if(Droppables.isAffected(e,t,n))r.push(n)});if(r.length>0)n=Droppables.findDeepestChild(r);if(this.last_active&&this.last_active!=n)this.deactivate(this.last_active);if(n){Position.within(n.element,e[0],e[1]);if(n.onHover)n.onHover(t,n.element,Position.overlap(n.overlap,n.element));if(n!=this.last_active)Droppables.activate(n)}},fire:function(e,t){if(!this.last_active)return;Position.prepare();if(this.isAffected([Event.pointerX(e),Event.pointerY(e)],t,this.last_active))if(this.last_active.onDrop){this.last_active.onDrop(t,this.last_active.element,e);return true}},reset:function(){if(this.last_active)this.deactivate(this.last_active)}};var Draggables={drags:[],observers:[],register:function(e){if(this.drags.length==0){this.eventMouseUp=this.endDrag.bindAsEventListener(this);this.eventMouseMove=this.updateDrag.bindAsEventListener(this);this.eventKeypress=this.keyPress.bindAsEventListener(this);Event.observe(document,"mouseup",this.eventMouseUp);Event.observe(document,"mousemove",this.eventMouseMove);Event.observe(document,"keypress",this.eventKeypress)}this.drags.push(e)},unregister:function(e){this.drags=this.drags.reject(function(t){return t==e});if(this.drags.length==0){Event.stopObserving(document,"mouseup",this.eventMouseUp);Event.stopObserving(document,"mousemove",this.eventMouseMove);Event.stopObserving(document,"keypress",this.eventKeypress)}},activate:function(e){if(e.options.delay){this._timeout=setTimeout(function(){Draggables._timeout=null;window.focus();Draggables.activeDraggable=e}.bind(this),e.options.delay)}else{window.focus();this.activeDraggable=e}},deactivate:function(){this.activeDraggable=null},updateDrag:function(e){if(!this.activeDraggable)return;var t=[Event.pointerX(e),Event.pointerY(e)];if(this._lastPointer&&this._lastPointer.inspect()==t.inspect())return;this._lastPointer=t;this.activeDraggable.updateDrag(e,t)},endDrag:function(e){if(this._timeout){clearTimeout(this._timeout);this._timeout=null}if(!this.activeDraggable)return;this._lastPointer=null;this.activeDraggable.endDrag(e);this.activeDraggable=null},keyPress:function(e){if(this.activeDraggable)this.activeDraggable.keyPress(e)},addObserver:function(e){this.observers.push(e);this._cacheObserverCallbacks()},removeObserver:function(e){this.observers=this.observers.reject(function(t){return t.element==e});this._cacheObserverCallbacks()},notify:function(e,t,n){if(this[e+"Count"]>0)this.observers.each(function(r){if(r[e])r[e](e,t,n)});if(t.options[e])t.options[e](t,n)},_cacheObserverCallbacks:function(){["onStart","onEnd","onDrag"].each(function(e){Draggables[e+"Count"]=Draggables.observers.select(function(t){return t[e]}).length})}};var Draggable=Class.create({initialize:function(e){var t={handle:false,reverteffect:function(e,t,n){var r=Math.sqrt(Math.abs(t^2)+Math.abs(n^2))*.02;new Effect.Move(e,{x:-n,y:-t,duration:r,queue:{scope:"_draggable",position:"end"}})},endeffect:function(e){var t=Object.isNumber(e._opacity)?e._opacity:1;new Effect.Opacity(e,{duration:.2,from:.7,to:t,queue:{scope:"_draggable",position:"end"},afterFinish:function(){Draggable._dragging[e]=false}})},zindex:1e3,revert:false,quiet:false,scroll:false,scrollSensitivity:20,scrollSpeed:15,snap:false,delay:0};if(!arguments[1]||Object.isUndefined(arguments[1].endeffect))Object.extend(t,{starteffect:function(e){e._opacity=Element.getOpacity(e);Draggable._dragging[e]=true;new Effect.Opacity(e,{duration:.2,from:e._opacity,to:.7})}});var n=Object.extend(t,arguments[1]||{});this.element=$(e);if(n.handle&&Object.isString(n.handle))this.handle=this.element.down("."+n.handle,0);if(!this.handle)this.handle=$(n.handle);if(!this.handle)this.handle=this.element;if(n.scroll&&!n.scroll.scrollTo&&!n.scroll.outerHTML){n.scroll=$(n.scroll);this._isScrollChild=Element.childOf(this.element,n.scroll)}Element.makePositioned(this.element);this.options=n;this.dragging=false;this.eventMouseDown=this.initDrag.bindAsEventListener(this);Event.observe(this.handle,"mousedown",this.eventMouseDown);Draggables.register(this)},destroy:function(){Event.stopObserving(this.handle,"mousedown",this.eventMouseDown);Draggables.unregister(this)},currentDelta:function(){return[parseInt(Element.getStyle(this.element,"left")||"0"),parseInt(Element.getStyle(this.element,"top")||"0")]},initDrag:function(e){if(!Object.isUndefined(Draggable._dragging[this.element])&&Draggable._dragging[this.element])return;if(Event.isLeftClick(e)){var t=Event.element(e);if((tag_name=t.tagName.toUpperCase())&&(tag_name=="INPUT"||tag_name=="SELECT"||tag_name=="OPTION"||tag_name=="BUTTON"||tag_name=="TEXTAREA"))return;var n=[Event.pointerX(e),Event.pointerY(e)];var r=this.element.cumulativeOffset();this.offset=[0,1].map(function(e){return n[e]-r[e]});Draggables.activate(this);Event.stop(e)}},startDrag:function(e){this.dragging=true;if(!this.delta)this.delta=this.currentDelta();if(this.options.zindex){this.originalZ=parseInt(Element.getStyle(this.element,"z-index")||0);this.element.style.zIndex=this.options.zindex}if(this.options.ghosting){this._clone=this.element.cloneNode(true);this._originallyAbsolute=this.element.getStyle("position")=="absolute";if(!this._originallyAbsolute)Position.absolutize(this.element);this.element.parentNode.insertBefore(this._clone,this.element)}if(this.options.scroll){if(this.options.scroll==window){var t=this._getWindowScroll(this.options.scroll);this.originalScrollLeft=t.left;this.originalScrollTop=t.top}else{this.originalScrollLeft=this.options.scroll.scrollLeft;this.originalScrollTop=this.options.scroll.scrollTop}}Draggables.notify("onStart",this,e);if(this.options.starteffect)this.options.starteffect(this.element)},updateDrag:function(event,pointer){if(!this.dragging)this.startDrag(event);if(!this.options.quiet){Position.prepare();Droppables.show(pointer,this.element)}Draggables.notify("onDrag",this,event);this.draw(pointer);if(this.options.change)this.options.change(this);if(this.options.scroll){this.stopScrolling();var p;if(this.options.scroll==window){with(this._getWindowScroll(this.options.scroll)){p=[left,top,left+width,top+height]}}else{p=Position.page(this.options.scroll);p[0]+=this.options.scroll.scrollLeft+Position.deltaX;p[1]+=this.options.scroll.scrollTop+Position.deltaY;p.push(p[0]+this.options.scroll.offsetWidth);p.push(p[1]+this.options.scroll.offsetHeight)}var speed=[0,0];if(pointer[0]<p[0]+this.options.scrollSensitivity)speed[0]=pointer[0]-(p[0]+this.options.scrollSensitivity);if(pointer[1]<p[1]+this.options.scrollSensitivity)speed[1]=pointer[1]-(p[1]+this.options.scrollSensitivity);if(pointer[0]>p[2]-this.options.scrollSensitivity)speed[0]=pointer[0]-(p[2]-this.options.scrollSensitivity);if(pointer[1]>p[3]-this.options.scrollSensitivity)speed[1]=pointer[1]-(p[3]-this.options.scrollSensitivity);this.startScrolling(speed)}if(Prototype.Browser.WebKit)window.scrollBy(0,0);Event.stop(event)},finishDrag:function(e,t){this.dragging=false;if(this.options.quiet){Position.prepare();var n=[Event.pointerX(e),Event.pointerY(e)];Droppables.show(n,this.element)}if(this.options.ghosting){if(!this._originallyAbsolute)Position.relativize(this.element);delete this._originallyAbsolute;Element.remove(this._clone);this._clone=null}var r=false;if(t){r=Droppables.fire(e,this.element);if(!r)r=false}if(r&&this.options.onDropped)this.options.onDropped(this.element);Draggables.notify("onEnd",this,e);var i=this.options.revert;if(i&&Object.isFunction(i))i=i(this.element);var s=this.currentDelta();if(i&&this.options.reverteffect){if(r==0||i!="failure")this.options.reverteffect(this.element,s[1]-this.delta[1],s[0]-this.delta[0])}else{this.delta=s}if(this.options.zindex)this.element.style.zIndex=this.originalZ;if(this.options.endeffect)this.options.endeffect(this.element);Draggables.deactivate(this);Droppables.reset()},keyPress:function(e){if(e.keyCode!=Event.KEY_ESC)return;this.finishDrag(e,false);Event.stop(e)},endDrag:function(e){if(!this.dragging)return;this.stopScrolling();this.finishDrag(e,true);Event.stop(e)},draw:function(e){var t=this.element.cumulativeOffset();if(this.options.ghosting){var n=Position.realOffset(this.element);t[0]+=n[0]-Position.deltaX;t[1]+=n[1]-Position.deltaY}var r=this.currentDelta();t[0]-=r[0];t[1]-=r[1];if(this.options.scroll&&this.options.scroll!=window&&this._isScrollChild){t[0]-=this.options.scroll.scrollLeft-this.originalScrollLeft;t[1]-=this.options.scroll.scrollTop-this.originalScrollTop}var i=[0,1].map(function(n){return e[n]-t[n]-this.offset[n]}.bind(this));if(this.options.snap){if(Object.isFunction(this.options.snap)){i=this.options.snap(i[0],i[1],this)}else{if(Object.isArray(this.options.snap)){i=i.map(function(e,t){return(e/this.options.snap[t]).round()*this.options.snap[t]}.bind(this))}else{i=i.map(function(e){return(e/this.options.snap).round()*this.options.snap}.bind(this))}}}var s=this.element.style;if(!this.options.constraint||this.options.constraint=="horizontal")s.left=i[0]+"px";if(!this.options.constraint||this.options.constraint=="vertical")s.top=i[1]+"px";if(s.visibility=="hidden")s.visibility=""},stopScrolling:function(){if(this.scrollInterval){clearInterval(this.scrollInterval);this.scrollInterval=null;Draggables._lastScrollPointer=null}},startScrolling:function(e){if(!(e[0]||e[1]))return;this.scrollSpeed=[e[0]*this.options.scrollSpeed,e[1]*this.options.scrollSpeed];this.lastScrolled=new Date;this.scrollInterval=setInterval(this.scroll.bind(this),10)},scroll:function(){var current=new Date;var delta=current-this.lastScrolled;this.lastScrolled=current;if(this.options.scroll==window){with(this._getWindowScroll(this.options.scroll)){if(this.scrollSpeed[0]||this.scrollSpeed[1]){var d=delta/1e3;this.options.scroll.scrollTo(left+d*this.scrollSpeed[0],top+d*this.scrollSpeed[1])}}}else{this.options.scroll.scrollLeft+=this.scrollSpeed[0]*delta/1e3;this.options.scroll.scrollTop+=this.scrollSpeed[1]*delta/1e3}Position.prepare();Droppables.show(Draggables._lastPointer,this.element);Draggables.notify("onDrag",this);if(this._isScrollChild){Draggables._lastScrollPointer=Draggables._lastScrollPointer||$A(Draggables._lastPointer);Draggables._lastScrollPointer[0]+=this.scrollSpeed[0]*delta/1e3;Draggables._lastScrollPointer[1]+=this.scrollSpeed[1]*delta/1e3;if(Draggables._lastScrollPointer[0]<0)Draggables._lastScrollPointer[0]=0;if(Draggables._lastScrollPointer[1]<0)Draggables._lastScrollPointer[1]=0;this.draw(Draggables._lastScrollPointer)}if(this.options.change)this.options.change(this)},_getWindowScroll:function(w){var T,L,W,H;with(w.document){if(w.document.documentElement&&documentElement.scrollTop){T=documentElement.scrollTop;L=documentElement.scrollLeft}else if(w.document.body){T=body.scrollTop;L=body.scrollLeft}if(w.innerWidth){W=w.innerWidth;H=w.innerHeight}else if(w.document.documentElement&&documentElement.clientWidth){W=documentElement.clientWidth;H=documentElement.clientHeight}else{W=body.offsetWidth;H=body.offsetHeight}}return{top:T,left:L,width:W,height:H}}});Draggable._dragging={};var SortableObserver=Class.create({initialize:function(e,t){this.element=$(e);this.observer=t;this.lastValue=Sortable.serialize(this.element)},onStart:function(){this.lastValue=Sortable.serialize(this.element)},onEnd:function(){Sortable.unmark();if(this.lastValue!=Sortable.serialize(this.element))this.observer(this.element)}});var Sortable={SERIALIZE_RULE:/^[^_\-](?:[A-Za-z0-9\-\_]*)[_](.*)$/,sortables:{},_findRootElement:function(e){while(e.tagName.toUpperCase()!="BODY"){if(e.id&&Sortable.sortables[e.id])return e;e=e.parentNode}},options:function(e){e=Sortable._findRootElement($(e));if(!e)return;return Sortable.sortables[e.id]},destroy:function(e){e=$(e);var t=Sortable.sortables[e.id];if(t){Draggables.removeObserver(t.element);t.droppables.each(function(e){Droppables.remove(e)});t.draggables.invoke("destroy");delete Sortable.sortables[t.element.id]}},create:function(e){e=$(e);var t=Object.extend({element:e,tag:"li",dropOnEmpty:false,tree:false,treeTag:"ul",overlap:"vertical",constraint:"vertical",containment:e,handle:false,only:false,delay:0,hoverclass:null,ghosting:false,quiet:false,scroll:false,scrollSensitivity:20,scrollSpeed:15,format:this.SERIALIZE_RULE,elements:false,handles:false,onChange:Prototype.emptyFunction,onUpdate:Prototype.emptyFunction},arguments[1]||{});this.destroy(e);var n={revert:true,quiet:t.quiet,scroll:t.scroll,scrollSpeed:t.scrollSpeed,scrollSensitivity:t.scrollSensitivity,delay:t.delay,ghosting:t.ghosting,constraint:t.constraint,handle:t.handle};if(t.starteffect)n.starteffect=t.starteffect;if(t.reverteffect)n.reverteffect=t.reverteffect;else if(t.ghosting)n.reverteffect=function(e){e.style.top=0;e.style.left=0};if(t.endeffect)n.endeffect=t.endeffect;if(t.zindex)n.zindex=t.zindex;var r={overlap:t.overlap,containment:t.containment,tree:t.tree,hoverclass:t.hoverclass,onHover:Sortable.onHover};var i={onHover:Sortable.onEmptyHover,overlap:t.overlap,containment:t.containment,hoverclass:t.hoverclass};Element.cleanWhitespace(e);t.draggables=[];t.droppables=[];if(t.dropOnEmpty||t.tree){Droppables.add(e,i);t.droppables.push(e)}(t.elements||this.findElements(e,t)||[]).each(function(i,s){var o=t.handles?$(t.handles[s]):t.handle?$(i).select("."+t.handle)[0]:i;t.draggables.push(new Draggable(i,Object.extend(n,{handle:o})));Droppables.add(i,r);if(t.tree)i.treeNode=e;t.droppables.push(i)});if(t.tree){(Sortable.findTreeElements(e,t)||[]).each(function(n){Droppables.add(n,i);n.treeNode=e;t.droppables.push(n)})}this.sortables[e.identify()]=t;Draggables.addObserver(new SortableObserver(e,t.onUpdate))},findElements:function(e,t){return Element.findChildren(e,t.only,t.tree?true:false,t.tag)},findTreeElements:function(e,t){return Element.findChildren(e,t.only,t.tree?true:false,t.treeTag)},onHover:function(e,t,n){if(Element.isParent(t,e))return;if(n>.33&&n<.66&&Sortable.options(t).tree){return}else if(n>.5){Sortable.mark(t,"before");if(t.previousSibling!=e){var r=e.parentNode;e.style.visibility="hidden";t.parentNode.insertBefore(e,t);if(t.parentNode!=r)Sortable.options(r).onChange(e);Sortable.options(t.parentNode).onChange(e)}}else{Sortable.mark(t,"after");var i=t.nextSibling||null;if(i!=e){var r=e.parentNode;e.style.visibility="hidden";t.parentNode.insertBefore(e,i);if(t.parentNode!=r)Sortable.options(r).onChange(e);Sortable.options(t.parentNode).onChange(e)}}},onEmptyHover:function(e,t,n){var r=e.parentNode;var i=Sortable.options(t);if(!Element.isParent(t,e)){var s;var o=Sortable.findElements(t,{tag:i.tag,only:i.only});var u=null;if(o){var a=Element.offsetSize(t,i.overlap)*(1-n);for(s=0;s<o.length;s+=1){if(a-Element.offsetSize(o[s],i.overlap)>=0){a-=Element.offsetSize(o[s],i.overlap)}else if(a-Element.offsetSize(o[s],i.overlap)/2>=0){u=s+1<o.length?o[s+1]:null;break}else{u=o[s];break}}}t.insertBefore(e,u);Sortable.options(r).onChange(e);i.onChange(e)}},unmark:function(){if(Sortable._marker)Sortable._marker.hide()},mark:function(e,t){var n=Sortable.options(e.parentNode);if(n&&!n.ghosting)return;if(!Sortable._marker){Sortable._marker=($("dropmarker")||Element.extend(document.createElement("DIV"))).hide().addClassName("dropmarker").setStyle({position:"absolute"});document.getElementsByTagName("body").item(0).appendChild(Sortable._marker)}var r=e.cumulativeOffset();Sortable._marker.setStyle({left:r[0]+"px",top:r[1]+"px"});if(t=="after")if(n.overlap=="horizontal")Sortable._marker.setStyle({left:r[0]+e.clientWidth+"px"});else Sortable._marker.setStyle({top:r[1]+e.clientHeight+"px"});Sortable._marker.show()},_tree:function(e,t,n){var r=Sortable.findElements(e,t)||[];for(var i=0;i<r.length;++i){var s=r[i].id.match(t.format);if(!s)continue;var o={id:encodeURIComponent(s?s[1]:null),element:e,parent:n,children:[],position:n.children.length,container:$(r[i]).down(t.treeTag)};if(o.container)this._tree(o.container,t,o);n.children.push(o)}return n},tree:function(e){e=$(e);var t=this.options(e);var n=Object.extend({tag:t.tag,treeTag:t.treeTag,only:t.only,name:e.id,format:t.format},arguments[1]||{});var r={id:null,parent:null,children:[],container:e,position:0};return Sortable._tree(e,n,r)},_constructIndex:function(e){var t="";do{if(e.id)t="["+e.position+"]"+t}while((e=e.parent)!=null);return t},sequence:function(e){e=$(e);var t=Object.extend(this.options(e),arguments[1]||{});return $(this.findElements(e,t)||[]).map(function(e){return e.id.match(t.format)?e.id.match(t.format)[1]:""})},setSequence:function(e,t){e=$(e);var n=Object.extend(this.options(e),arguments[2]||{});var r={};this.findElements(e,n).each(function(e){if(e.id.match(n.format))r[e.id.match(n.format)[1]]=[e,e.parentNode];e.parentNode.removeChild(e)});t.each(function(e){var t=r[e];if(t){t[1].appendChild(t[0]);delete r[e]}})},serialize:function(e){e=$(e);var t=Object.extend(Sortable.options(e),arguments[1]||{});var n=encodeURIComponent(arguments[1]&&arguments[1].name?arguments[1].name:e.id);if(t.tree){return Sortable.tree(e,arguments[1]).children.map(function(e){return[n+Sortable._constructIndex(e)+"[id]="+encodeURIComponent(e.id)].concat(e.children.map(arguments.callee))}).flatten().join("&")}else{return Sortable.sequence(e,arguments[1]).map(function(e){return n+"[]="+encodeURIComponent(e)}).join("&")}}};Element.isParent=function(e,t){if(!e.parentNode||e==t)return false;if(e.parentNode==t)return true;return Element.isParent(e.parentNode,t)};Element.findChildren=function(e,t,n,r){if(!e.hasChildNodes())return null;r=r.toUpperCase();if(t)t=[t].flatten();var i=[];$A(e.childNodes).each(function(e){if(e.tagName&&e.tagName.toUpperCase()==r&&(!t||Element.classNames(e).detect(function(e){return t.include(e)})))i.push(e);if(n){var s=Element.findChildren(e,t,n,r);if(s)i.push(s)}});return i.length>0?i.flatten():[]};Element.offsetSize=function(e,t){return e["offset"+(t=="vertical"||t=="height"?"Height":"Width")]}