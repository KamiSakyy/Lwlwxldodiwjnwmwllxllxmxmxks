package ri0;

import gn0.yv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o2 {
    public final String a;
    public final yv b;
    public final String c;

    public o2(yv yvVar, String str, String str2) {
        this.a = str;
        this.b = yvVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return k71.k.b(this.a, o2Var.a) && this.b == o2Var.b && k71.k.b(this.c, o2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusCheckRollup(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
