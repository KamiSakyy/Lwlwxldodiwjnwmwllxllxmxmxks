package wx0;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final LocalDate f;
    public final t g;

    public e1(String str, String str2, String str3, String str4, int i, LocalDate localDate, t tVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = localDate;
        this.g = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c) && k71.k.b(this.d, e1Var.d) && this.e == e1Var.e && k71.k.b(this.f, e1Var.f) && k71.k.b(this.g, e1Var.g);
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
