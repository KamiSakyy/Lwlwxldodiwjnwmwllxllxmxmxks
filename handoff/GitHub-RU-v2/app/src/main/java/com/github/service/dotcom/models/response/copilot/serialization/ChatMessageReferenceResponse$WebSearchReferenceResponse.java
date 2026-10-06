package com.github.service.dotcom.models.response.copilot.serialization;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import hz.f;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.rShadow;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatMessageReferenceResponse$WebSearchReferenceResponse extends a {
    public static final Companion Companion = new Companion();
    public static final h[] e;
    public String a;
    public String b;
    public List c;
    public f d;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatMessageReferenceResponse$WebSearchReferenceResponse$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        e = new h[]{null, null, w.s(iVar, new hz.e(5)), w.s(iVar, new hz.e(6))};
    }

    public ChatMessageReferenceResponse$WebSearchReferenceResponse(int i, String str, String str2, List list, f fVar) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = rShadow.r;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = f.u;
        } else {
            this.d = fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessageReferenceResponse$WebSearchReferenceResponse)) {
            return false;
        }
        ChatMessageReferenceResponse$WebSearchReferenceResponse chatMessageReferenceResponse$WebSearchReferenceResponse = (ChatMessageReferenceResponse$WebSearchReferenceResponse) obj;
        return k.b(this.a, chatMessageReferenceResponse$WebSearchReferenceResponse.a) && k.b(this.b, chatMessageReferenceResponse$WebSearchReferenceResponse.b) && k.b(this.c, chatMessageReferenceResponse$WebSearchReferenceResponse.c) && this.d == chatMessageReferenceResponse$WebSearchReferenceResponse.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + f1.e.c(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("WebSearchReferenceResponse(query=", this.a, ", status=", this.b, ", results=");
        o.append(this.c);
        o.append(", type=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }

    public ChatMessageReferenceResponse$WebSearchReferenceResponse(String str, String str2, ArrayList arrayList) {
        f fVar = f.u;
        k.g(str, "query");
        k.g(str2, "status");
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = fVar;
    }
}
