package tz;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o4 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final LocalDate e;

    public o4(String str, String str2, String str3, int i, LocalDate localDate) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return k71.k.b(this.a, o4Var.a) && k71.k.b(this.b, o4Var.b) && k71.k.b(this.c, o4Var.c) && this.d == o4Var.d && k71.k.b(this.e, o4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2IterationFragment(id=", this.a, ", title=", this.b, ", titleHTML=");
        a0.s0.w(this.d, this.c, ", duration=", ", startDate=", o);
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
