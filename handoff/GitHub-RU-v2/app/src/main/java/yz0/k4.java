package yz0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k4 {
    public Object a;
    public x01.i b;

    public k4(List list, x01.i iVar) {
        this.a = list;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return this.a.equals(k4Var.a) && this.b.equals(k4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleRepositoriesPaged(repositories=" + this.a + ", page=" + this.b + ")";
    }

    public k4(Object... a) {
    }
}
