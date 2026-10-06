package cq;

import java.util.ArrayList;
import m10.m8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x2 implements aa.h0 {
    public m8 a;
    public String b;
    public String c;
    public String d;
    public ArrayList e;

    public x2(m8 m8Var, String str, String str2, String str3, ArrayList arrayList) {
        this.a = m8Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return this.a == x2Var.a && this.b.equals(x2Var.b) && k71.k.b(this.c, x2Var.c) && this.d.equals(x2Var.d) && this.e.equals(x2Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaywallProductFragment(copilotLicenseType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        f1.e.x(sb, this.c, ", featuresHeader=", this.d, ", features=");
        return com.github.rudroid.m0.j(")", sb, this.e);
    }
}
