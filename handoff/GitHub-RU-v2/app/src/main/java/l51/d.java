package l51;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public static final d r;
    public static final /* synthetic */ d[] s;

    static {
        d dVar = new d("DEFAULT", 0);
        r = dVar;
        s = new d[]{dVar, new d("SIGNED", 1), new d("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) s.clone();
    }
    public Object a(Object p1) { return null; }
    public static Object b(Object p1, Object p2) { return null; }
    public Object e(Object) { return null; }
}
