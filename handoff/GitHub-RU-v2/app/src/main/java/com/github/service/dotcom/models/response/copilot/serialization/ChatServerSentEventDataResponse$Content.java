package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatServerSentEventDataResponse$Content extends c {
    public static final Companion Companion = new Companion();
    public static final h[] c = {w.s(i.r, new hz.e(19)), null};
    public hz.i a;
    public String b;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatServerSentEventDataResponse$Content$$serializer.INSTANCE;
        }
    }

    public ChatServerSentEventDataResponse$Content(int i, hz.i iVar, String str) {
        this.a = (i & 1) == 0 ? hz.i.v : iVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatServerSentEventDataResponse$Content)) {
            return false;
        }
        ChatServerSentEventDataResponse$Content chatServerSentEventDataResponse$Content = (ChatServerSentEventDataResponse$Content) obj;
        return this.a == chatServerSentEventDataResponse$Content.a && k.b(this.b, chatServerSentEventDataResponse$Content.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(type=" + this.a + ", body=" + this.b + ")";
    }
}
