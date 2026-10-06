package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xShadow {
    public String a;
    public f0 b;
    public String c;

    public Object x(String str, f0 f0Var, String str2) {
        this.a = str;
        this.b = f0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f0 f0Var = this.b;
        return this.c.hashCode() + ((hashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSuite(id=");
        sb.append(this.a);
        sb.append(", workflowRun=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
