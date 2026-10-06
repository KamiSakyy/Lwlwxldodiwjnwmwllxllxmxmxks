package wx0;

import pz0.py;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u1 {
    public final String a;
    public final String b;
    public final String c;
    public final s1 d;
    public final py e;

    public u1(String str, String str2, String str3, s1 s1Var, py pyVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = s1Var;
        this.e = pyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.a, u1Var.a) && k71.k.b(this.b, u1Var.b) && k71.k.b(this.c, u1Var.c) && k71.k.b(this.d, u1Var.d) && this.e == u1Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        py pyVar = this.e;
        return hashCode + (pyVar == null ? 0 : pyVar.hashCode());
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
