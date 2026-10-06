package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class jd {
    public static final id Companion;
    public static final aa.a0 s;
    public static final jd t;
    public static final /* synthetic */ jd[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        jd jdVar = new jd("OFF_TOPIC", 0, "OFF_TOPIC");
        jd jdVar2 = new jd("RESOLVED", 1, "RESOLVED");
        jd jdVar3 = new jd("SPAM", 2, "SPAM");
        jd jdVar4 = new jd("TOO_HEATED", 3, "TOO_HEATED");
        jd jdVar5 = new jd("UNKNOWN__", 4, "UNKNOWN__");
        t = jdVar5;
        jd[] jdVarArr = {jdVar, jdVar2, jdVar3, jdVar4, jdVar5};
        u = jdVarArr;
        v = v8.l0.t(jdVarArr);
        Companion = new id();
        x61.l.r(new String[]{"OFF_TOPIC", "RESOLVED", "SPAM", "TOO_HEATED"});
        s = new aa.a0("LockReason");
    }

    public jd(String str, int i, String str2) {
        this.r = str2;
    }

    public static jd valueOf(String str) {
        return (jd) Enum.valueOf(jd.class, str);
    }

    public static jd[] values() {
        return (jd[]) u.clone();
    }
}
