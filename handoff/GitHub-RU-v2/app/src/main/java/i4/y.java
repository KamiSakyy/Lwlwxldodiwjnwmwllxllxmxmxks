package i4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class y {

    /* renamed from: r, reason: collision with root package name */
    public static final y f26004r;

    /* renamed from: s, reason: collision with root package name */
    public static final y f26005s;

    /* renamed from: t, reason: collision with root package name */
    public static final y f26006t;

    /* renamed from: u, reason: collision with root package name */
    public static final y f26007u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y[] f26008v;

    static {
        y yVar = new y("UNDEFINED", 0);
        f26004r = yVar;
        y yVar2 = new y("SETUP", 1);
        f26005s = yVar2;
        y yVar3 = new y("MOVING", 2);
        f26006t = yVar3;
        y yVar4 = new y("FINISHED", 3);
        f26007u = yVar4;
        f26008v = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f26008v.clone();
    }
}
