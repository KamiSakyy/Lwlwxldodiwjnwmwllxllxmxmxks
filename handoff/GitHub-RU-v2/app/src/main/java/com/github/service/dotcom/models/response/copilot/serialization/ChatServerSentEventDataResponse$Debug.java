package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatServerSentEventDataResponse$Debug extends c {
    public static final Companion Companion = new Companion();
    public static final h[] c = {w.s(i.r, new hz.e(20)), null};
    public final hz.i a;
    public final String b;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatServerSentEventDataResponse$Debug$$serializer.INSTANCE;
        }
    }

    public ChatServerSentEventDataResponse$Debug(int i, hz.i iVar, String str) {
        this.a = (i & 1) == 0 ? hz.i.s : iVar;
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
        if (!(obj instanceof ChatServerSentEventDataResponse$Debug)) {
            return false;
        }
        ChatServerSentEventDataResponse$Debug chatServerSentEventDataResponse$Debug = (ChatServerSentEventDataResponse$Debug) obj;
        return this.a == chatServerSentEventDataResponse$Debug.a && k.b(this.b, chatServerSentEventDataResponse$Debug.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Debug(type=" + this.a + ", body=" + this.b + ")";
    }
}
