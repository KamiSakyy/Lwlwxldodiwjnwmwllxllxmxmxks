package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c7 {
    public final String a;
    public final List b;
    public final String c;

    public c7(String str, String str2, List list) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return k71.k.b(this.a, c7Var.a) && k71.k.b(this.b, c7Var.b) && k71.k.b(this.c, c7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return this.c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Patch(id=");
        sb.append(this.a);
        sb.append(", diffLines=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
