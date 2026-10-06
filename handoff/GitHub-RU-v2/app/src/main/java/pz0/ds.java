package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ds {
    public static final cs Companion;
    public static final aa.a0 s;
    public static final ds t;
    public static final /* synthetic */ ds[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        ds dsVar = new ds("BOARD_LAYOUT", 0, "BOARD_LAYOUT");
        ds dsVar2 = new ds("ROADMAP_LAYOUT", 1, "ROADMAP_LAYOUT");
        ds dsVar3 = new ds("TABLE_LAYOUT", 2, "TABLE_LAYOUT");
        ds dsVar4 = new ds("UNKNOWN__", 3, "UNKNOWN__");
        t = dsVar4;
        ds[] dsVarArr = {dsVar, dsVar2, dsVar3, dsVar4};
        u = dsVarArr;
        v = v8.l0.t(dsVarArr);
        Companion = new cs();
        x61.l.r(new String[]{"BOARD_LAYOUT", "ROADMAP_LAYOUT", "TABLE_LAYOUT"});
        s = new aa.a0("ProjectV2ViewLayout");
    }

    public ds(String str, int i, String str2) {
        this.r = str2;
    }

    public static ds valueOf(String str) {
        return (ds) Enum.valueOf(ds.class, str);
    }

    public static ds[] values() {
        return (ds[]) u.clone();
    }
}
