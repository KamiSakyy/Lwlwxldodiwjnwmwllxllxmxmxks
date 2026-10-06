package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y {
    public final String a;
    public final z0 b;
    public final vx.a c;

    public y(String str, z0 z0Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = z0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && k71.k.b(this.b, yVar.b) && k71.k.b(this.c, yVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vx.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field7(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2FieldConfiguration=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.r(sb, this.c, ")");
    }
}
