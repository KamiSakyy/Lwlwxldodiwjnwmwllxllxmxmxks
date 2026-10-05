package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class yo {
    public static final xo Companion;
    public static final yo s;
    public static final yo t;
    public static final yo u;
    public static final yo v;
    public static final yo w;
    public static final /* synthetic */ yo[] x;
    public static final /* synthetic */ d71.b y;
    public final String r;

    static {
        yo yoVar = new yo("DUPLICATE", 0, "DUPLICATE");
        s = yoVar;
        yo yoVar2 = new yo("OFF_TOPIC", 1, "OFF_TOPIC");
        t = yoVar2;
        yo yoVar3 = new yo("OUTDATED", 2, "OUTDATED");
        u = yoVar3;
        yo yoVar4 = new yo("RESOLVED", 3, "RESOLVED");
        v = yoVar4;
        yo yoVar5 = new yo("UNKNOWN__", 4, "UNKNOWN__");
        w = yoVar5;
        yo[] yoVarArr = {yoVar, yoVar2, yoVar3, yoVar4, yoVar5};
        x = yoVarArr;
        y = v8.l0.t(yoVarArr);
        Companion = new xo();
        sy.d0.o(new String[]{"DUPLICATE", "OFF_TOPIC", "OUTDATED", "RESOLVED"});
    }

    public yo(String str, int i, String str2) {
        this.r = str2;
    }

    public static yo valueOf(String str) {
        return (yo) Enum.valueOf(yo.class, str);
    }

    public static yo[] values() {
        return (yo[]) x.clone();
    }
}
