package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class mw {
    public static final lw Companion;
    public static final mw s;
    public static final mw t;
    public static final mw u;
    public static final mw v;
    public static final mw w;
    public static final mw x;
    public static final /* synthetic */ mw[] y;
    public String r;

    static {
        mw mwVar = new mw("CREATED_AT", 0, "CREATED_AT");
        s = mwVar;
        mw mwVar2 = new mw("NUMBER", 1, "NUMBER");
        t = mwVar2;
        mw mwVar3 = new mw("RECENTLY_VIEWED", 2, "RECENTLY_VIEWED");
        u = mwVar3;
        mw mwVar4 = new mw("RELEVANCE", 3, "RELEVANCE");
        v = mwVar4;
        mw mwVar5 = new mw("TITLE", 4, "TITLE");
        w = mwVar5;
        mw mwVar6 = new mw("UPDATED_AT", 5, "UPDATED_AT");
        x = mwVar6;
        mw[] mwVarArr = {mwVar, mwVar2, mwVar3, mwVar4, mwVar5, mwVar6, new mw("UNKNOWN__", 6, "UNKNOWN__")};
        y = mwVarArr;
        v8.l0.t(mwVarArr);
        Companion = new lw();
        sy.d0Shadow.o("CREATED_AT", "NUMBER", "RECENTLY_VIEWED", "RELEVANCE", "TITLE", "UPDATED_AT");
    }

    public mw(String str, int i, String str2) {
        this.r = str2;
    }

    public static mw valueOf(String str) {
        return (mw) Enum.valueOf(mw.class, str);
    }

    public static mw[] values() {
        return (mw[]) y.clone();
    }
}
