package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n90 {
    public final String a;
    public final String b;
    public final ea0.s1 c;

    public n90(String str, String str2, ea0.s1 s1Var) {
        this.a = str;
        this.b = str2;
        this.c = s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n90)) {
            return false;
        }
        n90 n90Var = (n90) obj;
        return k71.k.b(this.a, n90Var.a) && k71.k.b(this.b, n90Var.b) && k71.k.b(this.c, n90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", userProfileFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
