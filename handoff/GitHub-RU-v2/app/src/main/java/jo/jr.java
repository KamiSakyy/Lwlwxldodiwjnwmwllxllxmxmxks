package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jr {
    public final int a;
    public final int b;
    public final hr c;
    public final String d;
    public final String e;

    public jr(int i, int i2, hr hrVar, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = hrVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr)) {
            return false;
        }
        jr jrVar = (jr) obj;
        return this.a == jrVar.a && this.b == jrVar.b && k71.k.b(this.c, jrVar.c) && k71.k.b(this.d, jrVar.d) && k71.k.b(this.e, jrVar.e);
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
