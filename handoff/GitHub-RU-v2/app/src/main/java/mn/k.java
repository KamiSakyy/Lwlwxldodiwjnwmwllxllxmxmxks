package mn;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public static final k r;
    public static final k s;
    public static final k t;
    public static final k u;
    public static final /* synthetic */ k[] v;

    static {
        k kVar = new k("STATUS_CONTEXT", 0);
        r = kVar;
        k kVar2 = new k("WORKFLOW_RUN", 1);
        s = kVar2;
        k kVar3 = new k("CHECK_RUN", 2);
        t = kVar3;
        k kVar4 = new k("REQUIRED_STATUS_CHECK", 3);
        u = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        v = kVarArr;
        l0.t(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) v.clone();
    }
}
