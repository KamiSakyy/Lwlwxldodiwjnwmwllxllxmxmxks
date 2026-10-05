package l3;

import d2.f0;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends k71.l implements j71.c {

    /* renamed from: t, reason: collision with root package name */
    public static final b f27918t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f27919u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f27920v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f27921w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f27922x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f27923y;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f27924s;

    static {
        int i = 1;
        f27918t = new b(i, 0);
        f27919u = new b(i, 1);
        f27920v = new b(i, 2);
        f27921w = new b(i, 3);
        f27922x = new b(i, 4);
        f27923y = new b(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i10) {
        super(i);
        this.f27924s = i10;
    }

    public final /* synthetic */ Object k(Object obj) {
        switch (this.f27924s) {
            case k5.f.J:
                float[] fArr = ((f0) obj).f21340a;
                break;
            case 1:
                float[] fArr2 = ((f0) obj).f21340a;
                break;
            case 2:
                break;
            case 3:
                int i = ((i) obj).f27949a;
                break;
            case 4:
                break;
            default:
                int i10 = ((i) obj).f27949a;
                break;
        }
        return w61.a0.a;
    }
}
