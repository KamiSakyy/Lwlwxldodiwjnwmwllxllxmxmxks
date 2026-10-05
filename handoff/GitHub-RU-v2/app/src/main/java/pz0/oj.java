package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class oj {
    public static final nj Companion;
    public static final oj r;
    public static final /* synthetic */ oj[] s;

    static {
        oj ojVar = new oj("ANDROID", 0, "ANDROID");
        r = ojVar;
        oj[] ojVarArr = {ojVar, new oj("IOS", 1, "IOS"), new oj("UNKNOWN__", 2, "UNKNOWN__")};
        s = ojVarArr;
        v8.l0.t(ojVarArr);
        Companion = new nj();
        sy.d0.o(new String[]{"ANDROID", "IOS"});
    }

    public oj(String str, int i, String str2) {
    }

    public static oj valueOf(String str) {
        return (oj) Enum.valueOf(oj.class, str);
    }

    public static oj[] values() {
        return (oj[]) s.clone();
    }
}
