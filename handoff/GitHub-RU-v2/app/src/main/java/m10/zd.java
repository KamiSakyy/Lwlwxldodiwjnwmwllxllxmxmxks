package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class zd {
    public static final yd Companion;
    public static final aa.a0 s;
    public static final zd t;
    public static final zd u;
    public static final zd v;
    public static final zd w;
    public static final /* synthetic */ zd[] x;
    public static final /* synthetic */ d71.b y;
    public final String r;

    static {
        zd zdVar = new zd("DUPLICATE", 0, "DUPLICATE");
        t = zdVar;
        zd zdVar2 = new zd("OUTDATED", 1, "OUTDATED");
        u = zdVar2;
        zd zdVar3 = new zd("REOPENED", 2, "REOPENED");
        zd zdVar4 = new zd("RESOLVED", 3, "RESOLVED");
        v = zdVar4;
        zd zdVar5 = new zd("UNKNOWN__", 4, "UNKNOWN__");
        w = zdVar5;
        zd[] zdVarArr = {zdVar, zdVar2, zdVar3, zdVar4, zdVar5};
        x = zdVarArr;
        y = v8.l0.t(zdVarArr);
        Companion = new yd();
        x61.l.r(new String[]{"DUPLICATE", "OUTDATED", "REOPENED", "RESOLVED"});
        s = new aa.a0("DiscussionStateReason");
    }

    public zd(String str, int i, String str2) {
        this.r = str2;
    }

    public static zd valueOf(String str) {
        return (zd) Enum.valueOf(zd.class, str);
    }

    public static zd[] values() {
        return (zd[]) x.clone();
    }
}
