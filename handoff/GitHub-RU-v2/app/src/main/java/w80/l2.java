package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 implements aa.h0 {
    public String a;
    public String b;
    public i2 c;
    public o2 d;
    public m90.b e;

    public l2(String str, String str2, i2 i2Var, o2 o2Var, m90.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = i2Var;
        this.d = o2Var;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return k71.k.b(this.a, l2Var.a) && k71.k.b(this.b, l2Var.b) && k71.k.b(this.c, l2Var.c) && k71.k.b(this.d, l2Var.d) && k71.k.b(this.e, l2Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        i2 i2Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((i + (i2Var == null ? 0 : i2Var.hashCode())) * 31)) * 31);
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
