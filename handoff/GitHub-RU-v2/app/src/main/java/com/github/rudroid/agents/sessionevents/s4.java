package com.github.rudroid.agents.sessionevents;

/* loaded from: /home/user/work/p/classes.dex */
public final class s4 {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f7821a;

    /* renamed from: b, reason: collision with root package name */
    public String f7822b;

    /* renamed from: c, reason: collision with root package name */
    public xn.i3 f7823c;

    /* renamed from: d, reason: collision with root package name */
    public xn.i3 f7824d;

    /* renamed from: e, reason: collision with root package name */
    public String f7825e;

    public static final class a {
    }

    public s4(String str, String str2, xn.i3 i3Var, xn.i3 i3Var2, String str3) {
        k71.k.g(str, "id");
        this.f7821a = str;
        this.f7822b = str2;
        this.f7823c = i3Var;
        this.f7824d = i3Var2;
        this.f7825e = str3;
    }

    public final t4 a() {
        xn.i3 i3Var = this.f7824d;
        if (i3Var != null ? k71.k.b(i3Var.l, Boolean.TRUE) : false) {
            return t4.f7838s;
        }
        return i3Var != null ? k71.k.b(i3Var.l, Boolean.FALSE) : false ? t4.f7839t : t4.f7837r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return k71.k.b(this.f7821a, s4Var.f7821a) && k71.k.b(this.f7822b, s4Var.f7822b) && k71.k.b(this.f7823c, s4Var.f7823c) && k71.k.b(this.f7824d, s4Var.f7824d) && k71.k.b(this.f7825e, s4Var.f7825e);
    }

    public final int hashCode() {
        int hashCode = (this.f7823c.hashCode() + com.github.rudroid.copilot.h1.i(this.f7821a.hashCode() * 31, this.f7822b, 31)) * 31;
        xn.i3 i3Var = this.f7824d;
        int hashCode2 = (hashCode + (i3Var == null ? 0 : i3Var.hashCode())) * 31;
        String str = this.f7825e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o5 = a0.s0.o("ToolCall(id=", this.f7821a, ", name=", this.f7822b, ", startEvent=");
        o5.append(this.f7823c);
        o5.append(", endEvent=");
        o5.append(this.f7824d);
        o5.append(", assistantContent=");
        return com.github.rudroid.copilot.h1.p(o5, this.f7825e, ")");
    }

}
