package c3;

import k71.l;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public class b extends l implements j71.c {

    /* renamed from: t, reason: collision with root package name */
    public static final b f4079t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f4080u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f4081v;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4082s;

    static {
        int i = 1;
        f4079t = new b(i, 0);
        f4080u = new b(i, 1);
        f4081v = new b(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i10) {
        super(i);
        this.f4082s = i10;
    }

    public final Object k(Object obj) {
        switch (this.f4082s) {
            case k5.f.J:
                ((Number) obj).longValue();
                return a0.a;
            case 1:
                return Integer.valueOf(((i) obj).f4101b);
            default:
                return Integer.valueOf(((i) obj).f4102c.b());
        }
    }
}
