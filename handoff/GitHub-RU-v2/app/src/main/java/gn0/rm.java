package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class rm {
    public static final qm Companion;
    public static final rm s;
    public static final rm t;
    public static final rm u;
    public static final rm v;
    public static final rm w;
    public static final /* synthetic */ rm[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        rm rmVar = new rm("APPROVE", 0, "APPROVE");
        s = rmVar;
        rm rmVar2 = new rm("COMMENT", 1, "COMMENT");
        t = rmVar2;
        rm rmVar3 = new rm("DISMISS", 2, "DISMISS");
        u = rmVar3;
        rm rmVar4 = new rm("REQUEST_CHANGES", 3, "REQUEST_CHANGES");
        v = rmVar4;
        rm rmVar5 = new rm("UNKNOWN__", 4, "UNKNOWN__");
        w = rmVar5;
        rm[] rmVarArr = {rmVar, rmVar2, rmVar3, rmVar4, rmVar5};
        x = rmVarArr;
        y = v8.l0.t(rmVarArr);
        Companion = new qm();
        sy.d0.o(new String[]{"APPROVE", "COMMENT", "DISMISS", "REQUEST_CHANGES"});
    }

    public rm(String str, int i, String str2) {
        this.r = str2;
    }

    public static rm valueOf(String str) {
        return (rm) Enum.valueOf(rm.class, str);
    }

    public static rm[] values() {
        return (rm[]) x.clone();
    }
}
