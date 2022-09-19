package com.walletconnect.android.impl.crypto

import com.walletconnect.android.impl.common.model.Participants
import com.walletconnect.android.impl.common.model.type.enums.EnvelopeType
import com.walletconnect.foundation.common.model.Topic

interface Codec {
    fun encrypt(topic: Topic, payload: String, envelopeType: EnvelopeType, participants: Participants? = null): String
    fun decrypt(topic: Topic, cipherText: String): String
}