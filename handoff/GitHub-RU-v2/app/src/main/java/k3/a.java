package k3;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements w {

    /* renamed from: r, reason: collision with root package name */
    public int f27649r;

    public a(int i) {
        this.f27649r = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f27649r == ((a) obj).f27649r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27649r);
    }

    public final String toString() {
        return x.i.j(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f27649r, ')');
    }
}
