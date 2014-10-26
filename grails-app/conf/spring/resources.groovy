import com.im.demo.User
import grails.rest.render.json.JsonRenderer

// Place your Spring DSL code here
beans = {

    userRenderer(JsonRenderer, User){
        includes = ['email','firstName','lastName','age']
    }
}
