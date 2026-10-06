package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ia0 {
    public String a;
    public String b;
    public String c;
    public yp0.c d;

    public ia0(String str, String str2, String str3, yp0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia0)) {
            return false;
        }
        ia0 ia0Var = (ia0) obj;
        return k71.k.b(this.a, ia0Var.a) && k71.k.b(this.b, ia0Var.b) && k71.k.b(this.c, ia0Var.c) && k71.k.b(this.d, ia0Var.d);
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
