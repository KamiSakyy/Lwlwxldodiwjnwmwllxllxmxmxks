package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ag {
    public static final zf Companion;
    public static final ag r;
    public static final /* synthetic */ ag[] s;

    static {
        ag agVar = new ag("ANDROID", 0, "ANDROID");
        r = agVar;
        ag[] agVarArr = {agVar, new ag("IOS", 1, "IOS"), new ag("UNKNOWN__", 2, "UNKNOWN__")};
        s = agVarArr;
        v8.l0.t(agVarArr);
        Companion = new zf();
        sy.d0.o(new String[]{"ANDROID", "IOS"});
    }

    public ag(String str, int i, String str2) {
    }

    public static ag valueOf(String str) {
        return (ag) Enum.valueOf(ag.class, str);
    }

    public static ag[] values() {
        return (ag[]) s.clone();
    }
}
