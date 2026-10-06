package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class vc {
    public static final uc Companion;
    public static final vc s;
    public static final /* synthetic */ vc[] t;
    public String r;

    static {
        vc vcVar = new vc("CLOSE_REFERENCES", 0, "CLOSE_REFERENCES");
        vc vcVar2 = new vc("STATE", 1, "STATE");
        vc vcVar3 = new vc("TIMELINE", 2, "TIMELINE");
        vc vcVar4 = new vc("UPDATED", 3, "UPDATED");
        s = vcVar4;
        vc[] vcVarArr = {vcVar, vcVar2, vcVar3, vcVar4, new vc("UNKNOWN__", 4, "UNKNOWN__")};
        t = vcVarArr;
        v8.l0.t(vcVarArr);
        Companion = new uc();
        sy.d0Shadow.o(new String[]{"CLOSE_REFERENCES", "STATE", "TIMELINE", "UPDATED"});
    }

    public vc(String str, int i, String str2) {
        this.r = str2;
    }

    public static vc valueOf(String str) {
        return (vc) Enum.valueOf(vc.class, str);
    }

    public static vc[] values() {
        return (vc[]) t.clone();
    }
}
