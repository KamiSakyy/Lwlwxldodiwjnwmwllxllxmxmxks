package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class yh {
    public static final xh Companion;
    public static final yh s;
    public static final yh t;
    public static final yh u;
    public static final yh v;
    public static final /* synthetic */ yh[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        yh yhVar = new yh("COMPLETED", 0, "COMPLETED");
        s = yhVar;
        yh yhVar2 = new yh("DUPLICATE", 1, "DUPLICATE");
        t = yhVar2;
        yh yhVar3 = new yh("NOT_PLANNED", 2, "NOT_PLANNED");
        u = yhVar3;
        yh yhVar4 = new yh("UNKNOWN__", 3, "UNKNOWN__");
        v = yhVar4;
        yh[] yhVarArr = {yhVar, yhVar2, yhVar3, yhVar4};
        w = yhVarArr;
        x = v8.l0.t(yhVarArr);
        Companion = new xh();
        sy.d0.o("COMPLETED", "DUPLICATE", "NOT_PLANNED");
    }

    public yh(String str, int i, String str2) {
        this.r = str2;
    }

    public static yh valueOf(String str) {
        return (yh) Enum.valueOf(yh.class, str);
    }

    public static yh[] values() {
        return (yh[]) w.clone();
    }
}
