package cq0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public e1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c) && k71.k.b(this.d, e1Var.d) && k71.k.b(this.e, e1Var.e) && k71.k.b(this.f, e1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CommitDiffEntryFragment(id=", this.a, ", abbreviatedOid=", this.b, ", oid=");
        f1.e.x(o, this.c, ", messageHeadline=", this.d, ", messageBody=");
        return x.i.k(o, this.e, ", __typename=", this.f, ")");
    }
}
