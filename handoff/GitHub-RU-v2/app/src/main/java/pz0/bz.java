package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bz {
    public static final az Companion;
    public static final bz s;
    public static final bz t;
    public static final bz u;
    public static final /* synthetic */ bz[] v;
    public String r;

    static {
        bz bzVar = new bz("INTERNAL", 0, "INTERNAL");
        s = bzVar;
        bz bzVar2 = new bz("PRIVATE", 1, "PRIVATE");
        t = bzVar2;
        bz bzVar3 = new bz("PUBLIC", 2, "PUBLIC");
        u = bzVar3;
        bz[] bzVarArr = {bzVar, bzVar2, bzVar3, new bz("UNKNOWN__", 3, "UNKNOWN__")};
        v = bzVarArr;
        v8.l0.t(bzVarArr);
        Companion = new az();
        sy.d0Shadow.o(new String[]{"INTERNAL", "PRIVATE", "PUBLIC"});
    }

    public bz(String str, int i, String str2) {
        this.r = str2;
    }

    public static bz valueOf(String str) {
        return (bz) Enum.valueOf(bz.class, str);
    }

    public static bz[] values() {
        return (bz[]) v.clone();
    }
}
