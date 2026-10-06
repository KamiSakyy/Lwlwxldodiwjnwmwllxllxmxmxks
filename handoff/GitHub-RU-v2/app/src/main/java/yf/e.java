package yf;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public static final e r;
    public static final e s;
    public static final e t;
    public static final e u;
    public static final /* synthetic */ e[] v;

    static {
        e eVar = new e("UNKNOWN", 0);
        r = eVar;
        e eVar2 = new e("NO_HARDWARE", 1);
        s = eVar2;
        e eVar3 = new e("NEEDS_ENROLLMENT", 2);
        t = eVar3;
        e eVar4 = new e("HAS_BIOMETRIC", 3);
        u = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        v = eVarArr;
        l0.t(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) v.clone();
    }
}
