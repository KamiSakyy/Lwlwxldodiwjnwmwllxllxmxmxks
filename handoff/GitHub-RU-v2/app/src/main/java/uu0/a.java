package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public String a;
    public String b;
    public x0 c;

    public a(String str, String str2, x0 x0Var) {
        this.a = str;
        this.b = str2;
        this.c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", projectIssueOrPullRequestProjectFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object O(Object p1) { return null; }
}
