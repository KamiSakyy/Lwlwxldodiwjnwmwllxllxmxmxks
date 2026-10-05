package w3;

import java.util.UUID;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends k71.l implements j71.a {

    /* renamed from: t, reason: collision with root package name */
    public static final d f33258t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f33259u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f33260v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f33261w;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f33262s;

    static {
        int i = 0;
        f33258t = new d(i, 0);
        f33259u = new d(i, 1);
        f33260v = new d(i, 2);
        f33261w = new d(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i10) {
        super(i);
        this.f33262s = i10;
    }

    public final Object a() {
        switch (this.f33262s) {
            case k5.f.J /* 0 */:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
