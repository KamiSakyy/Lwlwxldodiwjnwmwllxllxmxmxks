package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w4 {
    public String a;
    public String b;
    public String c;

    public w4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return k71.k.b(this.a, w4Var.a) && k71.k.b(this.b, w4Var.b) && k71.k.b(this.c, w4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Node(nameWithOwner=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
