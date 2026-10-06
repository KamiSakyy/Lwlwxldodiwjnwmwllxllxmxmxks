package wx0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b5 implements aa.h0 {
    public String a;
    public String b;
    public int c;
    public ZonedDateTime d;
    public String e;
    public boolean f;
    public String g;
    public boolean h;
    public z4 i;
    public a5 j;
    public String k;

    public b5(String str, String str2, int i, ZonedDateTime zonedDateTime, String str3, boolean z, String str4, boolean z2, z4 z4Var, a5 a5Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = zonedDateTime;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = z4Var;
        this.j = a5Var;
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return k71.k.b(this.a, b5Var.a) && k71.k.b(this.b, b5Var.b) && this.c == b5Var.c && k71.k.b(this.d, b5Var.d) && k71.k.b(this.e, b5Var.e) && this.f == b5Var.f && k71.k.b(this.g, b5Var.g) && this.h == b5Var.h && k71.k.b(this.i, b5Var.i) && k71.k.b(this.j, b5Var.j) && k71.k.b(this.k, b5Var.k);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.d, a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31);
        String str = this.e;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(x.i.e((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), this.g, 31), 31, this.h)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SimpleProjectV2Fragment(id=", this.a, ", title=", this.b, ", number=");
        o.append(this.c);
        o.append(", updatedAt=");
        o.append(this.d);
        o.append(", shortDescription=");
        com.github.rudroid.m0.x(o, this.e, ", public=", this.f, ", url=");
        com.github.rudroid.m0.x(o, this.g, ", closed=", this.h, ", owner=");
        o.append(this.i);
        o.append(", repositories=");
        o.append(this.j);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.k, ")");
    }
}
