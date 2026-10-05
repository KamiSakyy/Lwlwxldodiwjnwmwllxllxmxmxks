package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public final String a;
    public final q1 b;
    public final vx.a c;

    public v(String str, q1 q1Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = q1Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q1 q1Var = this.b;
        int hashCode2 = (hashCode + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field4(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2SingleSelectField=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.r(sb, this.c, ")");
    }
}
