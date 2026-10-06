package iy0;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import pz0.tq;
import wx0.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public ZonedDateTime d;
    public boolean e;
    public tq f;
    public x1 g;

    public e1(String str, String str2, String str3, ZonedDateTime zonedDateTime, boolean z, tq tqVar, x1 x1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = z;
        this.f = tqVar;
        this.g = x1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c) && k71.k.b(this.d, e1Var.d) && this.e == e1Var.e && this.f == e1Var.f && k71.k.b(this.g, e1Var.g);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + x.i.e(com.github.rudroid.m0.a(this.d, (i + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2ViewItemFragment(__typename=", this.a, ", id=", this.b, ", fullDatabaseId=");
        h1.A(this.c, ", updatedAt=", ", isArchived=", o, this.d);
        o.append(this.e);
        o.append(", type=");
        o.append(this.f);
        o.append(", projectV2FieldValuesFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
