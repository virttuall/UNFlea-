<g:each in="${messages}" var="message">
    <div>
        <span class="nickname">${message.username}</span> - <span class="msg">${message.message}</span>
    </div>
</g:each>