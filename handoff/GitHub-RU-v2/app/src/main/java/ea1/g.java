package ea1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends n {
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    public g(int i, String str, String str2, boolean z) {
        this.c = i;
        aa1.b.H(str);
        aa1.b.H(str2);
        this.a = ba1.a.d(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        if (z || !z2) {
            this.b = ba1.a.d(str2);
        } else {
            this.b = ba1.a.c(str2);
        }
    }

    @Override // ea1.n
    public final int a() {
        switch (this.c) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return x.i.g("[", this.a, "=", this.b, "]");
            case 1:
                return x.i.g("[", this.a, "*=", this.b, "]");
            case 2:
                return x.i.g("[", this.a, "$=", this.b, "]");
            case 3:
                return x.i.g("[", this.a, "!=", this.b, "]");
            default:
                return x.i.g("[", this.a, "^=", this.b, "]");
        }
    }
}
