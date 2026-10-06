package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k00 {
    public String a;
    public hc0.ev b;
    public ja0.a c;

    public k00(String str, hc0.ev evVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = evVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return k71.k.b(this.a, k00Var.a) && this.b == k00Var.b && k71.k.b(this.c, k00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hc0.ev evVar = this.b;
        int hashCode2 = (hashCode + (evVar == null ? 0 : evVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subscribable(__typename=");
        sb.append(this.a);
        sb.append(", viewerSubscription=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
    public k00(String p1, Object p2, Object p3) {
    }
}
