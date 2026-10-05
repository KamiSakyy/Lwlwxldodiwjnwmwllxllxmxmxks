package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bj {
    public static final aj Companion;
    public static final aa.a0 s;
    public static final bj t;
    public static final /* synthetic */ bj[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        bj bjVar = new bj("CHEVRON_UP", 0, "CHEVRON_UP");
        bj bjVar2 = new bj("DOT", 1, "DOT");
        bj bjVar3 = new bj("DOT_FILL", 2, "DOT_FILL");
        bj bjVar4 = new bj("HEART_FILL", 3, "HEART_FILL");
        bj bjVar5 = new bj("PLUS", 4, "PLUS");
        bj bjVar6 = new bj("ZAP", 5, "ZAP");
        bj bjVar7 = new bj("UNKNOWN__", 6, "UNKNOWN__");
        t = bjVar7;
        bj[] bjVarArr = {bjVar, bjVar2, bjVar3, bjVar4, bjVar5, bjVar6, bjVar7};
        u = bjVarArr;
        v = v8.l0.t(bjVarArr);
        Companion = new aj();
        x61.l.r(new String[]{"CHEVRON_UP", "DOT", "DOT_FILL", "HEART_FILL", "PLUS", "ZAP"});
        s = new aa.a0("PinnedDiscussionPattern");
    }

    public bj(String str, int i, String str2) {
        this.r = str2;
    }

    public static bj valueOf(String str) {
        return (bj) Enum.valueOf(bj.class, str);
    }

    public static bj[] values() {
        return (bj[]) u.clone();
    }
}
