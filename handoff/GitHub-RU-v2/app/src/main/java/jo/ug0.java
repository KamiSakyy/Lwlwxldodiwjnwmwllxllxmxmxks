package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ug0 {
    public final String a;
    public final String b;
    public final String c;

    public ug0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug0)) {
            return false;
        }
        ug0 ug0Var = (ug0) obj;
        return k71.k.b(this.a, ug0Var.a) && k71.k.b(this.b, ug0Var.b) && k71.k.b(this.c, ug0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("User(mobileTimeZone=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
