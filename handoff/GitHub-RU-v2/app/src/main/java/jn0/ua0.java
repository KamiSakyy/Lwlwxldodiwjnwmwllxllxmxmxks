package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ua0 {
    public final String a;
    public final String b;
    public final String c;
    public final pz0.bf d;
    public final String e;
    public final va0 f;
    public final boolean g;
    public final ep0.i h;
    public final cs0.j i;
    public final yp0.c j;

    public ua0(String str, String str2, String str3, pz0.bf bfVar, String str4, va0 va0Var, boolean z, ep0.i iVar, cs0.j jVar, yp0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bfVar;
        this.e = str4;
        this.f = va0Var;
        this.g = z;
        this.h = iVar;
        this.i = jVar;
        this.j = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        return k71.k.b(this.a, ua0Var.a) && k71.k.b(this.b, ua0Var.b) && k71.k.b(this.c, ua0Var.c) && this.d == ua0Var.d && k71.k.b(this.e, ua0Var.e) && k71.k.b(this.f, ua0Var.f) && this.g == ua0Var.g && k71.k.b(this.h, ua0Var.h) && k71.k.b(this.i, ua0Var.i) && k71.k.b(this.j, ua0Var.j);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, this.e, 31);
        va0 va0Var = this.f;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + x.i.e((i + (va0Var == null ? 0 : va0Var.hashCode())) * 31, 31, this.g)) * 31)) * 31);
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
