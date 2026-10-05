package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bk {
    public static final ak Companion;
    public static final aa.a0 s;
    public static final bk t;
    public static final /* synthetic */ bk[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        bk bkVar = new bk("CHEVRON_UP", 0, "CHEVRON_UP");
        bk bkVar2 = new bk("DOT", 1, "DOT");
        bk bkVar3 = new bk("DOT_FILL", 2, "DOT_FILL");
        bk bkVar4 = new bk("HEART_FILL", 3, "HEART_FILL");
        bk bkVar5 = new bk("PLUS", 4, "PLUS");
        bk bkVar6 = new bk("ZAP", 5, "ZAP");
        bk bkVar7 = new bk("UNKNOWN__", 6, "UNKNOWN__");
        t = bkVar7;
        bk[] bkVarArr = {bkVar, bkVar2, bkVar3, bkVar4, bkVar5, bkVar6, bkVar7};
        u = bkVarArr;
        v = v8.l0.t(bkVarArr);
        Companion = new ak();
        x61.l.r(new String[]{"CHEVRON_UP", "DOT", "DOT_FILL", "HEART_FILL", "PLUS", "ZAP"});
        s = new aa.a0("PinnedDiscussionPattern");
    }

    public bk(String str, int i, String str2) {
        this.r = str2;
    }

    public static bk valueOf(String str) {
        return (bk) Enum.valueOf(bk.class, str);
    }

    public static bk[] values() {
        return (bk[]) u.clone();
    }
}
