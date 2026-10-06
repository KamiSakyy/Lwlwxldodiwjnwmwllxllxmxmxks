package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r4 {
    public String a;
    public String b;
    public e80.l c;

    public r4(String str, String str2, e80.l lVar) {
        this.a = str;
        this.b = str2;
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return k71.k.b(this.a, r4Var.a) && k71.k.b(this.b, r4Var.b) && k71.k.b(this.c, r4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node3(__typename=", this.a, ", id=", this.b, ", reviewFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
