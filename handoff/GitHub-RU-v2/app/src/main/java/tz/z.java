package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public String a;
    public a1 b;
    public vx.a c;

    public z(String str, a1 a1Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = a1Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b) && k71.k.b(this.c, zVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vx.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field8(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2FieldConfiguration=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.r(sb, this.c, ")");
    }
}
