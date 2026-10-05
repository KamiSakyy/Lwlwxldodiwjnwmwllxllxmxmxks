package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class wf {
    public static final vf Companion;
    public static final wf s;
    public static final /* synthetic */ wf[] t;
    public static final /* synthetic */ d71.b u;
    public final String r;

    static {
        wf wfVar = new wf("GESTURE", 0, "GESTURE");
        wf wfVar2 = new wf("KEY_COMMAND", 1, "KEY_COMMAND");
        wf wfVar3 = new wf("LEFT_SWIPE", 2, "LEFT_SWIPE");
        wf wfVar4 = new wf("LONG_PRESS", 3, "LONG_PRESS");
        wf wfVar5 = new wf("PRESS", 4, "PRESS");
        wf wfVar6 = new wf("RIGHT_SWIPE", 5, "RIGHT_SWIPE");
        wf wfVar7 = new wf("SWIPE", 6, "SWIPE");
        wf wfVar8 = new wf("UNKNOWN__", 7, "UNKNOWN__");
        s = wfVar8;
        wf[] wfVarArr = {wfVar, wfVar2, wfVar3, wfVar4, wfVar5, wfVar6, wfVar7, wfVar8};
        t = wfVarArr;
        u = v8.l0.t(wfVarArr);
        Companion = new vf();
        sy.d0.o(new String[]{"GESTURE", "KEY_COMMAND", "LEFT_SWIPE", "LONG_PRESS", "PRESS", "RIGHT_SWIPE", "SWIPE"});
    }

    public wf(String str, int i, String str2) {
        this.r = str2;
    }

    public static wf valueOf(String str) {
        return (wf) Enum.valueOf(wf.class, str);
    }

    public static wf[] values() {
        return (wf[]) t.clone();
    }
}
