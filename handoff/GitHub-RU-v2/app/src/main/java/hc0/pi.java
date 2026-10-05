package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class pi {
    public static final oi Companion;
    public static final aa.a0 s;
    public static final pi t;
    public static final /* synthetic */ pi[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        pi piVar = new pi("ADDED", 0, "ADDED");
        pi piVar2 = new pi("CHANGED", 1, "CHANGED");
        pi piVar3 = new pi("COPIED", 2, "COPIED");
        pi piVar4 = new pi("DELETED", 3, "DELETED");
        pi piVar5 = new pi("MODIFIED", 4, "MODIFIED");
        pi piVar6 = new pi("RENAMED", 5, "RENAMED");
        pi piVar7 = new pi("UNKNOWN__", 6, "UNKNOWN__");
        t = piVar7;
        pi[] piVarArr = {piVar, piVar2, piVar3, piVar4, piVar5, piVar6, piVar7};
        u = piVarArr;
        v = v8.l0.t(piVarArr);
        Companion = new oi();
        x61.l.r(new String[]{"ADDED", "CHANGED", "COPIED", "DELETED", "MODIFIED", "RENAMED"});
        s = new aa.a0("PatchStatus");
    }

    public pi(String str, int i, String str2) {
        this.r = str2;
    }

    public static pi valueOf(String str) {
        return (pi) Enum.valueOf(pi.class, str);
    }

    public static pi[] values() {
        return (pi[]) u.clone();
    }
}
