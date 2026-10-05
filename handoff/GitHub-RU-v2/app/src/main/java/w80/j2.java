package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j2 {
    public final String a;
    public final String b;
    public final m90.b c;
    public final c3 d;

    public j2(String str, String str2, m90.b bVar, c3 c3Var) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = c3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return k71.k.b(this.a, j2Var.a) && k71.k.b(this.b, j2Var.b) && k71.k.b(this.c, j2Var.c) && k71.k.b(this.d, j2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", subscribableFragment=");
        o.append(this.c);
        o.append(", repositoryNodeFragmentIssue=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
