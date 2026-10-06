package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import hz.k;
import java.util.List;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.r;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatThreadWithMessagesResponse {
    public static final Companion Companion = new Companion();
    public static final h[] c = {null, w.s(i.r, new k(3))};
    public ChatThreadResponse a;
    public List b;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatThreadWithMessagesResponse$$serializer.INSTANCE;
        }
    }

    public ChatThreadWithMessagesResponse(int i, ChatThreadResponse chatThreadResponse, List list) {
        if ((i & 1) == 0) {
            ChatThreadResponse.Companion.getClass();
            chatThreadResponse = ChatThreadResponse.g;
        }
        this.a = chatThreadResponse;
        if ((i & 2) == 0) {
            this.b = r.r;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatThreadWithMessagesResponse)) {
            return false;
        }
        ChatThreadWithMessagesResponse chatThreadWithMessagesResponse = (ChatThreadWithMessagesResponse) obj;
        return k71.k.b(this.a, chatThreadWithMessagesResponse.a) && k71.k.b(this.b, chatThreadWithMessagesResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatThreadWithMessagesResponse(thread=" + this.a + ", messages=" + this.b + ")";
    }
}
