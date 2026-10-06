package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ne0 {
    public final String a;
    public final String b;
    public final String c;
    public final m10.b00 d;
    public final m10.wm e;
    public final pe0 f;
    public final he0 g;
    public final String h;
    public final boolean i;
    public final le0 j;
    public final ie0 k;
    public final ke0 l;
    public final je0 m;
    public final boolean n;
    public final qe0 o;
    public final gv.b p;

    public ne0(String str, String str2, String str3, m10.b00 b00Var, m10.wm wmVar, pe0 pe0Var, he0 he0Var, String str4, boolean z, le0 le0Var, ie0 ie0Var, ke0 ke0Var, je0 je0Var, boolean z2, qe0 qe0Var, gv.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = b00Var;
        this.e = wmVar;
        this.f = pe0Var;
        this.g = he0Var;
        this.h = str4;
        this.i = z;
        this.j = le0Var;
        this.k = ie0Var;
        this.l = ke0Var;
        this.m = je0Var;
        this.n = z2;
        this.o = qe0Var;
        this.p = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne0)) {
            return false;
        }
        ne0 ne0Var = (ne0) obj;
        return k71.k.b(this.a, ne0Var.a) && k71.k.b(this.b, ne0Var.b) && k71.k.b(this.c, ne0Var.c) && this.d == ne0Var.d && this.e == ne0Var.e && k71.k.b(this.f, ne0Var.f) && k71.k.b(this.g, ne0Var.g) && k71.k.b(this.h, ne0Var.h) && this.i == ne0Var.i && k71.k.b(this.j, ne0Var.j) && k71.k.b(this.k, ne0Var.k) && k71.k.b(this.l, ne0Var.l) && k71.k.b(this.m, ne0Var.m) && this.n == ne0Var.n && k71.k.b(this.o, ne0Var.o) && k71.k.b(this.p, ne0Var.p);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31)) * 31)) * 31;
        he0 he0Var = this.g;
        int e = x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (he0Var == null ? 0 : he0Var.hashCode())) * 31, this.h, 31), 31, this.i);
        le0 le0Var = this.j;
        int hashCode2 = (e + (le0Var == null ? 0 : le0Var.hashCode())) * 31;
        ie0 ie0Var = this.k;
        int hashCode3 = (hashCode2 + (ie0Var == null ? 0 : ie0Var.hashCode())) * 31;
        ke0 ke0Var = this.l;
        int hashCode4 = (hashCode3 + (ke0Var == null ? 0 : ke0Var.hashCode())) * 31;
        je0 je0Var = this.m;
        return this.p.hashCode() + ((this.o.hashCode() + x.i.e((hashCode4 + (je0Var != null ? je0Var.hashCode() : 0)) * 31, 31, this.n)) * 31);
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
