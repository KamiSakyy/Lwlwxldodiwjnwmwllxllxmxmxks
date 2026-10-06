package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r80 {
    public String a;
    public String b;
    public uj0.d c;

    public r80(String str, String str2, uj0.d dVar) {
        this.a = str;
        this.b = str2;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r80)) {
            return false;
        }
        r80 r80Var = (r80) obj;
        return k71.k.b(this.a, r80Var.a) && k71.k.b(this.b, r80Var.b) && k71.k.b(this.c, r80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", reviewRequestFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
