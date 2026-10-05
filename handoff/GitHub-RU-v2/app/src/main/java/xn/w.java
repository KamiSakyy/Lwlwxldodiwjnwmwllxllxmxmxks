package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public static final w r;
    public static final w s;
    public static final w t;
    public static final w u;
    public static final w v;
    public static final w w;
    public static final /* synthetic */ w[] x;

    static {
        w wVar = new w("WELCOME", 0);
        w wVar2 = new w("LOADING", 1);
        r = wVar2;
        w wVar3 = new w("CONTENT", 2);
        s = wVar3;
        w wVar4 = new w("CONFIRMATION", 3);
        t = wVar4;
        w wVar5 = new w("COMPLETE", 4);
        u = wVar5;
        w wVar6 = new w("ERROR", 5);
        v = wVar6;
        w wVar7 = new w("UNKNOWN", 6);
        w = wVar7;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7};
        x = wVarArr;
        v8.l0.t(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) x.clone();
    }
}
