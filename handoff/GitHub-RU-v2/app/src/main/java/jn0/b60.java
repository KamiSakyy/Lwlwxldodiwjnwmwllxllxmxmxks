package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b60 {
    public String a;
    public pz0.f40 b;
    public kw0.a c;

    public b60(String str, pz0.f40 f40Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = f40Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b60)) {
            return false;
        }
        b60 b60Var = (b60) obj;
        return k71.k.b(this.a, b60Var.a) && this.b == b60Var.b && k71.k.b(this.c, b60Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pz0.f40 f40Var = this.b;
        int hashCode2 = (hashCode + (f40Var == null ? 0 : f40Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subscribable(__typename=");
        sb.append(this.a);
        sb.append(", viewerSubscription=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
