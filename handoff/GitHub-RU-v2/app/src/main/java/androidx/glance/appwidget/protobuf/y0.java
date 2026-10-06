package androidx.glance.appwidget.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f2809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2810b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2811c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2812d;

    public y0(a aVar, String str, Object[] objArr) {
        this.f2809a = aVar;
        this.f2810b = str;
        this.f2811c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2812d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f2812d = i | (charAt2 << i10);
                return;
            } else {
                i |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i = this.f2812d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
