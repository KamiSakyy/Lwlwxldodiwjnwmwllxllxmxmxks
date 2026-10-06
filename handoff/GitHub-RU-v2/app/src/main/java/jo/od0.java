package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class od0 {
    public String a;
    public String b;
    public String c;
    public String d;

    public od0(String str, String str2, String str3, String str4) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        k71.k.g(str3, "titleHTML");
        k71.k.g(str4, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od0)) {
            return false;
        }
        od0 od0Var = (od0) obj;
        return k71.k.b(this.a, od0Var.a) && k71.k.b(this.b, od0Var.b) && k71.k.b(this.c, od0Var.c) && k71.k.b(this.d, od0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("Issue(id=", this.a, ", title=", this.b, ", titleHTML="), this.c, ", __typename=", this.d, ")");
    }
}
