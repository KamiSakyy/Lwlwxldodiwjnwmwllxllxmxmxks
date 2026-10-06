package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class hc {
    public static final gc Companion;
    public static final hc s;
    public static final /* synthetic */ hc[] t;
    public String r;

    static {
        hc hcVar = new hc("CLOSE_REFERENCES", 0, "CLOSE_REFERENCES");
        hc hcVar2 = new hc("STATE", 1, "STATE");
        hc hcVar3 = new hc("TIMELINE", 2, "TIMELINE");
        hc hcVar4 = new hc("UPDATED", 3, "UPDATED");
        s = hcVar4;
        hc[] hcVarArr = {hcVar, hcVar2, hcVar3, hcVar4, new hc("UNKNOWN__", 4, "UNKNOWN__")};
        t = hcVarArr;
        v8.l0.t(hcVarArr);
        Companion = new gc();
        sy.d0Shadow.o(new String[]{"CLOSE_REFERENCES", "STATE", "TIMELINE", "UPDATED"});
    }

    public hc(String str, int i, String str2) {
        this.r = str2;
    }

    public static hc valueOf(String str) {
        return (hc) Enum.valueOf(hc.class, str);
    }

    public static hc[] values() {
        return (hc[]) t.clone();
    }
}
