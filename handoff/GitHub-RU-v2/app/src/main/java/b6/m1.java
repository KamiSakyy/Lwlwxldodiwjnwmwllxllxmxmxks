package b6;

/* loaded from: /home/user/work/p/classes.dex */
public final class m1 implements j71.c {

    /* renamed from: s, reason: collision with root package name */
    public static final m1 f3632s = new m1(0);

    /* renamed from: t, reason: collision with root package name */
    public static final m1 f3633t = new m1(1);

    /* renamed from: u, reason: collision with root package name */
    public static final m1 f3634u = new m1(2);

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3635r;

    public /* synthetic */ m1(int i) {
        this.f3635r = i;
    }

    public final Object k(Object obj) {
        switch (this.f3635r) {
            case k5.f.J:
                return Boolean.valueOf(((z5.m) obj) instanceof a6.b);
            case 1:
                return Boolean.valueOf(((z5.m) obj) instanceof z5.c);
            default:
                return Boolean.valueOf(((z5.m) obj) instanceof a6.b);
        }
    }
}
