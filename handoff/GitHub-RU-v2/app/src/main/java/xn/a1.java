package xn;

import java.time.Instant;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 {
    public static final z0 Companion = new z0();
    public final String a;
    public final String b;
    public final String c;
    public final eShadow d;
    public final Instant e;
    public final String f;
    public final Instant g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final l3 m;
    public final y3 n;
    public final double o;
    public final List p;

    public a1(String str, String str2, String str3, eShadow eVar, Instant instant, String str4, Instant instant2, String str5, String str6, String str7, String str8, String str9, l3 l3Var, y3 y3Var, double d, List list) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        k71.k.g(str3, "taskId");
        k71.k.g(eVar, "state");
        k71.k.g(str4, "lastUpdatedAt");
        k71.k.g(str5, "eventContent");
        k71.k.g(str8, "model");
        k71.k.g(list, "eventIdentifiers");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = eVar;
        this.e = instant;
        this.f = str4;
        this.g = instant2;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = l3Var;
        this.n = y3Var;
        this.o = d;
        this.p = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return k71.k.b(this.a, a1Var.a) && k71.k.b(this.b, a1Var.b) && k71.k.b(this.c, a1Var.c) && this.d == a1Var.d && k71.k.b(this.e, a1Var.e) && k71.k.b(this.f, a1Var.f) && k71.k.b(this.g, a1Var.g) && k71.k.b(this.h, a1Var.h) && k71.k.b(this.i, a1Var.i) && k71.k.b(this.j, a1Var.j) && k71.k.b(this.k, a1Var.k) && k71.k.b(this.l, a1Var.l) && k71.k.b(this.m, a1Var.m) && k71.k.b(this.n, a1Var.n) && Double.compare(this.o, a1Var.o) == 0 && k71.k.b(this.p, a1Var.p);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31)) * 31, this.f, 31);
        Instant instant = this.g;
        int i2 = com.github.rudroid.copilot.h1.i((i + (instant == null ? 0 : instant.hashCode())) * 31, this.h, 31);
        String str = this.i;
        int hashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int i3 = com.github.rudroid.copilot.h1.i((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.k, 31);
        String str3 = this.l;
        return this.p.hashCode() + ((Double.hashCode(this.o) + ((this.n.hashCode() + ((this.m.hashCode() + ((i3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CopilotAgentTaskSession(id=", this.a, ", name=", this.b, ", taskId=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(", createdAt=");
        o.append(this.e);
        o.append(", lastUpdatedAt=");
        o.append(this.f);
        o.append(", completedAt=");
        o.append(this.g);
        o.append(", eventContent=");
        o.append(this.h);
        o.append(", headRef=");
        f1.e.x(o, this.i, ", baseRef=", this.j, ", model=");
        f1.e.x(o, this.k, ", error=", this.l, ", resource=");
        o.append(this.m);
        o.append(", startReason=");
        o.append(this.n);
        o.append(", premiumRequests=");
        o.append(this.o);
        o.append(", eventIdentifiers=");
        o.append(this.p);
        o.append(")");
        return o.toString();
    }
}
