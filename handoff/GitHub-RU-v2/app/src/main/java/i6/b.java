package i6;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f26021a;

    public /* synthetic */ b(int i) {
        this.f26021a = i;
    }

    public static final /* synthetic */ b a(int i) {
        return new b(i);
    }

    public static String b(int i) {
        return no.a.l("Vertical(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f26021a == ((b) obj).f26021a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26021a);
    }

    public final String toString() {
        return b(this.f26021a);
    }

    public static Object b;
}
