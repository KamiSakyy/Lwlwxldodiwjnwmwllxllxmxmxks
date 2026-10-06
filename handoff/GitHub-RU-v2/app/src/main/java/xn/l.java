package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public static final l r;
    public static final l s;
    public static final l t;
    public static final /* synthetic */ l[] u;

    static {
        l lVar = new l("ENABLED", 0);
        r = lVar;
        l lVar2 = new l("UNCONFIGURED", 1);
        s = lVar2;
        l lVar3 = new l("DISABLED", 2);
        t = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        u = lVarArr;
        v8.l0.t(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) u.clone();
    }
    public Object name() { return null; }
}
