package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k70 {
    public final String a;
    public final String b;
    public final String c;

    public k70(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k70)) {
            return false;
        }
        k70 k70Var = (k70) obj;
        return k71.k.b(this.a, k70Var.a) && k71.k.b(this.b, k70Var.b) && k71.k.b(this.c, k70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("PullRequest(id=", this.a, ", headRefOid=", this.b, ", __typename="), this.c, ")");
    }






}
