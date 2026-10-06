package b6;

/* loaded from: /home/user/work/p/classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public int f3545a;

    public f1(int i) {
        this.f3545a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.f3545a == ((f1) obj).f3545a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3545a);
    }

    public final String toString() {
        return x.i.j(new StringBuilder("LayoutInfo(layoutId="), this.f3545a, ')');
    }
}
