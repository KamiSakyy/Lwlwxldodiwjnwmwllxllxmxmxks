package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.rudroid.copilot.h1;
import g81.e;
import hz.i;
import hz.j;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatServerSentEventDataResponse$Error extends c {
    public static final Companion Companion = new Companion();
    public static final h[] d;
    public final i a;
    public final j b;
    public final String c;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatServerSentEventDataResponse$Error$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        d = new h[]{w.s(iVar, new hz.e(21)), w.s(iVar, new hz.e(22)), null};
    }

    public ChatServerSentEventDataResponse$Error(int i, i iVar, j jVar, String str) {
        this.a = (i & 1) == 0 ? i.x : iVar;
        if ((i & 2) == 0) {
            this.b = j.s;
        } else {
            this.b = jVar;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatServerSentEventDataResponse$Error)) {
            return false;
        }
        ChatServerSentEventDataResponse$Error chatServerSentEventDataResponse$Error = (ChatServerSentEventDataResponse$Error) obj;
        return this.a == chatServerSentEventDataResponse$Error.a && this.b == chatServerSentEventDataResponse$Error.b && k.b(this.c, chatServerSentEventDataResponse$Error.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(type=");
        sb.append(this.a);
        sb.append(", errorType=");
        sb.append(this.b);
        sb.append(", description=");
        return h1.p(sb, this.c, ")");
    }
}
