package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.rudroid.copilot.h1;
import g81.e;
import hz.i;
import hz.l;
import hz.m;
import java.util.List;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import x61.r;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatServerSentEventDataResponse$FunctionCall extends c {
    public static final Companion Companion = new Companion();
    public static final h[] f;
    public final i a;
    public final m b;
    public final l c;
    public final String d;
    public final List e;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatServerSentEventDataResponse$FunctionCall$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        f = new h[]{w.s(iVar, new hz.e(23)), w.s(iVar, new hz.e(24)), w.s(iVar, new hz.e(25)), null, w.s(iVar, new hz.e(26))};
    }

    public ChatServerSentEventDataResponse$FunctionCall(int i, i iVar, m mVar, l lVar, String str, List list) {
        this.a = (i & 1) == 0 ? i.u : iVar;
        if ((i & 2) == 0) {
            this.b = m.s;
        } else {
            this.b = mVar;
        }
        if ((i & 4) == 0) {
            this.c = l.t;
        } else {
            this.c = lVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = r.r;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatServerSentEventDataResponse$FunctionCall)) {
            return false;
        }
        ChatServerSentEventDataResponse$FunctionCall chatServerSentEventDataResponse$FunctionCall = (ChatServerSentEventDataResponse$FunctionCall) obj;
        return this.a == chatServerSentEventDataResponse$FunctionCall.a && this.b == chatServerSentEventDataResponse$FunctionCall.b && this.c == chatServerSentEventDataResponse$FunctionCall.c && k.b(this.d, chatServerSentEventDataResponse$FunctionCall.d) && k.b(this.e, chatServerSentEventDataResponse$FunctionCall.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FunctionCall(type=");
        sb.append(this.a);
        sb.append(", functionCallType=");
        sb.append(this.b);
        sb.append(", functionCallStatus=");
        sb.append(this.c);
        sb.append(", functionCallArguments=");
        sb.append(this.d);
        sb.append(", references=");
        return x.i.l(sb, this.e, ")");
    }
}
