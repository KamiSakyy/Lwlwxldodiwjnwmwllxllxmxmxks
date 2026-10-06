package am0;

import gn0.kw;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w {
    public String a;
    public kw b;
    public bl0.a c;

    public w(String str, kw kwVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = kwVar;
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
        kw kwVar = this.b;
        int hashCode2 = (hashCode + (kwVar == null ? 0 : kwVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnSubscribable(__typename=");
        sb.append(this.a);
        sb.append(", viewerSubscription=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.q(sb, this.c, ")");
    }
}
