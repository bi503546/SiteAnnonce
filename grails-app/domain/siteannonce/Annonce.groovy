package siteannonce

import org.h2.engine.User
import sun.nio.fs.WindowsUserPrincipals

class Annonce {
    String title
    String description
    Date dateCreated
    Date validTill
    Boolean state = Boolean.FALSE

    static belongsTo=[author: User]
    static hasMnay=[illustrations: Illustration]

    static constraints = {
        title blank: false, nullable: false
        description blank: false, nullable: false
        validTill blank: false
    }
}
