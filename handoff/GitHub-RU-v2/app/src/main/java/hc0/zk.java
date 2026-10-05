package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class zk {
    public static final yk Companion;
    public static final aa.a0 s;
    public static final zk t;
    public static final zk u;
    public static final zk v;
    public static final zk w;
    public static final /* synthetic */ zk[] x;
    public static final /* synthetic */ d71.b y;
    public final String r;

    static {
        zk zkVar = new zk("MERGE", 0, "MERGE");
        t = zkVar;
        zk zkVar2 = new zk("REBASE", 1, "REBASE");
        u = zkVar2;
        zk zkVar3 = new zk("SQUASH", 2, "SQUASH");
        v = zkVar3;
        zk zkVar4 = new zk("UNKNOWN__", 3, "UNKNOWN__");
        w = zkVar4;
        zk[] zkVarArr = {zkVar, zkVar2, zkVar3, zkVar4};
        x = zkVarArr;
        y = v8.l0.t(zkVarArr);
        Companion = new yk();
        x61.l.r(new String[]{"MERGE", "REBASE", "SQUASH"});
        s = new aa.a0("PullRequestMergeMethod");
    }

    public zk(String str, int i, String str2) {
        this.r = str2;
    }

    public static zk valueOf(String str) {
        return (zk) Enum.valueOf(zk.class, str);
    }

    public static zk[] values() {
        return (zk[]) x.clone();
    }
}
