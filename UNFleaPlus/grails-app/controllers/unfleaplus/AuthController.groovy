package unfleaplus

import org.apache.shiro.SecurityUtils
import org.apache.shiro.authc.AuthenticationException
import org.apache.shiro.authc.UsernamePasswordToken
import org.apache.shiro.web.util.SavedRequest
import org.apache.shiro.web.util.WebUtils

class AuthController {
    def index = { redirect(action: "login", params: params) }

    def login = {
        redirect(controller:'index',view:'viewHome') //Que cuando un usuario no este autorizado para la vista lo direccione a la vista principal
    }

    
}
