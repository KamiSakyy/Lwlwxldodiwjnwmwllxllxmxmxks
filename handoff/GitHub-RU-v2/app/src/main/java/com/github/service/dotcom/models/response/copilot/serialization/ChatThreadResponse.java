package com.github.service.dotcom.models.response.copilot.serialization;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import hz.k;
import java.util.List;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.rShadow;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatThreadResponse {
    public static final Companion Companion = new Companion();
    public static final h[] f = {null, null, null, null, w.s(i.r, new k(2))};
    public static final ChatThreadResponse g = new ChatThreadResponse();
    public String a;
    public String b;
    public String c;
    public String d;
    public List e;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatThreadResponse$$serializer.INSTANCE;
        }
    }

    public ChatThreadResponse() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = rShadow.r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatThreadResponse)) {
            return false;
        }
        ChatThreadResponse chatThreadResponse = (ChatThreadResponse) obj;
        return k71.k.b(this.a, chatThreadResponse.a) && k71.k.b(this.b, chatThreadResponse.b) && k71.k.b(this.c, chatThreadResponse.c) && k71.k.b(this.d, chatThreadResponse.d) && k71.k.b(this.e, chatThreadResponse.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ChatThreadResponse(id=", this.a, ", name=", this.b, ", updatedAt=");
        f1.e.x(o, this.c, ", createdAt=", this.d, ", currentReferences=");
        return x.i.l(o, this.e, ")");
    }

    public /* synthetic */ ChatThreadResponse(int i, String str, String str2, String str3, String str4, List list) {
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
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = rShadow.r;
        } else {
            this.e = list;
        }
    }
}
