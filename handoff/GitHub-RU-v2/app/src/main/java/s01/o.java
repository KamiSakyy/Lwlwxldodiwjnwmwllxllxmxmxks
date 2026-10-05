package s01;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public static final o r;
    public static final o s;
    public static final /* synthetic */ o[] t;

    static {
        o oVar = new o("FORWARD", 0);
        r = oVar;
        o oVar2 = new o("BACKWARD", 1);
        s = oVar2;
        o[] oVarArr = {oVar, oVar2};
        t = oVarArr;
        l0.t(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) t.clone();
    }
}
