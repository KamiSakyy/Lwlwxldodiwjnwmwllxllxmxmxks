package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xe0 {
    public String a;
    public String b;
    public String c;
    public m10.b00 d;
    public we0 e;
    public boolean f;
    public boolean g;
    public gq.i h;
    public lt.j i;
    public ar.c j;

    public xe0(String str, String str2, String str3, m10.b00 b00Var, we0 we0Var, boolean z, boolean z2, gq.i iVar, lt.j jVar, ar.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = b00Var;
        this.e = we0Var;
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
        if (!(obj instanceof xe0)) {
            return false;
        }
        xe0 xe0Var = (xe0) obj;
        return k71.k.b(this.a, xe0Var.a) && k71.k.b(this.b, xe0Var.b) && k71.k.b(this.c, xe0Var.c) && this.d == xe0Var.d && k71.k.b(this.e, xe0Var.e) && this.f == xe0Var.f && this.g == xe0Var.g && k71.k.b(this.h, xe0Var.h) && k71.k.b(this.i, xe0Var.i) && k71.k.b(this.j, xe0Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        we0 we0Var = this.e;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + x.i.e(x.i.e((hashCode + (we0Var == null ? 0 : we0Var.hashCode())) * 31, 31, this.f), 31, this.g)) * 31)) * 31);
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
