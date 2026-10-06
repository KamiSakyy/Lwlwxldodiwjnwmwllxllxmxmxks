package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ks {
    public static final js Companion;
    public static final aa.a0 s;
    public static final ks t;
    public static final /* synthetic */ ks[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        ks ksVar = new ks("CHEVRON_UP", 0, "CHEVRON_UP");
        ks ksVar2 = new ks("DOT", 1, "DOT");
        ks ksVar3 = new ks("DOT_FILL", 2, "DOT_FILL");
        ks ksVar4 = new ks("HEART_FILL", 3, "HEART_FILL");
        ks ksVar5 = new ks("PLUS", 4, "PLUS");
        ks ksVar6 = new ks("ZAP", 5, "ZAP");
        ks ksVar7 = new ks("UNKNOWN__", 6, "UNKNOWN__");
        t = ksVar7;
        ks[] ksVarArr = {ksVar, ksVar2, ksVar3, ksVar4, ksVar5, ksVar6, ksVar7};
        u = ksVarArr;
        v = v8.l0.t(ksVarArr);
        Companion = new js();
        x61.l.r(new String[]{"CHEVRON_UP", "DOT", "DOT_FILL", "HEART_FILL", "PLUS", "ZAP"});
        s = new aa.a0("PinnedDiscussionPattern");
    }

    public ks(String str, int i, String str2) {
        this.r = str2;
    }

    public static ks valueOf(String str) {
        return (ks) Enum.valueOf(ks.class, str);
    }

    public static ks[] values() {
        return (ks[]) u.clone();
    }
    public Object ordinal() { return null; }
}
