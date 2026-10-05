package d81;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class i {
    public static final i r;
    public static final i s;
    public static final i t;
    public static final i u;
    public static final /* synthetic */ i[] v;

    static {
        i iVar = new i("SUCCESSFUL", 0);
        r = iVar;
        i iVar2 = new i("REREGISTER", 1);
        s = iVar2;
        i iVar3 = new i("CANCELLED", 2);
        t = iVar3;
        i iVar4 = new i("ALREADY_SELECTED", 3);
        u = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        v = iVarArr;
        l0.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) v.clone();
    }
}
