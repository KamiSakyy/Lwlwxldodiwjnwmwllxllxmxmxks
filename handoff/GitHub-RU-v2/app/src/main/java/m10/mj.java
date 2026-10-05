package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class mj {
    public static final lj Companion;
    public static final aa.a0 s;
    public static final mj t;
    public static final /* synthetic */ mj[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        mj mjVar = new mj("BLUE", 0, "BLUE");
        mj mjVar2 = new mj("GRAY", 1, "GRAY");
        mj mjVar3 = new mj("GREEN", 2, "GREEN");
        mj mjVar4 = new mj("ORANGE", 3, "ORANGE");
        mj mjVar5 = new mj("PINK", 4, "PINK");
        mj mjVar6 = new mj("PURPLE", 5, "PURPLE");
        mj mjVar7 = new mj("RED", 6, "RED");
        mj mjVar8 = new mj("YELLOW", 7, "YELLOW");
        mj mjVar9 = new mj("UNKNOWN__", 8, "UNKNOWN__");
        t = mjVar9;
        mj[] mjVarArr = {mjVar, mjVar2, mjVar3, mjVar4, mjVar5, mjVar6, mjVar7, mjVar8, mjVar9};
        u = mjVarArr;
        v = v8.l0.t(mjVarArr);
        Companion = new lj();
        x61.l.r(new String[]{"BLUE", "GRAY", "GREEN", "ORANGE", "PINK", "PURPLE", "RED", "YELLOW"});
        s = new aa.a0("IssueTypeColor");
    }

    public mj(String str, int i, String str2) {
        this.r = str2;
    }

    public static mj valueOf(String str) {
        return (mj) Enum.valueOf(mj.class, str);
    }

    public static mj[] values() {
        return (mj[]) u.clone();
    }
}
