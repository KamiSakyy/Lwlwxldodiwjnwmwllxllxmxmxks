package xn;

import java.time.Instant;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i3 {
    public static final h3 Companion = new h3();
    public static final String[] v = {"command-"};
    public String a;
    public Instant b;
    public String c;
    public boolean d;
    public j3 e;
    public String f;
    public String g;
    public String h;
    public String i;
    public List j;
    public Map k;
    public Boolean l;
    public String m;
    public String n;
    public String o;
    public sy.s p;
    public boolean q;
    public boolean r;
    public String s;
    public String t;
    public String u;

    public i3(String str, Instant instant, String str2, boolean z, j3 j3Var, String str3, String str4, String str5, String str6, List list, Map map, Boolean bool, String str7, String str8, String str9, sy.s sVar, boolean z2, boolean z3, String str10, String str11, String str12) {
        k71.k.g(str, "id");
        k71.k.g(j3Var, "type");
        k71.k.g(list, "toolRequests");
        k71.k.g(map, "arguments");
        this.a = str;
        this.b = instant;
        this.c = str2;
        this.d = z;
        this.e = j3Var;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = list;
        this.k = map;
        this.l = bool;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.p = sVar;
        this.q = z2;
        this.r = z3;
        this.s = str10;
        this.t = str11;
        this.u = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return k71.k.b(this.a, i3Var.a) && k71.k.b(this.b, i3Var.b) && k71.k.b(this.c, i3Var.c) && this.d == i3Var.d && this.e == i3Var.e && k71.k.b(this.f, i3Var.f) && k71.k.b(this.g, i3Var.g) && k71.k.b(this.h, i3Var.h) && k71.k.b(this.i, i3Var.i) && k71.k.b(this.j, i3Var.j) && k71.k.b(this.k, i3Var.k) && k71.k.b(this.l, i3Var.l) && k71.k.b(this.m, i3Var.m) && k71.k.b(this.n, i3Var.n) && k71.k.b(this.o, i3Var.o) && k71.k.b(this.p, i3Var.p) && this.q == i3Var.q && this.r == i3Var.r && k71.k.b(this.s, i3Var.s) && k71.k.b(this.t, i3Var.t) && k71.k.b(this.u, i3Var.u);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (this.e.hashCode() + x.i.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode6 = (this.k.hashCode() + f1.e.c(this.j, (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31)) * 31;
        Boolean bool = this.l;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.m;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.n;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        sy.s sVar = this.p;
        int e = x.i.e(x.i.e((hashCode10 + (sVar == null ? 0 : sVar.hashCode())) * 31, 31, this.q), 31, this.r);
        String str9 = this.s;
        int hashCode11 = (e + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.t;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.u;
        return hashCode12 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionEvent(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", parentId=");
        com.github.rudroid.m0.x(sb, this.c, ", ephemeral=", this.d, ", type=");
        sb.append(this.e);
        sb.append(", content=");
        sb.append(this.f);
        sb.append(", toolName=");
        f1.e.x(sb, this.g, ", messageId=", this.h, ", toolCallId=");
        sb.append(this.i);
        sb.append(", toolRequests=");
        sb.append(this.j);
        sb.append(", arguments=");
        sb.append(this.k);
        sb.append(", success=");
        sb.append(this.l);
        sb.append(", resultContent=");
        f1.e.x(sb, this.m, ", errorMessage=", this.n, ", sessionId=");
        sb.append(this.o);
        sb.append(", interactiveRequest=");
        sb.append(this.p);
        sb.append(", pending=");
        com.github.rudroid.m0.A(sb, this.q, ", dismissed=", this.r, ", reasoningText=");
        f1.e.x(sb, this.s, ", parentToolCallId=", this.t, ", source=");
        return com.github.rudroid.copilot.h1.p(sb, this.u, ")");
    }
}
