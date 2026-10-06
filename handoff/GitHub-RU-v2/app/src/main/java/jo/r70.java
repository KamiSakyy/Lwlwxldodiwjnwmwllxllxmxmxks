package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r70 {
    public String a;
    public String b;
    public dw.m3 c;
    public dw.o d;

    public r70(String str, String str2, dw.m3 m3Var, dw.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = m3Var;
        this.d = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r70)) {
            return false;
        }
        r70 r70Var = (r70) obj;
        return k71.k.b(this.a, r70Var.a) && k71.k.b(this.b, r70Var.b) && k71.k.b(this.c, r70Var.c) && k71.k.b(this.d, r70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", repositoryListItemFragment=");
        o.append(this.c);
        o.append(", issueTemplateFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
