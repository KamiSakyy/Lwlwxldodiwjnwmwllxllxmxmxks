package yz0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c4 {
    public List a;
    public x01.i b;

    public c4(List list, x01.i iVar) {
        this.a = list;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return k71.k.b(this.a, c4Var.a) && k71.k.b(this.b, c4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RepositoriesPaged(repositories=" + this.a + ", page=" + this.b + ")";
    }
}
