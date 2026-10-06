package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x2 {
    public e1 a;
    public String b;
    public String c;
    public String d;
    public List e;

    public x2(e1 e1Var, String str, String str2, String str3, List list) {
        this.a = e1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return this.a == x2Var.a && k71.k.b(this.b, x2Var.b) && k71.k.b(this.c, x2Var.c) && k71.k.b(this.d, x2Var.d) && k71.k.b(this.e, x2Var.e);
    }

    public final int hashCode() {
        e1 e1Var = this.a;
        int hashCode = (e1Var == null ? 0 : e1Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaywallProduct(copilotLicenseType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        f1.e.x(sb, this.c, ", featuresHeader=", this.d, ", features=");
        return x.i.l(sb, this.e, ")");
    }
}
