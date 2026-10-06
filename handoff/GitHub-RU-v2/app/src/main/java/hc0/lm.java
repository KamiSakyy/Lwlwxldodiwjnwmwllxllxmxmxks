package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class lm {
    public static final km Companion;
    public static final lm s;
    public static final lm t;
    public static final lm u;
    public static final /* synthetic */ lm[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        lm lmVar = new lm("CLOSED", 0, "CLOSED");
        s = lmVar;
        lm lmVar2 = new lm("OPEN", 1, "OPEN");
        t = lmVar2;
        lm lmVar3 = new lm("UNKNOWN__", 2, "UNKNOWN__");
        u = lmVar3;
        lm[] lmVarArr = {lmVar, lmVar2, lmVar3};
        v = lmVarArr;
        w = v8.l0.t(lmVarArr);
        Companion = new km();
        sy.d0.o(new String[]{"CLOSED", "OPEN"});
    }

    public lm(String str, int i, String str2) {
        this.r = str2;
    }

    public static lm valueOf(String str) {
        return (lm) Enum.valueOf(lm.class, str);
    }

    public static lm[] values() {
        return (lm[]) v.clone();
    }
}
