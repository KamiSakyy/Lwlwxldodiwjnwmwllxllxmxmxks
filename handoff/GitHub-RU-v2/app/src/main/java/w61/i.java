package w61;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public static final i r;
    public static final i s;
    public static final /* synthetic */ i[] t;

    static {
        i iVar = new i("SYNCHRONIZED", 0);
        i iVar2 = new i("PUBLICATION", 1);
        r = iVar2;
        i iVar3 = new i("NONE", 2);
        s = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        t = iVarArr;
        l0.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) t.clone();
    }
}
