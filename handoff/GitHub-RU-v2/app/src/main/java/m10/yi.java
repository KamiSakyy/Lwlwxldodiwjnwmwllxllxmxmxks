package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class yi {
    public static final xi Companion;
    public static final aa.a0 s;
    public static final yi t;
    public static final yi u;
    public static final yi v;
    public static final yi w;
    public static final yi x;
    public static final /* synthetic */ yi[] y;
    public static final /* synthetic */ d71.b z;
    public final String r;

    static {
        yi yiVar = new yi("COMPLETED", 0, "COMPLETED");
        t = yiVar;
        yi yiVar2 = new yi("DUPLICATE", 1, "DUPLICATE");
        u = yiVar2;
        yi yiVar3 = new yi("NOT_PLANNED", 2, "NOT_PLANNED");
        v = yiVar3;
        yi yiVar4 = new yi("REOPENED", 3, "REOPENED");
        w = yiVar4;
        yi yiVar5 = new yi("UNKNOWN__", 4, "UNKNOWN__");
        x = yiVar5;
        yi[] yiVarArr = {yiVar, yiVar2, yiVar3, yiVar4, yiVar5};
        y = yiVarArr;
        z = v8.l0.t(yiVarArr);
        Companion = new xi();
        x61.l.r(new String[]{"COMPLETED", "DUPLICATE", "NOT_PLANNED", "REOPENED"});
        s = new aa.a0("IssueStateReason");
    }

    public yi(String str, int i, String str2) {
        this.r = str2;
    }

    public static yi valueOf(String str) {
        return (yi) Enum.valueOf(yi.class, str);
    }

    public static yi[] values() {
        return (yi[]) y.clone();
    }
    public Object ordinal() { return null; }
}
