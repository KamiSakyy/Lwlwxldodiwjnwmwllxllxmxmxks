package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatServerSentEventDataResponse$Unknown extends c {
    public static final Companion Companion = new Companion();
    public static final h[] b = {w.s(i.r, new hz.e(27))};
    public final hz.i a;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatServerSentEventDataResponse$Unknown$$serializer.INSTANCE;
        }
    }

    public ChatServerSentEventDataResponse$Unknown(int i, hz.i iVar) {
        if ((i & 1) == 0) {
            this.a = hz.i.y;
        } else {
            this.a = iVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatServerSentEventDataResponse$Unknown) && this.a == ((ChatServerSentEventDataResponse$Unknown) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unknown(type=" + this.a + ")";
    }
}
