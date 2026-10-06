package com.github.service.dotcom.models.response.copilot.serialization;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import java.util.List;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.rShadow;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatMessageResponse {
    public static final Companion Companion = new Companion();
    public static final h[] k;
    public String a;
    public String b;
    public String c;
    public hz.h d;
    public List e;
    public ChatMessageAnnotationsResponse f;
    public String g;
    public List h;
    public List i;
    public List j;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatMessageResponse$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        k = new h[]{null, null, null, w.s(iVar, new hz.e(9)), w.s(iVar, new hz.e(10)), null, null, w.s(iVar, new hz.e(11)), w.s(iVar, new hz.e(12)), w.s(iVar, new hz.e(13))};
    }

    public /* synthetic */ ChatMessageResponse(int i, String str, String str2, String str3, hz.h hVar, List list, ChatMessageAnnotationsResponse chatMessageAnnotationsResponse, String str4, List list2, List list3, List list4) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = hz.h.t;
        } else {
            this.d = hVar;
        }
        int i2 = i & 16;
        rShadow rVar = rShadow.r;
        if (i2 == 0) {
            this.e = rVar;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = new ChatMessageAnnotationsResponse();
        } else {
            this.f = chatMessageAnnotationsResponse;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = rVar;
        } else {
            this.h = list2;
        }
        if ((i & 256) == 0) {
            this.i = rVar;
        } else {
            this.i = list3;
        }
        if ((i & 512) == 0) {
            this.j = rVar;
        } else {
            this.j = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessageResponse)) {
            return false;
        }
        ChatMessageResponse chatMessageResponse = (ChatMessageResponse) obj;
        return k.b(this.a, chatMessageResponse.a) && k.b(this.b, chatMessageResponse.b) && k.b(this.c, chatMessageResponse.c) && this.d == chatMessageResponse.d && k.b(this.e, chatMessageResponse.e) && k.b(this.f, chatMessageResponse.f) && k.b(this.g, chatMessageResponse.g) && k.b(this.h, chatMessageResponse.h) && k.b(this.i, chatMessageResponse.i) && k.b(this.j, chatMessageResponse.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + f1.e.c(this.i, f1.e.c(this.h, h1.i(f1.e.c(this.f.a, f1.e.c(this.e, (this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, 31), 31), this.g, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ChatMessageResponse(id=", this.a, ", threadId=", this.b, ", content=");
        o.append(this.c);
        o.append(", role=");
        o.append(this.d);
        o.append(", references=");
        o.append(this.e);
        o.append(", copilotAnnotations=");
        o.append(this.f);
        o.append(", createdAt=");
        o.append(this.g);
        o.append(", agentConfirmations=");
        o.append(this.h);
        o.append(", clientConfirmations=");
        o.append(this.i);
        o.append(", skillExecutions=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
}
