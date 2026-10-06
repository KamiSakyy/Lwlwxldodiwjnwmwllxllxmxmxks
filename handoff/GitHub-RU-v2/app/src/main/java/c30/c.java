package c30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.h0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final a d;
    public final b e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public c(String str, boolean z, boolean z2, a aVar, b bVar, boolean z3, boolean z4, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = aVar;
        this.e = bVar;
        this.f = z3;
        this.g = z4;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && k71.k.b(this.d, cVar.d) && k71.k.b(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g && k71.k.b(this.h, cVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + x.i.e(x.i.e(a0.s0.b(this.e.a, a0.s0.b(this.d.a, x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("BlockUserFragment(id=", this.a, ", viewerIsFollowing=", ", isFollowingViewer=", this.b);
        o.append(this.c);
        o.append(", followers=");
        o.append(this.d);
        o.append(", following=");
        o.append(this.e);
        o.append(", viewerCanBlock=");
        o.append(this.f);
        o.append(", viewerCanUnblock=");
        return com.github.rudroid.m0.l(o, this.g, ", __typename=", this.h, ")");
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}
