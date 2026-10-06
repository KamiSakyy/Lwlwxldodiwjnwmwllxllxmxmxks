package dl0;

import com.github.rudroid.copilot.h1;
import gn0.yv;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 {
    public String a;
    public String b;
    public yv c;
    public String d;
    public String e;
    public String f;
    public boolean g;

    public d0(String str, String str2, yv yvVar, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = yvVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return k71.k.b(this.a, d0Var.a) && k71.k.b(this.b, d0Var.b) && this.c == d0Var.c && k71.k.b(this.d, d0Var.d) && k71.k.b(this.e, d0Var.e) && k71.k.b(this.f, d0Var.f) && this.g == d0Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.g) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnStatusContext(id=", this.a, ", context=", this.b, ", state=");
        o.append(this.c);
        o.append(", avatarUrl=");
        o.append(this.d);
        o.append(", description=");
        f1.e.x(o, this.e, ", targetUrl=", this.f, ", isRequired=");
        return f4.s(o, this.g, ")");
    }
}
