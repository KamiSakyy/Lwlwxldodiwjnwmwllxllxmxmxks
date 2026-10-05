package s9;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: r, reason: collision with root package name */
    public static final g f31774r;

    /* renamed from: s, reason: collision with root package name */
    public static final g f31775s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g[] f31776t;

    static {
        g gVar = new g("FILL", 0);
        f31774r = gVar;
        g gVar2 = new g("FIT", 1);
        f31775s = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f31776t = gVarArr;
        l0.t(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f31776t.clone();
    }

    public g(Object... a) {
    }
}
