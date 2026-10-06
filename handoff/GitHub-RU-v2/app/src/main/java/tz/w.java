package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public String a;
    public x0 b;
    public vx.a c;

    public w(String str, x0 x0Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = x0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b) && k71.k.b(this.c, wVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vx.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field5(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2FieldConfiguration=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.r(sb, this.c, ")");
    }
    public Object e(Object p1) { return null; }
}
