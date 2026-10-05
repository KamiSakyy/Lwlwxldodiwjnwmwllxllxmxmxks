package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class sn {
    public static final rn Companion;
    public static final sn r;
    public static final /* synthetic */ sn[] s;

    static {
        sn snVar = new sn("ANDROID", 0, "ANDROID");
        r = snVar;
        sn[] snVarArr = {snVar, new sn("IOS", 1, "IOS"), new sn("UNKNOWN__", 2, "UNKNOWN__")};
        s = snVarArr;
        v8.l0.t(snVarArr);
        Companion = new rn();
        sy.d0.o("ANDROID", "IOS");
    }

    public sn(String str, int i, String str2) {
    }

    public static sn valueOf(String str) {
        return (sn) Enum.valueOf(sn.class, str);
    }

    public static sn[] values() {
        return (sn[]) s.clone();
    }
}
