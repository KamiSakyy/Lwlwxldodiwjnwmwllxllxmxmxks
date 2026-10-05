package s3;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements Comparable {

    /* renamed from: r, reason: collision with root package name */
    public final float f31694r;

    public static int a(float f6, float f10) {
        if (Float.isNaN(f6) || Float.isNaN(f10)) {
            return 0;
        }
        return Float.compare(f6, f10);
    }

    public static final boolean b(float f6, float f10) {
        return Float.compare(f6, f10) == 0;
    }

    public static String c(float f6) {
        if (Float.isNaN(f6)) {
            return "Dp.Unspecified";
        }
        return f6 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.f31694r, ((f) obj).f31694r);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f31694r, ((f) obj).f31694r) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31694r);
    }

    public final String toString() {
        return c(this.f31694r);
    }
}
