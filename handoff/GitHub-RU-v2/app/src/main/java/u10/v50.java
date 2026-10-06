package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v50 {
    public String a;
    public String b;
    public String c;
    public hc0.fm d;
    public hc0.ff e;
    public x50 f;
    public r50 g;
    public String h;
    public boolean i;
    public t50 j;
    public s50 k;
    public boolean l;
    public y50 m;
    public z70.b n;

    public v50(String str, String str2, String str3, hc0.fm fmVar, hc0.ff ffVar, x50 x50Var, r50 r50Var, String str4, boolean z, t50 t50Var, s50 s50Var, boolean z2, y50 y50Var, z70.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = fmVar;
        this.e = ffVar;
        this.f = x50Var;
        this.g = r50Var;
        this.h = str4;
        this.i = z;
        this.j = t50Var;
        this.k = s50Var;
        this.l = z2;
        this.m = y50Var;
        this.n = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v50)) {
            return false;
        }
        v50 v50Var = (v50) obj;
        return k71.k.b(this.a, v50Var.a) && k71.k.b(this.b, v50Var.b) && k71.k.b(this.c, v50Var.c) && this.d == v50Var.d && this.e == v50Var.e && k71.k.b(this.f, v50Var.f) && k71.k.b(this.g, v50Var.g) && k71.k.b(this.h, v50Var.h) && this.i == v50Var.i && k71.k.b(this.j, v50Var.j) && k71.k.b(this.k, v50Var.k) && this.l == v50Var.l && k71.k.b(this.m, v50Var.m) && k71.k.b(this.n, v50Var.n);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31)) * 31)) * 31;
        r50 r50Var = this.g;
        int e = x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (r50Var == null ? 0 : r50Var.hashCode())) * 31, this.h, 31), 31, this.i);
        t50 t50Var = this.j;
        int hashCode2 = (e + (t50Var == null ? 0 : t50Var.hashCode())) * 31;
        s50 s50Var = this.k;
        return this.n.hashCode() + ((this.m.hashCode() + x.i.e((hashCode2 + (s50Var != null ? s50Var.hashCode() : 0)) * 31, 31, this.l)) * 31);
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
        o.append(", viewerCanUpdate=");
        o.append(this.l);
        o.append(", timelineItems=");
        o.append(this.m);
        o.append(", autoMergeRequestFragment=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }
}
