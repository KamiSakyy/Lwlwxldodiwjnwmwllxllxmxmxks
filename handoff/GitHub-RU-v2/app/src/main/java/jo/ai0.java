package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ai0 {
    public final String a;
    public final String b;
    public final tu.j c;

    public ai0(String str, String str2, tu.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai0)) {
            return false;
        }
        ai0 ai0Var = (ai0) obj;
        return k71.k.b(this.a, ai0Var.a) && k71.k.b(this.b, ai0Var.b) && k71.k.b(this.c, ai0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Organization(__typename=", this.a, ", id=", this.b, ", organizationFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
