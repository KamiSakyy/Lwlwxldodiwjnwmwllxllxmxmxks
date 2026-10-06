package oj0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 {
    public final String a;
    public final String b;
    public final String c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final String f;

    public r0(String str, String str2, String str3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && k71.k.b(this.b, r0Var.b) && k71.k.b(this.c, r0Var.c) && k71.k.b(this.d, r0Var.d) && k71.k.b(this.e, r0Var.e) && k71.k.b(this.f, r0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        ZonedDateTime zonedDateTime = this.d;
        return this.f.hashCode() + com.github.rudroid.m0.a(this.e, (i + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("LatestRelease(id=", this.a, ", name=", this.b, ", tagName=");
        com.github.rudroid.copilot.h1.A(this.c, ", publishedAt=", ", createdAt=", o, this.d);
        return x.i.h(", __typename=", this.f, ")", o, this.e);
    }
}
