package i9;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class l {

    /* renamed from: r, reason: collision with root package name */
    public static final l f26108r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ l[] f26109s;

    static {
        l lVar = new l("IGNORE", 0);
        l lVar2 = new l("RESPECT_PERFORMANCE", 1);
        f26108r = lVar2;
        l[] lVarArr = {lVar, lVar2, new l("RESPECT_ALL", 2)};
        f26109s = lVarArr;
        l0.t(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f26109s.clone();
    }
}
