package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s6 {
    public final String a;
    public final List b;
    public final String c;

    public s6(String str, String str2, List list) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return k71.k.b(this.a, s6Var.a) && k71.k.b(this.b, s6Var.b) && k71.k.b(this.c, s6Var.c);
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
