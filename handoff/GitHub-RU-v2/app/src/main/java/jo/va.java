package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class va {
    public String a;
    public String b;
    public m10.b4 c;
    public ya d;
    public oa e;
    public ab f;
    public ma g;
    public qa h;

    public va(String str, String str2, m10.b4 b4Var, ya yaVar, oa oaVar, ab abVar, ma maVar, qa qaVar) {
        this.a = str;
        this.b = str2;
        this.c = b4Var;
        this.d = yaVar;
        this.e = oaVar;
        this.f = abVar;
        this.g = maVar;
        this.h = qaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va)) {
            return false;
        }
        va vaVar = (va) obj;
        return k71.k.b(this.a, vaVar.a) && k71.k.b(this.b, vaVar.b) && this.c == vaVar.c && k71.k.b(this.d, vaVar.d) && k71.k.b(this.e, vaVar.e) && k71.k.b(this.f, vaVar.f) && k71.k.b(this.g, vaVar.g) && k71.k.b(this.h, vaVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31;
        oa oaVar = this.e;
        int hashCode2 = (hashCode + (oaVar == null ? 0 : oaVar.hashCode())) * 31;
        ab abVar = this.f;
        int hashCode3 = (hashCode2 + (abVar == null ? 0 : abVar.hashCode())) * 31;
        ma maVar = this.g;
        int hashCode4 = (hashCode3 + (maVar == null ? 0 : maVar.hashCode())) * 31;
        qa qaVar = this.h;
        return hashCode4 + (qaVar != null ? qaVar.hashCode() : 0);
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
