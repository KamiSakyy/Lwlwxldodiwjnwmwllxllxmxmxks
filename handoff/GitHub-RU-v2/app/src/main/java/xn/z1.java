package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 {
    public String a;
    public String b;
    public String c;
    public Object d;
    public String e;

    public z1(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.a.equals(z1Var.a) && k71.k.b(this.b, z1Var.b) && k71.k.b(this.c, z1Var.c) && this.d.equals(z1Var.d) && k71.k.b(this.e, z1Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int h = com.github.rudroid.copilot.h1.h((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.d, 31);
        String str3 = this.e;
        return h + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ExitPlanModeRequestInfo(requestId=", this.a, ", summary=", this.b, ", planContent=");
        o.append(this.c);
        o.append(", actions=");
        o.append(this.d);
        o.append(", recommendedAction=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
