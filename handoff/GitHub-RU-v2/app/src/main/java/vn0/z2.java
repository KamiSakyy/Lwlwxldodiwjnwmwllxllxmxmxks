package vn0;

import java.time.ZonedDateTime;
import pz0.la0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z2 implements aa.h0 {
    public final String a;
    public final String b;
    public final int c;
    public final la0 d;
    public final ZonedDateTime e;
    public final y2 f;
    public final r2 g;
    public final String h;

    public z2(String str, String str2, int i, la0 la0Var, ZonedDateTime zonedDateTime, y2 y2Var, r2 r2Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = la0Var;
        this.e = zonedDateTime;
        this.f = y2Var;
        this.g = r2Var;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return k71.k.b(this.a, z2Var.a) && k71.k.b(this.b, z2Var.b) && this.c == z2Var.c && this.d == z2Var.d && k71.k.b(this.e, z2Var.e) && k71.k.b(this.f, z2Var.f) && k71.k.b(this.g, z2Var.g) && k71.k.b(this.h, z2Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + com.github.rudroid.m0.a(this.e, (this.d.hashCode() + a0.s0.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WorkflowRunFragment(id=", this.a, ", title=", this.b, ", runNumber=");
        o.append(this.c);
        o.append(", eventType=");
        o.append(this.d);
        o.append(", createdAt=");
        o.append(this.e);
        o.append(", workflow=");
        o.append(this.f);
        o.append(", checkSuite=");
        o.append(this.g);
        o.append(", __typename=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
