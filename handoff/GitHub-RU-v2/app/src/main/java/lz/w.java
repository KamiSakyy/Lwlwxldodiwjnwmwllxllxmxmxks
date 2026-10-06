package lz;

import jo.f4;
import m10.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public final String a;
    public final ya0 b;
    public final vx.a c;

    public w(String str, ya0 ya0Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = ya0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && this.b == wVar.b && k71.k.b(this.c, wVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ya0 ya0Var = this.b;
        int hashCode2 = (hashCode + (ya0Var == null ? 0 : ya0Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnSubscribable(__typename=");
        sb.append(this.a);
        sb.append(", viewerSubscription=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
