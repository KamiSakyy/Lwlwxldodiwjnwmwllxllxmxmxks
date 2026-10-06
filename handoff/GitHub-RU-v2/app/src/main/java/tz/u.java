package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public String a;
    public p1 b;
    public vx.a c;

    public u(String str, p1 p1Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = p1Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p1 p1Var = this.b;
        int hashCode2 = (hashCode + (p1Var == null ? 0 : p1Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field3(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2IterationField=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.r(sb, this.c, ")");
    }
}
