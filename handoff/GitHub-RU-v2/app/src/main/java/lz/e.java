package lz;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import m10.jq;
import m10.uq;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public int e;
    public ZonedDateTime f;
    public uq g;
    public n0 h;
    public String i;
    public boolean j;
    public boolean k;
    public String l;
    public a0Shadow m;
    public jq n;
    public b0 o;
    public String p;

    public e(String str, String str2, String str3, boolean z, int i, ZonedDateTime zonedDateTime, uq uqVar, n0 n0Var, String str4, boolean z2, boolean z3, String str5, a0Shadow a0Var, jq jqVar, b0 b0Var, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        this.f = zonedDateTime;
        this.g = uqVar;
        this.h = n0Var;
        this.i = str4;
        this.j = z2;
        this.k = z3;
        this.l = str5;
        this.m = a0Var;
        this.n = jqVar;
        this.o = b0Var;
        this.p = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && k71.k.b(this.f, eVar.f) && this.g == eVar.g && k71.k.b(this.h, eVar.h) && k71.k.b(this.i, eVar.i) && this.j == eVar.j && this.k == eVar.k && k71.k.b(this.l, eVar.l) && k71.k.b(this.m, eVar.m) && this.n == eVar.n && k71.k.b(this.o, eVar.o) && k71.k.b(this.p, eVar.p);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + com.github.rudroid.m0.a(this.f, a0.s0.b(this.e, x.i.e(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31), 31)) * 31;
        n0 n0Var = this.h;
        int hashCode2 = (hashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        String str = this.i;
        int i = h1.i(x.i.e(x.i.e((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), this.l, 31);
        a0Shadow a0Var = this.m;
        int hashCode3 = (i + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        jq jqVar = this.n;
        int hashCode4 = (hashCode3 + (jqVar == null ? 0 : jqVar.hashCode())) * 31;
        b0 b0Var = this.o;
        return this.p.hashCode() + ((hashCode4 + (b0Var != null ? b0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(id=", this.a, ", threadType=", this.b, ", title=");
        com.github.rudroid.m0.x(o, this.c, ", isUnread=", this.d, ", unreadItemsCount=");
        o.append(this.e);
        o.append(", lastUpdatedAt=");
        o.append(this.f);
        o.append(", subscriptionStatus=");
        o.append(this.g);
        o.append(", summaryItemAuthor=");
        o.append(this.h);
        o.append(", summaryItemBody=");
        com.github.rudroid.m0.x(o, this.i, ", isArchived=", this.j, ", isSaved=");
        com.github.rudroid.m0.z(o, this.k, ", url=", this.l, ", optionalList=");
        o.append(this.m);
        o.append(", reason=");
        o.append(this.n);
        o.append(", optionalSubject=");
        o.append(this.o);
        o.append(", __typename=");
        o.append(this.p);
        o.append(")");
        return o.toString();
    }
}
