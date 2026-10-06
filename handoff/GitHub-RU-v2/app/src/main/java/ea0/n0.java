package ea0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aa.h0 {
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public ZonedDateTime f;
    public m0 g;
    public String h;

    public n0(String str, String str2, boolean z, String str3, String str4, ZonedDateTime zonedDateTime, m0 m0Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = zonedDateTime;
        this.g = m0Var;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.a, n0Var.a) && k71.k.b(this.b, n0Var.b) && this.c == n0Var.c && k71.k.b(this.d, n0Var.d) && k71.k.b(this.e, n0Var.e) && k71.k.b(this.f, n0Var.f) && k71.k.b(this.g, n0Var.g) && k71.k.b(this.h, n0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = x.i.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.f;
        int hashCode4 = (hashCode3 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        m0 m0Var = this.g;
        return this.h.hashCode() + ((hashCode4 + (m0Var != null ? m0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProfileStatusFragment(id=", this.a, ", emojiHTML=", this.b, ", indicatesLimitedAvailability=");
        com.github.rudroid.m0.z(o, this.c, ", message=", this.d, ", emoji=");
        com.github.rudroid.copilot.h1.A(this.e, ", expiresAt=", ", organization=", o, this.f);
        o.append(this.g);
        o.append(", __typename=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
