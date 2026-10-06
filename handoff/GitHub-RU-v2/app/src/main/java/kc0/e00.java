package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e00 {
    public String a;
    public f00 b;
    public bl0.a c;

    public e00(String str, f00 f00Var, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = f00Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00)) {
            return false;
        }
        e00 e00Var = (e00) obj;
        return k71.k.b(this.a, e00Var.a) && k71.k.b(this.b, e00Var.b) && k71.k.b(this.c, e00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f00 f00Var = this.b;
        int hashCode2 = (hashCode + (f00Var == null ? 0 : f00Var.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.q(sb, this.c, ")");
    }
}
