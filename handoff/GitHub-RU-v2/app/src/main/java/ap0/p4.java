package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p4 implements aa.h0 {
    public String a;
    public String b;
    public int c;
    public String d;
    public o4 e;
    public uu0.u4 f;
    public x4 g;

    public p4(String str, String str2, int i, String str3, o4 o4Var, uu0.u4 u4Var, x4 x4Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = o4Var;
        this.f = u4Var;
        this.g = x4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return k71.k.b(this.a, p4Var.a) && k71.k.b(this.b, p4Var.b) && this.c == p4Var.c && k71.k.b(this.d, p4Var.d) && k71.k.b(this.e, p4Var.e) && k71.k.b(this.f, p4Var.f) && k71.k.b(this.g, p4Var.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31);
        o4 o4Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((i + (o4Var == null ? 0 : o4Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryFeedFragment(__typename=", this.a, ", id=", this.b, ", contributorsCount=");
        x.i.r(this.c, ", descriptionHTML=", this.d, ", primaryLanguage=", o);
        o.append(this.e);
        o.append(", repositoryStarsFragment=");
        o.append(this.f);
        o.append(", repositoryFeedHeader=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
