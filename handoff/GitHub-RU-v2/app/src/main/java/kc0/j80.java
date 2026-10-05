package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j80 {
    public final String a;
    public final String b;
    public final String c;
    public final gn0.hn d;
    public final f80 e;
    public final i80 f;
    public final boolean g;
    public final boolean h;
    public final yd0.i i;
    public final sg0.j j;
    public final se0.c k;

    public j80(String str, String str2, String str3, gn0.hn hnVar, f80 f80Var, i80 i80Var, boolean z, boolean z2, yd0.i iVar, sg0.j jVar, se0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hnVar;
        this.e = f80Var;
        this.f = i80Var;
        this.g = z;
        this.h = z2;
        this.i = iVar;
        this.j = jVar;
        this.k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80Var = (j80) obj;
        return k71.k.b(this.a, j80Var.a) && k71.k.b(this.b, j80Var.b) && k71.k.b(this.c, j80Var.c) && this.d == j80Var.d && k71.k.b(this.e, j80Var.e) && k71.k.b(this.f, j80Var.f) && this.g == j80Var.g && this.h == j80Var.h && k71.k.b(this.i, j80Var.i) && k71.k.b(this.j, j80Var.j) && k71.k.b(this.k, j80Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        f80 f80Var = this.e;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + x.i.e(x.i.e((this.f.hashCode() + ((hashCode + (f80Var == null ? 0 : f80Var.hashCode())) * 31)) * 31, 31, this.g), 31, this.h)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(", milestone=");
        o.append(this.e);
        o.append(", projectCards=");
        o.append(this.f);
        o.append(", viewerCanDeleteHeadRef=");
        com.github.rudroid.m0.A(o, this.g, ", viewerCanReopen=", this.h, ", assigneeFragment=");
        o.append(this.i);
        o.append(", labelsFragment=");
        o.append(this.j);
        o.append(", commentFragment=");
        o.append(this.k);
        o.append(")");
        return o.toString();
    }
}
