package ap0;

import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o6 {
    public final n30 a;
    public final String b;
    public final String c;

    public o6(String str, String str2, n30 n30Var) {
        this.a = n30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return this.a == o6Var.a && k71.k.b(this.b, o6Var.b) && k71.k.b(this.c, o6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusCheckRollup(state=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
