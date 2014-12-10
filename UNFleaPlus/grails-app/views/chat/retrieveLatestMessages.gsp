<asset:stylesheet src="chat.css" />
<div class="chatter">
	<div class="chatter_post_signup">
		<g:each in="${messages}" var="message">
			<div class="chatter_convo">
				<g:if test="${message.username== session.user }">
					<span class="chatter_msg_item chatter_msg_item_admin"> <a
						href="" class="chatter_avatar">
						<g:if test="${session.user==userMessage[0].username}">
							<g:if test="${userMessage[0].avatar }">
								<img 
									src="${createLink(controller:'user', action:'avatar_image', id:userMessage[0].ident())}" />
							</g:if> <g:else>
								<asset:image src="profile.png" />
							</g:else>
						</g:if>
						<g:else>
							<g:if test="${userMessage[1].avatar}">
								<img 
									src="${createLink(controller:'user', action:'avatar_image', id:userMessage[1].ident())}" />
							</g:if> <g:else>
								<asset:image src="profile.png" />
							</g:else>
						</g:else>
					</a> <strong class="chatter_name"> ${message.username}
					</strong> ${message.message}</span>
				</g:if>
				<g:else>
					<span class="chatter_msg_item chatter_msg_item_user"> <a
						href="" class="chatter_avatar"><g:if test="${message.username==userMessage[0].username}">
							<g:if test="${userMessage[0].avatar}">
								<img 
									src="${createLink(controller:'user', action:'avatar_image', id:userMessage[0].ident())}" />
							</g:if> <g:else>
								<asset:image src="profile.png" />
							</g:else>
						</g:if>
						<g:else>
							<g:if test="${userMessage[1].avatar }">
								<img 
									src="${createLink(controller:'user', action:'avatar_image', id:userMessage[1].ident())}" />
							</g:if> <g:else>
								<asset:image src="profile.png" />
							</g:else>
						</g:else></a> <strong
						class="chatter_name"> ${message.username}
					</strong> ${message.message}</span>
				</g:else>
			</div>
		</g:each>
	</div>
</div>