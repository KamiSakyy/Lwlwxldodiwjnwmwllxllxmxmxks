package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class wn {
    public static final vn Companion;
    public static final aa.a0 s;
    public static final wn t;
    public static final /* synthetic */ wn[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        wn wnVar = new wn("DEVICE_VERIFICATION", 0, "DEVICE_VERIFICATION");
        wn wnVar2 = new wn("TWO_FACTOR_LOGIN", 1, "TWO_FACTOR_LOGIN");
        wn wnVar3 = new wn("TWO_FACTOR_PASSWORD_RESET", 2, "TWO_FACTOR_PASSWORD_RESET");
        wn wnVar4 = new wn("TWO_FACTOR_SUDO_CHALLENGE", 3, "TWO_FACTOR_SUDO_CHALLENGE");
        wn wnVar5 = new wn("UNKNOWN", 4, "UNKNOWN");
        wn wnVar6 = new wn("UNKNOWN__", 5, "UNKNOWN__");
        t = wnVar6;
        wn[] wnVarArr = {wnVar, wnVar2, wnVar3, wnVar4, wnVar5, wnVar6};
        u = wnVarArr;
        v = v8.l0.t(wnVarArr);
        Companion = new vn();
        x61.l.r(new String[]{"DEVICE_VERIFICATION", "TWO_FACTOR_LOGIN", "TWO_FACTOR_PASSWORD_RESET", "TWO_FACTOR_SUDO_CHALLENGE", "UNKNOWN"});
        s = new aa.a0("MobileAuthRequestType");
    }

    public wn(String str, int i, String str2) {
        this.r = str2;
    }

    public static wn valueOf(String str) {
        return (wn) Enum.valueOf(wn.class, str);
    }

    public static wn[] values() {
        return (wn[]) u.clone();
    }
}
