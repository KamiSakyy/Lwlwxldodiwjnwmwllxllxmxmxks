package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p40 {
    public final String a;
    public final String b;
    public final String c;
    public final hc0.jc d;
    public final String e;
    public final q40 f;
    public final t40 g;
    public final boolean h;
    public final i30.i i;
    public final c60.j j;
    public final c40.c k;

    public p40(String str, String str2, String str3, hc0.jc jcVar, String str4, q40 q40Var, t40 t40Var, boolean z, i30.i iVar, c60.j jVar, c40.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jcVar;
        this.e = str4;
        this.f = q40Var;
        this.g = t40Var;
        this.h = z;
        this.i = iVar;
        this.j = jVar;
        this.k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p40)) {
            return false;
        }
        p40 p40Var = (p40) obj;
        return k71.k.b(this.a, p40Var.a) && k71.k.b(this.b, p40Var.b) && k71.k.b(this.c, p40Var.c) && this.d == p40Var.d && k71.k.b(this.e, p40Var.e) && k71.k.b(this.f, p40Var.f) && k71.k.b(this.g, p40Var.g) && this.h == p40Var.h && k71.k.b(this.i, p40Var.i) && k71.k.b(this.j, p40Var.j) && k71.k.b(this.k, p40Var.k);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, this.e, 31);
        q40 q40Var = this.f;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + x.i.e((this.g.hashCode() + ((i + (q40Var == null ? 0 : q40Var.hashCode())) * 31)) * 31, 31, this.h)) * 31)) * 31);
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
