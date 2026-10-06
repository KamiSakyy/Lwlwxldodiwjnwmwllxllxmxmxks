package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class rm {
    public static final qm Companion;
    public static final aa.a0 s;
    public static final rm t;
    public static final /* synthetic */ rm[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        rm rmVar = new rm("ADDED", 0, "ADDED");
        rm rmVar2 = new rm("CHANGED", 1, "CHANGED");
        rm rmVar3 = new rm("COPIED", 2, "COPIED");
        rm rmVar4 = new rm("DELETED", 3, "DELETED");
        rm rmVar5 = new rm("MODIFIED", 4, "MODIFIED");
        rm rmVar6 = new rm("RENAMED", 5, "RENAMED");
        rm rmVar7 = new rm("UNKNOWN__", 6, "UNKNOWN__");
        t = rmVar7;
        rm[] rmVarArr = {rmVar, rmVar2, rmVar3, rmVar4, rmVar5, rmVar6, rmVar7};
        u = rmVarArr;
        v = v8.l0.t(rmVarArr);
        Companion = new qm();
        x61.l.r(new String[]{"ADDED", "CHANGED", "COPIED", "DELETED", "MODIFIED", "RENAMED"});
        s = new aa.a0("PatchStatus");
    }

    public rm(String str, int i, String str2) {
        this.r = str2;
    }

    public static rm valueOf(String str) {
        return (rm) Enum.valueOf(rm.class, str);
    }

    public static rm[] values() {
        return (rm[]) u.clone();
    }
}
