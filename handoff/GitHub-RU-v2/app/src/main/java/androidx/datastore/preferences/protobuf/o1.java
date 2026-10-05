package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class o1 {
    public static final /* synthetic */ o1[] A;

    /* renamed from: r, reason: collision with root package name */
    public static final o1 f2349r;

    /* renamed from: s, reason: collision with root package name */
    public static final o1 f2350s;

    /* renamed from: t, reason: collision with root package name */
    public static final o1 f2351t;

    /* renamed from: u, reason: collision with root package name */
    public static final o1 f2352u;

    /* renamed from: v, reason: collision with root package name */
    public static final o1 f2353v;

    /* renamed from: w, reason: collision with root package name */
    public static final o1 f2354w;

    /* renamed from: x, reason: collision with root package name */
    public static final o1 f2355x;

    /* renamed from: y, reason: collision with root package name */
    public static final o1 f2356y;

    /* renamed from: z, reason: collision with root package name */
    public static final o1 f2357z;

    static {
        o1 o1Var = new o1("INT", 0);
        f2349r = o1Var;
        o1 o1Var2 = new o1("LONG", 1);
        f2350s = o1Var2;
        o1 o1Var3 = new o1("FLOAT", 2);
        f2351t = o1Var3;
        o1 o1Var4 = new o1("DOUBLE", 3);
        f2352u = o1Var4;
        o1 o1Var5 = new o1("BOOLEAN", 4);
        f2353v = o1Var5;
        o1 o1Var6 = new o1("STRING", 5);
        f2354w = o1Var6;
        g gVar = g.f2280t;
        o1 o1Var7 = new o1("BYTE_STRING", 6);
        f2355x = o1Var7;
        o1 o1Var8 = new o1("ENUM", 7);
        f2356y = o1Var8;
        o1 o1Var9 = new o1("MESSAGE", 8);
        f2357z = o1Var9;
        A = new o1[]{o1Var, o1Var2, o1Var3, o1Var4, o1Var5, o1Var6, o1Var7, o1Var8, o1Var9};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) A.clone();
    }
}
