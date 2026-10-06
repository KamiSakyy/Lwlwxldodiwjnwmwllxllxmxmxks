package yz0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d4 {
    public final int a;
    public final ArrayList b;
    public final x01.i c;

    public d4(int i, ArrayList arrayList, x01.i iVar) {
        this.a = i;
        this.b = arrayList;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return this.a == d4Var.a && this.b.equals(d4Var.b) && this.c.equals(d4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "RepositoriesSearchResults(totalCount=" + this.a + ", repositories=" + this.b + ", page=" + this.c + ")";
    }
}
