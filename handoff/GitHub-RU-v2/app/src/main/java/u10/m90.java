package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m90 {
    public final String a;
    public final String b;
    public final k70.i c;

    public m90(String str, String str2, k70.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m90)) {
            return false;
        }
        m90 m90Var = (m90) obj;
        return k71.k.b(this.a, m90Var.a) && k71.k.b(this.b, m90Var.b) && k71.k.b(this.c, m90Var.c);
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
