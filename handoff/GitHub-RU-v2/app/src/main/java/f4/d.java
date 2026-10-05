package f4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: r, reason: collision with root package name */
    public static final d f24248r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f24249s;

    /* renamed from: t, reason: collision with root package name */
    public static final d f24250t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f24251u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d[] f24252v;

    static {
        d dVar = new d("FIXED", 0);
        f24248r = dVar;
        d dVar2 = new d("WRAP_CONTENT", 1);
        f24249s = dVar2;
        d dVar3 = new d("MATCH_CONSTRAINT", 2);
        f24250t = dVar3;
        d dVar4 = new d("MATCH_PARENT", 3);
        f24251u = dVar4;
        f24252v = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f24252v.clone();
    }
}
