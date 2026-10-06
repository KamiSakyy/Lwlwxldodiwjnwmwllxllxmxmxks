package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n60 {
    public final String a;
    public final String b;
    public final String c;
    public final gn0.xc d;
    public final String e;
    public final o60 f;
    public final r60 g;
    public final boolean h;
    public final yd0.i i;
    public final sg0.j j;
    public final se0.c k;

    public n60(String str, String str2, String str3, gn0.xc xcVar, String str4, o60 o60Var, r60 r60Var, boolean z, yd0.i iVar, sg0.j jVar, se0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xcVar;
        this.e = str4;
        this.f = o60Var;
        this.g = r60Var;
        this.h = z;
        this.i = iVar;
        this.j = jVar;
        this.k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n60)) {
            return false;
        }
        n60 n60Var = (n60) obj;
        return k71.k.b(this.a, n60Var.a) && k71.k.b(this.b, n60Var.b) && k71.k.b(this.c, n60Var.c) && this.d == n60Var.d && k71.k.b(this.e, n60Var.e) && k71.k.b(this.f, n60Var.f) && k71.k.b(this.g, n60Var.g) && this.h == n60Var.h && k71.k.b(this.i, n60Var.i) && k71.k.b(this.j, n60Var.j) && k71.k.b(this.k, n60Var.k);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, this.e, 31);
        o60 o60Var = this.f;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + x.i.e((this.g.hashCode() + ((i + (o60Var == null ? 0 : o60Var.hashCode())) * 31)) * 31, 31, this.h)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(", bodyHtml=");
        o.append(this.e);
        o.append(", milestone=");
        o.append(this.f);
        o.append(", projectCards=");
        o.append(this.g);
        o.append(", viewerCanReopen=");
        o.append(this.h);
        o.append(", assigneeFragment=");
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
