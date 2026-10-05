package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public final String a;
    public final v0 b;
    public final ja0.a c;

    public s0(String str, v0 v0Var, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = v0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b) && k71.k.b(this.c, s0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v0 v0Var = this.b;
        int hashCode2 = (hashCode + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("List(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
