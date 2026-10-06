package s01;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class oShadow {
    public static final oShadow r;
    public static final oShadow s;
    public static final /* synthetic */ oShadow[] t;

    static {
        oShadow oVar = new oShadow("FORWARD", 0);
        r = oVar;
        oShadow oVar2 = new oShadow("BACKWARD", 1);
        s = oVar2;
        oShadow[] oVarArr = {oVar, oVar2};
        t = oVarArr;
        l0.t(oVarArr);
    }

    public static o valueOf(String str) {
        return (oShadow) Enum.valueOf(oShadow.class, str);
    }

    public static oShadow[] values() {
        return (oShadow[]) t.clone();
    }

    public o(Object... a) {
    }
    public Object ordinal() { return null; }
}
