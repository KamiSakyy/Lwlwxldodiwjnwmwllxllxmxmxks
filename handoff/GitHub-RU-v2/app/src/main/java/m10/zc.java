package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class zc {
    public static final yc Companion;
    public static final zc s;
    public static final zc t;
    public static final zc u;
    public static final /* synthetic */ zc[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        zc zcVar = new zc("LEFT", 0, "LEFT");
        s = zcVar;
        zc zcVar2 = new zc("RIGHT", 1, "RIGHT");
        t = zcVar2;
        zc zcVar3 = new zc("UNKNOWN__", 2, "UNKNOWN__");
        u = zcVar3;
        zc[] zcVarArr = {zcVar, zcVar2, zcVar3};
        v = zcVarArr;
        w = v8.l0.t(zcVarArr);
        Companion = new yc();
        sy.d0Shadow.o("LEFT", "RIGHT");
    }

    public zc(String str, int i, String str2) {
        this.r = str2;
    }

    public static zc valueOf(String str) {
        return (zc) Enum.valueOf(zc.class, str);
    }

    public static zc[] values() {
        return (zc[]) v.clone();
    }
}
