package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ah {
    public static final zg Companion;
    public static final ah r;
    public static final /* synthetic */ ah[] s;

    static {
        ah ahVar = new ah("ANDROID", 0, "ANDROID");
        r = ahVar;
        ah[] ahVarArr = {ahVar, new ah("IOS", 1, "IOS"), new ah("UNKNOWN__", 2, "UNKNOWN__")};
        s = ahVarArr;
        v8.l0.t(ahVarArr);
        Companion = new zg();
        sy.d0.o(new String[]{"ANDROID", "IOS"});
    }

    public ah(String str, int i, String str2) {
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) s.clone();
    }
}
