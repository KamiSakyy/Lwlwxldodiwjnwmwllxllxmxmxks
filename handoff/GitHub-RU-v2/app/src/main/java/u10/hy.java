package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hy {
    public String a;
    public String b;
    public w80.q3 c;

    public hy(String str, String str2, w80.q3 q3Var) {
        this.a = str;
        this.b = str2;
        this.c = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy)) {
            return false;
        }
        hy hyVar = (hy) obj;
        return k71.k.b(this.a, hyVar.a) && k71.k.b(this.b, hyVar.b) && k71.k.b(this.c, hyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnRepository(__typename=", this.a, ", id=", this.b, ", simpleRepositoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
