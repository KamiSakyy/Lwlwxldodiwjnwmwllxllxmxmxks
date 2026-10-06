package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class mx {
    public static final lx Companion;
    public static final aa.a0 s;
    public static final mx t;
    public static final mx u;
    public static final mx v;
    public static final mx w;
    public static final mx x;
    public static final /* synthetic */ mx[] y;
    public static final /* synthetic */ d71.b z;
    public final String r;

    static {
        mx mxVar = new mx("FLOAT", 0, "FLOAT");
        t = mxVar;
        mx mxVar2 = new mx("INTEGER", 1, "INTEGER");
        u = mxVar2;
        mx mxVar3 = new mx("NULL", 2, "NULL");
        v = mxVar3;
        mx mxVar4 = new mx("STRING", 3, "STRING");
        w = mxVar4;
        mx mxVar5 = new mx("UNKNOWN__", 4, "UNKNOWN__");
        x = mxVar5;
        mx[] mxVarArr = {mxVar, mxVar2, mxVar3, mxVar4, mxVar5};
        y = mxVarArr;
        z = v8.l0.t(mxVarArr);
        Companion = new lx();
        x61.l.r(new String[]{"FLOAT", "INTEGER", "NULL", "STRING"});
        s = new aa.a0("ProjectV2ViewItemSortableValueType");
    }

    public mx(String str, int i, String str2) {
        this.r = str2;
    }

    public static mx valueOf(String str) {
        return (mx) Enum.valueOf(mx.class, str);
    }

    public static mx[] values() {
        return (mx[]) y.clone();
    }
    public Object ordinal() { return null; }
}
