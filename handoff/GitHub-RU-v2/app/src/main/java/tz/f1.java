package tz;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public LocalDate f;
    public u g;

    public f1(String str, String str2, String str3, String str4, int i, LocalDate localDate, u uVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = localDate;
        this.g = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b) && k71.k.b(this.c, f1Var.c) && k71.k.b(this.d, f1Var.d) && this.e == f1Var.e && k71.k.b(this.f, f1Var.f) && k71.k.b(this.g, f1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + a0.s0.b(this.e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnProjectV2ItemFieldIterationValue(id=", this.a, ", iterationId=", this.b, ", title=");
        f1.e.x(o, this.c, ", titleHTML=", this.d, ", duration=");
        o.append(this.e);
        o.append(", startDate=");
        o.append(this.f);
        o.append(", field=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
