package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class lz {
    public static final kz Companion;
    public static final lz s;
    public static final lz t;
    public static final lz u;
    public static final lz v;
    public static final lz w;
    public static final /* synthetic */ lz[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        lz lzVar = new lz("APPROVE", 0, "APPROVE");
        s = lzVar;
        lz lzVar2 = new lz("COMMENT", 1, "COMMENT");
        t = lzVar2;
        lz lzVar3 = new lz("DISMISS", 2, "DISMISS");
        u = lzVar3;
        lz lzVar4 = new lz("REQUEST_CHANGES", 3, "REQUEST_CHANGES");
        v = lzVar4;
        lz lzVar5 = new lz("UNKNOWN__", 4, "UNKNOWN__");
        w = lzVar5;
        lz[] lzVarArr = {lzVar, lzVar2, lzVar3, lzVar4, lzVar5};
        x = lzVarArr;
        y = v8.l0.t(lzVarArr);
        Companion = new kz();
        sy.d0Shadow.o("APPROVE", "COMMENT", "DISMISS", "REQUEST_CHANGES");
    }

    public lz(String str, int i, String str2) {
        this.r = str2;
    }

    public static lz valueOf(String str) {
        return (lz) Enum.valueOf(lz.class, str);
    }

    public static lz[] values() {
        return (lz[]) x.clone();
    }
}
