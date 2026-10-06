package e50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 implements aa.h0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final ja0.a e;

    public d1(String str, boolean z, boolean z2, int i, ja0.a aVar) {
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
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && this.b == d1Var.b && this.c == d1Var.c && this.d == d1Var.d && k71.k.b(this.e, d1Var.e);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.d, x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        ja0.a aVar = this.e;
        return b + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("UpvoteFragment(__typename=", this.a, ", viewerCanUpvote=", ", viewerHasUpvoted=", this.b);
        com.github.rudroid.m0.y(o, this.c, ", upvoteCount=", this.d, ", nodeIdFragment=");
        return no.a.p(o, this.e, ")");
    }
}
