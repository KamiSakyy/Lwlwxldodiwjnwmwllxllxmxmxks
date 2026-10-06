package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class sj {
    public static final rj Companion;
    public static final aa.a0 s;
    public static final sj t;
    public static final /* synthetic */ sj[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        sj sjVar = new sj("DEVICE_VERIFICATION", 0, "DEVICE_VERIFICATION");
        sj sjVar2 = new sj("TWO_FACTOR_LOGIN", 1, "TWO_FACTOR_LOGIN");
        sj sjVar3 = new sj("TWO_FACTOR_PASSWORD_RESET", 2, "TWO_FACTOR_PASSWORD_RESET");
        sj sjVar4 = new sj("TWO_FACTOR_SUDO_CHALLENGE", 3, "TWO_FACTOR_SUDO_CHALLENGE");
        sj sjVar5 = new sj("UNKNOWN", 4, "UNKNOWN");
        sj sjVar6 = new sj("UNKNOWN__", 5, "UNKNOWN__");
        t = sjVar6;
        sj[] sjVarArr = {sjVar, sjVar2, sjVar3, sjVar4, sjVar5, sjVar6};
        u = sjVarArr;
        v = v8.l0.t(sjVarArr);
        Companion = new rj();
        x61.l.r(new String[]{"DEVICE_VERIFICATION", "TWO_FACTOR_LOGIN", "TWO_FACTOR_PASSWORD_RESET", "TWO_FACTOR_SUDO_CHALLENGE", "UNKNOWN"});
        s = new aa.a0("MobileAuthRequestType");
    }

    public sj(String str, int i, String str2) {
        this.r = str2;
    }

    public static sj valueOf(String str) {
        return (sj) Enum.valueOf(sj.class, str);
    }

    public static sj[] values() {
        return (sj[]) u.clone();
    }
}
