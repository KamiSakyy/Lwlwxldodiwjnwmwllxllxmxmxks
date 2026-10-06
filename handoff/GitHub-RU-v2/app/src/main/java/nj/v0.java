package nj;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 {
    public final int a;
    public final boolean b;
    public final Integer c;

    public v0(int i, boolean z, Integer num) {
        this.a = i;
        this.b = z;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && this.b == v0Var.b && k71.k.b(this.c, v0Var.c);
    }

    public final int hashCode() {
        int e = x.i.e(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PaginationState(nextPageToFetch=" + this.a + ", hasFinishedBackfill=" + this.b + ", serverTotal=" + this.c + ")";
    }
}
