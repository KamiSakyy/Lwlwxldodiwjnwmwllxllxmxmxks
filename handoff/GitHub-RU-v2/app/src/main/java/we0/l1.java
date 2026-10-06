package we0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 implements aa.h0 {
    public String a;
    public ZonedDateTime b;
    public String c;
    public boolean d;
    public boolean e;
    public String f;
    public h1 g;
    public g1 h;
    public i1 i;
    public String j;

    public l1(String str, ZonedDateTime zonedDateTime, String str2, boolean z, boolean z2, String str3, h1 h1Var, g1 g1Var, i1 i1Var, String str4) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = str3;
        this.g = h1Var;
        this.h = g1Var;
        this.i = i1Var;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return k71.k.b(this.a, l1Var.a) && k71.k.b(this.b, l1Var.b) && k71.k.b(this.c, l1Var.c) && this.d == l1Var.d && this.e == l1Var.e && k71.k.b(this.f, l1Var.f) && k71.k.b(this.g, l1Var.g) && k71.k.b(this.h, l1Var.h) && k71.k.b(this.i, l1Var.i) && k71.k.b(this.j, l1Var.j);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31, this.d), 31, this.e), this.f, 31);
        h1 h1Var = this.g;
        int hashCode = (i + (h1Var == null ? 0 : h1Var.hashCode())) * 31;
        g1 g1Var = this.h;
        int hashCode2 = (hashCode + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        i1 i1Var = this.i;
        return this.j.hashCode() + ((hashCode2 + (i1Var != null ? i1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = com.github.rudroid.copilot.h1.s("CommitFields(id=", this.a, ", committedDate=", ", messageHeadline=", this.b);
        com.github.rudroid.m0.x(s, this.c, ", committedViaWeb=", this.d, ", authoredByCommitter=");
        com.github.rudroid.m0.z(s, this.e, ", abbreviatedOid=", this.f, ", committer=");
        s.append(this.g);
        s.append(", author=");
        s.append(this.h);
        s.append(", statusCheckRollup=");
        s.append(this.i);
        s.append(", __typename=");
        s.append(this.j);
        s.append(")");
        return s.toString();
    }
}
