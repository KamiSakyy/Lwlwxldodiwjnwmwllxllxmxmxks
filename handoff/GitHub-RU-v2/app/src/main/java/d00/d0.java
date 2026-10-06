package d00;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {
    public c0 a;
    public String b;
    public String c;

    public d0(c0 c0Var, String str, String str2) {
        this.a = c0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return k71.k.b(this.a, d0Var.a) && k71.k.b(this.b, d0Var.b) && k71.k.b(this.c, d0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(items=");
        sb.append(this.a);
        sb.append(", viewGroupId=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
