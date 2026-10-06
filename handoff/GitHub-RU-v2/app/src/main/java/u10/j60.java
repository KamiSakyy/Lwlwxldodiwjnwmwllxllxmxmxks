package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j60 {
    public String a;
    public String b;
    public String c;
    public hc0.fm d;
    public f60 e;
    public i60 f;
    public boolean g;
    public boolean h;
    public i30.i i;
    public c60.j j;
    public c40.c k;

    public j60(String str, String str2, String str3, hc0.fm fmVar, f60 f60Var, i60 i60Var, boolean z, boolean z2, i30.i iVar, c60.j jVar, c40.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = fmVar;
        this.e = f60Var;
        this.f = i60Var;
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
        if (!(obj instanceof j60)) {
            return false;
        }
        j60 j60Var = (j60) obj;
        return k71.k.b(this.a, j60Var.a) && k71.k.b(this.b, j60Var.b) && k71.k.b(this.c, j60Var.c) && this.d == j60Var.d && k71.k.b(this.e, j60Var.e) && k71.k.b(this.f, j60Var.f) && this.g == j60Var.g && this.h == j60Var.h && k71.k.b(this.i, j60Var.i) && k71.k.b(this.j, j60Var.j) && k71.k.b(this.k, j60Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        f60 f60Var = this.e;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + x.i.e(x.i.e((this.f.hashCode() + ((hashCode + (f60Var == null ? 0 : f60Var.hashCode())) * 31)) * 31, 31, this.g), 31, this.h)) * 31)) * 31);
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

    public Object i;
}
