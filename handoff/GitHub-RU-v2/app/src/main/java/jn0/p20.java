package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p20 {
    public String a;
    public String b;
    public ur0.o c;

    public p20(String str, String str2, ur0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p20)) {
            return false;
        }
        p20 p20Var = (p20) obj;
        return k71.k.b(this.a, p20Var.a) && k71.k.b(this.b, p20Var.b) && k71.k.b(this.c, p20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", issueListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
