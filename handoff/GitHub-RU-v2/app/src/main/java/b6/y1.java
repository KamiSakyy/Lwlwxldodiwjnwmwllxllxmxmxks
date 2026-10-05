package b6;

/* loaded from: /home/user/work/p/classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f3737a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f3738b;

    public y1(i1 i1Var, i1 i1Var2) {
        this.f3737a = i1Var;
        this.f3738b = i1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.f3737a == y1Var.f3737a && this.f3738b == y1Var.f3738b;
    }

    public final int hashCode() {
        return this.f3738b.hashCode() + (this.f3737a.hashCode() * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + this.f3737a + ", height=" + this.f3738b + ')';
    }
}
