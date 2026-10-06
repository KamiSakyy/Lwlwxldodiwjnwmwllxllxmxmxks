package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o4 {
    public t5 a;
    public k4 b;
    public String c;
    public String d;

    public o4(t5 t5Var, k4 k4Var, String str, String str2) {
        this.a = t5Var;
        this.b = k4Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return k71.k.b(this.a, o4Var.a) && k71.k.b(this.b, o4Var.b) && k71.k.b(this.c, o4Var.c) && k71.k.b(this.d, o4Var.d);
    }

    public final int hashCode() {
        t5 t5Var = this.a;
        int hashCode = (t5Var == null ? 0 : t5Var.hashCode()) * 31;
        k4 k4Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (k4Var != null ? k4Var.hashCode() : 0)) * 31, this.c, 31);
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
