package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class wx {
    public static final vx Companion;
    public static final wx s;
    public static final wx t;
    public static final wx u;
    public static final /* synthetic */ wx[] v;
    public String r;

    static {
        wx wxVar = new wx("MERGE", 0, "MERGE");
        s = wxVar;
        wx wxVar2 = new wx("REBASE", 1, "REBASE");
        t = wxVar2;
        wx wxVar3 = new wx("UNKNOWN__", 2, "UNKNOWN__");
        u = wxVar3;
        wx[] wxVarArr = {wxVar, wxVar2, wxVar3};
        v = wxVarArr;
        v8.l0.t(wxVarArr);
        Companion = new vx();
        sy.d0.o("MERGE", "REBASE");
    }

    public wx(String str, int i, String str2) {
        this.r = str2;
    }

    public static wx valueOf(String str) {
        return (wx) Enum.valueOf(wx.class, str);
    }

    public static wx[] values() {
        return (wx[]) v.clone();
    }
}
