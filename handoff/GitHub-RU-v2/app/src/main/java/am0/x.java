package am0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x {
    public b0 a;
    public String b;
    public String c;

    public x(b0 b0Var, String str, String str2) {
        this.a = b0Var;
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
