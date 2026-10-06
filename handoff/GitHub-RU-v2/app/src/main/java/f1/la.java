package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class la {

    /* renamed from: r, reason: collision with root package name */
    public static final la f23253r;

    /* renamed from: s, reason: collision with root package name */
    public static final la f23254s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ la[] f23255t;

    static {
        la laVar = new la("Dismissed", 0);
        f23253r = laVar;
        la laVar2 = new la("ActionPerformed", 1);
        f23254s = laVar2;
        la[] laVarArr = {laVar, laVar2};
        f23255t = laVarArr;
        v8.l0.t(laVarArr);
    }

    public static la valueOf(String str) {
        return (la) Enum.valueOf(la.class, str);
    }

    public static la[] values() {
        return (la[]) f23255t.clone();
    }
    public Object ordinal() { return null; }
}
