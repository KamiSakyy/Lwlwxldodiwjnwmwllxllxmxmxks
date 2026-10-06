package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.s;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatServerSentEventDataResponse$AgentConfirmation extends c {
    public static final Companion Companion = new Companion();
    public static final h[] e = {w.s(i.r, new hz.e(15)), null, null, null};
    public hz.i a;
    public String b;
    public String c;
    public kotlinx.serialization.json.c d;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatServerSentEventDataResponse$AgentConfirmation$$serializer.INSTANCE;
        }
    }

    public ChatServerSentEventDataResponse$AgentConfirmation(int i, hz.i iVar, String str, String str2, kotlinx.serialization.json.c cVar) {
        this.a = (i & 1) == 0 ? hz.i.t : iVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = new kotlinx.serialization.json.c(s.r);
        } else {
            this.d = cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatServerSentEventDataResponse$AgentConfirmation)) {
            return false;
        }
        ChatServerSentEventDataResponse$AgentConfirmation chatServerSentEventDataResponse$AgentConfirmation = (ChatServerSentEventDataResponse$AgentConfirmation) obj;
        return this.a == chatServerSentEventDataResponse$AgentConfirmation.a && k.b(this.b, chatServerSentEventDataResponse$AgentConfirmation.b) && k.b(this.c, chatServerSentEventDataResponse$AgentConfirmation.c) && k.b(this.d, chatServerSentEventDataResponse$AgentConfirmation.d);
    }

    public final int hashCode() {
        return this.d.r.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "AgentConfirmation(type=" + this.a + ", title=" + this.b + ", message=" + this.c + ", confirmation=" + this.d + ")";
    }
}
