package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f31142c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f31143d = new s(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f31144a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31145b;

    public s(int i, boolean z10) {
        this.f31144a = i;
        this.f31145b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f31144a == sVar.f31144a && this.f31145b == sVar.f31145b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31145b) + (Integer.hashCode(this.f31144a) * 31);
    }

    public final String toString() {
        return equals(f31142c) ? "TextMotion.Static" : equals(f31143d) ? "TextMotion.Animated" : "Invalid";
    }
}
