package tz;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u4 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final ZonedDateTime d;
    public final String e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final l k;

    public u4(String str, String str2, String str3, ZonedDateTime zonedDateTime, String str4, boolean z, int i, boolean z2, boolean z3, String str5, l lVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = str4;
        this.f = z;
        this.g = i;
        this.h = z2;
        this.i = z3;
        this.j = str5;
        this.k = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return k71.k.b(this.a, u4Var.a) && k71.k.b(this.b, u4Var.b) && k71.k.b(this.c, u4Var.c) && k71.k.b(this.d, u4Var.d) && k71.k.b(this.e, u4Var.e) && this.f == u4Var.f && this.g == u4Var.g && this.h == u4Var.h && this.i == u4Var.i && k71.k.b(this.j, u4Var.j) && k71.k.b(this.k, u4Var.k);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
        String str = this.e;
        return this.k.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(a0.s0.b(this.g, x.i.e((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31), 31, this.h), 31, this.i), this.j, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectWithFieldsFragment(__typename=", this.a, ", id=", this.b, ", title=");
        com.github.rudroid.copilot.h1.A(this.c, ", updatedAt=", ", shortDescription=", o, this.d);
        com.github.rudroid.m0.x(o, this.e, ", public=", this.f, ", number=");
        com.github.rudroid.m0.w(o, this.g, ", viewerCanUpdate=", this.h, ", useElasticsearch=");
        com.github.rudroid.m0.z(o, this.i, ", url=", this.j, ", projectV2FieldConstraintsFragment=");
        o.append(this.k);
        o.append(")");
        return o.toString();
    }
}
