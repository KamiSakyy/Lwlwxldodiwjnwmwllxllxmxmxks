package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t3 {
    public final String a;
    public final String b;
    public final nv0.b c;
    public final l4 d;
    public final c e;

    public t3(String str, String str2, nv0.b bVar, l4 l4Var, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = l4Var;
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return k71.k.b(this.a, t3Var.a) && k71.k.b(this.b, t3Var.b) && k71.k.b(this.c, t3Var.c) && k71.k.b(this.d, t3Var.d) && k71.k.b(this.e, t3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", subscribableFragment=");
        o.append(this.c);
        o.append(", repositoryNodeFragmentIssue=");
        o.append(this.d);
        o.append(", issueProjectV2ItemsFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
