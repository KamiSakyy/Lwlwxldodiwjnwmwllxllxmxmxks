package lz;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public c0 a;
    public String b;
    public String c;

    public x(c0 c0Var, String str, String str2) {
        this.a = c0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnTeam(organization=");
        sb.append(this.a);
        sb.append(", slug=");
        sb.append(this.b);
        sb.append(", id=");
        return h1.p(sb, this.c, ")");
    }
}
