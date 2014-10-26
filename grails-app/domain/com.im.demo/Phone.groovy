package com.im.demo

import grails.rest.Resource

class Phone {
 
 String name
 String code
 BigDecimal price
 
 static belongsTo = [manufecturer: Manufecturer]
 static hasMany = [variations: Variation]
 
    
}
