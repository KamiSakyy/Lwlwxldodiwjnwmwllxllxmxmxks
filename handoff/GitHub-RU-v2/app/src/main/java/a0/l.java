package a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class l {

    /* renamed from: r, reason: collision with root package name */
    public static final l f133r;

    /* renamed from: s, reason: collision with root package name */
    public static final l f134s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ l[] f135t;

    static {
        l lVar = new l("BoundReached", 0);
        f133r = lVar;
        l lVar2 = new l("Finished", 1);
        f134s = lVar2;
        l[] lVarArr = {lVar, lVar2};
        f135t = lVarArr;
        v8.l0.t(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f135t.clone();
    }

    public l(Object... a) {
    }
}
