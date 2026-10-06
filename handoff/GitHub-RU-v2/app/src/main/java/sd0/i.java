package sd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public String a;
    public int b;
    public boolean c;
    public boolean d;

    public i(int i, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static i a(i iVar, int i, boolean z) {
        String str = iVar.a;
        boolean z2 = iVar.c;
        iVar.getClass();
        return new i(i, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return com.github.rudroid.m0.m(a0.s0.n(this.b, "OnDiscussion(id=", this.a, ", upvoteCount=", ", viewerCanUpvote="), this.c, ", viewerHasUpvoted=", this.d, ")");
    }
}
