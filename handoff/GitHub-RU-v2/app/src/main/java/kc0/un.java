package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class un {
    public int a;
    public int b;
    public sn c;
    public String d;
    public String e;

    public un(int i, int i2, sn snVar, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = snVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un)) {
            return false;
        }
        un unVar = (un) obj;
        return this.a == unVar.a && this.b == unVar.b && k71.k.b(this.c, unVar.c) && k71.k.b(this.d, unVar.d) && k71.k.b(this.e, unVar.e);
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
