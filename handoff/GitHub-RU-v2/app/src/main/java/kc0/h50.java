package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h50 {
    public final String a;
    public final gn0.kw b;
    public final bl0.a c;

    public h50(String str, gn0.kw kwVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = kwVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h50)) {
            return false;
        }
        h50 h50Var = (h50) obj;
        return k71.k.b(this.a, h50Var.a) && this.b == h50Var.b && k71.k.b(this.c, h50Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gn0.kw kwVar = this.b;
        int hashCode2 = (hashCode + (kwVar == null ? 0 : kwVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subscribable(__typename=");
        sb.append(this.a);
        sb.append(", viewerSubscription=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.q(sb, this.c, ")");
    }
}
