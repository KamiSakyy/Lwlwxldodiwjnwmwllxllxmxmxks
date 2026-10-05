package gl;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final i r;
    public static final i s;
    public static final i t;
    public static final /* synthetic */ i[] u;

    static {
        i iVar = new i("UNKNOWN", 0);
        r = iVar;
        i iVar2 = new i("ENABLED", 1);
        s = iVar2;
        i iVar3 = new i("DISABLED", 2);
        t = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        u = iVarArr;
        l0.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) u.clone();
    }
}
