package g20;

import hc0.uu;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public i1 e;
    public String f;
    public j1 g;
    public uu h;
    public Boolean i;
    public String j;

    public m1(String str, String str2, String str3, String str4, i1 i1Var, String str5, j1 j1Var, uu uuVar, Boolean bool, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i1Var;
        this.f = str5;
        this.g = j1Var;
        this.h = uuVar;
        this.i = bool;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return k71.k.b(this.a, m1Var.a) && k71.k.b(this.b, m1Var.b) && k71.k.b(this.c, m1Var.c) && k71.k.b(this.d, m1Var.d) && k71.k.b(this.e, m1Var.e) && k71.k.b(this.f, m1Var.f) && k71.k.b(this.g, m1Var.g) && this.h == m1Var.h && k71.k.b(this.i, m1Var.i) && k71.k.b(this.j, m1Var.j);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        i1 i1Var = this.e;
        int hashCode3 = (hashCode2 + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        j1 j1Var = this.g;
        int hashCode5 = (this.h.hashCode() + ((hashCode4 + (j1Var == null ? 0 : j1Var.hashCode())) * 31)) * 31;
        Boolean bool = this.i;
        return this.j.hashCode() + ((hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("StatusContextFragment(id=", this.a, ", context=", this.b, ", avatarUrl=");
        f1.e.x(o, this.c, ", targetUrl=", this.d, ", commit=");
        o.append(this.e);
        o.append(", description=");
        o.append(this.f);
        o.append(", creator=");
        o.append(this.g);
        o.append(", state=");
        o.append(this.h);
        o.append(", isRequired=");
        o.append(this.i);
        o.append(", __typename=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
}
