package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y9 {
    public final String a;
    public final String b;
    public final pz0.e3 c;
    public final ba d;
    public final r9 e;
    public final da f;
    public final p9 g;
    public final t9 h;

    public y9(String str, String str2, pz0.e3 e3Var, ba baVar, r9 r9Var, da daVar, p9 p9Var, t9 t9Var) {
        this.a = str;
        this.b = str2;
        this.c = e3Var;
        this.d = baVar;
        this.e = r9Var;
        this.f = daVar;
        this.g = p9Var;
        this.h = t9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return k71.k.b(this.a, y9Var.a) && k71.k.b(this.b, y9Var.b) && this.c == y9Var.c && k71.k.b(this.d, y9Var.d) && k71.k.b(this.e, y9Var.e) && k71.k.b(this.f, y9Var.f) && k71.k.b(this.g, y9Var.g) && k71.k.b(this.h, y9Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31;
        r9 r9Var = this.e;
        int hashCode2 = (hashCode + (r9Var == null ? 0 : r9Var.hashCode())) * 31;
        da daVar = this.f;
        int hashCode3 = (hashCode2 + (daVar == null ? 0 : daVar.hashCode())) * 31;
        p9 p9Var = this.g;
        int hashCode4 = (hashCode3 + (p9Var == null ? 0 : p9Var.hashCode())) * 31;
        t9 t9Var = this.h;
        return hashCode4 + (t9Var != null ? t9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnCheckSuite(id=", this.a, ", url=", this.b, ", status=");
        o.append(this.c);
        o.append(", repository=");
        o.append(this.d);
        o.append(", creator=");
        o.append(this.e);
        o.append(", workflowRun=");
        o.append(this.f);
        o.append(", checkRuns=");
        o.append(this.g);
        o.append(", matchingPullRequests=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
