package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xo {
    public String a;
    public int b;
    public uo c;
    public String d;

    public xo(String str, int i, uo uoVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = uoVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        return k71.k.b(this.a, xoVar.a) && this.b == xoVar.b && k71.k.b(this.c, xoVar.c) && k71.k.b(this.d, xoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Discussion(id=", this.a, ", number=", ", comments=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
