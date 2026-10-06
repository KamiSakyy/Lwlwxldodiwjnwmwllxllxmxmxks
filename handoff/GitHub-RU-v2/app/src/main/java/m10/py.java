package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class py {
    public static final oy Companion;
    public static final aa.a0 s;
    public static final py t;
    public static final py u;
    public static final py v;
    public static final py w;
    public static final /* synthetic */ py[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        py pyVar = new py("MERGE", 0, "MERGE");
        t = pyVar;
        py pyVar2 = new py("REBASE", 1, "REBASE");
        u = pyVar2;
        py pyVar3 = new py("SQUASH", 2, "SQUASH");
        v = pyVar3;
        py pyVar4 = new py("UNKNOWN__", 3, "UNKNOWN__");
        w = pyVar4;
        py[] pyVarArr = {pyVar, pyVar2, pyVar3, pyVar4};
        x = pyVarArr;
        y = v8.l0.t(pyVarArr);
        Companion = new oy();
        x61.l.r(new String[]{"MERGE", "REBASE", "SQUASH"});
        s = new aa.a0("PullRequestMergeMethod");
    }

    public py(String str, int i, String str2) {
        this.r = str2;
    }

    public static py valueOf(String str) {
        return (py) Enum.valueOf(py.class, str);
    }

    public static py[] values() {
        return (py[]) x.clone();
    }
}
