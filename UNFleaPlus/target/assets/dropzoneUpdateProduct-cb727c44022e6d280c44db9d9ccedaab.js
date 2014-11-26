(function(){function e(t){var n=e.modules[t];if(!n)throw new Error('failed to require "'+t+'"');if(!("exports"in n)&&typeof n.definition==="function"){n.client=n.component=true;n.definition.call(this,n.exports={},n);delete n.definition}return n.exports}e.modules={};e.register=function(t,n){e.modules[t]={definition:n}};e.define=function(t,n){e.modules[t]={exports:n}};e.register("component~emitter@1.1.2",function(e,t){function n(e){if(e)return r(e)}function r(e){for(var t in n.prototype){e[t]=n.prototype[t]}return e}t.exports=n;n.prototype.on=n.prototype.addEventListener=function(e,t){this._callbacks=this._callbacks||{};(this._callbacks[e]=this._callbacks[e]||[]).push(t);return this};n.prototype.once=function(e,t){function r(){n.off(e,r);t.apply(this,arguments)}var n=this;this._callbacks=this._callbacks||{};r.fn=t;this.on(e,r);return this};n.prototype.off=n.prototype.removeListener=n.prototype.removeAllListeners=n.prototype.removeEventListener=function(e,t){this._callbacks=this._callbacks||{};if(0==arguments.length){this._callbacks={};return this}var n=this._callbacks[e];if(!n)return this;if(1==arguments.length){delete this._callbacks[e];return this}var r;for(var i=0;i<n.length;i++){r=n[i];if(r===t||r.fn===t){n.splice(i,1);break}}return this};n.prototype.emit=function(e){this._callbacks=this._callbacks||{};var t=[].slice.call(arguments,1),n=this._callbacks[e];if(n){n=n.slice(0);for(var r=0,i=n.length;r<i;++r){n[r].apply(this,t)}}return this};n.prototype.listeners=function(e){this._callbacks=this._callbacks||{};return this._callbacks[e]||[]};n.prototype.hasListeners=function(e){return!!this.listeners(e).length}});e.register("dropzone",function(t,n){n.exports=e("dropzone/lib/dropzone.js")});e.register("dropzone/lib/dropzone.js",function(t,n){(function(){var t,r,i,s,o,u,a,f,l={}.hasOwnProperty,c=function(e,t){function r(){this.constructor=e}for(var n in t){if(l.call(t,n))e[n]=t[n]}r.prototype=t.prototype;e.prototype=new r;e.__super__=t.prototype;return e},h=[].slice;r=typeof Emitter!=="undefined"&&Emitter!==null?Emitter:e("component~emitter@1.1.2");a=function(){};t=function(e){function n(e,r){var i,s,o;this.element=e;this.version=n.version;this.defaultOptions.previewTemplate=this.defaultOptions.previewTemplate.replace(/\n*/g,"");this.clickableElements=[];this.listeners=[];this.files=[];if(typeof this.element==="string"){this.element=document.querySelector(this.element)}if(!(this.element&&this.element.nodeType!=null)){throw new Error("Invalid dropzone element.")}if(this.element.dropzone){throw new Error("Dropzone already attached.")}n.instances.push(this);this.element.dropzone=this;i=(o=n.optionsForElement(this.element))!=null?o:{};this.options=t({},this.defaultOptions,i,r!=null?r:{});if(this.options.forceFallback||!n.isBrowserSupported()){return this.options.fallback.call(this)}if(this.options.url==null){this.options.url=this.element.getAttribute("action")}if(!this.options.url){throw new Error("No URL provided.")}if(this.options.acceptedFiles&&this.options.acceptedMimeTypes){throw new Error("You can't provide both 'acceptedFiles' and 'acceptedMimeTypes'. 'acceptedMimeTypes' is deprecated.")}if(this.options.acceptedMimeTypes){this.options.acceptedFiles=this.options.acceptedMimeTypes;delete this.options.acceptedMimeTypes}this.options.method=this.options.method.toUpperCase();if((s=this.getExistingFallback())&&s.parentNode){s.parentNode.removeChild(s)}if(this.options.previewsContainer!==false){if(this.options.previewsContainer){this.previewsContainer=n.getElement(this.options.previewsContainer,"previewsContainer")}else{this.previewsContainer=this.element}}if(this.options.clickable){if(this.options.clickable===true){this.clickableElements=[this.element]}else{this.clickableElements=n.getElements(this.options.clickable,"clickable")}}this.init()}var t;c(n,e);n.prototype.events=["drop","dragstart","dragend","dragenter","dragover","dragleave","addedfile","removedfile","thumbnail","error","errormultiple","processing","processingmultiple","uploadprogress","totaluploadprogress","sending","sendingmultiple","success","successmultiple","canceled","canceledmultiple","complete","completemultiple","reset","maxfilesexceeded","maxfilesreached"];n.prototype.defaultOptions={url:null,method:"post",withCredentials:false,parallelUploads:10,uploadMultiple:true,maxFilesize:256,paramName:"file",createImageThumbnails:true,maxThumbnailFilesize:10,thumbnailWidth:80,thumbnailHeight:80,maxFiles:10,params:{},clickable:true,ignoreHiddenFiles:true,acceptedFiles:"image/jpeg, image/jpg, image/png, image/gif",acceptedMimeTypes:null,autoProcessQueue:false,autoQueue:true,addRemoveLinks:true,previewsContainer:null,dictDefaultMessage:"Drop files here to upload",dictFallbackMessage:"Your browser does not support drag'n'drop file uploads.",dictFallbackText:"Please use the fallback form below to upload your files like in the olden days.",dictFileTooBig:"File is too big ({{filesize}}MiB). Max filesize: {{maxFilesize}}MiB.",dictInvalidFileType:"You can't upload files of this type.",dictResponseError:"Server responded with {{statusCode}} code.",dictCancelUpload:"Cancel upload",dictCancelUploadConfirmation:"Are you sure you want to cancel this upload?",dictRemoveFile:"Remove file",dictRemoveFileConfirmation:null,dictMaxFilesExceeded:"You can not upload any more files.",accept:function(e,t){return t()},init:function(){var e=document.querySelector("#submit-all");myDropzone=this;e.addEventListener("click",function(){myDropzone.processQueue()});this.on("addedfile",function(){})},forceFallback:false,fallback:function(){var e,t,r,i,s,o;this.element.className=""+this.element.className+" dz-browser-not-supported";o=this.element.getElementsByTagName("div");for(i=0,s=o.length;i<s;i++){e=o[i];if(/(^| )dz-message($| )/.test(e.className)){t=e;e.className="dz-message";continue}}if(!t){t=n.createElement('<div class="dz-message"><span></span></div>');this.element.appendChild(t)}r=t.getElementsByTagName("span")[0];if(r){r.textContent=this.options.dictFallbackMessage}return this.element.appendChild(this.getFallbackForm())},resize:function(e){var t,n,r;t={srcX:0,srcY:0,srcWidth:e.width,srcHeight:e.height};n=e.width/e.height;t.optWidth=this.options.thumbnailWidth;t.optHeight=this.options.thumbnailHeight;if(t.optWidth==null&&t.optHeight==null){t.optWidth=t.srcWidth;t.optHeight=t.srcHeight}else if(t.optWidth==null){t.optWidth=n*t.optHeight}else if(t.optHeight==null){t.optHeight=1/n*t.optWidth}r=t.optWidth/t.optHeight;if(e.height<t.optHeight||e.width<t.optWidth){t.trgHeight=t.srcHeight;t.trgWidth=t.srcWidth}else{if(n>r){t.srcHeight=e.height;t.srcWidth=t.srcHeight*r}else{t.srcWidth=e.width;t.srcHeight=t.srcWidth/r}}t.srcX=(e.width-t.srcWidth)/2;t.srcY=(e.height-t.srcHeight)/2;return t},drop:function(e){return this.element.classList.remove("dz-drag-hover")},dragstart:a,dragend:function(e){return this.element.classList.remove("dz-drag-hover")},dragenter:function(e){return this.element.classList.add("dz-drag-hover")},dragover:function(e){return this.element.classList.add("dz-drag-hover")},dragleave:function(e){return this.element.classList.remove("dz-drag-hover")},paste:a,reset:function(){return this.element.classList.remove("dz-started")},addedfile:function(e){var t,r,i,s,o,u,a,f,l,c,h,p,d;if(this.element===this.previewsContainer){this.element.classList.add("dz-started")}if(this.previewsContainer){e.previewElement=n.createElement(this.options.previewTemplate.trim());e.previewTemplate=e.previewElement;this.previewsContainer.appendChild(e.previewElement);c=e.previewElement.querySelectorAll("[data-dz-name]");for(s=0,a=c.length;s<a;s++){t=c[s];t.textContent=e.name}h=e.previewElement.querySelectorAll("[data-dz-size]");for(o=0,f=h.length;o<f;o++){t=h[o];t.innerHTML=this.filesize(e.size)}if(this.options.addRemoveLinks){e._removeLink=n.createElement('<a class="dz-remove" href="javascript:undefined;" data-dz-remove>'+this.options.dictRemoveFile+"</a>");e.previewElement.appendChild(e._removeLink)}r=function(t){return function(r){r.preventDefault();r.stopPropagation();if(e.status===n.UPLOADING){return n.confirm(t.options.dictCancelUploadConfirmation,function(){return t.removeFile(e)})}else{if(t.options.dictRemoveFileConfirmation){return n.confirm(t.options.dictRemoveFileConfirmation,function(){return t.removeFile(e)})}else{return t.removeFile(e)}}}}(this);p=e.previewElement.querySelectorAll("[data-dz-remove]");d=[];for(u=0,l=p.length;u<l;u++){i=p[u];d.push(i.addEventListener("click",r))}return d}},removedfile:function(e){var t;if(e.previewElement){if((t=e.previewElement)!=null){t.parentNode.removeChild(e.previewElement)}}return this._updateMaxFilesReachedClass()},thumbnail:function(e,t){var n,r,i,s,o;if(e.previewElement){e.previewElement.classList.remove("dz-file-preview");e.previewElement.classList.add("dz-image-preview");s=e.previewElement.querySelectorAll("[data-dz-thumbnail]");o=[];for(r=0,i=s.length;r<i;r++){n=s[r];n.alt=e.name;o.push(n.src=t)}return o}},error:function(e,t){var n,r,i,s,o;if(e.previewElement){e.previewElement.classList.add("dz-error");if(typeof t!=="String"&&t.error){t=t.error}s=e.previewElement.querySelectorAll("[data-dz-errormessage]");o=[];for(r=0,i=s.length;r<i;r++){n=s[r];o.push(n.textContent=t)}return o}},errormultiple:a,processing:function(e){if(e.previewElement){e.previewElement.classList.add("dz-processing");if(e._removeLink){return e._removeLink.textContent=this.options.dictCancelUpload}}},processingmultiple:a,uploadprogress:function(e,t,n){var r,i,s,o,u;if(e.previewElement){o=e.previewElement.querySelectorAll("[data-dz-uploadprogress]");u=[];for(i=0,s=o.length;i<s;i++){r=o[i];u.push(r.style.width=""+t+"%")}return u}},totaluploadprogress:a,sending:a,sendingmultiple:a,success:function(e){if(e.previewElement){return e.previewElement.classList.add("dz-success")}},successmultiple:a,canceled:function(e){return this.emit("error",e,"Upload canceled.")},canceledmultiple:a,complete:function(e){if(e._removeLink){return e._removeLink.textContent=this.options.dictRemoveFile}},completemultiple:a,maxfilesexceeded:a,maxfilesreached:a,previewTemplate:'<div class="dz-preview dz-file-preview">\n  <div class="dz-details">\n    <div class="dz-filename"><span data-dz-name></span></div>\n    <div class="dz-size" data-dz-size></div>\n    <img data-dz-thumbnail />\n  </div>\n  <div class="dz-progress"><span class="dz-upload" data-dz-uploadprogress></span></div>\n  <div class="dz-success-mark"><span>✔</span></div>\n  <div class="dz-error-mark"><span>✘</span></div>\n  <div class="dz-error-message"><span data-dz-errormessage></span></div>\n</div>'};t=function(){var e,t,n,r,i,s,o;r=arguments[0],n=2<=arguments.length?h.call(arguments,1):[];for(s=0,o=n.length;s<o;s++){t=n[s];for(e in t){i=t[e];r[e]=i}}return r};n.prototype.getAcceptedFiles=function(){var e,t,n,r,i;r=this.files;i=[];for(t=0,n=r.length;t<n;t++){e=r[t];if(e.accepted){i.push(e)}}return i};n.prototype.getRejectedFiles=function(){var e,t,n,r,i;r=this.files;i=[];for(t=0,n=r.length;t<n;t++){e=r[t];if(!e.accepted){i.push(e)}}return i};n.prototype.getFilesWithStatus=function(e){var t,n,r,i,s;i=this.files;s=[];for(n=0,r=i.length;n<r;n++){t=i[n];if(t.status===e){s.push(t)}}return s};n.prototype.getQueuedFiles=function(){return this.getFilesWithStatus(n.QUEUED)};n.prototype.getUploadingFiles=function(){return this.getFilesWithStatus(n.UPLOADING)};n.prototype.getActiveFiles=function(){var e,t,r,i,s;i=this.files;s=[];for(t=0,r=i.length;t<r;t++){e=i[t];if(e.status===n.UPLOADING||e.status===n.QUEUED){s.push(e)}}return s};n.prototype.init=function(){var e,t,r,i,s,o,u;if(this.element.tagName==="form"){this.element.setAttribute("enctype","multipart/form-data")}if(this.element.classList.contains("dropzone")&&!this.element.querySelector(".dz-message")){this.element.appendChild(n.createElement('<div class="dz-default dz-message"><span>'+this.options.dictDefaultMessage+"</span></div>"))}if(this.clickableElements.length){r=function(e){return function(){if(e.hiddenFileInput){document.body.removeChild(e.hiddenFileInput)}e.hiddenFileInput=document.createElement("input");e.hiddenFileInput.setAttribute("type","file");if(e.options.maxFiles==null||e.options.maxFiles>1){e.hiddenFileInput.setAttribute("multiple","multiple")}e.hiddenFileInput.className="dz-hidden-input";if(e.options.acceptedFiles!=null){e.hiddenFileInput.setAttribute("accept",e.options.acceptedFiles)}e.hiddenFileInput.style.visibility="hidden";e.hiddenFileInput.style.position="absolute";e.hiddenFileInput.style.top="0";e.hiddenFileInput.style.left="0";e.hiddenFileInput.style.height="0";e.hiddenFileInput.style.width="0";document.body.appendChild(e.hiddenFileInput);return e.hiddenFileInput.addEventListener("change",function(){var t,n,i,s;n=e.hiddenFileInput.files;if(n.length){for(i=0,s=n.length;i<s;i++){t=n[i];e.addFile(t)}}return r()})}}(this);r()}this.URL=(o=window.URL)!=null?o:window.webkitURL;u=this.events;for(i=0,s=u.length;i<s;i++){e=u[i];this.on(e,this.options[e])}this.on("uploadprogress",function(e){return function(){return e.updateTotalUploadProgress()}}(this));this.on("removedfile",function(e){return function(){return e.updateTotalUploadProgress()}}(this));this.on("canceled",function(e){return function(t){return e.emit("complete",t)}}(this));this.on("complete",function(e){return function(t){if(e.getUploadingFiles().length===0&&e.getQueuedFiles().length===0){return setTimeout(function(){window.location.replace("/UNFleaPlus/user");return e.emit("queuecomplete")},0)}}}(this));t=function(e){e.stopPropagation();if(e.preventDefault){return e.preventDefault()}else{return e.returnValue=false}};this.listeners=[{element:this.element,events:{dragstart:function(e){return function(t){return e.emit("dragstart",t)}}(this),dragenter:function(e){return function(n){t(n);return e.emit("dragenter",n)}}(this),dragover:function(e){return function(n){var r;try{r=n.dataTransfer.effectAllowed}catch(i){}n.dataTransfer.dropEffect="move"===r||"linkMove"===r?"move":"copy";t(n);return e.emit("dragover",n)}}(this),dragleave:function(e){return function(t){return e.emit("dragleave",t)}}(this),drop:function(e){return function(n){t(n);return e.drop(n)}}(this),dragend:function(e){return function(t){return e.emit("dragend",t)}}(this)}}];this.clickableElements.forEach(function(e){return function(t){return e.listeners.push({element:t,events:{click:function(r){if(t!==e.element||r.target===e.element||n.elementInside(r.target,e.element.querySelector(".dz-message"))){return e.hiddenFileInput.click()}}}})}}(this));this.enable();return this.options.init.call(this)};n.prototype.destroy=function(){var e;this.disable();this.removeAllFiles(true);if((e=this.hiddenFileInput)!=null?e.parentNode:void 0){this.hiddenFileInput.parentNode.removeChild(this.hiddenFileInput);this.hiddenFileInput=null}delete this.element.dropzone;return n.instances.splice(n.instances.indexOf(this),1)};n.prototype.updateTotalUploadProgress=function(){var e,t,n,r,i,s,o,u;r=0;n=0;e=this.getActiveFiles();if(e.length){u=this.getActiveFiles();for(s=0,o=u.length;s<o;s++){t=u[s];r+=t.upload.bytesSent;n+=t.upload.total}i=100*r/n}else{i=100}return this.emit("totaluploadprogress",i,n,r)};n.prototype._getParamName=function(e){if(typeof this.options.paramName==="function"){return this.options.paramName(e)}else{return""+this.options.paramName+(this.options.uploadMultiple?"["+e+"]":"")}};n.prototype.getFallbackForm=function(){var e,t,r,i;if(e=this.getExistingFallback()){return e}r='<div class="dz-fallback">';if(this.options.dictFallbackText){r+="<p>"+this.options.dictFallbackText+"</p>"}r+='<input type="file" name="'+this._getParamName(0)+'" '+(this.options.uploadMultiple?'multiple="multiple"':void 0)+' /><input type="submit" value="Upload!"></div>';t=n.createElement(r);if(this.element.tagName!=="FORM"){i=n.createElement('<form action="'+this.options.url+'" enctype="multipart/form-data" method="'+this.options.method+'"></form>');i.appendChild(t)}else{this.element.setAttribute("enctype","multipart/form-data");this.element.setAttribute("method",this.options.method)}return i!=null?i:t};n.prototype.getExistingFallback=function(){var e,t,n,r,i,s;t=function(e){var t,n,r;for(n=0,r=e.length;n<r;n++){t=e[n];if(/(^| )fallback($| )/.test(t.className)){return t}}};s=["div","form"];for(r=0,i=s.length;r<i;r++){n=s[r];if(e=t(this.element.getElementsByTagName(n))){return e}}};n.prototype.setupEventListeners=function(){var e,t,n,r,i,s,o;s=this.listeners;o=[];for(r=0,i=s.length;r<i;r++){e=s[r];o.push(function(){var r,i;r=e.events;i=[];for(t in r){n=r[t];i.push(e.element.addEventListener(t,n,false))}return i}())}return o};n.prototype.removeEventListeners=function(){var e,t,n,r,i,s,o;s=this.listeners;o=[];for(r=0,i=s.length;r<i;r++){e=s[r];o.push(function(){var r,i;r=e.events;i=[];for(t in r){n=r[t];i.push(e.element.removeEventListener(t,n,false))}return i}())}return o};n.prototype.disable=function(){var e,t,n,r,i;this.clickableElements.forEach(function(e){return e.classList.remove("dz-clickable")});this.removeEventListeners();r=this.files;i=[];for(t=0,n=r.length;t<n;t++){e=r[t];i.push(this.cancelUpload(e))}return i};n.prototype.enable=function(){this.clickableElements.forEach(function(e){return e.classList.add("dz-clickable")});return this.setupEventListeners()};n.prototype.filesize=function(e){var t;if(e>=1024*1024*1024*1024/10){e=e/(1024*1024*1024*1024/10);t="TiB"}else if(e>=1024*1024*1024/10){e=e/(1024*1024*1024/10);t="GiB"}else if(e>=1024*1024/10){e=e/(1024*1024/10);t="MiB"}else if(e>=1024/10){e=e/(1024/10);t="KiB"}else{e=e*10;t="b"}return"<strong>"+Math.round(e)/10+"</strong> "+t};n.prototype._updateMaxFilesReachedClass=function(){var e=parseInt(document.getElementById("imagesNImages").value);if(this.options.maxFiles!=null&&this.getAcceptedFiles().length>e){if(this.getAcceptedFiles().length>e){alert("Sobre paso");this.emit("maxfilesreached",this.files)}return this.element.classList.add("dz-max-files-reached")}else{return this.element.classList.remove("dz-max-files-reached")}};n.prototype.drop=function(e){var t,n;if(!e.dataTransfer){return}this.emit("drop",e);t=e.dataTransfer.files;if(t.length){n=e.dataTransfer.items;if(n&&n.length&&n[0].webkitGetAsEntry!=null){this._addFilesFromItems(n)}else{this.handleFiles(t)}}};n.prototype.paste=function(e){var t,n;if((e!=null?(n=e.clipboardData)!=null?n.items:void 0:void 0)==null){return}this.emit("paste",e);t=e.clipboardData.items;if(t.length){return this._addFilesFromItems(t)}};n.prototype.handleFiles=function(e){var t,n,r,i;i=[];for(n=0,r=e.length;n<r;n++){t=e[n];i.push(this.addFile(t))}return i};n.prototype._addFilesFromItems=function(e){var t,n,r,i,s;s=[];for(r=0,i=e.length;r<i;r++){n=e[r];if(n.webkitGetAsEntry!=null&&(t=n.webkitGetAsEntry())){if(t.isFile){s.push(this.addFile(n.getAsFile()))}else if(t.isDirectory){s.push(this._addFilesFromDirectory(t,t.name))}else{s.push(void 0)}}else if(n.getAsFile!=null){if(n.kind==null||n.kind==="file"){s.push(this.addFile(n.getAsFile()))}else{s.push(void 0)}}else{s.push(void 0)}}return s};n.prototype._addFilesFromDirectory=function(e,t){var n,r;n=e.createReader();r=function(e){return function(n){var r,i,s;for(i=0,s=n.length;i<s;i++){r=n[i];if(r.isFile){r.file(function(n){if(e.options.ignoreHiddenFiles&&n.name.substring(0,1)==="."){return}n.fullPath=""+t+"/"+n.name;return e.addFile(n)})}else if(r.isDirectory){e._addFilesFromDirectory(r,""+t+"/"+r.name)}}}}(this);return n.readEntries(r,function(e){return typeof console!=="undefined"&&console!==null?typeof console.log==="function"?console.log(e):void 0:void 0})};n.prototype.accept=function(e,t){var r=parseInt(document.getElementById("imagesNImages").value);if(e.size>this.options.maxFilesize*1024*1024){return t(this.options.dictFileTooBig.replace("{{filesize}}",Math.round(e.size/1024/10.24)/100).replace("{{maxFilesize}}",this.options.maxFilesize))}else if(!n.isValidFile(e,this.options.acceptedFiles)){return t(this.options.dictInvalidFileType)}else if(this.options.maxFiles!=null&&this.getAcceptedFiles().length>=r){t(this.options.dictMaxFilesExceeded.replace("{{maxFiles}}",r));return this.emit("maxfilesexceeded",e)}else{return this.options.accept.call(this,e,t)}};n.prototype.addFile=function(e){e.upload={progress:0,total:e.size,bytesSent:0};this.files.push(e);e.status=n.ADDED;this.emit("addedfile",e);this._enqueueThumbnail(e);return this.accept(e,function(t){return function(n){if(n){e.accepted=false;t._errorProcessing([e],n)}else{e.accepted=true;if(t.options.autoQueue){t.enqueueFile(e)}}return t._updateMaxFilesReachedClass()}}(this))};n.prototype.enqueueFiles=function(e){var t,n,r;for(n=0,r=e.length;n<r;n++){t=e[n];this.enqueueFile(t)}return null};n.prototype.enqueueFile=function(e){if(e.status===n.ADDED&&e.accepted===true){e.status=n.QUEUED;if(this.options.autoProcessQueue){return setTimeout(function(e){return function(){return e.processQueue()}}(this),0)}}else{throw new Error("This file can't be queued because it has already been processed or was rejected.")}};n.prototype._thumbnailQueue=[];n.prototype._processingThumbnail=false;n.prototype._enqueueThumbnail=function(e){if(this.options.createImageThumbnails&&e.type.match(/image.*/)&&e.size<=this.options.maxThumbnailFilesize*1024*1024){this._thumbnailQueue.push(e);return setTimeout(function(e){return function(){return e._processThumbnailQueue()}}(this),0)}};n.prototype._processThumbnailQueue=function(){if(this._processingThumbnail||this._thumbnailQueue.length===0){return}this._processingThumbnail=true;return this.createThumbnail(this._thumbnailQueue.shift(),function(e){return function(){e._processingThumbnail=false;return e._processThumbnailQueue()}}(this))};n.prototype.removeFile=function(e){if(e.status===n.UPLOADING){this.cancelUpload(e)}this.files=f(this.files,e);this.emit("removedfile",e);if(this.files.length===0){return this.emit("reset")}};n.prototype.removeAllFiles=function(e){var t,r,i,s;if(e==null){e=false}s=this.files.slice();for(r=0,i=s.length;r<i;r++){t=s[r];if(t.status!==n.UPLOADING||e){this.removeFile(t)}}return null};n.prototype.createThumbnail=function(e,t){var n;n=new FileReader;n.onload=function(r){return function(){var i;i=document.createElement("img");i.onload=function(){var n,s,o,a,f,l,c,h;e.width=i.width;e.height=i.height;o=r.options.resize.call(r,e);if(o.trgWidth==null){o.trgWidth=o.optWidth}if(o.trgHeight==null){o.trgHeight=o.optHeight}n=document.createElement("canvas");s=n.getContext("2d");n.width=o.trgWidth;n.height=o.trgHeight;u(s,i,(f=o.srcX)!=null?f:0,(l=o.srcY)!=null?l:0,o.srcWidth,o.srcHeight,(c=o.trgX)!=null?c:0,(h=o.trgY)!=null?h:0,o.trgWidth,o.trgHeight);a=n.toDataURL("image/png");r.emit("thumbnail",e,a);if(t!=null){return t()}};return i.src=n.result}}(this);return n.readAsDataURL(e)};n.prototype.processQueue=function(){var e,t,n,r;t=this.options.parallelUploads;n=this.getUploadingFiles().length;e=n;if(n>=t){return}r=this.getQueuedFiles();if(!(r.length>0)){return}if(this.options.uploadMultiple){return this.processFiles(r.slice(0,t-n))}else{while(e<t){if(!r.length){return}this.processFile(r.shift());e++}}};n.prototype.processFile=function(e){return this.processFiles([e])};n.prototype.processFiles=function(e){var t,r,i;for(r=0,i=e.length;r<i;r++){t=e[r];t.processing=true;t.status=n.UPLOADING;this.emit("processing",t)}if(this.options.uploadMultiple){this.emit("processingmultiple",e)}return this.uploadFiles(e)};n.prototype._getFilesWithXhr=function(e){var t,n;return n=function(){var n,r,i,s;i=this.files;s=[];for(n=0,r=i.length;n<r;n++){t=i[n];if(t.xhr===e){s.push(t)}}return s}.call(this)};n.prototype.cancelUpload=function(e){var t,r,i,s,o,u,a;if(e.status===n.UPLOADING){r=this._getFilesWithXhr(e.xhr);for(i=0,o=r.length;i<o;i++){t=r[i];t.status=n.CANCELED}e.xhr.abort();for(s=0,u=r.length;s<u;s++){t=r[s];this.emit("canceled",t)}if(this.options.uploadMultiple){this.emit("canceledmultiple",r)}}else if((a=e.status)===n.ADDED||a===n.QUEUED){e.status=n.CANCELED;this.emit("canceled",e);if(this.options.uploadMultiple){this.emit("canceledmultiple",[e])}}if(this.options.autoProcessQueue){return this.processQueue()}};n.prototype.uploadFile=function(e){return this.uploadFiles([e])};n.prototype.uploadFiles=function(e){var r,i,s,o,u,a,f,l,c,h,p,d,v,m,g,y,b,w,E,S,x,T,N,C,k,L,A,O,M,_,D,P;b=new XMLHttpRequest;for(w=0,T=e.length;w<T;w++){r=e[w];r.xhr=b}b.open(this.options.method,this.options.url,true);b.withCredentials=!!this.options.withCredentials;m=null;s=function(t){return function(){var n,i,s;s=[];for(n=0,i=e.length;n<i;n++){r=e[n];s.push(t._errorProcessing(e,m||t.options.dictResponseError.replace("{{statusCode}}",b.status),b))}return s}}(this);g=function(t){return function(n){var i,s,o,u,a,f,l,c,h;if(n!=null){s=100*n.loaded/n.total;for(o=0,f=e.length;o<f;o++){r=e[o];r.upload={progress:s,total:n.total,bytesSent:n.loaded}}}else{i=true;s=100;for(u=0,l=e.length;u<l;u++){r=e[u];if(!(r.upload.progress===100&&r.upload.bytesSent===r.upload.total)){i=false}r.upload.progress=s;r.upload.bytesSent=r.upload.total}if(i){return}}h=[];for(a=0,c=e.length;a<c;a++){r=e[a];h.push(t.emit("uploadprogress",r,s,r.upload.bytesSent))}return h}}(this);b.onload=function(t){return function(r){var i;if(e[0].status===n.CANCELED){return}if(b.readyState!==4){return}m=b.responseText;if(b.getResponseHeader("content-type")&&~b.getResponseHeader("content-type").indexOf("application/json")){try{m=JSON.parse(m)}catch(o){r=o;m="Invalid JSON response from server."}}g();if(!(200<=(i=b.status)&&i<300)){return s()}else{return t._finished(e,m,r)}}}(this);b.onerror=function(t){return function(){if(e[0].status===n.CANCELED){return}return s()}}(this);v=(A=b.upload)!=null?A:b;v.onprogress=g;a={Accept:"application/json","Cache-Control":"no-cache","X-Requested-With":"XMLHttpRequest"};if(this.options.headers){t(a,this.options.headers)}for(o in a){u=a[o];b.setRequestHeader(o,u)}i=new FormData;if(this.options.params){O=this.options.params;for(p in O){y=O[p];i.append(p,y)}}for(E=0,N=e.length;E<N;E++){r=e[E];this.emit("sending",r,b,i)}if(this.options.uploadMultiple){this.emit("sendingmultiple",e,b,i)}if(this.element.tagName==="FORM"){M=this.element.querySelectorAll("input, textarea, select, button");for(S=0,C=M.length;S<C;S++){l=M[S];c=l.getAttribute("name");h=l.getAttribute("type");if(l.tagName==="SELECT"&&l.hasAttribute("multiple")){_=l.options;for(x=0,k=_.length;x<k;x++){d=_[x];if(d.selected){i.append(c,d.value)}}}else if(!h||(D=h.toLowerCase())!=="checkbox"&&D!=="radio"||l.checked){i.append(c,l.value)}}}for(f=L=0,P=e.length-1;0<=P?L<=P:L>=P;f=0<=P?++L:--L){i.append(this._getParamName(f),e[f],e[f].name)}return b.send(i)};n.prototype._finished=function(e,t,r){var i,s,o;for(s=0,o=e.length;s<o;s++){i=e[s];i.status=n.SUCCESS;this.emit("success",i,t,r);this.emit("complete",i)}if(this.options.uploadMultiple){this.emit("successmultiple",e,t,r);this.emit("completemultiple",e)}if(this.options.autoProcessQueue){return this.processQueue()}};n.prototype._errorProcessing=function(e,t,r){var i,s,o;for(s=0,o=e.length;s<o;s++){i=e[s];i.status=n.ERROR;this.emit("error",i,t,r);this.emit("complete",i)}if(this.options.uploadMultiple){this.emit("errormultiple",e,t,r);this.emit("completemultiple",e)}if(this.options.autoProcessQueue){return this.processQueue()}};return n}(r);t.version="3.10.2";t.options={};t.optionsForElement=function(e){if(e.getAttribute("id")){return t.options[i(e.getAttribute("id"))]}else{return void 0}};t.instances=[];t.forElement=function(e){if(typeof e==="string"){e=document.querySelector(e)}if((e!=null?e.dropzone:void 0)==null){throw new Error("No Dropzone found for given element. This is probably because you're trying to access it before Dropzone had the time to initialize. Use the `init` option to setup any additional observers on your Dropzone.")}return e.dropzone};t.autoDiscover=true;t.discover=function(){var e,n,r,i,s,o;if(document.querySelectorAll){r=document.querySelectorAll(".dropzone")}else{r=[];e=function(e){var t,n,i,s;s=[];for(n=0,i=e.length;n<i;n++){t=e[n];if(/(^| )dropzone($| )/.test(t.className)){s.push(r.push(t))}else{s.push(void 0)}}return s};e(document.getElementsByTagName("div"));e(document.getElementsByTagName("form"))}o=[];for(i=0,s=r.length;i<s;i++){n=r[i];if(t.optionsForElement(n)!==false){o.push(new t(n))}else{o.push(void 0)}}return o};t.blacklistedBrowsers=[/opera.*Macintosh.*version\/12/i];t.isBrowserSupported=function(){var e,n,r,i,s;e=true;if(window.File&&window.FileReader&&window.FileList&&window.Blob&&window.FormData&&document.querySelector){if(!("classList"in document.createElement("a"))){e=false}else{s=t.blacklistedBrowsers;for(r=0,i=s.length;r<i;r++){n=s[r];if(n.test(navigator.userAgent)){e=false;continue}}}}else{e=false}return e};f=function(e,t){var n,r,i,s;s=[];for(r=0,i=e.length;r<i;r++){n=e[r];if(n!==t){s.push(n)}}return s};i=function(e){return e.replace(/[\-_](\w)/g,function(e){return e.charAt(1).toUpperCase()})};t.createElement=function(e){var t;t=document.createElement("div");t.innerHTML=e;return t.childNodes[0]};t.elementInside=function(e,t){if(e===t){return true}while(e=e.parentNode){if(e===t){return true}}return false};t.getElement=function(e,t){var n;if(typeof e==="string"){n=document.querySelector(e)}else if(e.nodeType!=null){n=e}if(n==null){throw new Error("Invalid `"+t+"` option provided. Please provide a CSS selector or a plain HTML element.")}return n};t.getElements=function(e,t){var n,r,i,s,o,u,a,f;if(e instanceof Array){i=[];try{for(s=0,u=e.length;s<u;s++){r=e[s];i.push(this.getElement(r,t))}}catch(l){n=l;i=null}}else if(typeof e==="string"){i=[];f=document.querySelectorAll(e);for(o=0,a=f.length;o<a;o++){r=f[o];i.push(r)}}else if(e.nodeType!=null){i=[e]}if(!(i!=null&&i.length)){throw new Error("Invalid `"+t+"` option provided. Please provide a CSS selector, a plain HTML element or a list of those.")}return i};t.confirm=function(e,t,n){if(window.confirm(e)){return t()}else if(n!=null){return n()}};t.isValidFile=function(e,t){var n,r,i,s,o;if(!t){return true}t=t.split(",");r=e.type;n=r.replace(/\/.*$/,"");for(s=0,o=t.length;s<o;s++){i=t[s];i=i.trim();if(i.charAt(0)==="."){if(e.name.toLowerCase().indexOf(i.toLowerCase(),e.name.length-i.length)!==-1){return true}}else if(/\/\*$/.test(i)){if(n===i.replace(/\/.*$/,"")){return true}}else{if(r===i){return true}}}return false};if(typeof jQuery!=="undefined"&&jQuery!==null){jQuery.fn.dropzone=function(e){return this.each(function(){return new t(this,e)})}}if(typeof n!=="undefined"&&n!==null){n.exports=t}else{window.Dropzone=t}t.ADDED="added";t.QUEUED="queued";t.ACCEPTED=t.QUEUED;t.UPLOADING="uploading";t.PROCESSING=t.UPLOADING;t.CANCELED="canceled";t.ERROR="error";t.SUCCESS="success";o=function(e){var t,n,r,i,s,o,u,a,f,l;u=e.naturalWidth;o=e.naturalHeight;n=document.createElement("canvas");n.width=1;n.height=o;r=n.getContext("2d");r.drawImage(e,0,0);i=r.getImageData(0,0,1,o).data;l=0;s=o;a=o;while(a>l){t=i[(a-1)*4+3];if(t===0){s=a}else{l=a}a=s+l>>1}f=a/o;if(f===0){return 1}else{return f}};u=function(e,t,n,r,i,s,u,a,f,l){var c;c=o(t);return e.drawImage(t,n,r,i,s,u,a,f,l/c)};s=function(e,t){var n,r,i,s,o,u,a,f,l;i=false;l=true;r=e.document;f=r.documentElement;n=r.addEventListener?"addEventListener":"attachEvent";a=r.addEventListener?"removeEventListener":"detachEvent";u=r.addEventListener?"":"on";s=function(n){if(n.type==="readystatechange"&&r.readyState!=="complete"){return}(n.type==="load"?e:r)[a](u+n.type,s,false);if(!i&&(i=true)){return t.call(e,n.type||n)}};o=function(){var e;try{f.doScroll("left")}catch(t){e=t;setTimeout(o,50);return}return s("poll")};if(r.readyState!=="complete"){if(r.createEventObject&&f.doScroll){try{l=!e.frameElement}catch(c){}if(l){o()}}r[n](u+"DOMContentLoaded",s,false);r[n](u+"readystatechange",s,false);return e[n](u+"load",s,false)}};t._autoDiscoverFunction=function(){if(t.autoDiscover){return t.discover()}};s(window,t._autoDiscoverFunction)}).call(this)});if(typeof exports=="object"){module.exports=e("dropzone")}else if(typeof define=="function"&&define.amd){define([],function(){return e("dropzone")})}else{this["Dropzone"]=e("dropzone")}})()