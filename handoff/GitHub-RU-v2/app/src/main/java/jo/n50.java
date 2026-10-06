package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n50 {
    public String a;
    public String b;
    public dw.m3 c;
    public dw.o d;

    public n50(String str, String str2, dw.m3 m3Var, dw.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = m3Var;
        this.d = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n50)) {
            return false;
        }
        n50 n50Var = (n50) obj;
        return k71.k.b(this.a, n50Var.a) && k71.k.b(this.b, n50Var.b) && k71.k.b(this.c, n50Var.c) && k71.k.b(this.d, n50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnRepository(__typename=", this.a, ", id=", this.b, ", repositoryListItemFragment=");
        o.append(this.c);
        o.append(", issueTemplateFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
