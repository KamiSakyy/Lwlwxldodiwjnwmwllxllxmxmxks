package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class xd {
    public static final wd Companion;
    public static final aa.a0 s;
    public static final xd t;
    public static final /* synthetic */ xd[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        xd xdVar = new xd("OFF_TOPIC", 0, "OFF_TOPIC");
        xd xdVar2 = new xd("RESOLVED", 1, "RESOLVED");
        xd xdVar3 = new xd("SPAM", 2, "SPAM");
        xd xdVar4 = new xd("TOO_HEATED", 3, "TOO_HEATED");
        xd xdVar5 = new xd("UNKNOWN__", 4, "UNKNOWN__");
        t = xdVar5;
        xd[] xdVarArr = {xdVar, xdVar2, xdVar3, xdVar4, xdVar5};
        u = xdVarArr;
        v = v8.l0.t(xdVarArr);
        Companion = new wd();
        x61.l.r(new String[]{"OFF_TOPIC", "RESOLVED", "SPAM", "TOO_HEATED"});
        s = new aa.a0("LockReason");
    }

    public xd(String str, int i, String str2) {
        this.r = str2;
    }

    public static xd valueOf(String str) {
        return (xd) Enum.valueOf(xd.class, str);
    }

    public static xd[] values() {
        return (xd[]) u.clone();
    }
    public Object ordinal() { return null; }
}
