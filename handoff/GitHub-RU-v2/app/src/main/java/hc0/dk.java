package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class dk {
    public static final ck Companion;
    public static final aa.a0 s;
    public static final dk t;
    public static final /* synthetic */ dk[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        dk dkVar = new dk("CLOSED", 0, "CLOSED");
        dk dkVar2 = new dk("OPEN", 1, "OPEN");
        dk dkVar3 = new dk("UNKNOWN__", 2, "UNKNOWN__");
        t = dkVar3;
        dk[] dkVarArr = {dkVar, dkVar2, dkVar3};
        u = dkVarArr;
        v = v8.l0.t(dkVarArr);
        Companion = new ck();
        x61.l.r(new String[]{"CLOSED", "OPEN"});
        s = new aa.a0("ProjectState");
    }

    public dk(String str, int i, String str2) {
        this.r = str2;
    }

    public static dk valueOf(String str) {
        return (dk) Enum.valueOf(dk.class, str);
    }

    public static dk[] values() {
        return (dk[]) u.clone();
    }
    public Object ordinal() { return null; }
}
