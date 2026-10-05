package l7;

/* loaded from: /home/user/work/p/classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28049a;

    /* renamed from: b, reason: collision with root package name */
    public int f28050b;

    /* renamed from: c, reason: collision with root package name */
    public int f28051c;

    /* renamed from: d, reason: collision with root package name */
    public int f28052d;

    /* renamed from: e, reason: collision with root package name */
    public int f28053e;

    public final boolean a() {
        int i = this.f28049a;
        int i10 = 2;
        if ((i & 7) != 0) {
            int i11 = this.f28052d;
            int i12 = this.f28050b;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i13 = this.f28052d;
            int i14 = this.f28051c;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i15 = this.f28053e;
            int i16 = this.f28050b;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i17 = this.f28053e;
            int i18 = this.f28051c;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
