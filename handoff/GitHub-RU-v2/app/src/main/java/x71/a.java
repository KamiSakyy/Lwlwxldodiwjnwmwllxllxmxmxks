package x71;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public static final a r;
    public static final a s;
    public static final a t;
    public static final /* synthetic */ a[] u;

    static {
        a aVar = new a("SUSPEND", 0);
        r = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        s = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        t = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        u = aVarArr;
        l0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) u.clone();
    }
}
