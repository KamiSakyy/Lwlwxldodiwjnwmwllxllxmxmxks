package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class wShadow {
    public static final wShadow r;
    public static final wShadow s;
    public static final wShadow t;
    public static final wShadow u;
    public static final wShadow v;
    public static final wShadow w;
    public static final /* synthetic */ wShadow[] x;

    static {
        wShadow wVar = new wShadow("WELCOME", 0);
        wShadow wVar2 = new wShadow("LOADING", 1);
        r = wVar2;
        wShadow wVar3 = new wShadow("CONTENT", 2);
        s = wVar3;
        wShadow wVar4 = new wShadow("CONFIRMATION", 3);
        t = wVar4;
        wShadow wVar5 = new wShadow("COMPLETE", 4);
        u = wVar5;
        wShadow wVar6 = new wShadow("ERROR", 5);
        v = wVar6;
        wShadow wVar7 = new wShadow("UNKNOWN", 6);
        w = wVar7;
        wShadow[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7};
        x = wVarArr;
        v8.l0.t(wVarArr);
    }

    public static w valueOf(String str) {
        return (wShadow) Enum.valueOf(wShadow.class, str);
    }

    public static wShadow[] values() {
        return (wShadow[]) x.clone();
    }
}
