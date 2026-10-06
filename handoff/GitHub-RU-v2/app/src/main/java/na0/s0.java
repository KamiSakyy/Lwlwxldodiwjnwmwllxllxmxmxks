package na0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public String a;
    public Boolean b;
    public String c;

    public s0(Boolean bool, String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = bool;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b) && k71.k.b(this.c, s0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return this.c.hashCode() + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Issue(id=");
        sb.append(this.a);
        sb.append(", isPinned=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
