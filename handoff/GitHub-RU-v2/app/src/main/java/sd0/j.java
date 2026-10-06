package sd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public String a;
    public int b;
    public boolean c;
    public boolean d;

    public j(int i, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static j a(j jVar, int i, boolean z) {
        String str = jVar.a;
        boolean z2 = jVar.c;
        jVar.getClass();
        return new j(i, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return com.github.rudroid.m0.m(a0.s0.n(this.b, "OnDiscussionComment(id=", this.a, ", upvoteCount=", ", viewerCanUpvote="), this.c, ", viewerHasUpvoted=", this.d, ")");
    }
}
