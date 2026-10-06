package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class pj {
    public static final oj Companion;
    public static final aa.a0 s;
    public static final pj t;
    public static final /* synthetic */ pj[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        pj pjVar = new pj("ADDED", 0, "ADDED");
        pj pjVar2 = new pj("CHANGED", 1, "CHANGED");
        pj pjVar3 = new pj("COPIED", 2, "COPIED");
        pj pjVar4 = new pj("DELETED", 3, "DELETED");
        pj pjVar5 = new pj("MODIFIED", 4, "MODIFIED");
        pj pjVar6 = new pj("RENAMED", 5, "RENAMED");
        pj pjVar7 = new pj("UNKNOWN__", 6, "UNKNOWN__");
        t = pjVar7;
        pj[] pjVarArr = {pjVar, pjVar2, pjVar3, pjVar4, pjVar5, pjVar6, pjVar7};
        u = pjVarArr;
        v = v8.l0.t(pjVarArr);
        Companion = new oj();
        x61.l.r(new String[]{"ADDED", "CHANGED", "COPIED", "DELETED", "MODIFIED", "RENAMED"});
        s = new aa.a0("PatchStatus");
    }

    public pj(String str, int i, String str2) {
        this.r = str2;
    }

    public static pj valueOf(String str) {
        return (pj) Enum.valueOf(pj.class, str);
    }

    public static pj[] values() {
        return (pj[]) u.clone();
    }
    public Object ordinal() { return null; }
}
