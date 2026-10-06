package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f31113b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f31114a;

    public static String a(int i) {
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i10 = i & 255;
        String str = "Invalid";
        sb2.append((Object) (i10 == 1 ? "Strategy.Simple" : i10 == 2 ? "Strategy.HighQuality" : i10 == 3 ? "Strategy.Balanced" : i10 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb2.append(", strictness=");
        int i11 = (i >> 8) & 255;
        sb2.append((Object) (i11 == 1 ? "Strictness.None" : i11 == 2 ? "Strictness.Loose" : i11 == 3 ? "Strictness.Normal" : i11 == 4 ? "Strictness.Strict" : i11 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb2.append(", wordBreak=");
        int i12 = (i >> 16) & 255;
        if (i12 == 1) {
            str = "WordBreak.None";
        } else if (i12 == 2) {
            str = "WordBreak.Phrase";
        } else if (i12 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f31114a == ((e) obj).f31114a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31114a);
    }

    public final String toString() {
        return a(this.f31114a);
    }
}
