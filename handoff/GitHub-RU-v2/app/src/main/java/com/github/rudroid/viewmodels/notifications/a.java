package com.github.rudroid.viewmodels.notifications;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
final class a {
    public dd.a a;
    public com.github.rudroid.utilities.ui.g1 b;
    public boolean c;

    public a(dd.a aVar, com.github.rudroid.utilities.ui.g1 g1Var, boolean z) {
        k71.k.g(aVar, "banner");
        this.a = aVar;
        this.b = g1Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && this.c == aVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CombineEvent(banner=");
        sb.append(this.a);
        sb.append(", filtered=");
        sb.append(this.b);
        sb.append(", scrollToTop=");
        return f4Shadow.s(sb, this.c, ")");
    }
}
