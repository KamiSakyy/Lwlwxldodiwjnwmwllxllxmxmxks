package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class mz {
    public static final lz Companion;
    public static final aa.a0 s;
    public static final mz t;
    public static final mz u;
    public static final /* synthetic */ mz[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        mz mzVar = new mz("ONE_DAY", 0, "ONE_DAY");
        mz mzVar2 = new mz("ONE_MONTH", 1, "ONE_MONTH");
        mz mzVar3 = new mz("ONE_WEEK", 2, "ONE_WEEK");
        mz mzVar4 = new mz("PERMANENT", 3, "PERMANENT");
        t = mzVar4;
        mz mzVar5 = new mz("THREE_DAYS", 4, "THREE_DAYS");
        mz mzVar6 = new mz("UNKNOWN__", 5, "UNKNOWN__");
        u = mzVar6;
        mz[] mzVarArr = {mzVar, mzVar2, mzVar3, mzVar4, mzVar5, mzVar6};
        v = mzVarArr;
        w = v8.l0.t(mzVarArr);
        Companion = new lz();
        x61.l.r(new String[]{"ONE_DAY", "ONE_MONTH", "ONE_WEEK", "PERMANENT", "THREE_DAYS"});
        s = new aa.a0("UserBlockDuration");
    }

    public mz(String str, int i, String str2) {
        this.r = str2;
    }

    public static mz valueOf(String str) {
        return (mz) Enum.valueOf(mz.class, str);
    }

    public static mz[] values() {
        return (mz[]) v.clone();
    }
}
