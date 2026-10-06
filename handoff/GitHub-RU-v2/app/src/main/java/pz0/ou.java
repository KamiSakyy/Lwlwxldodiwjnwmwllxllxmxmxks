package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ou {
    public static final nu Companion;
    public static final ou s;
    public static final ou t;
    public static final ou u;
    public static final /* synthetic */ ou[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        ou ouVar = new ou("CLOSED", 0, "CLOSED");
        s = ouVar;
        ou ouVar2 = new ou("OPEN", 1, "OPEN");
        t = ouVar2;
        ou ouVar3 = new ou("UNKNOWN__", 2, "UNKNOWN__");
        u = ouVar3;
        ou[] ouVarArr = {ouVar, ouVar2, ouVar3};
        v = ouVarArr;
        w = v8.l0.t(ouVarArr);
        Companion = new nu();
        sy.d0.o(new String[]{"CLOSED", "OPEN"});
    }

    public ou(String str, int i, String str2) {
        this.r = str2;
    }

    public static ou valueOf(String str) {
        return (ou) Enum.valueOf(ou.class, str);
    }

    public static ou[] values() {
        return (ou[]) v.clone();
    }
}
