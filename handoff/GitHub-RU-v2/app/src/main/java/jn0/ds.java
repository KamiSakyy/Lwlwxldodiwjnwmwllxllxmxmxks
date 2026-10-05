package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ds {
    public final String a;
    public final int b;
    public final as c;
    public final String d;

    public ds(String str, int i, as asVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = asVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds)) {
            return false;
        }
        ds dsVar = (ds) obj;
        return k71.k.b(this.a, dsVar.a) && this.b == dsVar.b && k71.k.b(this.c, dsVar.c) && k71.k.b(this.d, dsVar.d);
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
