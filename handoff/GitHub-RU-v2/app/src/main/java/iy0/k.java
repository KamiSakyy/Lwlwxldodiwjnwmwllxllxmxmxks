package iy0;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public ZonedDateTime d;
    public ZonedDateTime e;

    public k(String str, String str2, String str3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && k71.k.b(this.c, kVar.c) && k71.k.b(this.d, kVar.d) && k71.k.b(this.e, kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.m0.a(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2ContentDraft(__typename=", this.a, ", id=", this.b, ", title=");
        h1.A(this.c, ", updatedAt=", ", createdAt=", o, this.d);
        return h1.q(o, this.e, ")");
    }
}
