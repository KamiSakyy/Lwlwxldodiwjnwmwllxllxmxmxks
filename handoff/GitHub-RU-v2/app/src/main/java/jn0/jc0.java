package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jc0 {
    public String a;
    public String b;
    public String c;
    public pz0.gu d;
    public ic0 e;
    public boolean f;
    public boolean g;
    public ep0.i h;
    public cs0.j i;
    public yp0.c j;

    public jc0(String str, String str2, String str3, pz0.gu guVar, ic0 ic0Var, boolean z, boolean z2, ep0.i iVar, cs0.j jVar, yp0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = guVar;
        this.e = ic0Var;
        this.f = z;
        this.g = z2;
        this.h = iVar;
        this.i = jVar;
        this.j = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc0)) {
            return false;
        }
        jc0 jc0Var = (jc0) obj;
        return k71.k.b(this.a, jc0Var.a) && k71.k.b(this.b, jc0Var.b) && k71.k.b(this.c, jc0Var.c) && this.d == jc0Var.d && k71.k.b(this.e, jc0Var.e) && this.f == jc0Var.f && this.g == jc0Var.g && k71.k.b(this.h, jc0Var.h) && k71.k.b(this.i, jc0Var.i) && k71.k.b(this.j, jc0Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        ic0 ic0Var = this.e;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + x.i.e(x.i.e((hashCode + (ic0Var == null ? 0 : ic0Var.hashCode())) * 31, 31, this.f), 31, this.g)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(", milestone=");
        o.append(this.e);
        o.append(", viewerCanDeleteHeadRef=");
        o.append(this.f);
        o.append(", viewerCanReopen=");
        o.append(this.g);
        o.append(", assigneeFragment=");
        o.append(this.h);
        o.append(", labelsFragment=");
        o.append(this.i);
        o.append(", commentFragment=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
