package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g60 {
    public final String a;
    public final String b;
    public final String c;
    public final se0.c d;

    public g60(String str, String str2, String str3, se0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g60)) {
            return false;
        }
        g60 g60Var = (g60) obj;
        return k71.k.b(this.a, g60Var.a) && k71.k.b(this.b, g60Var.b) && k71.k.b(this.c, g60Var.c) && k71.k.b(this.d, g60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueComment(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", commentFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
