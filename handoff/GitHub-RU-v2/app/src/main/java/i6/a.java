package i6;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f26020a;

    public /* synthetic */ a(int i) {
        this.f26020a = i;
    }

    public static final /* synthetic */ a a(int i) {
        return new a(i);
    }

    public static String b(int i) {
        return no.a.l("Horizontal(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f26020a == ((a) obj).f26020a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26020a);
    }

    public final String toString() {
        return b(this.f26020a);
    }
}
