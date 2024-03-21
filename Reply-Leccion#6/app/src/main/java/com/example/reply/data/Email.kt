
package com.example.reply.data

import androidx.annotation.StringRes

/**
 * A simple data class to represent an Email
 */
data class Email(

    val id: Long,

    val sender: Account,

    val recipients: List<Account> = emptyList(),

    @StringRes val subject: Int = -1,

    @StringRes val body: Int = -1,

    var mailbox: MailboxType = MailboxType.Inbox,

    var createdAt: Int = -1
)
