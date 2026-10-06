package com.github.rudroid.uitoolkit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p2 {
    public String a;
    public Integer b;
    public i2.b c;
    public d2.t d;
    public String e;
    public d2.t f;
    public d2.t g;
    public g3.q0 h;

    public p2(String str, Integer num, i2.b bVar, d2.t tVar, String str2, d2.t tVar2, d2.t tVar3, g3.q0 q0Var, int i) {
        num = (i & 2) != 0 ? null : num;
        bVar = (i & 4) != 0 ? null : bVar;
        tVar = (i & 8) != 0 ? null : tVar;
        str2 = (i & 16) != 0 ? null : str2;
        tVar2 = (i & 32) != 0 ? null : tVar2;
        tVar3 = (i & 64) != 0 ? null : tVar3;
        q0Var = (i & 128) != 0 ? null : q0Var;
        k71.k.g(str, "text");
        this.a = str;
        this.b = num;
        this.c = bVar;
        this.d = tVar;
        this.e = str2;
        this.f = tVar2;
        this.g = tVar3;
        this.h = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return k71.k.b(this.a, p2Var.a) && k71.k.b(this.b, p2Var.b) && k71.k.b(this.c, p2Var.c) && k71.k.b(this.d, p2Var.d) && k71.k.b(this.e, p2Var.e) && k71.k.b(this.f, p2Var.f) && k71.k.b(this.g, p2Var.g) && k71.k.b(this.h, p2Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        i2.b bVar = this.c;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d2.t tVar = this.d;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : Long.hashCode(tVar.a))) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        d2.t tVar2 = this.f;
        int hashCode6 = (hashCode5 + (tVar2 == null ? 0 : Long.hashCode(tVar2.a))) * 31;
        d2.t tVar3 = this.g;
        int hashCode7 = (hashCode6 + (tVar3 == null ? 0 : Long.hashCode(tVar3.a))) * 31;
        g3.q0 q0Var = this.h;
        return hashCode7 + (q0Var != null ? q0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = com.github.rudroid.copilot.h1.r(this.b, "SimpleMetadataItem(text=", this.a, ", drawableRes=", ", painter=");
        r.append(this.c);
        r.append(", drawableTint=");
        r.append(this.d);
        r.append(", contentDescription=");
        r.append(this.e);
        r.append(", backgroundColor=");
        r.append(this.f);
        r.append(", strokeColor=");
        r.append(this.g);
        r.append(", textStyle=");
        r.append(this.h);
        r.append(")");
        return r.toString();
    }
    public Object d(Object p1, Object p2) { return null; }
    public w1 e(Object p1, Object p2) { return null; }
    public Object f(Object p1, Object p2) { return null; }
    public Object o(Object p1, Object p2) { return null; }
    public Object p(Object p1, Object p2, Object p3) { return null; }
    public Object s(Object p1, Object p2) { return null; }
}
