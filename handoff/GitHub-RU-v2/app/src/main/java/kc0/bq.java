package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bq {
    public String a;
    public int b;
    public yp c;
    public String d;

    public bq(String str, int i, yp ypVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = ypVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq)) {
            return false;
        }
        bq bqVar = (bq) obj;
        return k71.k.b(this.a, bqVar.a) && this.b == bqVar.b && k71.k.b(this.c, bqVar.c) && k71.k.b(this.d, bqVar.d);
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
