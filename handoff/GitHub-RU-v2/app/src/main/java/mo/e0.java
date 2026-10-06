package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public String a;
    public String b;
    public String c;

    public e0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b) && k71.k.b(this.c, e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Repository9(nameWithOwner=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
