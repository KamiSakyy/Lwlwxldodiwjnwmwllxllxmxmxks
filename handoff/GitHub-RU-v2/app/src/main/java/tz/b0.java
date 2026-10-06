package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public String a;
    public d1 b;
    public vx.a c;

    public b0(String str, d1 d1Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = d1Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b) && k71.k.b(this.c, b0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vx.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2FieldConfiguration=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.r(sb, this.c, ")");
    }
}
