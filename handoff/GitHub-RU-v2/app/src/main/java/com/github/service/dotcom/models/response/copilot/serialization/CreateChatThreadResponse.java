package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class CreateChatThreadResponse {
    public static final Companion Companion = new Companion();
    public final ChatThreadResponse a;

    public static final class Companion {
        public final KSerializer serializer() {
            return CreateChatThreadResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateChatThreadResponse(int i, ChatThreadResponse chatThreadResponse) {
        if ((i & 1) == 0) {
            this.a = new ChatThreadResponse();
        } else {
            this.a = chatThreadResponse;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateChatThreadResponse) && k.b(this.a, ((CreateChatThreadResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreateChatThreadResponse(thread=" + this.a + ")";
    }
}
