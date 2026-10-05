package vn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements aa.h0 {
    public final String a;
    public final pz0.e3 b;
    public final pz0.y2 c;
    public final String d;
    public final int e;
    public final String f;
    public final d g;
    public final r h;
    public final p i;
    public final f j;
    public final h k;
    public final boolean l;
    public final c m;
    public final g n;
    public final i o;
    public final s p;
    public final t q;
    public final j r;
    public final u s;
    public final String t;

    public v(String str, pz0.e3 e3Var, pz0.y2 y2Var, String str2, int i, String str3, d dVar, r rVar, p pVar, f fVar, h hVar, boolean z, c cVar, g gVar, i iVar, s sVar, t tVar, j jVar, u uVar, String str4) {
        this.a = str;
        this.b = e3Var;
        this.c = y2Var;
        this.d = str2;
        this.e = i;
        this.f = str3;
        this.g = dVar;
        this.h = rVar;
        this.i = pVar;
        this.j = fVar;
        this.k = hVar;
        this.l = z;
        this.m = cVar;
        this.n = gVar;
        this.o = iVar;
        this.p = sVar;
        this.q = tVar;
        this.r = jVar;
        this.s = uVar;
        this.t = str4;
    }

    public static v a(v vVar, g gVar) {
        return new v(vVar.a, vVar.b, vVar.c, vVar.d, vVar.e, vVar.f, vVar.g, vVar.h, vVar.i, vVar.j, vVar.k, vVar.l, vVar.m, gVar, vVar.o, vVar.p, vVar.q, vVar.r, vVar.s, vVar.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && this.b == vVar.b && this.c == vVar.c && k71.k.b(this.d, vVar.d) && this.e == vVar.e && k71.k.b(this.f, vVar.f) && k71.k.b(this.g, vVar.g) && k71.k.b(this.h, vVar.h) && k71.k.b(this.i, vVar.i) && k71.k.b(this.j, vVar.j) && k71.k.b(this.k, vVar.k) && this.l == vVar.l && k71.k.b(this.m, vVar.m) && k71.k.b(this.n, vVar.n) && k71.k.b(this.o, vVar.o) && k71.k.b(this.p, vVar.p) && k71.k.b(this.q, vVar.q) && k71.k.b(this.r, vVar.r) && k71.k.b(this.s, vVar.s) && k71.k.b(this.t, vVar.t);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        pz0.y2 y2Var = this.c;
        int b = a0.s0.b(this.e, com.github.rudroid.copilot.h1.i((hashCode + (y2Var == null ? 0 : y2Var.hashCode())) * 31, this.d, 31), 31);
        String str = this.f;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.g;
        int hashCode3 = (this.h.hashCode() + ((hashCode2 + (dVar == null ? 0 : Integer.hashCode(dVar.a))) * 31)) * 31;
        p pVar = this.i;
        int hashCode4 = (hashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        f fVar = this.j;
        int e = x.i.e((this.k.hashCode() + ((hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31, 31, this.l);
        c cVar = this.m;
        int hashCode5 = (e + (cVar == null ? 0 : cVar.hashCode())) * 31;
        g gVar = this.n;
        int hashCode6 = (hashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        i iVar = this.o;
        int hashCode7 = (hashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        s sVar = this.p;
        int hashCode8 = (hashCode7 + (sVar == null ? 0 : Integer.hashCode(sVar.a))) * 31;
        t tVar = this.q;
        int hashCode9 = (hashCode8 + (tVar == null ? 0 : Integer.hashCode(tVar.a))) * 31;
        j jVar = this.r;
        int hashCode10 = (hashCode9 + (jVar == null ? 0 : Integer.hashCode(jVar.a))) * 31;
        u uVar = this.s;
        return this.t.hashCode() + ((hashCode10 + (uVar != null ? Integer.hashCode(uVar.a) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSuiteFragment(id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", conclusion=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", duration=");
        x.i.r(this.e, ", event=", this.f, ", artifacts=", sb);
        sb.append(this.g);
        sb.append(", repository=");
        sb.append(this.h);
        sb.append(", push=");
        sb.append(this.i);
        sb.append(", branch=");
        sb.append(this.j);
        sb.append(", commit=");
        sb.append(this.k);
        sb.append(", rerunnable=");
        sb.append(this.l);
        sb.append(", app=");
        sb.append(this.m);
        sb.append(", checkRuns=");
        sb.append(this.n);
        sb.append(", failedCheckRuns=");
        sb.append(this.o);
        sb.append(", runningCheckRuns=");
        sb.append(this.p);
        sb.append(", skippedCheckRuns=");
        sb.append(this.q);
        sb.append(", neutralCheckRuns=");
        sb.append(this.r);
        sb.append(", successfulCheckRuns=");
        sb.append(this.s);
        sb.append(", __typename=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }
}
