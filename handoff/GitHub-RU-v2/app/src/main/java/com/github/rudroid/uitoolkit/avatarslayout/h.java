package com.github.rudroid.uitoolkit.avatarslayout;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final String a;
    public final String b;
    public final String c;

    public h(String str, String str2, String str3) {
        k71.k.g(str, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return h1.p(s0.o("PileItem(id=", this.a, ", url=", this.b, ", contentDescription="), this.c, ")");
    }
}
