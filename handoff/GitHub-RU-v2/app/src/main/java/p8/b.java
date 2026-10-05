package p8;

import z70.a3;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final b f30412d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f30413e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f30414f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f30415g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f30416h;
    public static final b i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f30417j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f30418k;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30419b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30420c;

    static {
        int i10 = 0;
        f30412d = new b("NONE", i10);
        f30413e = new b("FULL", i10);
        int i11 = 1;
        f30414f = new b("VERTICAL", i11);
        f30415g = new b("HORIZONTAL", i11);
        int i12 = 2;
        f30416h = new b("FLAT", i12);
        i = new b("HALF_OPENED", i12);
        int i13 = 3;
        f30417j = new b("FOLD", i13);
        f30418k = new b("HINGE", i13);
    }

    public /* synthetic */ b(String str, int i10) {
        this.f30419b = i10;
        this.f30420c = str;
    }

    public String toString() {
        switch (this.f30419b) {
            case k5.f.J:
                return (String) this.f30420c;
            case 1:
                return (String) this.f30420c;
            case 2:
                return (String) this.f30420c;
            case 3:
                return (String) this.f30420c;
            default:
                return super.toString();
        }
    }

    public b(l lVar, q8.a aVar, a3 a3Var) {
        this.f30419b = 4;
        this.f30420c = aVar;
    }



}
