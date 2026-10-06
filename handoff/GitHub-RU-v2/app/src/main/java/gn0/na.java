package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class na {
    public static final ma Companion;
    public static final aa.a0 s;
    public static final na t;
    public static final na u;
    public static final na v;
    public static final /* synthetic */ na[] w;
    public static final /* synthetic */ d71.b x;
    public String r;

    static {
        na naVar = new na("DISMISSED", 0, "DISMISSED");
        na naVar2 = new na("UNVIEWED", 1, "UNVIEWED");
        t = naVar2;
        na naVar3 = new na("VIEWED", 2, "VIEWED");
        u = naVar3;
        na naVar4 = new na("UNKNOWN__", 3, "UNKNOWN__");
        v = naVar4;
        na[] naVarArr = {naVar, naVar2, naVar3, naVar4};
        w = naVarArr;
        x = v8.l0.t(naVarArr);
        Companion = new ma();
        x61.l.r(new String[]{"DISMISSED", "UNVIEWED", "VIEWED"});
        s = new aa.a0("FileViewedState");
    }

    public na(String str, int i, String str2) {
        this.r = str2;
    }

    public static na valueOf(String str) {
        return (na) Enum.valueOf(na.class, str);
    }

    public static na[] values() {
        return (na[]) w.clone();
    }
    public Object ordinal() { return null; }
}
