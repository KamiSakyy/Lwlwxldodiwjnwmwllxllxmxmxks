package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f31115b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f31116c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f31117d;

    /* renamed from: a, reason: collision with root package name */
    public float f31118a;

    static {
        a(0.0f);
        a(0.5f);
        f31115b = 0.5f;
        a(-1.0f);
        f31116c = -1.0f;
        a(1.0f);
        f31117d = 1.0f;
    }

    public static void a(float f6) {
        if ((0.0f > f6 || f6 > 1.0f) && f6 != -1.0f) {
            m3.a.c("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f6) {
        if (f6 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f6 == f31115b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f6 == f31116c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f6 == f31117d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f6 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f31118a, ((f) obj).f31118a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31118a);
    }

    public final String toString() {
        return b(this.f31118a);
    }
}
