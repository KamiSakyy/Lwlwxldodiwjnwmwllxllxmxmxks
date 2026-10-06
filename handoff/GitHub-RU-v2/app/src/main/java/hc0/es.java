package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class es {
    public static final es A;
    public static final /* synthetic */ es[] B;
    public static final /* synthetic */ d71.b C;
    public static final ds Companion;
    public static final aa.a0 s;
    public static final es t;
    public static final es u;
    public static final es v;
    public static final es w;
    public static final es x;
    public static final es y;
    public static final es z;
    public String r;

    static {
        es esVar = new es("BLUE", 0, "BLUE");
        t = esVar;
        es esVar2 = new es("GRAY", 1, "GRAY");
        u = esVar2;
        es esVar3 = new es("GREEN", 2, "GREEN");
        v = esVar3;
        es esVar4 = new es("ORANGE", 3, "ORANGE");
        w = esVar4;
        es esVar5 = new es("PINK", 4, "PINK");
        x = esVar5;
        es esVar6 = new es("PURPLE", 5, "PURPLE");
        y = esVar6;
        es esVar7 = new es("RED", 6, "RED");
        z = esVar7;
        es esVar8 = new es("UNKNOWN__", 7, "UNKNOWN__");
        A = esVar8;
        es[] esVarArr = {esVar, esVar2, esVar3, esVar4, esVar5, esVar6, esVar7, esVar8};
        B = esVarArr;
        C = v8.l0.t(esVarArr);
        Companion = new ds();
        x61.l.r(new String[]{"BLUE", "GRAY", "GREEN", "ORANGE", "PINK", "PURPLE", "RED"});
        s = new aa.a0("SearchShortcutColor");
    }

    public es(String str, int i, String str2) {
        this.r = str2;
    }

    public static es valueOf(String str) {
        return (es) Enum.valueOf(es.class, str);
    }

    public static es[] values() {
        return (es[]) B.clone();
    }
}
