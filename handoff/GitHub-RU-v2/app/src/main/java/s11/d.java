package s11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public static final d r;
    public static final d s;
    public static final d t;
    public static final /* synthetic */ d[] u;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        r = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        s = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        t = dVar3;
        u = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) u.clone();
    }
}
