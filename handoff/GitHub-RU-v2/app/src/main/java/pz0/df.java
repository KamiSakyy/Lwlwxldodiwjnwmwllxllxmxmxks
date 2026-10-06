package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class df {
    public static final cf Companion;
    public static final aa.a0 s;
    public static final df t;
    public static final df u;
    public static final df v;
    public static final df w;
    public static final /* synthetic */ df[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        df dfVar = new df("COMPLETED", 0, "COMPLETED");
        t = dfVar;
        df dfVar2 = new df("DUPLICATE", 1, "DUPLICATE");
        df dfVar3 = new df("NOT_PLANNED", 2, "NOT_PLANNED");
        u = dfVar3;
        df dfVar4 = new df("REOPENED", 3, "REOPENED");
        v = dfVar4;
        df dfVar5 = new df("UNKNOWN__", 4, "UNKNOWN__");
        w = dfVar5;
        df[] dfVarArr = {dfVar, dfVar2, dfVar3, dfVar4, dfVar5};
        x = dfVarArr;
        y = v8.l0.t(dfVarArr);
        Companion = new cf();
        x61.l.r(new String[]{"COMPLETED", "DUPLICATE", "NOT_PLANNED", "REOPENED"});
        s = new aa.a0("IssueStateReason");
    }

    public df(String str, int i, String str2) {
        this.r = str2;
    }

    public static df valueOf(String str) {
        return (df) Enum.valueOf(df.class, str);
    }

    public static df[] values() {
        return (df[]) x.clone();
    }
    public Object ordinal() { return null; }
}
