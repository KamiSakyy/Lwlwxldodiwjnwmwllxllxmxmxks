package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public String b;
    public dw.z0 c;

    public d(String str, String str2, dw.z0 z0Var) {
        this.a = str;
        this.b = str2;
        this.c = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Item(__typename=", this.a, ", id=", this.b, ", projectIssueOrPullRequestProjectFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
