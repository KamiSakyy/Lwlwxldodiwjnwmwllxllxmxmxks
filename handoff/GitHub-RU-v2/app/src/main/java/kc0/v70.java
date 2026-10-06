package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v70 {
    public String a;
    public String b;
    public String c;
    public gn0.hn d;
    public gn0.gg e;
    public x70 f;
    public p70 g;
    public String h;
    public boolean i;
    public t70 j;
    public q70 k;
    public s70 l;
    public r70 m;
    public boolean n;
    public y70 o;
    public ri0.b p;

    public v70(String str, String str2, String str3, gn0.hn hnVar, gn0.gg ggVar, x70 x70Var, p70 p70Var, String str4, boolean z, t70 t70Var, q70 q70Var, s70 s70Var, r70 r70Var, boolean z2, y70 y70Var, ri0.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hnVar;
        this.e = ggVar;
        this.f = x70Var;
        this.g = p70Var;
        this.h = str4;
        this.i = z;
        this.j = t70Var;
        this.k = q70Var;
        this.l = s70Var;
        this.m = r70Var;
        this.n = z2;
        this.o = y70Var;
        this.p = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return k71.k.b(this.a, v70Var.a) && k71.k.b(this.b, v70Var.b) && k71.k.b(this.c, v70Var.c) && this.d == v70Var.d && this.e == v70Var.e && k71.k.b(this.f, v70Var.f) && k71.k.b(this.g, v70Var.g) && k71.k.b(this.h, v70Var.h) && this.i == v70Var.i && k71.k.b(this.j, v70Var.j) && k71.k.b(this.k, v70Var.k) && k71.k.b(this.l, v70Var.l) && k71.k.b(this.m, v70Var.m) && this.n == v70Var.n && k71.k.b(this.o, v70Var.o) && k71.k.b(this.p, v70Var.p);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31)) * 31)) * 31;
        p70 p70Var = this.g;
        int e = x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (p70Var == null ? 0 : p70Var.hashCode())) * 31, this.h, 31), 31, this.i);
        t70 t70Var = this.j;
        int hashCode2 = (e + (t70Var == null ? 0 : t70Var.hashCode())) * 31;
        q70 q70Var = this.k;
        int hashCode3 = (hashCode2 + (q70Var == null ? 0 : q70Var.hashCode())) * 31;
        s70 s70Var = this.l;
        int hashCode4 = (hashCode3 + (s70Var == null ? 0 : s70Var.hashCode())) * 31;
        r70 r70Var = this.m;
        return this.p.hashCode() + ((this.o.hashCode() + x.i.e((hashCode4 + (r70Var != null ? r70Var.hashCode() : 0)) * 31, 31, this.n)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", headRefOid=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(", mergeStateStatus=");
        o.append(this.e);
        o.append(", repository=");
        o.append(this.f);
        o.append(", headRef=");
        o.append(this.g);
        o.append(", baseRefName=");
        o.append(this.h);
        o.append(", viewerCanMergeAsAdmin=");
        o.append(this.i);
        o.append(", mergedBy=");
        o.append(this.j);
        o.append(", mergeCommit=");
        o.append(this.k);
        o.append(", mergeQueueEntry=");
        o.append(this.l);
        o.append(", mergeQueue=");
        o.append(this.m);
        o.append(", viewerCanUpdate=");
        o.append(this.n);
        o.append(", timelineItems=");
        o.append(this.o);
        o.append(", autoMergeRequestFragment=");
        o.append(this.p);
        o.append(")");
        return o.toString();
    }
}
