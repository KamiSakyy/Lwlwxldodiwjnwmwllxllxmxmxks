package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v3 {
    public String a;
    public String b;
    public yw.b c;
    public t4 d;
    public c e;

    public v3(String str, String str2, yw.b bVar, t4 t4Var, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = t4Var;
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return k71.k.b(this.a, v3Var.a) && k71.k.b(this.b, v3Var.b) && k71.k.b(this.c, v3Var.c) && k71.k.b(this.d, v3Var.d) && k71.k.b(this.e, v3Var.e);
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
