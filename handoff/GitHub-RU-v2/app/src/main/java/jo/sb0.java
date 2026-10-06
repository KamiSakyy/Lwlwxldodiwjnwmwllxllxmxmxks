package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sb0 {
    public String a;
    public m10.ya0 b;
    public vx.a c;

    public sb0(String str, m10.ya0 ya0Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = ya0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb0)) {
            return false;
        }
        sb0 sb0Var = (sb0) obj;
        return k71.k.b(this.a, sb0Var.a) && this.b == sb0Var.b && k71.k.b(this.c, sb0Var.c);
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
    public sb0(String p1, Object p2, Object p3) {
    }
}
