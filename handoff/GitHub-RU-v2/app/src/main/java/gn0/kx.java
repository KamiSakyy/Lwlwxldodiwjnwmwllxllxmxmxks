package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class kx {
    public static final jx Companion;
    public static final kx s;
    public static final kx t;
    public static final kx u;
    public static final kx v;
    public static final /* synthetic */ kx[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        kx kxVar = new kx("DAILY", 0, "DAILY");
        s = kxVar;
        kx kxVar2 = new kx("MONTHLY", 1, "MONTHLY");
        t = kxVar2;
        kx kxVar3 = new kx("WEEKLY", 2, "WEEKLY");
        u = kxVar3;
        kx kxVar4 = new kx("UNKNOWN__", 3, "UNKNOWN__");
        v = kxVar4;
        kx[] kxVarArr = {kxVar, kxVar2, kxVar3, kxVar4};
        w = kxVarArr;
        x = v8.l0.t(kxVarArr);
        Companion = new jx();
        sy.d0.o(new String[]{"DAILY", "MONTHLY", "WEEKLY"});
    }

    public kx(String str, int i, String str2) {
        this.r = str2;
    }

    public static kx valueOf(String str) {
        return (kx) Enum.valueOf(kx.class, str);
    }

    public static kx[] values() {
        return (kx[]) w.clone();
    }
}
