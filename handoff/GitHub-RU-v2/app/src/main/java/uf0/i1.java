package uf0;

import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i1 implements aa.h0 {
    public String a;
    public boolean b;
    public boolean c;
    public int d;
    public bl0.a e;

    public i1(String str, boolean z, boolean z2, int i, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return k71.k.b(this.a, i1Var.a) && this.b == i1Var.b && this.c == i1Var.c && this.d == i1Var.d && k71.k.b(this.e, i1Var.e);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.d, x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        bl0.a aVar = this.e;
        return b + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("UpvoteFragment(__typename=", this.a, ", viewerCanUpvote=", ", viewerHasUpvoted=", this.b);
        com.github.rudroid.m0.y(o, this.c, ", upvoteCount=", this.d, ", nodeIdFragment=");
        return f4.q(o, this.e, ")");
    }
}
