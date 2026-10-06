package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class zo {
    public static final yo Companion;
    public static final zo r;
    public static final /* synthetic */ zo[] s;

    static {
        zo zoVar = new zo("PHONE", 0, "PHONE");
        r = zoVar;
        zo[] zoVarArr = {zoVar, new zo("TABLET", 1, "TABLET"), new zo("UNKNOWN__", 2, "UNKNOWN__")};
        s = zoVarArr;
        v8.l0.t(zoVarArr);
        Companion = new yo();
        sy.d0Shadow.o("PHONE", "TABLET");
    }

    public zo(String str, int i, String str2) {
    }

    public static zo valueOf(String str) {
        return (zo) Enum.valueOf(zo.class, str);
    }

    public static zo[] values() {
        return (zo[]) s.clone();
    }
}
