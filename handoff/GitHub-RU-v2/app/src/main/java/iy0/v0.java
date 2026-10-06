package iy0;

import com.github.rudroid.copilot.h1;
import pz0.ds;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 implements aa.h0 {
    public final String a;
    public final Integer b;
    public final String c;
    public final ds d;
    public final int e;
    public final q0 f;
    public final u0 g;
    public final p0 h;
    public final String i;

    public v0(String str, Integer num, String str2, ds dsVar, int i, q0 q0Var, u0 u0Var, p0 p0Var, String str3) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = dsVar;
        this.e = i;
        this.f = q0Var;
        this.g = u0Var;
        this.h = p0Var;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return k71.k.b(this.a, v0Var.a) && k71.k.b(this.b, v0Var.b) && k71.k.b(this.c, v0Var.c) && this.d == v0Var.d && this.e == v0Var.e && k71.k.b(this.f, v0Var.f) && k71.k.b(this.g, v0Var.g) && k71.k.b(this.h, v0Var.h) && k71.k.b(this.i, v0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int b = a0.s0.b(this.e, (this.d.hashCode() + h1.i((hashCode + (num == null ? 0 : num.hashCode())) * 31, this.c, 31)) * 31, 31);
        q0 q0Var = this.f;
        int hashCode2 = (b + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        u0 u0Var = this.g;
        int hashCode3 = (hashCode2 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        p0 p0Var = this.h;
        return this.i.hashCode() + ((hashCode3 + (p0Var != null ? p0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = h1.r(this.b, "ProjectV2ViewFragment(id=", this.a, ", databaseId=", ", name=");
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
        return h1.p(r, this.i, ")");
    }
}
