package fb0;

import com.github.rudroid.copilot.h1;
import hc0.ih;
import hc0.th;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public int e;
    public ZonedDateTime f;
    public th g;
    public m0 h;
    public String i;
    public boolean j;
    public boolean k;
    public String l;
    public e m;
    public ih n;
    public l0 o;
    public String p;

    public f(String str, String str2, String str3, boolean z, int i, ZonedDateTime zonedDateTime, th thVar, m0 m0Var, String str4, boolean z2, boolean z3, String str5, e eVar, ih ihVar, l0 l0Var, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        this.f = zonedDateTime;
        this.g = thVar;
        this.h = m0Var;
        this.i = str4;
        this.j = z2;
        this.k = z3;
        this.l = str5;
        this.m = eVar;
        this.n = ihVar;
        this.o = l0Var;
        this.p = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && k71.k.b(this.c, fVar.c) && this.d == fVar.d && this.e == fVar.e && k71.k.b(this.f, fVar.f) && this.g == fVar.g && k71.k.b(this.h, fVar.h) && k71.k.b(this.i, fVar.i) && this.j == fVar.j && this.k == fVar.k && k71.k.b(this.l, fVar.l) && k71.k.b(this.m, fVar.m) && this.n == fVar.n && k71.k.b(this.o, fVar.o) && k71.k.b(this.p, fVar.p);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + com.github.rudroid.m0.a(this.f, a0.s0.b(this.e, x.i.e(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31), 31)) * 31;
        m0 m0Var = this.h;
        int hashCode2 = (hashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        String str = this.i;
        int hashCode3 = (this.m.hashCode() + h1.i(x.i.e(x.i.e((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), this.l, 31)) * 31;
        ih ihVar = this.n;
        return this.p.hashCode() + ((this.o.hashCode() + ((hashCode3 + (ihVar != null ? ihVar.hashCode() : 0)) * 31)) * 31);
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
        com.github.rudroid.m0.z(o, this.k, ", url=", this.l, ", list=");
        o.append(this.m);
        o.append(", reason=");
        o.append(this.n);
        o.append(", subject=");
        o.append(this.o);
        o.append(", __typename=");
        o.append(this.p);
        o.append(")");
        return o.toString();
    }
}
