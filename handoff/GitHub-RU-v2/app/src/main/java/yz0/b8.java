package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b8 implements q3 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final long e = -1754429403;

    public b8(int i, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public static b8 a(b8 b8Var, boolean z, int i) {
        String str = b8Var.a;
        boolean z2 = b8Var.b;
        b8Var.getClass();
        return new b8(i, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return k71.k.b(this.a, b8Var.a) && this.b == b8Var.b && this.c == b8Var.c && this.d == b8Var.d;
    }

    @Override // yz0.q3
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("Upvote(subjectId=", this.a, ", viewerCanUpvote=", ", viewerHasUpvoted=", this.b);
        o.append(this.c);
        o.append(", upvoteCount=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
