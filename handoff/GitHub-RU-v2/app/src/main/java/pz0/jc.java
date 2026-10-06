package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class jc {
    public static final ic Companion;
    public static final aa.a0 s;
    public static final jc t;
    public static final jc u;
    public static final jc v;
    public static final /* synthetic */ jc[] w;
    public static final /* synthetic */ d71.b x;
    public String r;

    static {
        jc jcVar = new jc("DISMISSED", 0, "DISMISSED");
        jc jcVar2 = new jc("UNVIEWED", 1, "UNVIEWED");
        t = jcVar2;
        jc jcVar3 = new jc("VIEWED", 2, "VIEWED");
        u = jcVar3;
        jc jcVar4 = new jc("UNKNOWN__", 3, "UNKNOWN__");
        v = jcVar4;
        jc[] jcVarArr = {jcVar, jcVar2, jcVar3, jcVar4};
        w = jcVarArr;
        x = v8.l0.t(jcVarArr);
        Companion = new ic();
        x61.l.r(new String[]{"DISMISSED", "UNVIEWED", "VIEWED"});
        s = new aa.a0("FileViewedState");
    }

    public jc(String str, int i, String str2) {
        this.r = str2;
    }

    public static jc valueOf(String str) {
        return (jc) Enum.valueOf(jc.class, str);
    }

    public static jc[] values() {
        return (jc[]) w.clone();
    }
}
