package com.github.rudroid.uitoolkit.tooltip;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final String a;
    public final String b;
    public final g c;
    public final g d;

    public h(String str, String str2, g gVar, g gVar2) {
        k.g(str, "title");
        k.g(str2, "text");
        this.a = str;
        this.b = str2;
        this.c = gVar;
        this.d = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.a, hVar.a) && k.b(this.b, hVar.b) && k.b(this.c, hVar.c) && k.b(this.d, hVar.d);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        g gVar = this.c;
        int hashCode = (i + (gVar == null ? 0 : gVar.hashCode())) * 31;
        g gVar2 = this.d;
        return hashCode + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("TooltipInfo(title=", this.a, ", text=", this.b, ", action=");
        o.append(this.c);
        o.append(", dismiss=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
