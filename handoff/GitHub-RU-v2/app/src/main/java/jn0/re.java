package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class re {
    public String a;
    public boolean b;
    public boolean c;

    public re(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return k71.k.b(this.a, reVar.a) && this.b == reVar.b && this.c == reVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return jo.f4.s(com.github.rudroid.m0.o("PageInfo(endCursor=", this.a, ", hasNextPage=", ", hasPreviousPage=", this.b), this.c, ")");
    }
}
