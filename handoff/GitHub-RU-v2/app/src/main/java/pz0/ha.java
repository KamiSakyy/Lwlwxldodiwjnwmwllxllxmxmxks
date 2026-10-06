package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ha {
    public static final ga Companion;
    public static final ha s;
    public static final ha t;
    public static final ha u;
    public static final ha v;
    public static final /* synthetic */ ha[] w;
    public static final /* synthetic */ d71.b x;
    public String r;

    static {
        ha haVar = new ha("DUPLICATE", 0, "DUPLICATE");
        s = haVar;
        ha haVar2 = new ha("OUTDATED", 1, "OUTDATED");
        t = haVar2;
        ha haVar3 = new ha("RESOLVED", 2, "RESOLVED");
        u = haVar3;
        ha haVar4 = new ha("UNKNOWN__", 3, "UNKNOWN__");
        v = haVar4;
        ha[] haVarArr = {haVar, haVar2, haVar3, haVar4};
        w = haVarArr;
        x = v8.l0.t(haVarArr);
        Companion = new ga();
        sy.d0Shadow.o(new String[]{"DUPLICATE", "OUTDATED", "RESOLVED"});
    }

    public ha(String str, int i, String str2) {
        this.r = str2;
    }

    public static ha valueOf(String str) {
        return (ha) Enum.valueOf(ha.class, str);
    }

    public static ha[] values() {
        return (ha[]) w.clone();
    }
}
