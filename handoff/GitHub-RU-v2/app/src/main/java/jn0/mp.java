package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mp {
    public final int a;
    public final int b;
    public final kp c;
    public final String d;
    public final String e;

    public mp(int i, int i2, kp kpVar, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = kpVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp)) {
            return false;
        }
        mp mpVar = (mp) obj;
        return this.a == mpVar.a && this.b == mpVar.b && k71.k.b(this.c, mpVar.c) && k71.k.b(this.d, mpVar.d) && k71.k.b(this.e, mpVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "Compare(aheadBy=", ", behindBy=", ", commits=");
        m.append(this.c);
        m.append(", id=");
        m.append(this.d);
        m.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(m, this.e, ")");
    }
}
