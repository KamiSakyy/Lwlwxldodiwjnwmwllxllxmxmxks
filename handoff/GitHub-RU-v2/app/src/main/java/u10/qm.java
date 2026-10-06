package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qm {
    public int a;
    public int b;
    public om c;
    public String d;
    public String e;

    public qm(int i, int i2, om omVar, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = omVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm)) {
            return false;
        }
        qm qmVar = (qm) obj;
        return this.a == qmVar.a && this.b == qmVar.b && k71.k.b(this.c, qmVar.c) && k71.k.b(this.d, qmVar.d) && k71.k.b(this.e, qmVar.e);
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
