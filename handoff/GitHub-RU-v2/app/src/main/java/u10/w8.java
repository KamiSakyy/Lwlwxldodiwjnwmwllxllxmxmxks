package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w8 {
    public final String a;
    public final String b;
    public final hc0.p2 c;
    public final z8 d;
    public final p8 e;
    public final b9 f;
    public final n8 g;
    public final r8 h;

    public w8(String str, String str2, hc0.p2 p2Var, z8 z8Var, p8 p8Var, b9 b9Var, n8 n8Var, r8 r8Var) {
        this.a = str;
        this.b = str2;
        this.c = p2Var;
        this.d = z8Var;
        this.e = p8Var;
        this.f = b9Var;
        this.g = n8Var;
        this.h = r8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj;
        return k71.k.b(this.a, w8Var.a) && k71.k.b(this.b, w8Var.b) && this.c == w8Var.c && k71.k.b(this.d, w8Var.d) && k71.k.b(this.e, w8Var.e) && k71.k.b(this.f, w8Var.f) && k71.k.b(this.g, w8Var.g) && k71.k.b(this.h, w8Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31;
        p8 p8Var = this.e;
        int hashCode2 = (hashCode + (p8Var == null ? 0 : p8Var.hashCode())) * 31;
        b9 b9Var = this.f;
        int hashCode3 = (hashCode2 + (b9Var == null ? 0 : b9Var.hashCode())) * 31;
        n8 n8Var = this.g;
        int hashCode4 = (hashCode3 + (n8Var == null ? 0 : n8Var.hashCode())) * 31;
        r8 r8Var = this.h;
        return hashCode4 + (r8Var != null ? r8Var.hashCode() : 0);
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
