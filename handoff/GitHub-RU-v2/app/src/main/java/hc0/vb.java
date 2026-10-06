package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class vb {
    public static final ub Companion;
    public static final vb s;
    public static final vb t;
    public static final vb u;
    public static final /* synthetic */ vb[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        vb vbVar = new vb("COMPLETED", 0, "COMPLETED");
        s = vbVar;
        vb vbVar2 = new vb("NOT_PLANNED", 1, "NOT_PLANNED");
        t = vbVar2;
        vb vbVar3 = new vb("UNKNOWN__", 2, "UNKNOWN__");
        u = vbVar3;
        vb[] vbVarArr = {vbVar, vbVar2, vbVar3};
        v = vbVarArr;
        w = v8.l0.t(vbVarArr);
        Companion = new ub();
        sy.d0.o(new String[]{"COMPLETED", "NOT_PLANNED"});
    }

    public vb(String str, int i, String str2) {
        this.r = str2;
    }

    public static vb valueOf(String str) {
        return (vb) Enum.valueOf(vb.class, str);
    }

    public static vb[] values() {
        return (vb[]) v.clone();
    }
}
