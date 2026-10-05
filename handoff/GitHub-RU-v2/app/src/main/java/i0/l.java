package i0;

/* loaded from: /home/user/work/p/classes.dex */
public final class l implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f25688b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f25689c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25690a;

    public /* synthetic */ l(int i) {
        this.f25690a = i;
    }

    @Override // i0.m
    public final int c(int i, int i10, int i11, int i12) {
        switch (this.f25690a) {
            case k5.f.J /* 0 */:
                return (((i - i11) - i12) / 2) - (i10 / 2);
            default:
                return 0;
        }
    }

    public final String toString() {
        switch (this.f25690a) {
            case k5.f.J /* 0 */:
                return "Center";
            default:
                return "Start";
        }
    }
}
