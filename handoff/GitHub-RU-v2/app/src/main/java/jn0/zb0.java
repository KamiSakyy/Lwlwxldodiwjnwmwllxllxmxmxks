package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zb0 {
    public final String a;
    public final String b;
    public final String c;
    public final pz0.gu d;
    public final pz0.si e;
    public final bc0 f;
    public final tb0 g;
    public final String h;
    public final boolean i;
    public final xb0 j;
    public final ub0 k;
    public final wb0 l;
    public final vb0 m;
    public final boolean n;
    public final cc0 o;
    public final xt0.b p;

    public zb0(String str, String str2, String str3, pz0.gu guVar, pz0.si siVar, bc0 bc0Var, tb0 tb0Var, String str4, boolean z, xb0 xb0Var, ub0 ub0Var, wb0 wb0Var, vb0 vb0Var, boolean z2, cc0 cc0Var, xt0.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = guVar;
        this.e = siVar;
        this.f = bc0Var;
        this.g = tb0Var;
        this.h = str4;
        this.i = z;
        this.j = xb0Var;
        this.k = ub0Var;
        this.l = wb0Var;
        this.m = vb0Var;
        this.n = z2;
        this.o = cc0Var;
        this.p = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0Var = (zb0) obj;
        return k71.k.b(this.a, zb0Var.a) && k71.k.b(this.b, zb0Var.b) && k71.k.b(this.c, zb0Var.c) && this.d == zb0Var.d && this.e == zb0Var.e && k71.k.b(this.f, zb0Var.f) && k71.k.b(this.g, zb0Var.g) && k71.k.b(this.h, zb0Var.h) && this.i == zb0Var.i && k71.k.b(this.j, zb0Var.j) && k71.k.b(this.k, zb0Var.k) && k71.k.b(this.l, zb0Var.l) && k71.k.b(this.m, zb0Var.m) && this.n == zb0Var.n && k71.k.b(this.o, zb0Var.o) && k71.k.b(this.p, zb0Var.p);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31)) * 31)) * 31;
        tb0 tb0Var = this.g;
        int e = x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (tb0Var == null ? 0 : tb0Var.hashCode())) * 31, this.h, 31), 31, this.i);
        xb0 xb0Var = this.j;
        int hashCode2 = (e + (xb0Var == null ? 0 : xb0Var.hashCode())) * 31;
        ub0 ub0Var = this.k;
        int hashCode3 = (hashCode2 + (ub0Var == null ? 0 : ub0Var.hashCode())) * 31;
        wb0 wb0Var = this.l;
        int hashCode4 = (hashCode3 + (wb0Var == null ? 0 : wb0Var.hashCode())) * 31;
        vb0 vb0Var = this.m;
        return this.p.hashCode() + ((this.o.hashCode() + x.i.e((hashCode4 + (vb0Var != null ? vb0Var.hashCode() : 0)) * 31, 31, this.n)) * 31);
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
