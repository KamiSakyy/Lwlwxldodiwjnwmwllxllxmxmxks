package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class zy {
    public static final /* synthetic */ zy[] A;
    public static final /* synthetic */ d71.b B;
    public static final yy Companion;
    public static final zy s;
    public static final zy t;
    public static final zy u;
    public static final zy v;
    public static final zy w;
    public static final zy x;
    public static final zy y;
    public static final zy z;
    public final String r;

    static {
        zy zyVar = new zy("ARCHIVED", 0, "ARCHIVED");
        s = zyVar;
        zy zyVar2 = new zy("FORK", 1, "FORK");
        t = zyVar2;
        zy zyVar3 = new zy("MIRROR", 2, "MIRROR");
        u = zyVar3;
        zy zyVar4 = new zy("PRIVATE", 3, "PRIVATE");
        v = zyVar4;
        zy zyVar5 = new zy("PUBLIC", 4, "PUBLIC");
        w = zyVar5;
        zy zyVar6 = new zy("SOURCE", 5, "SOURCE");
        x = zyVar6;
        zy zyVar7 = new zy("SPONSORABLE", 6, "SPONSORABLE");
        zy zyVar8 = new zy("TEMPLATE", 7, "TEMPLATE");
        y = zyVar8;
        zy zyVar9 = new zy("UNKNOWN__", 8, "UNKNOWN__");
        z = zyVar9;
        zy[] zyVarArr = {zyVar, zyVar2, zyVar3, zyVar4, zyVar5, zyVar6, zyVar7, zyVar8, zyVar9};
        A = zyVarArr;
        B = v8.l0.t(zyVarArr);
        Companion = new yy();
        sy.d0.o(new String[]{"ARCHIVED", "FORK", "MIRROR", "PRIVATE", "PUBLIC", "SOURCE", "SPONSORABLE", "TEMPLATE"});
    }

    public zy(String str, int i, String str2) {
        this.r = str2;
    }

    public static zy valueOf(String str) {
        return (zy) Enum.valueOf(zy.class, str);
    }

    public static zy[] values() {
        return (zy[]) A.clone();
    }
}
