package tz;

import m10.pt;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 {
    public String a;
    public pt b;
    public String c;

    public n0(String str, pt ptVar, String str2) {
        this.a = str;
        this.b = ptVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.a, n0Var.a) && this.b == n0Var.b && k71.k.b(this.c, n0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnProjectV2FieldCommon2(id=");
        sb.append(this.a);
        sb.append(", dataType=");
        sb.append(this.b);
        sb.append(", name=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
