package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class jc {
    public static final ic Companion;
    public static final jc s;
    public static final jc t;
    public static final jc u;
    public static final /* synthetic */ jc[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        jc jcVar = new jc("COMPLETED", 0, "COMPLETED");
        s = jcVar;
        jc jcVar2 = new jc("NOT_PLANNED", 1, "NOT_PLANNED");
        t = jcVar2;
        jc jcVar3 = new jc("UNKNOWN__", 2, "UNKNOWN__");
        u = jcVar3;
        jc[] jcVarArr = {jcVar, jcVar2, jcVar3};
        v = jcVarArr;
        w = v8.l0.t(jcVarArr);
        Companion = new ic();
        sy.d0.o(new String[]{"COMPLETED", "NOT_PLANNED"});
    }

    public jc(String str, int i, String str2) {
        this.r = str2;
    }

    public static jc valueOf(String str) {
        return (jc) Enum.valueOf(jc.class, str);
    }

    public static jc[] values() {
        return (jc[]) v.clone();
    }
}
