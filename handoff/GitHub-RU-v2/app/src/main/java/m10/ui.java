package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ui {
    public static final ti Companion;
    public static final ui s;
    public static final /* synthetic */ ui[] t;
    public final String r;

    static {
        ui uiVar = new ui("CLOSE_REFERENCES", 0, "CLOSE_REFERENCES");
        ui uiVar2 = new ui("STATE", 1, "STATE");
        ui uiVar3 = new ui("TIMELINE", 2, "TIMELINE");
        ui uiVar4 = new ui("UPDATED", 3, "UPDATED");
        s = uiVar4;
        ui[] uiVarArr = {uiVar, uiVar2, uiVar3, uiVar4, new ui("UNKNOWN__", 4, "UNKNOWN__")};
        t = uiVarArr;
        v8.l0.t(uiVarArr);
        Companion = new ti();
        sy.d0.o("CLOSE_REFERENCES", "STATE", "TIMELINE", "UPDATED");
    }

    public ui(String str, int i, String str2) {
        this.r = str2;
    }

    public static ui valueOf(String str) {
        return (ui) Enum.valueOf(ui.class, str);
    }

    public static ui[] values() {
        return (ui[]) t.clone();
    }
}
