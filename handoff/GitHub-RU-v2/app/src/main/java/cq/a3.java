package cq;

import m10.m8;
import m10.ro;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a3 implements aa.h0 {
    public final m8 a;
    public final ro b;
    public final String c;
    public final String d;

    public a3(m8 m8Var, ro roVar, String str, String str2) {
        this.a = m8Var;
        this.b = roVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.a == a3Var.a && this.b == a3Var.b && k71.k.b(this.c, a3Var.c) && k71.k.b(this.d, a3Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
        String str = this.d;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlanRowFragment(copilotLicenseType=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", planTitle=");
        return x.i.k(sb, this.c, ", subtitle=", this.d, ")");
    }
}
