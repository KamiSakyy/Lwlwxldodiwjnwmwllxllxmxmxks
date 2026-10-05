package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class py {
    public static final oy Companion;
    public static final aa.a0 s;
    public static final py t;
    public static final /* synthetic */ py[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        py pyVar = new py("ADMIN", 0, "ADMIN");
        py pyVar2 = new py("MAINTAIN", 1, "MAINTAIN");
        py pyVar3 = new py("READ", 2, "READ");
        py pyVar4 = new py("TRIAGE", 3, "TRIAGE");
        py pyVar5 = new py("WRITE", 4, "WRITE");
        py pyVar6 = new py("UNKNOWN__", 5, "UNKNOWN__");
        t = pyVar6;
        py[] pyVarArr = {pyVar, pyVar2, pyVar3, pyVar4, pyVar5, pyVar6};
        u = pyVarArr;
        v = v8.l0.t(pyVarArr);
        Companion = new oy();
        x61.l.r(new String[]{"ADMIN", "MAINTAIN", "READ", "TRIAGE", "WRITE"});
        s = new aa.a0("RepositoryPermission");
    }

    public py(String str, int i, String str2) {
        this.r = str2;
    }

    public static py valueOf(String str) {
        return (py) Enum.valueOf(py.class, str);
    }

    public static py[] values() {
        return (py[]) u.clone();
    }
}
