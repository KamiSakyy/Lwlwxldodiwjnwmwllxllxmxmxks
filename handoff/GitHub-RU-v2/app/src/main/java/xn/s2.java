package xn;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s2 implements y {
    public final String a;
    public final String b;
    public final ZonedDateTime c;
    public final List d;
    public final a0 e;
    public final String f;
    public final double g;
    public final String h;

    public s2(String str, double d) {
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
        a0 a0Var = new a0();
        k71.k.g(str, "modelName");
        this.a = "";
        this.b = "";
        this.c = now;
        this.d = x61.r.r;
        this.e = a0Var;
        this.f = str;
        this.g = d;
        this.h = "MultiplierWarningMessage" + str + d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return k71.k.b(this.a, s2Var.a) && k71.k.b(this.b, s2Var.b) && k71.k.b(this.c, s2Var.c) && k71.k.b(this.d, s2Var.d) && k71.k.b(this.e, s2Var.e) && k71.k.b(this.f, s2Var.f) && Double.compare(this.g, s2Var.g) == 0;
    }

    @Override // xn.y
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + com.github.rudroid.copilot.h1.i(f1.e.c(this.e.a, f1.e.c(this.d, com.github.rudroid.m0.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("MultiplierWarningMessage(threadId=", this.a, ", content=", this.b, ", createdAt=");
        o.append(this.c);
        o.append(", references=");
        o.append(this.d);
        o.append(", annotations=");
        o.append(this.e);
        o.append(", modelName=");
        o.append(this.f);
        o.append(", multiplier=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
