package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k80 {
    public final String a;
    public final m10.ya0 b;
    public final vx.a c;

    public k80(String str, m10.ya0 ya0Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = ya0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        k80 k80Var = (k80) obj;
        return k71.k.b(this.a, k80Var.a) && this.b == k80Var.b && k71.k.b(this.c, k80Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m10.ya0 ya0Var = this.b;
        int hashCode2 = (hashCode + (ya0Var == null ? 0 : ya0Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subscribable(__typename=");
        sb.append(this.a);
        sb.append(", viewerSubscription=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
