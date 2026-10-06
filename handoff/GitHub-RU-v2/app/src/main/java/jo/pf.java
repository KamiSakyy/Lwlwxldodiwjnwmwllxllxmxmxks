package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pf {
    public final String a;
    public final boolean b;
    public final boolean c;

    public pf(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj;
        return k71.k.b(this.a, pfVar.a) && this.b == pfVar.b && this.c == pfVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return f4.s(com.github.rudroid.m0.o("PageInfo(endCursor=", this.a, ", hasNextPage=", ", hasPreviousPage=", this.b), this.c, ")");
    }
}
