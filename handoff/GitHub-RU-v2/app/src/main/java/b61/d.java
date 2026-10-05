package b61;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public static final d r;
    public static final d s;
    public static final /* synthetic */ d[] t;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        r = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        s = dVar2;
        t = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) t.clone();
    }
}
