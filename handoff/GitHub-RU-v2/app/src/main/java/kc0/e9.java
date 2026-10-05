package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e9 {
    public final String a;
    public final String b;
    public final gn0.r2 c;
    public final h9 d;
    public final x8 e;
    public final j9 f;
    public final v8 g;
    public final z8 h;

    public e9(String str, String str2, gn0.r2 r2Var, h9 h9Var, x8 x8Var, j9 j9Var, v8 v8Var, z8 z8Var) {
        this.a = str;
        this.b = str2;
        this.c = r2Var;
        this.d = h9Var;
        this.e = x8Var;
        this.f = j9Var;
        this.g = v8Var;
        this.h = z8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj;
        return k71.k.b(this.a, e9Var.a) && k71.k.b(this.b, e9Var.b) && this.c == e9Var.c && k71.k.b(this.d, e9Var.d) && k71.k.b(this.e, e9Var.e) && k71.k.b(this.f, e9Var.f) && k71.k.b(this.g, e9Var.g) && k71.k.b(this.h, e9Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31;
        x8 x8Var = this.e;
        int hashCode2 = (hashCode + (x8Var == null ? 0 : x8Var.hashCode())) * 31;
        j9 j9Var = this.f;
        int hashCode3 = (hashCode2 + (j9Var == null ? 0 : j9Var.hashCode())) * 31;
        v8 v8Var = this.g;
        int hashCode4 = (hashCode3 + (v8Var == null ? 0 : v8Var.hashCode())) * 31;
        z8 z8Var = this.h;
        return hashCode4 + (z8Var != null ? z8Var.hashCode() : 0);
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
