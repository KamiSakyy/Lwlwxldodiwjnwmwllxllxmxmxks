package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class va {
    public static final ua Companion;
    public static final aa.a0 s;
    public static final va t;
    public static final va u;
    public static final va v;
    public static final va w;
    public static final /* synthetic */ va[] x;
    public static final /* synthetic */ d71.b y;
    public final String r;

    static {
        va vaVar = new va("DUPLICATE", 0, "DUPLICATE");
        t = vaVar;
        va vaVar2 = new va("OUTDATED", 1, "OUTDATED");
        u = vaVar2;
        va vaVar3 = new va("REOPENED", 2, "REOPENED");
        va vaVar4 = new va("RESOLVED", 3, "RESOLVED");
        v = vaVar4;
        va vaVar5 = new va("UNKNOWN__", 4, "UNKNOWN__");
        w = vaVar5;
        va[] vaVarArr = {vaVar, vaVar2, vaVar3, vaVar4, vaVar5};
        x = vaVarArr;
        y = v8.l0.t(vaVarArr);
        Companion = new ua();
        x61.l.r(new String[]{"DUPLICATE", "OUTDATED", "REOPENED", "RESOLVED"});
        s = new aa.a0("DiscussionStateReason");
    }

    public va(String str, int i, String str2) {
        this.r = str2;
    }

    public static va valueOf(String str) {
        return (va) Enum.valueOf(va.class, str);
    }

    public static va[] values() {
        return (va[]) x.clone();
    }
}
