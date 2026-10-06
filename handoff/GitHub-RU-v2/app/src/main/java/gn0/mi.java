package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class mi {
    public static final li Companion;
    public static final mi s;
    public static final mi t;
    public static final /* synthetic */ mi[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        mi miVar = new mi("ARCHIVED", 0, "ARCHIVED");
        mi miVar2 = new mi("DONE", 1, "DONE");
        mi miVar3 = new mi("READ", 2, "READ");
        mi miVar4 = new mi("UNREAD", 3, "UNREAD");
        s = miVar4;
        mi miVar5 = new mi("UNKNOWN__", 4, "UNKNOWN__");
        t = miVar5;
        mi[] miVarArr = {miVar, miVar2, miVar3, miVar4, miVar5};
        u = miVarArr;
        v = v8.l0.t(miVarArr);
        Companion = new li();
        sy.d0Shadow.o(new String[]{"ARCHIVED", "DONE", "READ", "UNREAD"});
    }

    public mi(String str, int i, String str2) {
        this.r = str2;
    }

    public static mi valueOf(String str) {
        return (mi) Enum.valueOf(mi.class, str);
    }

    public static mi[] values() {
        return (mi[]) u.clone();
    }
}
