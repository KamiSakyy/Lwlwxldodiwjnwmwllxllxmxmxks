package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class zs {
    public static final ys Companion;
    public static final aa.a0 s;
    public static final zs t;
    public static final zs u;
    public static final zs v;
    public static final zs w;
    public static final /* synthetic */ zs[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        zs zsVar = new zs("MERGE", 0, "MERGE");
        t = zsVar;
        zs zsVar2 = new zs("REBASE", 1, "REBASE");
        u = zsVar2;
        zs zsVar3 = new zs("SQUASH", 2, "SQUASH");
        v = zsVar3;
        zs zsVar4 = new zs("UNKNOWN__", 3, "UNKNOWN__");
        w = zsVar4;
        zs[] zsVarArr = {zsVar, zsVar2, zsVar3, zsVar4};
        x = zsVarArr;
        y = v8.l0.t(zsVarArr);
        Companion = new ys();
        x61.l.r(new String[]{"MERGE", "REBASE", "SQUASH"});
        s = new aa.a0("PullRequestMergeMethod");
    }

    public zs(String str, int i, String str2) {
        this.r = str2;
    }

    public static zs valueOf(String str) {
        return (zs) Enum.valueOf(zs.class, str);
    }

    public static zs[] values() {
        return (zs[]) x.clone();
    }
    public Object ordinal() { return null; }
}
