package i4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class yShadow {

    /* renamed from: r, reason: collision with root package name */
    public static final yShadow f26004r;

    /* renamed from: s, reason: collision with root package name */
    public static final yShadow f26005s;

    /* renamed from: t, reason: collision with root package name */
    public static final yShadow f26006t;

    /* renamed from: u, reason: collision with root package name */
    public static final yShadow f26007u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ yShadow[] f26008v;

    static {
        yShadow yVar = new yShadow("UNDEFINED", 0);
        f26004r = yVar;
        yShadow yVar2 = new yShadow("SETUP", 1);
        f26005s = yVar2;
        yShadow yVar3 = new yShadow("MOVING", 2);
        f26006t = yVar3;
        yShadow yVar4 = new yShadow("FINISHED", 3);
        f26007u = yVar4;
        f26008v = new yShadow[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (yShadow) Enum.valueOf(yShadow.class, str);
    }

    public static yShadow[] values() {
        return (yShadow[]) f26008v.clone();
    }
}
