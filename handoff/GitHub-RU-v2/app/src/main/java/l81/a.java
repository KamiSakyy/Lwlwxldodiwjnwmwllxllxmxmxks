package l81;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public static final a r;
    public static final a s;
    public static final /* synthetic */ a[] t;

    static {
        a aVar = new a("NONE", 0);
        r = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        s = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        t = aVarArr;
        l0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) t.clone();
    }
    public Object c(Object p1, Object p2) { return null; }
}
