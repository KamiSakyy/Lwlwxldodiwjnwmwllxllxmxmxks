package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a00 {
    public final int a;
    public final zz b;
    public final List c;

    public a00(int i, zz zzVar, List list) {
        this.a = i;
        this.b = zzVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a00)) {
            return false;
        }
        a00 a00Var = (a00) obj;
        return this.a == a00Var.a && k71.k.b(this.b, a00Var.b) && k71.k.b(this.c, a00Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(issueCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}
