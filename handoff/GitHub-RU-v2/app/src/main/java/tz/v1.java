package tz;

import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v1 {
    public final String a;
    public final String b;
    public final String c;
    public final t1 d;
    public final n40 e;

    public v1(String str, String str2, String str3, t1 t1Var, n40 n40Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = t1Var;
        this.e = n40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return k71.k.b(this.a, v1Var.a) && k71.k.b(this.b, v1Var.b) && k71.k.b(this.c, v1Var.c) && k71.k.b(this.d, v1Var.d) && this.e == v1Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        n40 n40Var = this.e;
        return hashCode + (n40Var == null ? 0 : n40Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", name=");
        o.append(this.c);
        o.append(", owner=");
        o.append(this.d);
        o.append(", viewerPermission=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
