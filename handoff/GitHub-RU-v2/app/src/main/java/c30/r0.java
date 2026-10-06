package c30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements aa.h0 {
    public String a;
    public boolean b;
    public q0 c;
    public String d;

    public r0(String str, boolean z, q0 q0Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = q0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && this.b == r0Var.b && k71.k.b(this.c, r0Var.c) && k71.k.b(this.d, r0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c.a, x.i.e(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("UserFollowersFragment(id=", this.a, ", viewerIsFollowing=", ", followers=", this.b);
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public Object j(Object p1) { return null; }
}
