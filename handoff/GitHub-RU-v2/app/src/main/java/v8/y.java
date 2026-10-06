package v8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class y {

    /* renamed from: r, reason: collision with root package name */
    public static final y f32849r;

    /* renamed from: s, reason: collision with root package name */
    public static final y f32850s;

    /* renamed from: t, reason: collision with root package name */
    public static final y f32851t;

    /* renamed from: u, reason: collision with root package name */
    public static final y f32852u;

    /* renamed from: v, reason: collision with root package name */
    public static final y f32853v;

    /* renamed from: w, reason: collision with root package name */
    public static final y f32854w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ y[] f32855x;

    static {
        y yVar = new y("NOT_REQUIRED", 0);
        f32849r = yVar;
        y yVar2 = new y("CONNECTED", 1);
        f32850s = yVar2;
        y yVar3 = new y("UNMETERED", 2);
        f32851t = yVar3;
        y yVar4 = new y("NOT_ROAMING", 3);
        f32852u = yVar4;
        y yVar5 = new y("METERED", 4);
        f32853v = yVar5;
        y yVar6 = new y("TEMPORARILY_UNMETERED", 5);
        f32854w = yVar6;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5, yVar6};
        f32855x = yVarArr;
        l0.t(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f32855x.clone();
    }

    public static v8.y r;

    public static Object s;
    public Object a(Object p1, Object p2) { return null; }
    public Object o(Object p1, Object p2) { return null; }
    public Object ordinal() { return null; }
    public Object t(Object p1, Object p2) { return null; }
    public static final Object r = null;
}
