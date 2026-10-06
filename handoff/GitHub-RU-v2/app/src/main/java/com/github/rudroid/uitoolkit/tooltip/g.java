package com.github.rudroid.uitoolkit.tooltip;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public String a;
    public j71.a b;

    public g(String str, j71.a aVar) {
        k.g(str, "label");
        k.g(aVar, "onClick");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.b(this.a, gVar.a) && k.b(this.b, gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TooltipAction(label=" + this.a + ", onClick=" + this.b + ")";
    }
}
