package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public String a;
    public c1 b;
    public vx.a c;

    public r(String str, c1 c1Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = c1Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vx.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field10(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2FieldConfiguration=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.r(sb, this.c, ")");
    }
}
