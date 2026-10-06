package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0Shadow implements aa.h0 {
    public String a;
    public String b;
    public y c;
    public yh0.a d;

    public Object a0(String str, String str2, y yVar, yh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = yVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0Shadow)) {
            return false;
        }
        a0Shadow a0Var = (a0Shadow) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b) && k71.k.b(this.c, a0Var.c) && k71.k.b(this.d, a0Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        y yVar = this.c;
        return this.d.hashCode() + ((i + (yVar == null ? 0 : yVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OrgBlockablePullRequestFragment(__typename=", this.a, ", id=", this.b, ", author=");
        o.append(this.c);
        o.append(", orgBlockableFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
