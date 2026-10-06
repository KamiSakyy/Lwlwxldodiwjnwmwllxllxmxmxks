package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ox {
    public static final nx Companion;
    public static final aa.a0 s;
    public static final ox t;
    public static final /* synthetic */ ox[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        ox oxVar = new ox("BOARD_LAYOUT", 0, "BOARD_LAYOUT");
        ox oxVar2 = new ox("ROADMAP_LAYOUT", 1, "ROADMAP_LAYOUT");
        ox oxVar3 = new ox("TABLE_LAYOUT", 2, "TABLE_LAYOUT");
        ox oxVar4 = new ox("UNKNOWN__", 3, "UNKNOWN__");
        t = oxVar4;
        ox[] oxVarArr = {oxVar, oxVar2, oxVar3, oxVar4};
        u = oxVarArr;
        v = v8.l0.t(oxVarArr);
        Companion = new nx();
        x61.l.r(new String[]{"BOARD_LAYOUT", "ROADMAP_LAYOUT", "TABLE_LAYOUT"});
        s = new aa.a0("ProjectV2ViewLayout");
    }

    public ox(String str, int i, String str2) {
        this.r = str2;
    }

    public static ox valueOf(String str) {
        return (ox) Enum.valueOf(ox.class, str);
    }

    public static ox[] values() {
        return (ox[]) u.clone();
    }
}
