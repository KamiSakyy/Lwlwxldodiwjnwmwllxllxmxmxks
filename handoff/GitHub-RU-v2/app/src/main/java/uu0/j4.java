package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j4 {
    public final String a;
    public final String b;
    public final yr0.a c;

    public j4(String str, String str2, yr0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return k71.k.b(this.a, j4Var.a) && k71.k.b(this.b, j4Var.b) && k71.k.b(this.c, j4Var.c);
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
