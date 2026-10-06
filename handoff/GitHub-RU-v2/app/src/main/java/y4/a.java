package y4;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f34252e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f34253a;

    /* renamed from: b, reason: collision with root package name */
    public int f34254b;

    /* renamed from: c, reason: collision with root package name */
    public int f34255c;

    /* renamed from: d, reason: collision with root package name */
    public char f34256d;

    static {
        for (int i = 0; i < 1792; i++) {
            f34252e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f34253a = charSequence;
        this.f34254b = charSequence.length();
    }

    public final byte a() {
        int i = this.f34255c - 1;
        CharSequence charSequence = this.f34253a;
        char charAt = charSequence.charAt(i);
        this.f34256d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f34255c);
            this.f34255c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f34255c--;
        char c10 = this.f34256d;
        return c10 < 1792 ? f34252e[c10] : Character.getDirectionality(c10);
    }
}
