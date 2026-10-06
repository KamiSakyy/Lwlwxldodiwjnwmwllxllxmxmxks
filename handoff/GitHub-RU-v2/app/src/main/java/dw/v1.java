package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v1 {
    public String a;
    public String b;
    public pt.a c;

    public v1(String str, String str2, pt.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return k71.k.b(this.a, v1Var.a) && k71.k.b(this.b, v1Var.b) && k71.k.b(this.c, v1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("LicenseInfo(__typename=", this.a, ", id=", this.b, ", licenseFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
