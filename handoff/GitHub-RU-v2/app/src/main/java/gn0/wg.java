package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class wg {
    public static final vg Companion;
    public static final wg s;
    public static final /* synthetic */ wg[] t;
    public static final /* synthetic */ d71.b u;
    public final String r;

    static {
        wg wgVar = new wg("GESTURE", 0, "GESTURE");
        wg wgVar2 = new wg("KEY_COMMAND", 1, "KEY_COMMAND");
        wg wgVar3 = new wg("LEFT_SWIPE", 2, "LEFT_SWIPE");
        wg wgVar4 = new wg("LONG_PRESS", 3, "LONG_PRESS");
        wg wgVar5 = new wg("PRESS", 4, "PRESS");
        wg wgVar6 = new wg("RIGHT_SWIPE", 5, "RIGHT_SWIPE");
        wg wgVar7 = new wg("SWIPE", 6, "SWIPE");
        wg wgVar8 = new wg("UNKNOWN__", 7, "UNKNOWN__");
        s = wgVar8;
        wg[] wgVarArr = {wgVar, wgVar2, wgVar3, wgVar4, wgVar5, wgVar6, wgVar7, wgVar8};
        t = wgVarArr;
        u = v8.l0.t(wgVarArr);
        Companion = new vg();
        sy.d0.o(new String[]{"GESTURE", "KEY_COMMAND", "LEFT_SWIPE", "LONG_PRESS", "PRESS", "RIGHT_SWIPE", "SWIPE"});
    }

    public wg(String str, int i, String str2) {
        this.r = str2;
    }

    public static wg valueOf(String str) {
        return (wg) Enum.valueOf(wg.class, str);
    }

    public static wg[] values() {
        return (wg[]) t.clone();
    }
}
