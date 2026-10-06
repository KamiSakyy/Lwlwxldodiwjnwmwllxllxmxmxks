package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z5 {
    public String a;
    public String b;
    public gt.a c;

    public z5(String str, String str2, gt.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        return k71.k.b(this.a, z5Var.a) && k71.k.b(this.b, z5Var.b) && k71.k.b(this.c, z5Var.c);
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
