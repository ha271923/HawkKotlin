package com.hawk.kotlinexample

class ItemClub(fullname: String, countryClub: String, flag: String) {
    var fullName: String = fullname
        get() = field
        set(value) {
            field = value
        }
    var country: String = countryClub
        get() = field
        set(value) {
            field = value
        }
    var flagClub: String = flag
        get() = field
        set(value) {
            field = value
        }

}