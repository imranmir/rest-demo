package com.im.demo

import grails.rest.Resource

class Manufecturer {

   String name
   
   static hasMany = [phones: Phone]
    
}
