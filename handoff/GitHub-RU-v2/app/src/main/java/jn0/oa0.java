package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oa0 {
    public String a;
    public String b;
    public yr0.a c;

    public oa0(String str, String str2, yr0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa0)) {
            return false;
        }
        oa0 oa0Var = (oa0) obj;
        return k71.k.b(this.a, oa0Var.a) && k71.k.b(this.b, oa0Var.b) && k71.k.b(this.c, oa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueType(__typename=", this.a, ", id=", this.b, ", issueTypeFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
