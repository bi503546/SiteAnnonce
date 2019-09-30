package siteannonce

class User {
    String username
    String password
    Date dateCreated
    Date lastUpdated
    Illustration thumbnail

    static belongsTo = [author: User]

    static hasMany = [illustrations: Illustration]

    static constraints = {
    }


}
