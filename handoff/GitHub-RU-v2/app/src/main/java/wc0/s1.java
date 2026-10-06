package wc0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s1 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final gn0.r2 d;
    public final gn0.l2 e;
    public final int f;
    public final String g;
    public final String h;
    public final ZonedDateTime i;
    public final ZonedDateTime j;
    public final String k;
    public final Boolean l;
    public final String m;

    public s1(String str, String str2, String str3, gn0.r2 r2Var, gn0.l2 l2Var, int i, String str4, String str5, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str6, Boolean bool, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = r2Var;
        this.e = l2Var;
        this.f = i;
        this.g = str4;
        this.h = str5;
        this.i = zonedDateTime;
        this.j = zonedDateTime2;
        this.k = str6;
        this.l = bool;
        this.m = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return k71.k.b(this.a, s1Var.a) && k71.k.b(this.b, s1Var.b) && k71.k.b(this.c, s1Var.c) && this.d == s1Var.d && this.e == s1Var.e && this.f == s1Var.f && k71.k.b(this.g, s1Var.g) && k71.k.b(this.h, s1Var.h) && k71.k.b(this.i, s1Var.i) && k71.k.b(this.j, s1Var.j) && k71.k.b(this.k, s1Var.k) && k71.k.b(this.l, s1Var.l) && k71.k.b(this.m, s1Var.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31)) * 31;
        gn0.l2 l2Var = this.e;
        int b = a0.s0.b(this.f, (hashCode2 + (l2Var == null ? 0 : l2Var.hashCode())) * 31, 31);
        String str2 = this.g;
        int hashCode3 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.i;
        int hashCode5 = (hashCode4 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.j;
        int i = com.github.rudroid.copilot.h1.i((hashCode5 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31, this.k, 31);
        Boolean bool = this.l;
        return this.m.hashCode() + ((i + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WorkFlowCheckRunFragment(id=", this.a, ", fullDatabaseId=", this.b, ", name=");
        o.append(this.c);
        o.append(", status=");
        o.append(this.d);
        o.append(", conclusion=");
        o.append(this.e);
        o.append(", duration=");
        o.append(this.f);
        o.append(", title=");
        f1.e.x(o, this.g, ", summary=", this.h, ", startedAt=");
        com.github.rudroid.copilot.h1.B(o, this.i, ", completedAt=", this.j, ", permalink=");
        o.append(this.k);
        o.append(", isRequired=");
        o.append(this.l);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.m, ")");
    }
}
