package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public v0(String str, String str2, String str3, String str4, String str5) {
        k71.k.g(str, "id");
        k71.k.g(str2, "abbreviatedOid");
        k71.k.g(str3, "oid");
        k71.k.g(str4, "messageHeadline");
        k71.k.g(str5, "messageBody");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return k71.k.b(this.a, v0Var.a) && k71.k.b(this.b, v0Var.b) && k71.k.b(this.c, v0Var.c) && k71.k.b(this.d, v0Var.d) && k71.k.b(this.e, v0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String a = qb.b.a(this.b);
        String a2 = qb.a.a(this.c);
        StringBuilder o = a0.s0.o("CommitDiffEntry(id=", this.a, ", abbreviatedOid=", a, ", oid=");
        f1.e.x(o, a2, ", messageHeadline=", this.d, ", messageBody=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
