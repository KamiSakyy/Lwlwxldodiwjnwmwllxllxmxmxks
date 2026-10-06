package g3;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f24642a;

    public static String a(int i) {
        return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : no.a.l("Invalid(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f24642a == ((k) obj).f24642a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24642a);
    }

    public final String toString() {
        return a(this.f24642a);
    }
}
