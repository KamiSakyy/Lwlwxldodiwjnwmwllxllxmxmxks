package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public d(String str, String str2, String str3, String str4, String str5) {
        k71.k.g(str, "appElement");
        k71.k.g(str2, "appAction");
        k71.k.g(str3, "performedAt");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c) && k71.k.b(this.d, dVar.d) && k71.k.b(this.e, dVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("AnalyticEvent(appElement=", this.a, ", appAction=", this.b, ", performedAt=");
        f1.e.x(o, this.c, ", subjectType=", this.d, ", context=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
