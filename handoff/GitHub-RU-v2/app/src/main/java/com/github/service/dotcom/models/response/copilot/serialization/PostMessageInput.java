package com.github.service.dotcom.models.response.copilot.serialization;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import hz.k;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.rShadow;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class PostMessageInput {
    public static final Companion Companion = new Companion();
    public static final h[] h;
    public String a;
    public String b;
    public List c;
    public boolean d;
    public String e;
    public String f;
    public List g;

    public static final class Companion {
        public final KSerializer serializer() {
            return PostMessageInput$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        h = new h[]{null, null, w.s(iVar, new k(7)), null, null, null, w.s(iVar, new k(8))};
    }

    public PostMessageInput(String str, String str2, ArrayList arrayList, String str3, String str4, ArrayList arrayList2) {
        k71.k.g(str, "content");
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = true;
        this.e = str3;
        this.f = str4;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostMessageInput)) {
            return false;
        }
        PostMessageInput postMessageInput = (PostMessageInput) obj;
        return k71.k.b(this.a, postMessageInput.a) && k71.k.b(this.b, postMessageInput.b) && k71.k.b(this.c, postMessageInput.c) && this.d == postMessageInput.d && k71.k.b(this.e, postMessageInput.e) && k71.k.b(this.f, postMessageInput.f) && k71.k.b(this.g, postMessageInput.g);
    }

    public final int hashCode() {
        int i = h1.i(x.i.e(f1.e.c(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31, this.d), this.e, 31);
        String str = this.f;
        return this.g.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("PostMessageInput(content=", this.a, ", intent=", this.b, ", references=");
        h1.C(o, this.c, ", streaming=", this.d, ", currentUrl=");
        f1.e.x(o, this.e, ", model=", this.f, ", confirmations=");
        return x.i.l(o, this.g, ")");
    }

    public /* synthetic */ PostMessageInput(int i, String str, String str2, List list, boolean z, String str3, String str4, List list2) {
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
        int i2 = i & 4;
        rShadow rVar = rShadow.r;
        if (i2 == 0) {
            this.c = rVar;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = rVar;
        } else {
            this.g = list2;
        }
    }
}
