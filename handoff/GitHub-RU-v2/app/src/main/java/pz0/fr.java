package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class fr {
    public static final er Companion;
    public static final fr s;
    public static final fr t;
    public static final /* synthetic */ fr[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        fr frVar = new fr("ADMIN", 0, "ADMIN");
        fr frVar2 = new fr("READ", 1, "READ");
        fr frVar3 = new fr("WRITE", 2, "WRITE");
        s = frVar3;
        fr frVar4 = new fr("UNKNOWN__", 3, "UNKNOWN__");
        t = frVar4;
        fr[] frVarArr = {frVar, frVar2, frVar3, frVar4};
        u = frVarArr;
        v = v8.l0.t(frVarArr);
        Companion = new er();
        sy.d0.o(new String[]{"ADMIN", "READ", "WRITE"});
    }

    public fr(String str, int i, String str2) {
        this.r = str2;
    }

    public static fr valueOf(String str) {
        return (fr) Enum.valueOf(fr.class, str);
    }

    public static fr[] values() {
        return (fr[]) u.clone();
    }
}
