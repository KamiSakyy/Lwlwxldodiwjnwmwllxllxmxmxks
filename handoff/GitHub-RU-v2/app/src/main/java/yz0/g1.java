package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g1 {
    public final p2 a;
    public final c4 b;

    public g1(p2 p2Var, c4 c4Var) {
        this.a = p2Var;
        this.b = c4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return k71.k.b(this.a, g1Var.a) && k71.k.b(this.b, g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FetchRepositoriesListLoad(listDetailData=" + this.a + ", repositoriesInListPaged=" + this.b + ")";
    }
}
