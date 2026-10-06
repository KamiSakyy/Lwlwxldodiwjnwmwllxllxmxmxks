package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i20 {
    public String a;
    public gn0.kw b;
    public bl0.a c;

    public i20(String str, gn0.kw kwVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = kwVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i20)) {
            return false;
        }
        i20 i20Var = (i20) obj;
        return k71.k.b(this.a, i20Var.a) && this.b == i20Var.b && k71.k.b(this.c, i20Var.c);
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
