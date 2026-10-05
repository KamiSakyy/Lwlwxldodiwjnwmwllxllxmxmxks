package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bs {
    public static final as Companion;
    public static final aa.a0 s;
    public static final bs t;
    public static final bs u;
    public static final bs v;
    public static final bs w;
    public static final bs x;
    public static final /* synthetic */ bs[] y;
    public static final /* synthetic */ d71.b z;
    public final String r;

    static {
        bs bsVar = new bs("FLOAT", 0, "FLOAT");
        t = bsVar;
        bs bsVar2 = new bs("INTEGER", 1, "INTEGER");
        u = bsVar2;
        bs bsVar3 = new bs("NULL", 2, "NULL");
        v = bsVar3;
        bs bsVar4 = new bs("STRING", 3, "STRING");
        w = bsVar4;
        bs bsVar5 = new bs("UNKNOWN__", 4, "UNKNOWN__");
        x = bsVar5;
        bs[] bsVarArr = {bsVar, bsVar2, bsVar3, bsVar4, bsVar5};
        y = bsVarArr;
        z = v8.l0.t(bsVarArr);
        Companion = new as();
        x61.l.r(new String[]{"FLOAT", "INTEGER", "NULL", "STRING"});
        s = new aa.a0("ProjectV2ViewItemSortableValueType");
    }

    public bs(String str, int i, String str2) {
        this.r = str2;
    }

    public static bs valueOf(String str) {
        return (bs) Enum.valueOf(bs.class, str);
    }

    public static bs[] values() {
        return (bs[]) y.clone();
    }
}
