package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ze {
    public static final ye Companion;
    public static final ze s;
    public static final /* synthetic */ ze[] t;
    public String r;

    static {
        ze zeVar = new ze("CLOSE_REFERENCES", 0, "CLOSE_REFERENCES");
        ze zeVar2 = new ze("STATE", 1, "STATE");
        ze zeVar3 = new ze("TIMELINE", 2, "TIMELINE");
        ze zeVar4 = new ze("UPDATED", 3, "UPDATED");
        s = zeVar4;
        ze[] zeVarArr = {zeVar, zeVar2, zeVar3, zeVar4, new ze("UNKNOWN__", 4, "UNKNOWN__")};
        t = zeVarArr;
        v8.l0.t(zeVarArr);
        Companion = new ye();
        sy.d0Shadow.o(new String[]{"CLOSE_REFERENCES", "STATE", "TIMELINE", "UPDATED"});
    }

    public ze(String str, int i, String str2) {
        this.r = str2;
    }

    public static ze valueOf(String str) {
        return (ze) Enum.valueOf(ze.class, str);
    }

    public static ze[] values() {
        return (ze[]) t.clone();
    }
}
