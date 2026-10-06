package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jz {
    public final String a;
    public final String b;
    public final ZonedDateTime c;
    public final String d;

    public jz(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        return k71.k.b(this.a, jzVar.a) && k71.k.b(this.b, jzVar.b) && k71.k.b(this.c, jzVar.c) && k71.k.b(this.d, jzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.m0.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return x.i.h(", __typename=", this.d, ")", a0.s0.o("Node1(id=", this.a, ", message=", this.b, ", committedDate="), this.c);
    }
}
