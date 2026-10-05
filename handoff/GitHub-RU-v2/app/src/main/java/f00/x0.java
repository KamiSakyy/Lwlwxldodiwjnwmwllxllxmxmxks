package f00;

import m10.ox;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 implements aa.h0 {
    public final String a;
    public final Integer b;
    public final String c;
    public final ox d;
    public final int e;
    public final s0 f;
    public final w0 g;
    public final r0 h;
    public final String i;

    public x0(String str, Integer num, String str2, ox oxVar, int i, s0 s0Var, w0 w0Var, r0 r0Var, String str3) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = oxVar;
        this.e = i;
        this.f = s0Var;
        this.g = w0Var;
        this.h = r0Var;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && k71.k.b(this.c, x0Var.c) && this.d == x0Var.d && this.e == x0Var.e && k71.k.b(this.f, x0Var.f) && k71.k.b(this.g, x0Var.g) && k71.k.b(this.h, x0Var.h) && k71.k.b(this.i, x0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int b = a0.s0.b(this.e, (this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (num == null ? 0 : num.hashCode())) * 31, this.c, 31)) * 31, 31);
        s0 s0Var = this.f;
        int hashCode2 = (b + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        w0 w0Var = this.g;
        int hashCode3 = (hashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        r0 r0Var = this.h;
        return this.i.hashCode() + ((hashCode3 + (r0Var != null ? r0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = com.github.rudroid.copilot.h1.r(this.b, "ProjectV2ViewFragment(id=", this.a, ", databaseId=", ", name=");
        r.append(this.c);
        r.append(", layout=");
        r.append(this.d);
        r.append(", number=");
        r.append(this.e);
        r.append(", groupByFields=");
        r.append(this.f);
        r.append(", sortByFields=");
        r.append(this.g);
        r.append(", fields=");
        r.append(this.h);
        r.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(r, this.i, ")");
    }
}
