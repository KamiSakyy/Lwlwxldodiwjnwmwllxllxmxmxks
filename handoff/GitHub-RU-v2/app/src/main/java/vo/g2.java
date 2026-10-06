package vo;

import java.util.List;
import m10.ah0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g2 {
    public List a;
    public String b;
    public boolean c;
    public ah0 d;
    public String e;
    public String f;

    public g2(List list, String str, boolean z, ah0 ah0Var, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = ah0Var;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return k71.k.b(this.a, g2Var.a) && k71.k.b(this.b, g2Var.b) && this.c == g2Var.c && this.d == g2Var.d && k71.k.b(this.e, g2Var.e) && k71.k.b(this.f, g2Var.f);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + x.i.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder n = com.github.rudroid.m0.n("Input(choices=", ", description=", this.b, ", required=", this.a);
        n.append(this.c);
        n.append(", type=");
        n.append(this.d);
        n.append(", defaultValue=");
        return x.i.k(n, this.e, ", titleId=", this.f, ")");
    }
}
