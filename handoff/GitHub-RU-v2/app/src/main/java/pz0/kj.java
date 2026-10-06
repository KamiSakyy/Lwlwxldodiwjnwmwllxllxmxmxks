package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class kj {
    public static final jj Companion;
    public static final kj s;
    public static final /* synthetic */ kj[] t;
    public static final /* synthetic */ d71.b u;
    public String r;

    static {
        kj kjVar = new kj("GESTURE", 0, "GESTURE");
        kj kjVar2 = new kj("KEY_COMMAND", 1, "KEY_COMMAND");
        kj kjVar3 = new kj("LEFT_SWIPE", 2, "LEFT_SWIPE");
        kj kjVar4 = new kj("LONG_PRESS", 3, "LONG_PRESS");
        kj kjVar5 = new kj("PRESS", 4, "PRESS");
        kj kjVar6 = new kj("RIGHT_SWIPE", 5, "RIGHT_SWIPE");
        kj kjVar7 = new kj("SWIPE", 6, "SWIPE");
        kj kjVar8 = new kj("UNKNOWN__", 7, "UNKNOWN__");
        s = kjVar8;
        kj[] kjVarArr = {kjVar, kjVar2, kjVar3, kjVar4, kjVar5, kjVar6, kjVar7, kjVar8};
        t = kjVarArr;
        u = v8.l0.t(kjVarArr);
        Companion = new jj();
        sy.d0Shadow.o(new String[]{"GESTURE", "KEY_COMMAND", "LEFT_SWIPE", "LONG_PRESS", "PRESS", "RIGHT_SWIPE", "SWIPE"});
    }

    public kj(String str, int i, String str2) {
        this.r = str2;
    }

    public static kj valueOf(String str) {
        return (kj) Enum.valueOf(kj.class, str);
    }

    public static kj[] values() {
        return (kj[]) t.clone();
    }
}
