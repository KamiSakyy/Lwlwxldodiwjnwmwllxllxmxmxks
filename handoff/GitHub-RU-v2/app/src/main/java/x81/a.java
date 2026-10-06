package x81;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public static final z s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final /* synthetic */ a[] z;
    public int r;

    static {
        a aVar = new a(0, "NO_ERROR", 0);
        t = aVar;
        a aVar2 = new a(1, "PROTOCOL_ERROR", 1);
        u = aVar2;
        a aVar3 = new a(2, "INTERNAL_ERROR", 2);
        v = aVar3;
        a aVar4 = new a(3, "FLOW_CONTROL_ERROR", 3);
        w = aVar4;
        a aVar5 = new a(4, "SETTINGS_TIMEOUT", 4);
        a aVar6 = new a(5, "STREAM_CLOSED", 5);
        a aVar7 = new a(6, "FRAME_SIZE_ERROR", 6);
        a aVar8 = new a(7, "REFUSED_STREAM", 7);
        x = aVar8;
        a aVar9 = new a(8, "CANCEL", 8);
        y = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(9, "COMPRESSION_ERROR", 9), new a(10, "CONNECT_ERROR", 10), new a(11, "ENHANCE_YOUR_CALM", 11), new a(12, "INADEQUATE_SECURITY", 12), new a(13, "HTTP_1_1_REQUIRED", 13)};
        z = aVarArr;
        l0.t(aVarArr);
        s = new z();
    }

    public a(int i, String str, int i2) {
        this.r = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) z.clone();
    }
}
