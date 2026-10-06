package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import no.a;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatAgentResponse {
    public static final Companion Companion = new Companion();
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatAgentResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatAgentResponse(int i, long j, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            c1.l(i, 31, ChatAgentResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatAgentResponse)) {
            return false;
        }
        ChatAgentResponse chatAgentResponse = (ChatAgentResponse) obj;
        return this.a == chatAgentResponse.a && k.b(this.b, chatAgentResponse.b) && k.b(this.c, chatAgentResponse.c) && k.b(this.d, chatAgentResponse.d) && k.b(this.e, chatAgentResponse.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(h1.i(h1.i(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatAgentResponse(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        f1.e.x(sb, ", avatarUrl=", this.c, ", slug=", this.d);
        return a.q(sb, ", url=", this.e, ")");
    }
}
