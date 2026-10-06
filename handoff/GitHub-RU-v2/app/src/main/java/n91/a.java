package n91;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a extends t91.c {
    public static final a g = new a(new int[0], new char[0], new boolean[0], 0, false);
    public boolean f;

    public a(int[] iArr, char[] cArr, boolean[] zArr, int i, boolean z) {
        super(iArr, cArr, zArr, i);
        this.f = z;
    }

    @Override // t91.c
    public final t91.c d(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        char c = cArr[cArr.length - 1];
        char c2 = c < 128 ? c : (char) (c - 'd');
        cArr[cArr.length - 1] = c2;
        return new a(iArr, cArr, zArr, i, c != c2);
    }

    @Override // t91.c
    public final t91.a e(s91.c cVar) {
        int i = cVar.b;
        t91.a e = super.e(cVar);
        if (e == null) {
            return null;
        }
        int i2 = e.a;
        String str = cVar.d;
        int i3 = i + i2;
        while (i3 < str.length() && (str.charAt(i3) == ' ' || str.charAt(i3) == '\t')) {
            i3++;
        }
        int i4 = i3 + 3;
        if (i4 <= str.length() && str.charAt(i3) == '[' && str.charAt(i3 + 2) == ']') {
            int i5 = i3 + 1;
            if (str.charAt(i5) == 'x' || str.charAt(i5) == 'X' || str.charAt(i5) == ' ') {
                return new t91.a((char) (e.b + 'd'), i4 - i, i2);
            }
        }
        return e;
    }

    @Override // t91.c
    public final t91.c f() {
        return g;
    }
}
