package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class gu {
    public static final fu Companion;
    public static final aa.a0 s;
    public static final gu t;
    public static final gu u;
    public static final gu v;
    public static final /* synthetic */ gu[] w;
    public static final /* synthetic */ d71.b x;
    public String r;

    static {
        gu guVar = new gu("CLOSED", 0, "CLOSED");
        t = guVar;
        gu guVar2 = new gu("MERGED", 1, "MERGED");
        gu guVar3 = new gu("OPEN", 2, "OPEN");
        u = guVar3;
        gu guVar4 = new gu("UNKNOWN__", 3, "UNKNOWN__");
        v = guVar4;
        gu[] guVarArr = {guVar, guVar2, guVar3, guVar4};
        w = guVarArr;
        x = v8.l0.t(guVarArr);
        Companion = new fu();
        x61.l.r(new String[]{"CLOSED", "MERGED", "OPEN"});
        s = new aa.a0("PullRequestState");
    }

    public gu(String str, int i, String str2) {
        this.r = str2;
    }

    public static gu valueOf(String str) {
        return (gu) Enum.valueOf(gu.class, str);
    }

    public static gu[] values() {
        return (gu[]) w.clone();
    }
    public Object ordinal() { return null; }
}
