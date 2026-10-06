package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ay {
    public String a;
    public int b;
    public ey c;
    public String d;

    public ay(String str, int i, ey eyVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = eyVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        return k71.k.b(this.a, ayVar.a) && this.b == ayVar.b && k71.k.b(this.c, ayVar.c) && k71.k.b(this.d, ayVar.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        ey eyVar = this.c;
        return this.d.hashCode() + ((b + (eyVar == null ? 0 : eyVar.hashCode())) * 31);
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
