package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l5 implements aa.h0 {
    public String a;
    public String b;
    public int c;
    public String d;
    public k5 e;
    public dw.o5 f;
    public t5 g;

    public l5(String str, String str2, int i, String str3, k5 k5Var, dw.o5 o5Var, t5 t5Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = k5Var;
        this.f = o5Var;
        this.g = t5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj;
        return k71.k.b(this.a, l5Var.a) && k71.k.b(this.b, l5Var.b) && this.c == l5Var.c && k71.k.b(this.d, l5Var.d) && k71.k.b(this.e, l5Var.e) && k71.k.b(this.f, l5Var.f) && k71.k.b(this.g, l5Var.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31);
        k5 k5Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((i + (k5Var == null ? 0 : k5Var.hashCode())) * 31)) * 31);
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
