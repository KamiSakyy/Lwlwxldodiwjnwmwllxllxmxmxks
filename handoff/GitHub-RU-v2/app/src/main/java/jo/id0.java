package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class id0 {
    public final String a;
    public final String b;
    public final String c;
    public final m10.wi d;
    public final String e;
    public final jd0 f;
    public final boolean g;
    public final gq.i h;
    public final lt.j i;
    public final ar.c j;

    public id0(String str, String str2, String str3, m10.wi wiVar, String str4, jd0 jd0Var, boolean z, gq.i iVar, lt.j jVar, ar.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = wiVar;
        this.e = str4;
        this.f = jd0Var;
        this.g = z;
        this.h = iVar;
        this.i = jVar;
        this.j = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id0)) {
            return false;
        }
        id0 id0Var = (id0) obj;
        return k71.k.b(this.a, id0Var.a) && k71.k.b(this.b, id0Var.b) && k71.k.b(this.c, id0Var.c) && this.d == id0Var.d && k71.k.b(this.e, id0Var.e) && k71.k.b(this.f, id0Var.f) && this.g == id0Var.g && k71.k.b(this.h, id0Var.h) && k71.k.b(this.i, id0Var.i) && k71.k.b(this.j, id0Var.j);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, this.e, 31);
        jd0 jd0Var = this.f;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + x.i.e((i + (jd0Var == null ? 0 : jd0Var.hashCode())) * 31, 31, this.g)) * 31)) * 31);
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
}
