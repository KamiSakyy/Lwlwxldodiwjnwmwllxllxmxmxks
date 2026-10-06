package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class dn {
    public static final cn Companion;
    public static final aa.a0 s;
    public static final dn t;
    public static final /* synthetic */ dn[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        dn dnVar = new dn("CHEVRON_UP", 0, "CHEVRON_UP");
        dn dnVar2 = new dn("DOT", 1, "DOT");
        dn dnVar3 = new dn("DOT_FILL", 2, "DOT_FILL");
        dn dnVar4 = new dn("HEART_FILL", 3, "HEART_FILL");
        dn dnVar5 = new dn("PLUS", 4, "PLUS");
        dn dnVar6 = new dn("ZAP", 5, "ZAP");
        dn dnVar7 = new dn("UNKNOWN__", 6, "UNKNOWN__");
        t = dnVar7;
        dn[] dnVarArr = {dnVar, dnVar2, dnVar3, dnVar4, dnVar5, dnVar6, dnVar7};
        u = dnVarArr;
        v = v8.l0.t(dnVarArr);
        Companion = new cn();
        x61.l.r(new String[]{"CHEVRON_UP", "DOT", "DOT_FILL", "HEART_FILL", "PLUS", "ZAP"});
        s = new aa.a0("PinnedDiscussionPattern");
    }

    public dn(String str, int i, String str2) {
        this.r = str2;
    }

    public static dn valueOf(String str) {
        return (dn) Enum.valueOf(dn.class, str);
    }

    public static dn[] values() {
        return (dn[]) u.clone();
    }
    public Object ordinal() { return null; }
}
