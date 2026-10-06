package s3;

/* loaded from: /home/user/work/p/classes.dex */
public final class n implements t3.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f31707a;

    public n(float f6) {
        this.f31707a = f6;
    }

    @Override // t3.a
    public final float a(float f6) {
        return f6 / this.f31707a;
    }

    @Override // t3.a
    public final float b(float f6) {
        return f6 * this.f31707a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.f31707a, ((n) obj).f31707a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31707a);
    }

    public final String toString() {
        return x.i.i(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f31707a, ')');
    }
}
