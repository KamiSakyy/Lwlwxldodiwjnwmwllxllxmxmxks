package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class zc {
    public static final yc Companion;
    public static final aa.a0 s;
    public static final zc t;
    public static final zc u;
    public static final zc v;
    public static final zc w;
    public static final /* synthetic */ zc[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        zc zcVar = new zc("COMPLETED", 0, "COMPLETED");
        t = zcVar;
        zc zcVar2 = new zc("NOT_PLANNED", 1, "NOT_PLANNED");
        u = zcVar2;
        zc zcVar3 = new zc("REOPENED", 2, "REOPENED");
        v = zcVar3;
        zc zcVar4 = new zc("UNKNOWN__", 3, "UNKNOWN__");
        w = zcVar4;
        zc[] zcVarArr = {zcVar, zcVar2, zcVar3, zcVar4};
        x = zcVarArr;
        y = v8.l0.t(zcVarArr);
        Companion = new yc();
        x61.l.r(new String[]{"COMPLETED", "NOT_PLANNED", "REOPENED"});
        s = new aa.a0("IssueStateReason");
    }

    public zc(String str, int i, String str2) {
        this.r = str2;
    }

    public static zc valueOf(String str) {
        return (zc) Enum.valueOf(zc.class, str);
    }

    public static zc[] values() {
        return (zc[]) x.clone();
    }
    public Object ordinal() { return null; }
}
