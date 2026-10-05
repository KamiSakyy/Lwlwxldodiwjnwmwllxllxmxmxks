package w01;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static final a r;
    public static final a s;
    public static final /* synthetic */ a[] t;

    static {
        a aVar = new a("PRIVATE", 0);
        r = aVar;
        a aVar2 = new a("PUBLIC", 1);
        s = aVar2;
        a[] aVarArr = {aVar, aVar2, new a("INTERNAL", 2)};
        t = aVarArr;
        l0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) t.clone();
    }
}
