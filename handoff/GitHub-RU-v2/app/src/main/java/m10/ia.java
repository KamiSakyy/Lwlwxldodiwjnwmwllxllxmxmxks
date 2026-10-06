package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ia {
    public static final /* synthetic */ d71.b A;
    public static final ha Companion;
    public static final aa.a0 s;
    public static final ia t;
    public static final ia u;
    public static final ia v;
    public static final ia w;
    public static final ia x;
    public static final ia y;
    public static final /* synthetic */ ia[] z;
    public String r;

    static {
        ia iaVar = new ia("DISCUSSION", 0, "DISCUSSION");
        t = iaVar;
        ia iaVar2 = new ia("ISSUE", 1, "ISSUE");
        u = iaVar2;
        ia iaVar3 = new ia("PULL_REQUEST", 2, "PULL_REQUEST");
        v = iaVar3;
        ia iaVar4 = new ia("RELEASE", 3, "RELEASE");
        w = iaVar4;
        ia iaVar5 = new ia("SECURITY_ALERT", 4, "SECURITY_ALERT");
        x = iaVar5;
        ia iaVar6 = new ia("UNKNOWN__", 5, "UNKNOWN__");
        y = iaVar6;
        ia[] iaVarArr = {iaVar, iaVar2, iaVar3, iaVar4, iaVar5, iaVar6};
        z = iaVarArr;
        A = v8.l0.t(iaVarArr);
        Companion = new ha();
        x61.l.r(new String[]{"DISCUSSION", "ISSUE", "PULL_REQUEST", "RELEASE", "SECURITY_ALERT"});
        s = new aa.a0("CustomSubscriptionType");
    }

    public ia(String str, int i, String str2) {
        this.r = str2;
    }

    public static ia valueOf(String str) {
        return (ia) Enum.valueOf(ia.class, str);
    }

    public static ia[] values() {
        return (ia[]) z.clone();
    }
    public Object ordinal() { return null; }
}
