package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zx {
    public String a;
    public int b;
    public dy c;
    public String d;

    public zx(String str, int i, dy dyVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = dyVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx)) {
            return false;
        }
        zx zxVar = (zx) obj;
        return k71.k.b(this.a, zxVar.a) && this.b == zxVar.b && k71.k.b(this.c, zxVar.c) && k71.k.b(this.d, zxVar.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        dy dyVar = this.c;
        return this.d.hashCode() + ((b + (dyVar == null ? 0 : dyVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Node1(id=", this.a, ", position=", ", pullRequest=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
