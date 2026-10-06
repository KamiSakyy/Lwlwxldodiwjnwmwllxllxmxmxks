package g3;

/* loaded from: /home/user/work/p/classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final x f24715c = new x(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24716a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24717b;

    public x(boolean z10) {
        this.f24716a = z10;
        this.f24717b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f24716a == xVar.f24716a && this.f24717b == xVar.f24717b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24717b) + (Boolean.hashCode(this.f24716a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f24716a + ", emojiSupportMatch=" + ((Object) k.a(this.f24717b)) + ')';
    }

    public x(int i, boolean z10) {
        this.f24716a = z10;
        this.f24717b = i;
    }
}
