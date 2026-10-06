package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bw {
    public String a;
    public int b;
    public dw c;
    public String d;

    public bw(String str, int i, dw dwVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = dwVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return k71.k.b(this.a, bwVar.a) && this.b == bwVar.b && k71.k.b(this.c, bwVar.c) && k71.k.b(this.d, bwVar.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        dw dwVar = this.c;
        return this.d.hashCode() + ((b + (dwVar == null ? 0 : dwVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Node(id=", this.a, ", position=", ", pullRequest=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
