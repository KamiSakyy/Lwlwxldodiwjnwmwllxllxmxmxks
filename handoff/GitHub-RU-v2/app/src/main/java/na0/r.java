package na0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public h0 a;
    public q b;
    public String c;
    public String d;

    public r(h0 h0Var, q qVar, String str, String str2) {
        this.a = h0Var;
        this.b = qVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c) && k71.k.b(this.d, rVar.d);
    }

    public final int hashCode() {
        h0 h0Var = this.a;
        int hashCode = (h0Var == null ? 0 : h0Var.hashCode()) * 31;
        q qVar = this.b;
        return this.d.hashCode() + h1.i((hashCode + (qVar != null ? qVar.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSuite(workflowRun=");
        sb.append(this.a);
        sb.append(", app=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
