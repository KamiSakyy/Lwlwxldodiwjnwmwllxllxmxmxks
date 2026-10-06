package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v3 implements aa.h0 {
    public final String a;
    public final String b;
    public final s3 c;
    public final z3 d;
    public final nv0.b e;

    public v3(String str, String str2, s3 s3Var, z3 z3Var, nv0.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = s3Var;
        this.d = z3Var;
        this.e = bVar;
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
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        s3 s3Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((i + (s3Var == null ? 0 : s3Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryNodeFragment(__typename=", this.a, ", id=", this.b, ", issueOrPullRequest=");
        o.append(this.c);
        o.append(", repositoryNodeFragmentBase=");
        o.append(this.d);
        o.append(", subscribableFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
