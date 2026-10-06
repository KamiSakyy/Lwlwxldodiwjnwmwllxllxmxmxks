package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ro {
    public static final qo Companion;
    public static final aa.a0 s;
    public static final ro t;
    public static final /* synthetic */ ro[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        ro roVar = new ro("CHECK", 0, "CHECK");
        ro roVar2 = new ro("NONE", 1, "NONE");
        ro roVar3 = new ro("RELOAD", 2, "RELOAD");
        ro roVar4 = new ro("UNLIMITED", 3, "UNLIMITED");
        ro roVar5 = new ro("UNKNOWN__", 4, "UNKNOWN__");
        t = roVar5;
        ro[] roVarArr = {roVar, roVar2, roVar3, roVar4, roVar5};
        u = roVarArr;
        v = v8.l0.t(roVarArr);
        Companion = new qo();
        x61.l.r(new String[]{"CHECK", "NONE", "RELOAD", "UNLIMITED"});
        s = new aa.a0("MobileCopilotPaywallIcon");
    }

    public ro(String str, int i, String str2) {
        this.r = str2;
    }

    public static ro valueOf(String str) {
        return (ro) Enum.valueOf(ro.class, str);
    }

    public static ro[] values() {
        return (ro[]) u.clone();
    }
}
