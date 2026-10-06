package ox0;

import pz0.f40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xShadow {
    public String a;
    public f40 b;
    public kw0.a c;

    public x(String str, f40 f40Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = f40Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return k71.k.b(this.a, xVar.a) && this.b == xVar.b && k71.k.b(this.c, xVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f40 f40Var = this.b;
        int hashCode2 = (hashCode + (f40Var == null ? 0 : f40Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnSubscribable(__typename=");
        sb.append(this.a);
        sb.append(", viewerSubscription=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
