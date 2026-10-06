package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s4 {
    public String a;
    public String b;
    public e80.l c;

    public s4(String str, String str2, e80.l lVar) {
        this.a = str;
        this.b = str2;
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return k71.k.b(this.a, s4Var.a) && k71.k.b(this.b, s4Var.b) && k71.k.b(this.c, s4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node4(__typename=", this.a, ", id=", this.b, ", reviewFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
