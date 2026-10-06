package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class m8 {
    public static final l8 Companion;
    public static final aa.a0 s;
    public static final m8 t;
    public static final /* synthetic */ m8[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        m8 m8Var = new m8("COPILOT_BUSINESS", 0, "COPILOT_BUSINESS");
        m8 m8Var2 = new m8("COPILOT_ENTERPRISE", 1, "COPILOT_ENTERPRISE");
        m8 m8Var3 = new m8("COPILOT_FREE", 2, "COPILOT_FREE");
        m8 m8Var4 = new m8("COPILOT_INDIVIDUAL", 3, "COPILOT_INDIVIDUAL");
        m8 m8Var5 = new m8("COPILOT_INDIVIDUAL_MAX", 4, "COPILOT_INDIVIDUAL_MAX");
        m8 m8Var6 = new m8("COPILOT_INDIVIDUAL_PRO_PLUS", 5, "COPILOT_INDIVIDUAL_PRO_PLUS");
        m8 m8Var7 = new m8("NO_ACCESS", 6, "NO_ACCESS");
        m8 m8Var8 = new m8("UNKNOWN__", 7, "UNKNOWN__");
        t = m8Var8;
        m8[] m8VarArr = {m8Var, m8Var2, m8Var3, m8Var4, m8Var5, m8Var6, m8Var7, m8Var8};
        u = m8VarArr;
        v = v8.l0.t(m8VarArr);
        Companion = new l8();
        x61.l.r(new String[]{"COPILOT_BUSINESS", "COPILOT_ENTERPRISE", "COPILOT_FREE", "COPILOT_INDIVIDUAL", "COPILOT_INDIVIDUAL_MAX", "COPILOT_INDIVIDUAL_PRO_PLUS", "NO_ACCESS"});
        s = new aa.a0("CopilotLicenseType");
    }

    public m8(String str, int i, String str2) {
        this.r = str2;
    }

    public static m8 valueOf(String str) {
        return (m8) Enum.valueOf(m8.class, str);
    }

    public static m8[] values() {
        return (m8[]) u.clone();
    }
}
